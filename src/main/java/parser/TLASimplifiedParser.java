package parser;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TLASimplifiedParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, BOOLEAN=4, REC_SEP=5, AND=6, NAT=7, STRING=8, 
		LSTR=9, RSTR=10, LCURL=11, RCURL=12, LPAR=13, RPAR=14, EQ=15, ATTR=16, 
		COMMA=17, NEWLINE=18, WS=19;
	public static final int
		RULE_state = 0, RULE_stateElement = 1, RULE_ensuresState = 2, RULE_schemaMapping = 3, 
		RULE_entity = 4, RULE_map = 5, RULE_mapElement = 6, RULE_record = 7, RULE_recordElement = 8, 
		RULE_fieldValue = 9, RULE_set = 10, RULE_setElement = 11, RULE_objectRecord = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"state", "stateElement", "ensuresState", "schemaMapping", "entity", "map", 
			"mapElement", "record", "recordElement", "fieldValue", "set", "setElement", 
			"objectRecord"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ensures'", "'schemaMapping'", "':>'", null, "'@@'", "'/\\\\'", 
			null, null, "'['", "']'", "'{'", "'}'", "'('", "')'", "'='", "'|->'", 
			"','", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "BOOLEAN", "REC_SEP", "AND", "NAT", "STRING", 
			"LSTR", "RSTR", "LCURL", "RCURL", "LPAR", "RPAR", "EQ", "ATTR", "COMMA", 
			"NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TLASimplifiedParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateContext extends ParserRuleContext {
		public List<StateElementContext> stateElement() {
			return getRuleContexts(StateElementContext.class);
		}
		public StateElementContext stateElement(int i) {
			return getRuleContext(StateElementContext.class,i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedVisitor ) return ((TLASimplifiedVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				stateElement();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AND );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateElementContext extends ParserRuleContext {
		public List<TerminalNode> AND() { return getTokens(TLASimplifiedParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(TLASimplifiedParser.AND, i);
		}
		public EnsuresStateContext ensuresState() {
			return getRuleContext(EnsuresStateContext.class,0);
		}
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public SchemaMappingContext schemaMapping() {
			return getRuleContext(SchemaMappingContext.class,0);
		}
		public StateElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).enterStateElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).exitStateElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedVisitor ) return ((TLASimplifiedVisitor<? extends T>)visitor).visitStateElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateElementContext stateElement() throws RecognitionException {
		StateElementContext _localctx = new StateElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stateElement);
		try {
			int _alt;
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(AND);
				setState(32);
				ensuresState();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(AND);
				setState(34);
				entity();
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(35);
						match(AND);
						setState(36);
						entity();
						}
						} 
					}
					setState(41);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(AND);
				setState(43);
				schemaMapping();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnsuresStateContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(TLASimplifiedParser.EQ, 0); }
		public TerminalNode BOOLEAN() { return getToken(TLASimplifiedParser.BOOLEAN, 0); }
		public EnsuresStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ensuresState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).enterEnsuresState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).exitEnsuresState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedVisitor ) return ((TLASimplifiedVisitor<? extends T>)visitor).visitEnsuresState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnsuresStateContext ensuresState() throws RecognitionException {
		EnsuresStateContext _localctx = new EnsuresStateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ensuresState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);
			setState(47);
			match(EQ);
			setState(48);
			match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SchemaMappingContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(TLASimplifiedParser.EQ, 0); }
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public SchemaMappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaMapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).enterSchemaMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).exitSchemaMapping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedVisitor ) return ((TLASimplifiedVisitor<? extends T>)visitor).visitSchemaMapping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaMappingContext schemaMapping() throws RecognitionException {
		SchemaMappingContext _localctx = new SchemaMappingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_schemaMapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__1);
			setState(51);
			match(EQ);
			setState(52);
			record();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EntityContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TLASimplifiedParser.STRING, 0); }
		public TerminalNode EQ() { return getToken(TLASimplifiedParser.EQ, 0); }
		public TerminalNode LPAR() { return getToken(TLASimplifiedParser.LPAR, 0); }
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(TLASimplifiedParser.RPAR, 0); }
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).exitEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedVisitor ) return ((TLASimplifiedVisitor<? extends T>)visitor).visitEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_entity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(STRING);
			setState(55);
			match(EQ);
			setState(56);
			match(LPAR);
			setState(57);
			map();
			setState(58);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapContext extends ParserRuleContext {
		public List<MapElementContext> mapElement() {
			return getRuleContexts(MapElementContext.class);
		}
		public MapElementContext mapElement(int i) {
			return getRuleContext(MapElementContext.class,i);
		}
		public List<TerminalNode> REC_SEP() { return getTokens(TLASimplifiedParser.REC_SEP); }
		public TerminalNode REC_SEP(int i) {
			return getToken(TLASimplifiedParser.REC_SEP, i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedVisitor ) return ((TLASimplifiedVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			mapElement();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REC_SEP) {
				{
				{
				setState(61);
				match(REC_SEP);
				setState(62);
				mapElement();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapElementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TLASimplifiedParser.STRING, 0); }
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public MapElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).enterMapElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).exitMapElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedVisitor ) return ((TLASimplifiedVisitor<? extends T>)visitor).visitMapElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapElementContext mapElement() throws RecognitionException {
		MapElementContext _localctx = new MapElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mapElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(STRING);
			setState(69);
			match(T__2);
			setState(70);
			record();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordContext extends ParserRuleContext {
		public TerminalNode LSTR() { return getToken(TLASimplifiedParser.LSTR, 0); }
		public List<RecordElementContext> recordElement() {
			return getRuleContexts(RecordElementContext.class);
		}
		public RecordElementContext recordElement(int i) {
			return getRuleContext(RecordElementContext.class,i);
		}
		public TerminalNode RSTR() { return getToken(TLASimplifiedParser.RSTR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TLASimplifiedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLASimplifiedParser.COMMA, i);
		}
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).enterRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).exitRecord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedVisitor ) return ((TLASimplifiedVisitor<? extends T>)visitor).visitRecord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(LSTR);
			setState(73);
			recordElement();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(74);
				match(COMMA);
				setState(75);
				recordElement();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(RSTR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordElementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TLASimplifiedParser.STRING, 0); }
		public TerminalNode ATTR() { return getToken(TLASimplifiedParser.ATTR, 0); }
		public FieldValueContext fieldValue() {
			return getRuleContext(FieldValueContext.class,0);
		}
		public RecordElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).enterRecordElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).exitRecordElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedVisitor ) return ((TLASimplifiedVisitor<? extends T>)visitor).visitRecordElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordElementContext recordElement() throws RecognitionException {
		RecordElementContext _localctx = new RecordElementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_recordElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(STRING);
			setState(84);
			match(ATTR);
			setState(85);
			fieldValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TLASimplifiedParser.STRING, 0); }
		public TerminalNode NAT() { return getToken(TLASimplifiedParser.NAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(TLASimplifiedParser.BOOLEAN, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public FieldValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).enterFieldValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).exitFieldValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedVisitor ) return ((TLASimplifiedVisitor<? extends T>)visitor).visitFieldValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldValueContext fieldValue() throws RecognitionException {
		FieldValueContext _localctx = new FieldValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldValue);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(STRING);
				}
				break;
			case NAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(NAT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				match(BOOLEAN);
				}
				break;
			case LCURL:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				set();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(TLASimplifiedParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(TLASimplifiedParser.RCURL, 0); }
		public List<SetElementContext> setElement() {
			return getRuleContexts(SetElementContext.class);
		}
		public SetElementContext setElement(int i) {
			return getRuleContext(SetElementContext.class,i);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedVisitor ) return ((TLASimplifiedVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LCURL);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0) {
				{
				{
				setState(94);
				setElement();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetElementContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(TLASimplifiedParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TLASimplifiedParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLASimplifiedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLASimplifiedParser.COMMA, i);
		}
		public List<TerminalNode> NAT() { return getTokens(TLASimplifiedParser.NAT); }
		public TerminalNode NAT(int i) {
			return getToken(TLASimplifiedParser.NAT, i);
		}
		public List<RecordContext> record() {
			return getRuleContexts(RecordContext.class);
		}
		public RecordContext record(int i) {
			return getRuleContext(RecordContext.class,i);
		}
		public SetElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).enterSetElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).exitSetElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedVisitor ) return ((TLASimplifiedVisitor<? extends T>)visitor).visitSetElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetElementContext setElement() throws RecognitionException {
		SetElementContext _localctx = new SetElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_setElement);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(STRING);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(103);
					match(COMMA);
					setState(104);
					match(STRING);
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(NAT);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(111);
					match(COMMA);
					setState(112);
					match(NAT);
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LSTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				record();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(119);
					match(COMMA);
					setState(120);
					record();
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectRecordContext extends ParserRuleContext {
		public List<RecordContext> record() {
			return getRuleContexts(RecordContext.class);
		}
		public RecordContext record(int i) {
			return getRuleContext(RecordContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLASimplifiedParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLASimplifiedParser.COMMA, i);
		}
		public List<TerminalNode> STRING() { return getTokens(TLASimplifiedParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TLASimplifiedParser.STRING, i);
		}
		public ObjectRecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectRecord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).enterObjectRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedListener) ((TLASimplifiedListener)listener).exitObjectRecord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedVisitor ) return ((TLASimplifiedVisitor<? extends T>)visitor).visitObjectRecord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectRecordContext objectRecord() throws RecognitionException {
		ObjectRecordContext _localctx = new ObjectRecordContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_objectRecord);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				record();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(129);
					match(COMMA);
					setState(130);
					record();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(STRING);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(137);
					match(COMMA);
					setState(138);
					match(STRING);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013\u0094\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000"+
		"\u001d\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001&\b\u0001\n\u0001\f\u0001)\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001-\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005@\b\u0005\n\u0005\f\u0005C\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007M\b\u0007\n\u0007\f\u0007P\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\\\b\t\u0001\n\u0001\n\u0005\n`\b\n\n\n\f\nc\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bj\b\u000b\n"+
		"\u000b\f\u000bm\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"r\b\u000b\n\u000b\f\u000bu\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000bz\b\u000b\n\u000b\f\u000b}\t\u000b\u0003\u000b\u007f\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\f\u0084\b\f\n\f\f\f\u0087\t\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u008c\b\f\n\f\f\f\u008f\t\f\u0001\f\u0003\f\u0092\b"+
		"\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u0000\u0000\u0099\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0002,\u0001\u0000\u0000\u0000\u0004.\u0001\u0000\u0000\u0000\u00062"+
		"\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000\n<\u0001\u0000\u0000"+
		"\u0000\fD\u0001\u0000\u0000\u0000\u000eH\u0001\u0000\u0000\u0000\u0010"+
		"S\u0001\u0000\u0000\u0000\u0012[\u0001\u0000\u0000\u0000\u0014]\u0001"+
		"\u0000\u0000\u0000\u0016~\u0001\u0000\u0000\u0000\u0018\u0091\u0001\u0000"+
		"\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0001\u0001\u0000"+
		"\u0000\u0000\u001f \u0005\u0006\u0000\u0000 -\u0003\u0004\u0002\u0000"+
		"!\"\u0005\u0006\u0000\u0000\"\'\u0003\b\u0004\u0000#$\u0005\u0006\u0000"+
		"\u0000$&\u0003\b\u0004\u0000%#\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000"+
		"\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(-\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0005\u0006\u0000\u0000+-\u0003"+
		"\u0006\u0003\u0000,\u001f\u0001\u0000\u0000\u0000,!\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000-\u0003\u0001\u0000\u0000\u0000./\u0005"+
		"\u0001\u0000\u0000/0\u0005\u000f\u0000\u000001\u0005\u0004\u0000\u0000"+
		"1\u0005\u0001\u0000\u0000\u000023\u0005\u0002\u0000\u000034\u0005\u000f"+
		"\u0000\u000045\u0003\u000e\u0007\u00005\u0007\u0001\u0000\u0000\u0000"+
		"67\u0005\b\u0000\u000078\u0005\u000f\u0000\u000089\u0005\r\u0000\u0000"+
		"9:\u0003\n\u0005\u0000:;\u0005\u000e\u0000\u0000;\t\u0001\u0000\u0000"+
		"\u0000<A\u0003\f\u0006\u0000=>\u0005\u0005\u0000\u0000>@\u0003\f\u0006"+
		"\u0000?=\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000B\u000b\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000DE\u0005\b\u0000\u0000EF\u0005\u0003\u0000\u0000"+
		"FG\u0003\u000e\u0007\u0000G\r\u0001\u0000\u0000\u0000HI\u0005\t\u0000"+
		"\u0000IN\u0003\u0010\b\u0000JK\u0005\u0011\u0000\u0000KM\u0003\u0010\b"+
		"\u0000LJ\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000QR\u0005\n\u0000\u0000R\u000f\u0001\u0000\u0000\u0000"+
		"ST\u0005\b\u0000\u0000TU\u0005\u0010\u0000\u0000UV\u0003\u0012\t\u0000"+
		"V\u0011\u0001\u0000\u0000\u0000W\\\u0005\b\u0000\u0000X\\\u0005\u0007"+
		"\u0000\u0000Y\\\u0005\u0004\u0000\u0000Z\\\u0003\u0014\n\u0000[W\u0001"+
		"\u0000\u0000\u0000[X\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[Z\u0001\u0000\u0000\u0000\\\u0013\u0001\u0000\u0000\u0000]a\u0005\u000b"+
		"\u0000\u0000^`\u0003\u0016\u000b\u0000_^\u0001\u0000\u0000\u0000`c\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bd\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000de\u0005\f\u0000\u0000"+
		"e\u0015\u0001\u0000\u0000\u0000fk\u0005\b\u0000\u0000gh\u0005\u0011\u0000"+
		"\u0000hj\u0005\b\u0000\u0000ig\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u007f\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000ns\u0005\u0007\u0000\u0000"+
		"op\u0005\u0011\u0000\u0000pr\u0005\u0007\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000t\u007f\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"v{\u0003\u000e\u0007\u0000wx\u0005\u0011\u0000\u0000xz\u0003\u000e\u0007"+
		"\u0000yw\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000~f\u0001\u0000\u0000\u0000~n\u0001\u0000\u0000"+
		"\u0000~v\u0001\u0000\u0000\u0000\u007f\u0017\u0001\u0000\u0000\u0000\u0080"+
		"\u0085\u0003\u000e\u0007\u0000\u0081\u0082\u0005\u0011\u0000\u0000\u0082"+
		"\u0084\u0003\u000e\u0007\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084"+
		"\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0092\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0088\u008d\u0005\b\u0000\u0000\u0089\u008a"+
		"\u0005\u0011\u0000\u0000\u008a\u008c\u0005\b\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0092\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0092\u0001"+
		"\u0000\u0000\u0000\u0091\u0080\u0001\u0000\u0000\u0000\u0091\u0088\u0001"+
		"\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0019\u0001"+
		"\u0000\u0000\u0000\u000e\u001d\',AN[aks{~\u0085\u008d\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}