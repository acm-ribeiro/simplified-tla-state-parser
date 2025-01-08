package parser;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TLASimplifiedStateParser}.
 */
public interface TLASimplifiedStateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedStateParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(TLASimplifiedStateParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedStateParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(TLASimplifiedStateParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedStateParser#stateElement}.
	 * @param ctx the parse tree
	 */
	void enterStateElement(TLASimplifiedStateParser.StateElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedStateParser#stateElement}.
	 * @param ctx the parse tree
	 */
	void exitStateElement(TLASimplifiedStateParser.StateElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedStateParser#schemaMapping}.
	 * @param ctx the parse tree
	 */
	void enterSchemaMapping(TLASimplifiedStateParser.SchemaMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedStateParser#schemaMapping}.
	 * @param ctx the parse tree
	 */
	void exitSchemaMapping(TLASimplifiedStateParser.SchemaMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedStateParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(TLASimplifiedStateParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedStateParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(TLASimplifiedStateParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedStateParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(TLASimplifiedStateParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedStateParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(TLASimplifiedStateParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedStateParser#mapElement}.
	 * @param ctx the parse tree
	 */
	void enterMapElement(TLASimplifiedStateParser.MapElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedStateParser#mapElement}.
	 * @param ctx the parse tree
	 */
	void exitMapElement(TLASimplifiedStateParser.MapElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedStateParser#record}.
	 * @param ctx the parse tree
	 */
	void enterRecord(TLASimplifiedStateParser.RecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedStateParser#record}.
	 * @param ctx the parse tree
	 */
	void exitRecord(TLASimplifiedStateParser.RecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedStateParser#recordElement}.
	 * @param ctx the parse tree
	 */
	void enterRecordElement(TLASimplifiedStateParser.RecordElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedStateParser#recordElement}.
	 * @param ctx the parse tree
	 */
	void exitRecordElement(TLASimplifiedStateParser.RecordElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedStateParser#fieldValue}.
	 * @param ctx the parse tree
	 */
	void enterFieldValue(TLASimplifiedStateParser.FieldValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedStateParser#fieldValue}.
	 * @param ctx the parse tree
	 */
	void exitFieldValue(TLASimplifiedStateParser.FieldValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedStateParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(TLASimplifiedStateParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedStateParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(TLASimplifiedStateParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedStateParser#setElement}.
	 * @param ctx the parse tree
	 */
	void enterSetElement(TLASimplifiedStateParser.SetElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedStateParser#setElement}.
	 * @param ctx the parse tree
	 */
	void exitSetElement(TLASimplifiedStateParser.SetElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedStateParser#fState}.
	 * @param ctx the parse tree
	 */
	void enterFState(TLASimplifiedStateParser.FStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedStateParser#fState}.
	 * @param ctx the parse tree
	 */
	void exitFState(TLASimplifiedStateParser.FStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedStateParser#postcondState}.
	 * @param ctx the parse tree
	 */
	void enterPostcondState(TLASimplifiedStateParser.PostcondStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedStateParser#postcondState}.
	 * @param ctx the parse tree
	 */
	void exitPostcondState(TLASimplifiedStateParser.PostcondStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLASimplifiedStateParser#objectRecord}.
	 * @param ctx the parse tree
	 */
	void enterObjectRecord(TLASimplifiedStateParser.ObjectRecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLASimplifiedStateParser#objectRecord}.
	 * @param ctx the parse tree
	 */
	void exitObjectRecord(TLASimplifiedStateParser.ObjectRecordContext ctx);
}