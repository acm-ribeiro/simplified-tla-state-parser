package parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import domain.Entity;
import domain.ObjectRecord;
import domain.EnsuresState;
import domain.Record;
import domain.RecordFieldValue;
import domain.SchemaMapping;
import domain.Set;
import domain.SetElement;
import domain.State;
import domain.StateElement;

public class VisitorOrientedParser {

    public State parse(String s) {
        CharStream charStream = CharStreams.fromString(s);
        TLASimplifiedLexer lexer = new TLASimplifiedLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        TLASimplifiedParser parser = new TLASimplifiedParser(tokens);

        TLAStateVisitor visitor = new TLAStateVisitor();

        return visitor.visit(parser.state());
    }

    public static class TLAStateVisitor extends TLASimplifiedBaseVisitor<State> {
        @Override
        public State visitState(TLASimplifiedParser.StateContext ctx) {
            StateElementVisitor stateElementVisitor = new StateElementVisitor();
            List<StateElement> stateElements = new ArrayList<>();

            for (TLASimplifiedParser.StateElementContext elemCtx : ctx.stateElement())
                stateElements.add(elemCtx.accept(stateElementVisitor));


            return new State(ctx.getText(), stateElements);
        }
    }

    public static class StateElementVisitor extends TLASimplifiedBaseVisitor<StateElement> {
        @Override
        public StateElement visitStateElement(TLASimplifiedParser.StateElementContext ctx) {
            EnsuresStateVisitor ensuresStateVisitor = new EnsuresStateVisitor();
            EnsuresState ensuresState = ctx.ensuresState() != null ? ctx.accept(ensuresStateVisitor) : null;

            List<TLASimplifiedParser.EntityContext> entitiesCtx = ctx.entity() != null ? ctx.entity() : null;
            Map<String, Entity> entities = null;

            if (entitiesCtx != null) {
                EntityVisitor entityVisitor = new EntityVisitor();
                entities = new HashMap<>();

                for (TLASimplifiedParser.EntityContext entityCtx : entitiesCtx) {
                    Entity e = entityCtx.accept(entityVisitor);
                    entities.put(e.getName(), e);
                }
            }

            SchemaMappingVisitor schemaMappingVisitor = new SchemaMappingVisitor();
            SchemaMapping schemaMapping = ctx.schemaMapping() != null? ctx.accept(schemaMappingVisitor) : null;

            return new StateElement(ensuresState, entities, schemaMapping);
        }
    }

    public static class SchemaMappingVisitor extends TLASimplifiedBaseVisitor<SchemaMapping> {
        @Override
        public SchemaMapping visitSchemaMapping(TLASimplifiedParser.SchemaMappingContext ctx) {
            RecordVisitor recordVisitor = new RecordVisitor();
            Record record = ctx.record() != null? ctx.accept(recordVisitor) : null;

            return new SchemaMapping(record);
        }
    }

    public static class EntityVisitor extends TLASimplifiedBaseVisitor<Entity> {
        @Override
        public Entity visitEntity(TLASimplifiedParser.EntityContext ctx) {
            String name = ctx.STRING().getText();
            Map<String, Record> records = new HashMap<>();

            List<TLASimplifiedParser.MapElementContext> elemsCtx = ctx.map().mapElement();
            RecordVisitor recordVisitor = new RecordVisitor();

            String recordId;
            for (TLASimplifiedParser.MapElementContext elemCtx : elemsCtx) {
                recordId = elemCtx.STRING().getText();
                Record r = elemCtx.record().accept(recordVisitor);
                r.setId(recordId);
                records.put(recordId, r);
            }

            return new Entity(name, records);
        }
    }

    public static class EnsuresStateVisitor extends TLASimplifiedBaseVisitor<EnsuresState> {
        @Override
        public EnsuresState visitEnsuresState(TLASimplifiedParser.EnsuresStateContext ctx) {
            boolean ensures = Boolean.parseBoolean(ctx.BOOLEAN().getText());
            return new EnsuresState(ensures);
        }
    }

