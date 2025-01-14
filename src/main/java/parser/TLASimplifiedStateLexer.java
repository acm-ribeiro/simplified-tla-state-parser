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
			null, "'schemaMapping'", "':>'", "'f'", "'postcond'", null, "'@@'", "'/\\\\'", 
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
		"\u0004\u0000\u0014\u0091\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"O\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007Y\b\u0007\u0001\u0007"+
		"\u0004\u0007\\\b\u0007\u000b\u0007\f\u0007]\u0001\b\u0005\ba\b\b\n\b\f"+
		"\bd\t\b\u0001\b\u0004\bg\b\b\u000b\b\f\bh\u0001\b\u0005\bl\b\b\n\b\f\b"+
		"o\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0003\u0012\u0086\b\u0012\u0001\u0012\u0001\u0012\u0004\u0012"+
		"\u008a\b\u0012\u000b\u0012\f\u0012\u008b\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014\u0001\u0000\u0004\u0001\u000009\u0004\u0000--09@@__\u0003"+
		"\u0000@Z__az\u0005\u0000--09@Z__az\u0099\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u00037\u0001\u0000\u0000\u0000"+
		"\u0005:\u0001\u0000\u0000\u0000\u0007<\u0001\u0000\u0000\u0000\tN\u0001"+
		"\u0000\u0000\u0000\u000bP\u0001\u0000\u0000\u0000\rS\u0001\u0000\u0000"+
		"\u0000\u000fX\u0001\u0000\u0000\u0000\u0011b\u0001\u0000\u0000\u0000\u0013"+
		"p\u0001\u0000\u0000\u0000\u0015r\u0001\u0000\u0000\u0000\u0017t\u0001"+
		"\u0000\u0000\u0000\u0019v\u0001\u0000\u0000\u0000\u001bx\u0001\u0000\u0000"+
		"\u0000\u001dz\u0001\u0000\u0000\u0000\u001f|\u0001\u0000\u0000\u0000!"+
		"~\u0001\u0000\u0000\u0000#\u0082\u0001\u0000\u0000\u0000%\u0089\u0001"+
		"\u0000\u0000\u0000\'\u008d\u0001\u0000\u0000\u0000)*\u0005s\u0000\u0000"+
		"*+\u0005c\u0000\u0000+,\u0005h\u0000\u0000,-\u0005e\u0000\u0000-.\u0005"+
		"m\u0000\u0000./\u0005a\u0000\u0000/0\u0005M\u0000\u000001\u0005a\u0000"+
		"\u000012\u0005p\u0000\u000023\u0005p\u0000\u000034\u0005i\u0000\u0000"+
		"45\u0005n\u0000\u000056\u0005g\u0000\u00006\u0002\u0001\u0000\u0000\u0000"+
		"78\u0005:\u0000\u000089\u0005>\u0000\u00009\u0004\u0001\u0000\u0000\u0000"+
		":;\u0005f\u0000\u0000;\u0006\u0001\u0000\u0000\u0000<=\u0005p\u0000\u0000"+
		"=>\u0005o\u0000\u0000>?\u0005s\u0000\u0000?@\u0005t\u0000\u0000@A\u0005"+
		"c\u0000\u0000AB\u0005o\u0000\u0000BC\u0005n\u0000\u0000CD\u0005d\u0000"+
		"\u0000D\b\u0001\u0000\u0000\u0000EF\u0005T\u0000\u0000FG\u0005R\u0000"+
		"\u0000GH\u0005U\u0000\u0000HO\u0005E\u0000\u0000IJ\u0005F\u0000\u0000"+
		"JK\u0005A\u0000\u0000KL\u0005L\u0000\u0000LM\u0005S\u0000\u0000MO\u0005"+
		"E\u0000\u0000NE\u0001\u0000\u0000\u0000NI\u0001\u0000\u0000\u0000O\n\u0001"+
		"\u0000\u0000\u0000PQ\u0005@\u0000\u0000QR\u0005@\u0000\u0000R\f\u0001"+
		"\u0000\u0000\u0000ST\u0005/\u0000\u0000TU\u0005\\\u0000\u0000UV\u0005"+
		"\\\u0000\u0000V\u000e\u0001\u0000\u0000\u0000WY\u0005-\u0000\u0000XW\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000"+
		"Z\\\u0007\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\u0010\u0001"+
		"\u0000\u0000\u0000_a\u0007\u0001\u0000\u0000`_\u0001\u0000\u0000\u0000"+
		"ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000eg\u0007\u0002"+
		"\u0000\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000im\u0001\u0000\u0000\u0000"+
		"jl\u0007\u0003\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u0012\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005[\u0000\u0000q\u0014"+
		"\u0001\u0000\u0000\u0000rs\u0005]\u0000\u0000s\u0016\u0001\u0000\u0000"+
		"\u0000tu\u0005{\u0000\u0000u\u0018\u0001\u0000\u0000\u0000vw\u0005}\u0000"+
		"\u0000w\u001a\u0001\u0000\u0000\u0000xy\u0005(\u0000\u0000y\u001c\u0001"+
		"\u0000\u0000\u0000z{\u0005)\u0000\u0000{\u001e\u0001\u0000\u0000\u0000"+
		"|}\u0005=\u0000\u0000} \u0001\u0000\u0000\u0000~\u007f\u0005|\u0000\u0000"+
		"\u007f\u0080\u0005-\u0000\u0000\u0080\u0081\u0005>\u0000\u0000\u0081\""+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005,\u0000\u0000\u0083$\u0001\u0000"+
		"\u0000\u0000\u0084\u0086\u0005\r\u0000\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u008a\u0005\n\u0000\u0000\u0088\u008a\u0005\r\u0000\u0000"+
		"\u0089\u0085\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c&\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0005 \u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0006\u0013\u0000\u0000\u0090(\u0001\u0000\u0000\u0000\n\u0000NX]bhm"+
		"\u0085\u0089\u008b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}