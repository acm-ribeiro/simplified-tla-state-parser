package parser;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TLASimplifiedParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TLASimplifiedVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(TLASimplifiedParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedParser#stateElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateElement(TLASimplifiedParser.StateElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedParser#ensuresState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnsuresState(TLASimplifiedParser.EnsuresStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedParser#schemaMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaMapping(TLASimplifiedParser.SchemaMappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(TLASimplifiedParser.EntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(TLASimplifiedParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedParser#mapElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapElement(TLASimplifiedParser.MapElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedParser#record}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord(TLASimplifiedParser.RecordContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedParser#recordElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordElement(TLASimplifiedParser.RecordElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedParser#fieldValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldValue(TLASimplifiedParser.FieldValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(TLASimplifiedParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedParser#setElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetElement(TLASimplifiedParser.SetElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLASimplifiedParser#objectRecord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectRecord(TLASimplifiedParser.ObjectRecordContext ctx);
}