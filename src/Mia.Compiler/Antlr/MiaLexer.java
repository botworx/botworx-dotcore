// Generated from Mia.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DIGIT=1, L=2, VERB=3, NOUN=4, ID=5, CR=6, NUMBER=7, IMPORT=8, DEF=9, NOT=10, 
		RETURN=11, WHERE=12, LONGSKINNYARROW=13, BANGARROW=14, FATLONGARROW=15, 
		BANGFATARROW=16, ARROW=17, PLUS=18, MINUS=19, MINUSPLUS=20, STAR=21, AT=22, 
		SLASH=23, BANGEQ=24, EQ=25, BANG=26, VARIABLE=27, TYPE=28, PROPERTY=29, 
		LPAREN=30, RPAREN=31, COMMA=32, COLONCOLON=33, HAT=34, SEMICOLON=35, LEFTANGLECOLON=36, 
		LEFTANGLE2COLON=37, COMMENT=38, SNIPPET=39, STRING=40, NEWLINE=41, WS=42, 
		INVALID=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DIGIT", "L", "VERB", "NOUN", "ID", "CR", "NUMBER", "IMPORT", "DEF", "NOT", 
		"RETURN", "WHERE", "LONGSKINNYARROW", "BANGARROW", "FATLONGARROW", "BANGFATARROW", 
		"ARROW", "PLUS", "MINUS", "MINUSPLUS", "STAR", "AT", "SLASH", "BANGEQ", 
		"EQ", "BANG", "VARIABLE", "TYPE", "PROPERTY", "LPAREN", "RPAREN", "COMMA", 
		"COLONCOLON", "HAT", "SEMICOLON", "LEFTANGLECOLON", "LEFTANGLE2COLON", 
		"COMMENT", "SNIPPET", "STRING", "NEWLINE", "WS", "INVALID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "'import'", "'def'", "'not'", 
		"'returnExpr'", "'where'", "'-->'", "'!->'", "'==>'", "'!=>'", "'->'", 
		"'+'", "'-'", "'-+'", "'*'", "'@'", "'/'", "'!='", "'='", "'!'", null, 
		null, null, "'('", "')'", "','", "'::'", "'^'", "';'", "'<:'", "'<<:'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DIGIT", "L", "VERB", "NOUN", "ID", "CR", "NUMBER", "IMPORT", "DEF", 
		"NOT", "RETURN", "WHERE", "LONGSKINNYARROW", "BANGARROW", "FATLONGARROW", 
		"BANGFATARROW", "ARROW", "PLUS", "MINUS", "MINUSPLUS", "STAR", "AT", "SLASH", 
		"BANGEQ", "EQ", "BANG", "VARIABLE", "TYPE", "PROPERTY", "LPAREN", "RPAREN", 
		"COMMA", "COLONCOLON", "HAT", "SEMICOLON", "LEFTANGLECOLON", "LEFTANGLE2COLON", 
		"COMMENT", "SNIPPET", "STRING", "NEWLINE", "WS", "INVALID"
	};
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


	public MiaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mia.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0113\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\6\4_\n\4\r\4\16\4`\3\4\7\4d\n\4\f\4\16\4g\13"+
		"\4\3\5\6\5j\n\5\r\5\16\5k\3\5\7\5o\n\5\f\5\16\5r\13\5\3\6\6\6u\n\6\r\6"+
		"\16\6v\3\6\7\6z\n\6\f\6\16\6}\13\6\3\7\6\7\u0080\n\7\r\7\16\7\u0081\3"+
		"\b\6\b\u0085\n\b\r\b\16\b\u0086\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\7\'\u00ef"+
		"\n\'\f\'\16\'\u00f2\13\'\3\'\3\'\3(\3(\7(\u00f8\n(\f(\16(\u00fb\13(\3"+
		")\3)\7)\u00ff\n)\f)\16)\u0102\13)\3)\3)\3*\6*\u0107\n*\r*\16*\u0108\3"+
		"+\6+\u010c\n+\r+\16+\u010d\3+\3+\3,\3,\4\u00f0\u00f9\2-\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-\3\2\n\3\2\62;\5\2C\\aac|\4\2aac|\6\2\62;C\\aac|\4\2"+
		"C\\aa\5\2\f\f\17\17AA\5\2\f\f\17\17$$\4\2\13\13\"\"\2\u011f\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7^\3\2\2\2\ti\3\2\2\2\13t\3\2\2\2\r\177"+
		"\3\2\2\2\17\u0084\3\2\2\2\21\u0088\3\2\2\2\23\u008f\3\2\2\2\25\u0093\3"+
		"\2\2\2\27\u0097\3\2\2\2\31\u00a2\3\2\2\2\33\u00a8\3\2\2\2\35\u00ac\3\2"+
		"\2\2\37\u00b0\3\2\2\2!\u00b4\3\2\2\2#\u00b8\3\2\2\2%\u00bb\3\2\2\2\'\u00bd"+
		"\3\2\2\2)\u00bf\3\2\2\2+\u00c2\3\2\2\2-\u00c4\3\2\2\2/\u00c6\3\2\2\2\61"+
		"\u00c8\3\2\2\2\63\u00cb\3\2\2\2\65\u00cd\3\2\2\2\67\u00cf\3\2\2\29\u00d2"+
		"\3\2\2\2;\u00d5\3\2\2\2=\u00d8\3\2\2\2?\u00da\3\2\2\2A\u00dc\3\2\2\2C"+
		"\u00de\3\2\2\2E\u00e1\3\2\2\2G\u00e3\3\2\2\2I\u00e5\3\2\2\2K\u00e8\3\2"+
		"\2\2M\u00ec\3\2\2\2O\u00f5\3\2\2\2Q\u00fc\3\2\2\2S\u0106\3\2\2\2U\u010b"+
		"\3\2\2\2W\u0111\3\2\2\2YZ\t\2\2\2Z\4\3\2\2\2[\\\t\3\2\2\\\6\3\2\2\2]_"+
		"\t\4\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ae\3\2\2\2bd\t\5\2\2c"+
		"b\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\b\3\2\2\2ge\3\2\2\2hj\t\6\2\2"+
		"ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lp\3\2\2\2mo\t\5\2\2nm\3\2\2\2"+
		"or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\n\3\2\2\2rp\3\2\2\2su\t\3\2\2ts\3\2\2"+
		"\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w{\3\2\2\2xz\t\5\2\2yx\3\2\2\2z}\3\2\2"+
		"\2{y\3\2\2\2{|\3\2\2\2|\f\3\2\2\2}{\3\2\2\2~\u0080\t\7\2\2\177~\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\16"+
		"\3\2\2\2\u0083\u0085\5\3\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\20\3\2\2\2\u0088\u0089\7k\2\2"+
		"\u0089\u008a\7o\2\2\u008a\u008b\7r\2\2\u008b\u008c\7q\2\2\u008c\u008d"+
		"\7t\2\2\u008d\u008e\7v\2\2\u008e\22\3\2\2\2\u008f\u0090\7f\2\2\u0090\u0091"+
		"\7g\2\2\u0091\u0092\7h\2\2\u0092\24\3\2\2\2\u0093\u0094\7p\2\2\u0094\u0095"+
		"\7q\2\2\u0095\u0096\7v\2\2\u0096\26\3\2\2\2\u0097\u0098\7t\2\2\u0098\u0099"+
		"\7g\2\2\u0099\u009a\7v\2\2\u009a\u009b\7w\2\2\u009b\u009c\7t\2\2\u009c"+
		"\u009d\7p\2\2\u009d\u009e\7G\2\2\u009e\u009f\7z\2\2\u009f\u00a0\7r\2\2"+
		"\u00a0\u00a1\7t\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7y\2\2\u00a3\u00a4\7"+
		"j\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7g\2\2\u00a7\32"+
		"\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9\u00aa\7/\2\2\u00aa\u00ab\7@\2\2\u00ab"+
		"\34\3\2\2\2\u00ac\u00ad\7#\2\2\u00ad\u00ae\7/\2\2\u00ae\u00af\7@\2\2\u00af"+
		"\36\3\2\2\2\u00b0\u00b1\7?\2\2\u00b1\u00b2\7?\2\2\u00b2\u00b3\7@\2\2\u00b3"+
		" \3\2\2\2\u00b4\u00b5\7#\2\2\u00b5\u00b6\7?\2\2\u00b6\u00b7\7@\2\2\u00b7"+
		"\"\3\2\2\2\u00b8\u00b9\7/\2\2\u00b9\u00ba\7@\2\2\u00ba$\3\2\2\2\u00bb"+
		"\u00bc\7-\2\2\u00bc&\3\2\2\2\u00bd\u00be\7/\2\2\u00be(\3\2\2\2\u00bf\u00c0"+
		"\7/\2\2\u00c0\u00c1\7-\2\2\u00c1*\3\2\2\2\u00c2\u00c3\7,\2\2\u00c3,\3"+
		"\2\2\2\u00c4\u00c5\7B\2\2\u00c5.\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7\60"+
		"\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca\7?\2\2\u00ca\62\3\2\2\2\u00cb"+
		"\u00cc\7?\2\2\u00cc\64\3\2\2\2\u00cd\u00ce\7#\2\2\u00ce\66\3\2\2\2\u00cf"+
		"\u00d0\7&\2\2\u00d0\u00d1\5\13\6\2\u00d18\3\2\2\2\u00d2\u00d3\5\t\5\2"+
		"\u00d3\u00d4\7<\2\2\u00d4:\3\2\2\2\u00d5\u00d6\5\7\4\2\u00d6\u00d7\7<"+
		"\2\2\u00d7<\3\2\2\2\u00d8\u00d9\7*\2\2\u00d9>\3\2\2\2\u00da\u00db\7+\2"+
		"\2\u00db@\3\2\2\2\u00dc\u00dd\7.\2\2\u00ddB\3\2\2\2\u00de\u00df\7<\2\2"+
		"\u00df\u00e0\7<\2\2\u00e0D\3\2\2\2\u00e1\u00e2\7`\2\2\u00e2F\3\2\2\2\u00e3"+
		"\u00e4\7=\2\2\u00e4H\3\2\2\2\u00e5\u00e6\7>\2\2\u00e6\u00e7\7<\2\2\u00e7"+
		"J\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9\u00ea\7>\2\2\u00ea\u00eb\7<\2\2\u00eb"+
		"L\3\2\2\2\u00ec\u00f0\7%\2\2\u00ed\u00ef\13\2\2\2\u00ee\u00ed\3\2\2\2"+
		"\u00ef\u00f2\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\b\'\2\2\u00f4N\3\2\2\2\u00f5"+
		"\u00f9\7~\2\2\u00f6\u00f8\13\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00faP\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u0100\7$\2\2\u00fd\u00ff\n\b\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2"+
		"\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7$\2\2\u0104R\3\2\2\2\u0105\u0107"+
		"\t\7\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109T\3\2\2\2\u010a\u010c\t\t\2\2\u010b\u010a\3\2\2\2"+
		"\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0110\b+\2\2\u0110V\3\2\2\2\u0111\u0112\13\2\2\2\u0112"+
		"X\3\2\2\2\20\2`ekpv{\u0081\u0086\u00f0\u00f9\u0100\u0108\u010d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}