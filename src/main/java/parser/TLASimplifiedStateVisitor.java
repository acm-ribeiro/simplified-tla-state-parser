package parser;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TLASimplifiedStateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TLASimplifiedStateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedStateParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(TLASimplifiedStateParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedStateParser#stateElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateElement(TLASimplifiedStateParser.StateElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedStateParser#schemaMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaMapping(TLASimplifiedStateParser.SchemaMappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedStateParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(TLASimplifiedStateParser.EntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedStateParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(TLASimplifiedStateParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedStateParser#mapElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapElement(TLASimplifiedStateParser.MapElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedStateParser#record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord(TLASimplifiedStateParser.RecordContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedStateParser#recordElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordElement(TLASimplifiedStateParser.RecordElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedStateParser#fieldValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldValue(TLASimplifiedStateParser.FieldValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedStateParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(TLASimplifiedStateParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedStateParser#setElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetElement(TLASimplifiedStateParser.SetElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedStateParser#fState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFState(TLASimplifiedStateParser.FStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedStateParser#postcondState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostcondState(TLASimplifiedStateParser.PostcondStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedStateParser#objectRecord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectRecord(TLASimplifiedStateParser.ObjectRecordContext ctx);
}