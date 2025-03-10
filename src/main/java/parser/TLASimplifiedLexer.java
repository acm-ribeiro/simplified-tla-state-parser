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
public class TLASimplifiedLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, BOOLEAN=4, REC_SEP=5, AND=6, NAT=7, STRING=8, 
		LSTR=9, RSTR=10, LCURL=11, RCURL=12, LPAR=13, RPAR=14, EQ=15, ATTR=16, 
		COMMA=17, NEWLINE=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "BOOLEAN", "REC_SEP", "AND", "NAT", "STRING", 
			"LSTR", "RSTR", "LCURL", "RCURL", "LPAR", "RPAR", "EQ", "ATTR", "COMMA", 
			"NEWLINE", "WS"
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


	public TLASimplifiedLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TLASimplified.g4"; }

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
		"\u0004\u0000\u0013\u008c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003J\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006T\b\u0006"+
		"\u0001\u0006\u0004\u0006W\b\u0006\u000b\u0006\f\u0006X\u0001\u0007\u0005"+
		"\u0007\\\b\u0007\n\u0007\f\u0007_\t\u0007\u0001\u0007\u0004\u0007b\b\u0007"+
		"\u000b\u0007\f\u0007c\u0001\u0007\u0005\u0007g\b\u0007\n\u0007\f\u0007"+
		"j\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0003\u0011\u0081\b\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u0085"+
		"\b\u0011\u000b\u0011\f\u0011\u0086\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0000\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\u0001\u0000\u0004\u0001\u000009\u0004\u0000--09@@__\u0003\u0000@Z__a"+
		"z\u0005\u0000--09@Z__az\u0094\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000"+
		"\u0003/\u0001\u0000\u0000\u0000\u0005=\u0001\u0000\u0000\u0000\u0007I"+
		"\u0001\u0000\u0000\u0000\tK\u0001\u0000\u0000\u0000\u000bN\u0001\u0000"+
		"\u0000\u0000\rS\u0001\u0000\u0000\u0000\u000f]\u0001\u0000\u0000\u0000"+
		"\u0011k\u0001\u0000\u0000\u0000\u0013m\u0001\u0000\u0000\u0000\u0015o"+
		"\u0001\u0000\u0000\u0000\u0017q\u0001\u0000\u0000\u0000\u0019s\u0001\u0000"+
		"\u0000\u0000\u001bu\u0001\u0000\u0000\u0000\u001dw\u0001\u0000\u0000\u0000"+
		"\u001fy\u0001\u0000\u0000\u0000!}\u0001\u0000\u0000\u0000#\u0084\u0001"+
		"\u0000\u0000\u0000%\u0088\u0001\u0000\u0000\u0000\'(\u0005e\u0000\u0000"+
		"()\u0005n\u0000\u0000)*\u0005s\u0000\u0000*+\u0005u\u0000\u0000+,\u0005"+
		"r\u0000\u0000,-\u0005e\u0000\u0000-.\u0005s\u0000\u0000.\u0002\u0001\u0000"+
		"\u0000\u0000/0\u0005s\u0000\u000001\u0005c\u0000\u000012\u0005h\u0000"+
		"\u000023\u0005e\u0000\u000034\u0005m\u0000\u000045\u0005a\u0000\u0000"+
		"56\u0005M\u0000\u000067\u0005a\u0000\u000078\u0005p\u0000\u000089\u0005"+
		"p\u0000\u00009:\u0005i\u0000\u0000:;\u0005n\u0000\u0000;<\u0005g\u0000"+
		"\u0000<\u0004\u0001\u0000\u0000\u0000=>\u0005:\u0000\u0000>?\u0005>\u0000"+
		"\u0000?\u0006\u0001\u0000\u0000\u0000@A\u0005T\u0000\u0000AB\u0005R\u0000"+
		"\u0000BC\u0005U\u0000\u0000CJ\u0005E\u0000\u0000DE\u0005F\u0000\u0000"+
		"EF\u0005A\u0000\u0000FG\u0005L\u0000\u0000GH\u0005S\u0000\u0000HJ\u0005"+
		"E\u0000\u0000I@\u0001\u0000\u0000\u0000ID\u0001\u0000\u0000\u0000J\b\u0001"+
		"\u0000\u0000\u0000KL\u0005@\u0000\u0000LM\u0005@\u0000\u0000M\n\u0001"+
		"\u0000\u0000\u0000NO\u0005/\u0000\u0000OP\u0005\\\u0000\u0000PQ\u0005"+
		"\\\u0000\u0000Q\f\u0001\u0000\u0000\u0000RT\u0005-\u0000\u0000SR\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000"+
		"UW\u0007\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u000e\u0001"+
		"\u0000\u0000\u0000Z\\\u0007\u0001\u0000\u0000[Z\u0001\u0000\u0000\u0000"+
		"\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`b\u0007\u0002"+
		"\u0000\u0000a`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dh\u0001\u0000\u0000\u0000"+
		"eg\u0007\u0003\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0010\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0005[\u0000\u0000l\u0012"+
		"\u0001\u0000\u0000\u0000mn\u0005]\u0000\u0000n\u0014\u0001\u0000\u0000"+
		"\u0000op\u0005{\u0000\u0000p\u0016\u0001\u0000\u0000\u0000qr\u0005}\u0000"+
		"\u0000r\u0018\u0001\u0000\u0000\u0000st\u0005(\u0000\u0000t\u001a\u0001"+
		"\u0000\u0000\u0000uv\u0005)\u0000\u0000v\u001c\u0001\u0000\u0000\u0000"+
		"wx\u0005=\u0000\u0000x\u001e\u0001\u0000\u0000\u0000yz\u0005|\u0000\u0000"+
		"z{\u0005-\u0000\u0000{|\u0005>\u0000\u0000| \u0001\u0000\u0000\u0000}"+
		"~\u0005,\u0000\u0000~\"\u0001\u0000\u0000\u0000\u007f\u0081\u0005\r\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0085\u0005\n\u0000\u0000"+
		"\u0083\u0085\u0005\r\u0000\u0000\u0084\u0080\u0001\u0000\u0000\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"$\u0001\u0000\u0000\u0000\u0088\u0089\u0005 \u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0006\u0012\u0000\u0000\u008b&\u0001\u0000"+
		"\u0000\u0000\n\u0000ISX]ch\u0080\u0084\u0086\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}