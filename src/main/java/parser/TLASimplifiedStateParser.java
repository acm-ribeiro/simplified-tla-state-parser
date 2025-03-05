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
public class TLASimplifiedStateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, BOOLEAN=5, REC_SEP=6, AND=7, NAT=8, STRING=9, 
		LSTR=10, RSTR=11, LCURL=12, RCURL=13, LPAR=14, RPAR=15, EQ=16, ATTR=17, 
		COMMA=18, NEWLINE=19, WS=20;
	public static final int
		RULE_state = 0, RULE_stateElement = 1, RULE_fState = 2, RULE_ensuresState = 3, 
		RULE_schemaMapping = 4, RULE_entity = 5, RULE_map = 6, RULE_mapElement = 7, 
		RULE_record = 8, RULE_recordElement = 9, RULE_fieldValue = 10, RULE_set = 11, 
		RULE_setElement = 12, RULE_objectRecord = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"state", "stateElement", "fState", "ensuresState", "schemaMapping", "entity", 
			"map", "mapElement", "record", "recordElement", "fieldValue", "set", 
			"setElement", "objectRecord"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'f'", "'ensures'", "'schemaMapping'", "':>'", null, "'@@'", "'/\\\\'", 
			null, null, "'['", "']'", "'{'", "'}'", "'('", "')'", "'='", "'|->'", 
			"','", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "BOOLEAN", "REC_SEP", "AND", "NAT", "STRING", 
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

	public TLASimplifiedStateParser(TokenStream input) {
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
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedStateVisitor ) return ((TLASimplifiedStateVisitor<? extends T>)visitor).visitState(this);
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
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				stateElement();
				}
				}
				setState(31); 
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
		public List<TerminalNode> AND() { return getTokens(TLASimplifiedStateParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(TLASimplifiedStateParser.AND, i);
		}
		public FStateContext fState() {
			return getRuleContext(FStateContext.class,0);
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
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).enterStateElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).exitStateElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedStateVisitor ) return ((TLASimplifiedStateVisitor<? extends T>)visitor).visitStateElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateElementContext stateElement() throws RecognitionException {
		StateElementContext _localctx = new StateElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stateElement);
		try {
			int _alt;
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(AND);
				setState(34);
				fState();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(AND);
				setState(36);
				ensuresState();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(AND);
				setState(38);
				entity();
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(39);
						match(AND);
						setState(40);
						entity();
						}
						} 
					}
					setState(45);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(AND);
				setState(47);
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
	public static class FStateContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(TLASimplifiedStateParser.EQ, 0); }
		public TerminalNode BOOLEAN() { return getToken(TLASimplifiedStateParser.BOOLEAN, 0); }
		public FStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).enterFState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).exitFState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedStateVisitor ) return ((TLASimplifiedStateVisitor<? extends T>)visitor).visitFState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FStateContext fState() throws RecognitionException {
		FStateContext _localctx = new FStateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(51);
			match(EQ);
			setState(52);
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
	public static class EnsuresStateContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(TLASimplifiedStateParser.EQ, 0); }
		public TerminalNode BOOLEAN() { return getToken(TLASimplifiedStateParser.BOOLEAN, 0); }
		public EnsuresStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ensuresState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).enterEnsuresState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).exitEnsuresState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedStateVisitor ) return ((TLASimplifiedStateVisitor<? extends T>)visitor).visitEnsuresState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnsuresStateContext ensuresState() throws RecognitionException {
		EnsuresStateContext _localctx = new EnsuresStateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ensuresState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__1);
			setState(55);
			match(EQ);
			setState(56);
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
		public TerminalNode EQ() { return getToken(TLASimplifiedStateParser.EQ, 0); }
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public SchemaMappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaMapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).enterSchemaMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).exitSchemaMapping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedStateVisitor ) return ((TLASimplifiedStateVisitor<? extends T>)visitor).visitSchemaMapping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaMappingContext schemaMapping() throws RecognitionException {
		SchemaMappingContext _localctx = new SchemaMappingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_schemaMapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__2);
			setState(59);
			match(EQ);
			setState(60);
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
		public TerminalNode STRING() { return getToken(TLASimplifiedStateParser.STRING, 0); }
		public TerminalNode EQ() { return getToken(TLASimplifiedStateParser.EQ, 0); }
		public TerminalNode LPAR() { return getToken(TLASimplifiedStateParser.LPAR, 0); }
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(TLASimplifiedStateParser.RPAR, 0); }
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).exitEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedStateVisitor ) return ((TLASimplifiedStateVisitor<? extends T>)visitor).visitEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_entity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(STRING);
			setState(63);
			match(EQ);
			setState(64);
			match(LPAR);
			setState(65);
			map();
			setState(66);
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
		public List<TerminalNode> REC_SEP() { return getTokens(TLASimplifiedStateParser.REC_SEP); }
		public TerminalNode REC_SEP(int i) {
			return getToken(TLASimplifiedStateParser.REC_SEP, i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedStateVisitor ) return ((TLASimplifiedStateVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			mapElement();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REC_SEP) {
				{
				{
				setState(69);
				match(REC_SEP);
				setState(70);
				mapElement();
				}
				}
				setState(75);
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
		public TerminalNode STRING() { return getToken(TLASimplifiedStateParser.STRING, 0); }
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public MapElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).enterMapElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).exitMapElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedStateVisitor ) return ((TLASimplifiedStateVisitor<? extends T>)visitor).visitMapElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapElementContext mapElement() throws RecognitionException {
		MapElementContext _localctx = new MapElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mapElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(STRING);
			setState(77);
			match(T__3);
			setState(78);
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
		public TerminalNode LSTR() { return getToken(TLASimplifiedStateParser.LSTR, 0); }
		public List<RecordElementContext> recordElement() {
			return getRuleContexts(RecordElementContext.class);
		}
		public RecordElementContext recordElement(int i) {
			return getRuleContext(RecordElementContext.class,i);
		}
		public TerminalNode RSTR() { return getToken(TLASimplifiedStateParser.RSTR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TLASimplifiedStateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLASimplifiedStateParser.COMMA, i);
		}
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).enterRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).exitRecord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedStateVisitor ) return ((TLASimplifiedStateVisitor<? extends T>)visitor).visitRecord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(LSTR);
			setState(81);
			recordElement();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(82);
				match(COMMA);
				setState(83);
				recordElement();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
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
		public TerminalNode STRING() { return getToken(TLASimplifiedStateParser.STRING, 0); }
		public TerminalNode ATTR() { return getToken(TLASimplifiedStateParser.ATTR, 0); }
		public FieldValueContext fieldValue() {
			return getRuleContext(FieldValueContext.class,0);
		}
		public RecordElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).enterRecordElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).exitRecordElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedStateVisitor ) return ((TLASimplifiedStateVisitor<? extends T>)visitor).visitRecordElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordElementContext recordElement() throws RecognitionException {
		RecordElementContext _localctx = new RecordElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_recordElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(STRING);
			setState(92);
			match(ATTR);
			setState(93);
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
		public TerminalNode STRING() { return getToken(TLASimplifiedStateParser.STRING, 0); }
		public TerminalNode NAT() { return getToken(TLASimplifiedStateParser.NAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(TLASimplifiedStateParser.BOOLEAN, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public FieldValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).enterFieldValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).exitFieldValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedStateVisitor ) return ((TLASimplifiedStateVisitor<? extends T>)visitor).visitFieldValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldValueContext fieldValue() throws RecognitionException {
		FieldValueContext _localctx = new FieldValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldValue);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(STRING);
				}
				break;
			case NAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(NAT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				match(BOOLEAN);
				}
				break;
			case LCURL:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
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
		public TerminalNode LCURL() { return getToken(TLASimplifiedStateParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(TLASimplifiedStateParser.RCURL, 0); }
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
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedStateVisitor ) return ((TLASimplifiedStateVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(LCURL);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0) {
				{
				{
				setState(102);
				setElement();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
		public List<TerminalNode> STRING() { return getTokens(TLASimplifiedStateParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TLASimplifiedStateParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLASimplifiedStateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLASimplifiedStateParser.COMMA, i);
		}
		public List<TerminalNode> NAT() { return getTokens(TLASimplifiedStateParser.NAT); }
		public TerminalNode NAT(int i) {
			return getToken(TLASimplifiedStateParser.NAT, i);
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
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).enterSetElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).exitSetElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedStateVisitor ) return ((TLASimplifiedStateVisitor<? extends T>)visitor).visitSetElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetElementContext setElement() throws RecognitionException {
		SetElementContext _localctx = new SetElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_setElement);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(STRING);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(111);
					match(COMMA);
					setState(112);
					match(STRING);
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(NAT);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(119);
					match(COMMA);
					setState(120);
					match(NAT);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LSTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				record();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(127);
					match(COMMA);
					setState(128);
					record();
					}
					}
					setState(133);
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
		public List<TerminalNode> COMMA() { return getTokens(TLASimplifiedStateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLASimplifiedStateParser.COMMA, i);
		}
		public List<TerminalNode> STRING() { return getTokens(TLASimplifiedStateParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(TLASimplifiedStateParser.STRING, i);
		}
		public ObjectRecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectRecord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).enterObjectRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLASimplifiedStateListener) ((TLASimplifiedStateListener)listener).exitObjectRecord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLASimplifiedStateVisitor ) return ((TLASimplifiedStateVisitor<? extends T>)visitor).visitObjectRecord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectRecordContext objectRecord() throws RecognitionException {
		ObjectRecordContext _localctx = new ObjectRecordContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_objectRecord);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				record();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(137);
					match(COMMA);
					setState(138);
					record();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(STRING);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(145);
					match(COMMA);
					setState(146);
					match(STRING);
					}
					}
					setState(151);
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
		"\u0004\u0001\u0014\u009c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001e\b\u0000"+
		"\u000b\u0000\f\u0000\u001f\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001*\b\u0001"+
		"\n\u0001\f\u0001-\t\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006H\b\u0006\n\u0006\f\u0006"+
		"K\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\bU\b\b\n\b\f\bX\t\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nd\b\n\u0001"+
		"\u000b\u0001\u000b\u0005\u000bh\b\u000b\n\u000b\f\u000bk\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\fr\b\f\n\f\f\fu\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\fz\b\f\n\f\f\f}\t\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u0082\b\f\n\f\f\f\u0085\t\f\u0003\f\u0087\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u008c\b\r\n\r\f\r\u008f\t\r\u0001\r\u0001\r\u0001\r\u0005\r"+
		"\u0094\b\r\n\r\f\r\u0097\t\r\u0001\r\u0003\r\u009a\b\r\u0001\r\u0000\u0000"+
		"\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u0000\u0000\u00a1\u0000\u001d\u0001\u0000\u0000\u0000\u00020\u0001"+
		"\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u00066\u0001\u0000\u0000"+
		"\u0000\b:\u0001\u0000\u0000\u0000\n>\u0001\u0000\u0000\u0000\fD\u0001"+
		"\u0000\u0000\u0000\u000eL\u0001\u0000\u0000\u0000\u0010P\u0001\u0000\u0000"+
		"\u0000\u0012[\u0001\u0000\u0000\u0000\u0014c\u0001\u0000\u0000\u0000\u0016"+
		"e\u0001\u0000\u0000\u0000\u0018\u0086\u0001\u0000\u0000\u0000\u001a\u0099"+
		"\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0002\u0001\u0000\u001d\u001c"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u0001\u0001\u0000"+
		"\u0000\u0000!\"\u0005\u0007\u0000\u0000\"1\u0003\u0004\u0002\u0000#$\u0005"+
		"\u0007\u0000\u0000$1\u0003\u0006\u0003\u0000%&\u0005\u0007\u0000\u0000"+
		"&+\u0003\n\u0005\u0000\'(\u0005\u0007\u0000\u0000(*\u0003\n\u0005\u0000"+
		")\'\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000"+
		"\u0000+,\u0001\u0000\u0000\u0000,1\u0001\u0000\u0000\u0000-+\u0001\u0000"+
		"\u0000\u0000./\u0005\u0007\u0000\u0000/1\u0003\b\u0004\u00000!\u0001\u0000"+
		"\u0000\u00000#\u0001\u0000\u0000\u00000%\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u00001\u0003\u0001\u0000\u0000\u000023\u0005\u0001\u0000"+
		"\u000034\u0005\u0010\u0000\u000045\u0005\u0005\u0000\u00005\u0005\u0001"+
		"\u0000\u0000\u000067\u0005\u0002\u0000\u000078\u0005\u0010\u0000\u0000"+
		"89\u0005\u0005\u0000\u00009\u0007\u0001\u0000\u0000\u0000:;\u0005\u0003"+
		"\u0000\u0000;<\u0005\u0010\u0000\u0000<=\u0003\u0010\b\u0000=\t\u0001"+
		"\u0000\u0000\u0000>?\u0005\t\u0000\u0000?@\u0005\u0010\u0000\u0000@A\u0005"+
		"\u000e\u0000\u0000AB\u0003\f\u0006\u0000BC\u0005\u000f\u0000\u0000C\u000b"+
		"\u0001\u0000\u0000\u0000DI\u0003\u000e\u0007\u0000EF\u0005\u0006\u0000"+
		"\u0000FH\u0003\u000e\u0007\u0000GE\u0001\u0000\u0000\u0000HK\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\r\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005\t\u0000\u0000MN\u0005"+
		"\u0004\u0000\u0000NO\u0003\u0010\b\u0000O\u000f\u0001\u0000\u0000\u0000"+
		"PQ\u0005\n\u0000\u0000QV\u0003\u0012\t\u0000RS\u0005\u0012\u0000\u0000"+
		"SU\u0003\u0012\t\u0000TR\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000YZ\u0005\u000b\u0000\u0000Z\u0011\u0001"+
		"\u0000\u0000\u0000[\\\u0005\t\u0000\u0000\\]\u0005\u0011\u0000\u0000]"+
		"^\u0003\u0014\n\u0000^\u0013\u0001\u0000\u0000\u0000_d\u0005\t\u0000\u0000"+
		"`d\u0005\b\u0000\u0000ad\u0005\u0005\u0000\u0000bd\u0003\u0016\u000b\u0000"+
		"c_\u0001\u0000\u0000\u0000c`\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000cb\u0001\u0000\u0000\u0000d\u0015\u0001\u0000\u0000\u0000ei\u0005"+
		"\f\u0000\u0000fh\u0003\u0018\f\u0000gf\u0001\u0000\u0000\u0000hk\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\r\u0000\u0000"+
		"m\u0017\u0001\u0000\u0000\u0000ns\u0005\t\u0000\u0000op\u0005\u0012\u0000"+
		"\u0000pr\u0005\t\u0000\u0000qo\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t\u0087\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000v{\u0005\b\u0000\u0000wx\u0005"+
		"\u0012\u0000\u0000xz\u0005\b\u0000\u0000yw\u0001\u0000\u0000\u0000z}\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|\u0087\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0083\u0003"+
		"\u0010\b\u0000\u007f\u0080\u0005\u0012\u0000\u0000\u0080\u0082\u0003\u0010"+
		"\b\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086n\u0001\u0000\u0000\u0000\u0086v\u0001\u0000\u0000\u0000\u0086"+
		"~\u0001\u0000\u0000\u0000\u0087\u0019\u0001\u0000\u0000\u0000\u0088\u008d"+
		"\u0003\u0010\b\u0000\u0089\u008a\u0005\u0012\u0000\u0000\u008a\u008c\u0003"+
		"\u0010\b\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u009a\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u0090\u0095\u0005\t\u0000\u0000\u0091\u0092\u0005\u0012\u0000"+
		"\u0000\u0092\u0094\u0005\t\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u009a\u0001\u0000\u0000\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u009a\u0001\u0000\u0000\u0000"+
		"\u0099\u0088\u0001\u0000\u0000\u0000\u0099\u0090\u0001\u0000\u0000\u0000"+
		"\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u001b\u0001\u0000\u0000\u0000"+
		"\u000e\u001f+0IVcis{\u0083\u0086\u008d\u0095\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}