    public static class ObjectRecordVisitor extends TLASimplifiedBaseVisitor<ObjectRecord> {
        @Override
        public ObjectRecord visitObjectRecord(TLASimplifiedParser.ObjectRecordContext ctx) {
            List<Record> records = new ArrayList<>();
            List<String> strRecords = new ArrayList<>();

            for (TLASimplifiedParser.RecordContext r : ctx.record()) {
                Map<String, RecordFieldValue> elems = new HashMap<>();

                for (TLASimplifiedParser.RecordElementContext e : r.recordElement()) {
                    String name = e.STRING().getText();

                    RecordFieldValueVisitor recordFieldValueVisitor = new RecordFieldValueVisitor();
                    RecordFieldValue value = e.fieldValue().accept(recordFieldValueVisitor);
                    elems.put(name, value);
                }
                records.add(new Record(elems));
            }

            for (TerminalNode str : ctx.STRING())
                strRecords.add(str.getText());

            return new ObjectRecord(records, strRecords);
        }
    }

    public static class RecordFieldValueVisitor extends TLASimplifiedBaseVisitor<RecordFieldValue> {
        @Override
        public RecordFieldValue visitFieldValue(TLASimplifiedParser.FieldValueContext ctx) {
            String str = ctx.STRING() != null ? ctx.STRING().getText() : null;
            Integer num = ctx.NAT() != null ? Integer.parseInt(ctx.NAT().getText()) : null;
            Boolean bool = ctx.BOOLEAN() != null ? Boolean.parseBoolean(ctx.BOOLEAN().getText()) : null;

            SetVisitor setVisitor = new SetVisitor();
            Set set = ctx.set() != null ? ctx.set().accept(setVisitor) : null;

            return new RecordFieldValue(str, num, bool, set);
        }
    }

    public static class SetVisitor extends TLASimplifiedBaseVisitor<Set> {
        @Override
        public Set visitSet(TLASimplifiedParser.SetContext ctx) {
            List<SetElement> setElements = new ArrayList<>();
            SetElementVisitor setElementVisitor = new SetElementVisitor();

            for (TLASimplifiedParser.SetElementContext e : ctx.setElement())
                setElements.add(e.accept(setElementVisitor));

            return new Set(setElements);
        }
    }

    public static class SetElementVisitor extends TLASimplifiedBaseVisitor<SetElement> {
        @Override
        public SetElement visitSetElement(TLASimplifiedParser.SetElementContext ctx) {
            List<String> strElems = new ArrayList<>();
            List<Integer> intElems = new ArrayList<>();
            List<Record> recordElems = new ArrayList<>();

            if (ctx.STRING() != null)
                for (TerminalNode s : ctx.STRING())
                    strElems.add(s.getText());

            if (ctx.NAT() != null)
                for (TerminalNode i : ctx.NAT())
                    intElems.add(Integer.parseInt(i.getText()));

            if (ctx.record() != null) {
                RecordVisitor recordVisitor = new RecordVisitor();

                for (TLASimplifiedParser.RecordContext r : ctx.record())
                    recordElems.add(r.accept(recordVisitor));
            }

            return new SetElement(strElems, intElems, recordElems);
        }
    }

    public static class RecordVisitor extends TLASimplifiedBaseVisitor<Record> {
        @Override
        public Record visitRecord(TLASimplifiedParser.RecordContext ctx) {
            RecordFieldValueVisitor fieldValueVisitor = new RecordFieldValueVisitor();
            Map<String, RecordFieldValue> elems = new HashMap<>();

            String name;
            RecordFieldValue value;
            for (TLASimplifiedParser.RecordElementContext e : ctx.recordElement()) {
                name = e.STRING().getText();
                value = e.fieldValue().accept(fieldValueVisitor);
                elems.put(name, value);
            }

            return new Record(elems);
        }
    }

}
