package parser;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TLASimplifiedStateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, BOOLEAN=5, REC_SEP=6, AND=7, NAT=8, STRING=9, 
		LSTR=10, RSTR=11, LCURL=12, RCURL=13, LPAR=14, RPAR=15, EQ=16, ATTR=17, 
		COMMA=18, NEWLINE=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "BOOLEAN", "REC_SEP", "AND", "NAT", "STRING", 
			"LSTR", "RSTR", "LCURL", "RCURL", "LPAR", "RPAR", "EQ", "ATTR", "COMMA", 
			"NEWLINE", "WS"
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


	public TLASimplifiedStateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TLASimplifiedState.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0014\u0090\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004N\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0003\u0007X\b\u0007\u0001\u0007\u0004\u0007"+
		"[\b\u0007\u000b\u0007\f\u0007\\\u0001\b\u0005\b`\b\b\n\b\f\bc\t\b\u0001"+
		"\b\u0004\bf\b\b\u000b\b\f\bg\u0001\b\u0005\bk\b\b\n\b\f\bn\t\b\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0003\u0012\u0085\b\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u0089\b"+
		"\u0012\u000b\u0012\f\u0012\u008a\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014\u0001\u0000\u0004\u0001\u000009\u0004\u0000--09@@__\u0003\u0000"+
		"@Z__az\u0005\u0000--09@Z__az\u0098\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0001)\u0001\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005"+
		"3\u0001\u0000\u0000\u0000\u0007A\u0001\u0000\u0000\u0000\tM\u0001\u0000"+
		"\u0000\u0000\u000bO\u0001\u0000\u0000\u0000\rR\u0001\u0000\u0000\u0000"+
		"\u000fW\u0001\u0000\u0000\u0000\u0011a\u0001\u0000\u0000\u0000\u0013o"+
		"\u0001\u0000\u0000\u0000\u0015q\u0001\u0000\u0000\u0000\u0017s\u0001\u0000"+
		"\u0000\u0000\u0019u\u0001\u0000\u0000\u0000\u001bw\u0001\u0000\u0000\u0000"+
		"\u001dy\u0001\u0000\u0000\u0000\u001f{\u0001\u0000\u0000\u0000!}\u0001"+
		"\u0000\u0000\u0000#\u0081\u0001\u0000\u0000\u0000%\u0088\u0001\u0000\u0000"+
		"\u0000\'\u008c\u0001\u0000\u0000\u0000)*\u0005f\u0000\u0000*\u0002\u0001"+
		"\u0000\u0000\u0000+,\u0005e\u0000\u0000,-\u0005n\u0000\u0000-.\u0005s"+
		"\u0000\u0000./\u0005u\u0000\u0000/0\u0005r\u0000\u000001\u0005e\u0000"+
		"\u000012\u0005s\u0000\u00002\u0004\u0001\u0000\u0000\u000034\u0005s\u0000"+
		"\u000045\u0005c\u0000\u000056\u0005h\u0000\u000067\u0005e\u0000\u0000"+
		"78\u0005m\u0000\u000089\u0005a\u0000\u00009:\u0005M\u0000\u0000:;\u0005"+
		"a\u0000\u0000;<\u0005p\u0000\u0000<=\u0005p\u0000\u0000=>\u0005i\u0000"+
		"\u0000>?\u0005n\u0000\u0000?@\u0005g\u0000\u0000@\u0006\u0001\u0000\u0000"+
		"\u0000AB\u0005:\u0000\u0000BC\u0005>\u0000\u0000C\b\u0001\u0000\u0000"+
		"\u0000DE\u0005T\u0000\u0000EF\u0005R\u0000\u0000FG\u0005U\u0000\u0000"+
		"GN\u0005E\u0000\u0000HI\u0005F\u0000\u0000IJ\u0005A\u0000\u0000JK\u0005"+
		"L\u0000\u0000KL\u0005S\u0000\u0000LN\u0005E\u0000\u0000MD\u0001\u0000"+
		"\u0000\u0000MH\u0001\u0000\u0000\u0000N\n\u0001\u0000\u0000\u0000OP\u0005"+
		"@\u0000\u0000PQ\u0005@\u0000\u0000Q\f\u0001\u0000\u0000\u0000RS\u0005"+
		"/\u0000\u0000ST\u0005\\\u0000\u0000TU\u0005\\\u0000\u0000U\u000e\u0001"+
		"\u0000\u0000\u0000VX\u0005-\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000Y[\u0007\u0000\u0000\u0000"+
		"ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]\u0010\u0001\u0000\u0000\u0000^`\u0007"+
		"\u0001\u0000\u0000_^\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000be\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000df\u0007\u0002\u0000\u0000ed\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hl\u0001\u0000\u0000\u0000ik\u0007\u0003\u0000\u0000"+
		"ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000m\u0012\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000op\u0005[\u0000\u0000p\u0014\u0001\u0000\u0000\u0000"+
		"qr\u0005]\u0000\u0000r\u0016\u0001\u0000\u0000\u0000st\u0005{\u0000\u0000"+
		"t\u0018\u0001\u0000\u0000\u0000uv\u0005}\u0000\u0000v\u001a\u0001\u0000"+
		"\u0000\u0000wx\u0005(\u0000\u0000x\u001c\u0001\u0000\u0000\u0000yz\u0005"+
		")\u0000\u0000z\u001e\u0001\u0000\u0000\u0000{|\u0005=\u0000\u0000| \u0001"+
		"\u0000\u0000\u0000}~\u0005|\u0000\u0000~\u007f\u0005-\u0000\u0000\u007f"+
		"\u0080\u0005>\u0000\u0000\u0080\"\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005,\u0000\u0000\u0082$\u0001\u0000\u0000\u0000\u0083\u0085\u0005\r"+
		"\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0089\u0005\n\u0000"+
		"\u0000\u0087\u0089\u0005\r\u0000\u0000\u0088\u0084\u0001\u0000\u0000\u0000"+
		"\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b&\u0001\u0000\u0000\u0000\u008c\u008d\u0005 \u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0006\u0013\u0000\u0000\u008f(\u0001"+
		"\u0000\u0000\u0000\n\u0000MW\\agl\u0084\u0088\u008a\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}