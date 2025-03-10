package parser;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TLASimplifiedParser}.
 */
public interface TLASimplifiedListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(TLASimplifiedParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(TLASimplifiedParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedParser#stateElement}.
	 * @param ctx the parse tree
	 */
	void enterStateElement(TLASimplifiedParser.StateElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedParser#stateElement}.
	 * @param ctx the parse tree
	 */
	void exitStateElement(TLASimplifiedParser.StateElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedParser#fState}.
	 * @param ctx the parse tree
	 */
	void enterFState(TLASimplifiedParser.FStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedParser#fState}.
	 * @param ctx the parse tree
	 */
	void exitFState(TLASimplifiedParser.FStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedParser#ensuresState}.
	 * @param ctx the parse tree
	 */
	void enterEnsuresState(TLASimplifiedParser.EnsuresStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedParser#ensuresState}.
	 * @param ctx the parse tree
	 */
	void exitEnsuresState(TLASimplifiedParser.EnsuresStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedParser#schemaMapping}.
	 * @param ctx the parse tree
	 */
	void enterSchemaMapping(TLASimplifiedParser.SchemaMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedParser#schemaMapping}.
	 * @param ctx the parse tree
	 */
	void exitSchemaMapping(TLASimplifiedParser.SchemaMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(TLASimplifiedParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(TLASimplifiedParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(TLASimplifiedParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(TLASimplifiedParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedParser#mapElement}.
	 * @param ctx the parse tree
	 */
	void enterMapElement(TLASimplifiedParser.MapElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedParser#mapElement}.
	 * @param ctx the parse tree
	 */
	void exitMapElement(TLASimplifiedParser.MapElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedParser#record}.
	 * @param ctx the parse tree
	 */
	void enterRecord(TLASimplifiedParser.RecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedParser#record}.
	 * @param ctx the parse tree
	 */
	void exitRecord(TLASimplifiedParser.RecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedParser#recordElement}.
	 * @param ctx the parse tree
	 */
	void enterRecordElement(TLASimplifiedParser.RecordElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedParser#recordElement}.
	 * @param ctx the parse tree
	 */
	void exitRecordElement(TLASimplifiedParser.RecordElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedParser#fieldValue}.
	 * @param ctx the parse tree
	 */
	void enterFieldValue(TLASimplifiedParser.FieldValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedParser#fieldValue}.
	 * @param ctx the parse tree
	 */
	void exitFieldValue(TLASimplifiedParser.FieldValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(TLASimplifiedParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(TLASimplifiedParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedParser#setElement}.
	 * @param ctx the parse tree
	 */
	void enterSetElement(TLASimplifiedParser.SetElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedParser#setElement}.
	 * @param ctx the parse tree
	 */
	void exitSetElement(TLASimplifiedParser.SetElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedParser#objectRecord}.
	 * @param ctx the parse tree
	 */
	void enterObjectRecord(TLASimplifiedParser.ObjectRecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedParser#objectRecord}.
	 * @param ctx the parse tree
	 */
	void exitObjectRecord(TLASimplifiedParser.ObjectRecordContext ctx);
}