// Generated from Mia.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiaParser extends Parser {
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
		INVALID=43, INDENT=44, OUTDENT=45, TERMINATOR=46;
	public static final int
		RULE_ignore = 0, RULE_file = 1, RULE_module = 2, RULE_block = 3, RULE_body = 4, 
		RULE_commalist = 5, RULE_exprlist = 6, RULE_line = 7, RULE_statement = 8, 
		RULE_importStmt = 9, RULE_trigger = 10, RULE_ruledef = 11, RULE_condition = 12, 
		RULE_where = 13, RULE_lhs = 14, RULE_rhs = 15, RULE_action = 16, RULE_whereTrue = 17, 
		RULE_whereFalse = 18, RULE_whereAllTrue = 19, RULE_whereAllFalse = 20, 
		RULE_expression = 21, RULE_terminal = 22, RULE_verb = 23, RULE_variableName = 24, 
		RULE_variable = 25, RULE_term = 26, RULE_literal = 27, RULE_snippet = 28, 
		RULE_paragraph = 29, RULE_sentence = 30, RULE_clause = 31, RULE_simpleclause = 32, 
		RULE_typeName = 33, RULE_propertyName = 34, RULE_property = 35, RULE_properties = 36, 
		RULE_parenExpr = 37, RULE_prefixExpr = 38, RULE_postfixExpr = 39, RULE_typed = 40, 
		RULE_not = 41, RULE_assertExpr = 42, RULE_retract = 43, RULE_modify = 44, 
		RULE_propose = 45, RULE_achieve = 46, RULE_slash = 47, RULE_binaryExpr = 48, 
		RULE_contextExpr = 49, RULE_injectExpr = 50, RULE_typeOfExpr = 51, RULE_assignExpr = 52, 
		RULE_bindExpr = 53, RULE_notEqualExpr = 54, RULE_returnExpr = 55;
	public static final String[] ruleNames = {
		"ignore", "file", "module", "block", "body", "commalist", "exprlist", 
		"line", "statement", "importStmt", "trigger", "ruledef", "condition", 
		"where", "lhs", "rhs", "action", "whereTrue", "whereFalse", "whereAllTrue", 
		"whereAllFalse", "expression", "terminal", "verb", "variableName", "variable", 
		"term", "literal", "snippet", "paragraph", "sentence", "clause", "simpleclause", 
		"typeName", "propertyName", "property", "properties", "parenExpr", "prefixExpr", 
		"postfixExpr", "typed", "not", "assertExpr", "retract", "modify", "propose", 
		"achieve", "slash", "binaryExpr", "contextExpr", "injectExpr", "typeOfExpr", 
		"assignExpr", "bindExpr", "notEqualExpr", "returnExpr"
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
		"COMMENT", "SNIPPET", "STRING", "NEWLINE", "WS", "INVALID", "INDENT", 
		"OUTDENT", "TERMINATOR"
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

	@Override
	public String getGrammarFileName() { return "Mia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IgnoreContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(MiaParser.COMMENT, 0); }
		public TerminalNode NEWLINE() { return getToken(MiaParser.NEWLINE, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiaParser.SEMICOLON, 0); }
		public TerminalNode INVALID() { return getToken(MiaParser.INVALID, 0); }
		public IgnoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterIgnore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitIgnore(this);
		}
	}

	public final IgnoreContext ignore() throws RecognitionException {
		IgnoreContext _localctx = new IgnoreContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ignore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMICOLON) | (1L << COMMENT) | (1L << NEWLINE) | (1L << INVALID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FileContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiaParser.EOF, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			module();
			setState(115);
			match(EOF);
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

	public static class ModuleContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			body(0);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(MiaParser.INDENT, 0); }
		public TerminalNode OUTDENT() { return getToken(MiaParser.OUTDENT, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(INDENT);
				setState(120);
				match(OUTDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(INDENT);
				setState(122);
				body(0);
				setState(123);
				match(OUTDENT);
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

	public static class BodyContext extends ParserRuleContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(MiaParser.TERMINATOR, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		return body(0);
	}

	private BodyContext body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BodyContext _localctx = new BodyContext(_ctx, _parentState);
		BodyContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(128);
			line();
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new BodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_body);
						setState(130);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(131);
						match(TERMINATOR);
						setState(132);
						line();
						}
						break;
					case 2:
						{
						_localctx = new BodyContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_body);
						setState(133);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(134);
						match(TERMINATOR);
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CommalistContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommalistContext commalist() {
			return getRuleContext(CommalistContext.class,0);
		}
		public CommalistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commalist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterCommalist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitCommalist(this);
		}
	}

	public final CommalistContext commalist() throws RecognitionException {
		return commalist(0);
	}

	private CommalistContext commalist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CommalistContext _localctx = new CommalistContext(_ctx, _parentState);
		CommalistContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_commalist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(141);
				expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CommalistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_commalist);
					setState(144);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(145);
					match(COMMA);
					setState(146);
					expression();
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprlistContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(MiaParser.TERMINATOR, 0); }
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitExprlist(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		return exprlist(0);
	}

	private ExprlistContext exprlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprlistContext _localctx = new ExprlistContext(_ctx, _parentState);
		ExprlistContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_exprlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(153);
				expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprlistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprlist);
						setState(156);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(157);
						match(TERMINATOR);
						setState(158);
						expression();
						}
						break;
					case 2:
						{
						_localctx = new ExprlistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprlist);
						setState(159);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(160);
						match(TERMINATOR);
						}
						break;
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_line);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
			case DEF:
			case RETURN:
			case WHERE:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				statement();
				}
				break;
			case NOT:
			case PLUS:
			case MINUS:
			case MINUSPLUS:
			case STAR:
			case SLASH:
			case TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				expression();
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

	public static class StatementContext extends ParserRuleContext {
		public ImportStmtContext importStmt() {
			return getRuleContext(ImportStmtContext.class,0);
		}
		public RuledefContext ruledef() {
			return getRuleContext(RuledefContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public ReturnExprContext returnExpr() {
			return getRuleContext(ReturnExprContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				importStmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				ruledef();
				}
				break;
			case WHERE:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				where();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				returnExpr();
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

	public static class ImportStmtContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(MiaParser.IMPORT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ImportStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterImportStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitImportStmt(this);
		}
	}

	public final ImportStmtContext importStmt() throws RecognitionException {
		ImportStmtContext _localctx = new ImportStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_importStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(IMPORT);
			setState(177);
			expression();
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

	public static class TriggerContext extends ParserRuleContext {
		public ParenExprContext parenExpr() {
			return getRuleContext(ParenExprContext.class,0);
		}
		public TriggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterTrigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitTrigger(this);
		}
	}

	public final TriggerContext trigger() throws RecognitionException {
		TriggerContext _localctx = new TriggerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			parenExpr();
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

	public static class RuledefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(MiaParser.DEF, 0); }
		public TriggerContext trigger() {
			return getRuleContext(TriggerContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RuledefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruledef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterRuledef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitRuledef(this);
		}
	}

	public final RuledefContext ruledef() throws RecognitionException {
		RuledefContext _localctx = new RuledefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ruledef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(DEF);
			setState(182);
			trigger();
			setState(183);
			block();
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

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			expression();
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

	public static class WhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(MiaParser.WHERE, 0); }
		public TerminalNode INDENT() { return getToken(MiaParser.INDENT, 0); }
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public TerminalNode OUTDENT() { return getToken(MiaParser.OUTDENT, 0); }
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitWhere(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(WHERE);
			setState(188);
			match(INDENT);
			setState(189);
			lhs(0);
			setState(190);
			rhs(0);
			setState(191);
			match(OUTDENT);
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

	public static class LhsContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(MiaParser.TERMINATOR, 0); }
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitLhs(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		return lhs(0);
	}

	private LhsContext lhs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LhsContext _localctx = new LhsContext(_ctx, _parentState);
		LhsContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_lhs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(194);
			condition();
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(201);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new LhsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lhs);
						setState(196);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(197);
						match(TERMINATOR);
						setState(198);
						condition();
						}
						break;
					case 2:
						{
						_localctx = new LhsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lhs);
						setState(199);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(200);
						match(TERMINATOR);
						}
						break;
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RhsContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(MiaParser.TERMINATOR, 0); }
		public RhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterRhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitRhs(this);
		}
	}

	public final RhsContext rhs() throws RecognitionException {
		return rhs(0);
	}

	private RhsContext rhs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RhsContext _localctx = new RhsContext(_ctx, _parentState);
		RhsContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_rhs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(207);
			action();
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(214);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new RhsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rhs);
						setState(209);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(210);
						match(TERMINATOR);
						setState(211);
						action();
						}
						break;
					case 2:
						{
						_localctx = new RhsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_rhs);
						setState(212);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(213);
						match(TERMINATOR);
						}
						break;
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public WhereTrueContext whereTrue() {
			return getRuleContext(WhereTrueContext.class,0);
		}
		public WhereFalseContext whereFalse() {
			return getRuleContext(WhereFalseContext.class,0);
		}
		public WhereAllTrueContext whereAllTrue() {
			return getRuleContext(WhereAllTrueContext.class,0);
		}
		public WhereAllFalseContext whereAllFalse() {
			return getRuleContext(WhereAllFalseContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_action);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LONGSKINNYARROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				whereTrue();
				}
				break;
			case BANGARROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				whereFalse();
				}
				break;
			case FATLONGARROW:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				whereAllTrue();
				}
				break;
			case BANGFATARROW:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				whereAllFalse();
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

	public static class WhereTrueContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhereTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterWhereTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitWhereTrue(this);
		}
	}

	public final WhereTrueContext whereTrue() throws RecognitionException {
		WhereTrueContext _localctx = new WhereTrueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whereTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(LONGSKINNYARROW);
			setState(226);
			block();
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

	public static class WhereFalseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhereFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterWhereFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitWhereFalse(this);
		}
	}

	public final WhereFalseContext whereFalse() throws RecognitionException {
		WhereFalseContext _localctx = new WhereFalseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whereFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(BANGARROW);
			setState(229);
			block();
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

	public static class WhereAllTrueContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhereAllTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereAllTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterWhereAllTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitWhereAllTrue(this);
		}
	}

	public final WhereAllTrueContext whereAllTrue() throws RecognitionException {
		WhereAllTrueContext _localctx = new WhereAllTrueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_whereAllTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(FATLONGARROW);
			setState(232);
			block();
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

	public static class WhereAllFalseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhereAllFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereAllFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterWhereAllFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitWhereAllFalse(this);
		}
	}

	public final WhereAllFalseContext whereAllFalse() throws RecognitionException {
		WhereAllFalseContext _localctx = new WhereAllFalseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whereAllFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(BANGFATARROW);
			setState(235);
			block();
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

	public static class ExpressionContext extends ParserRuleContext {
		public PrefixExprContext prefixExpr() {
			return getRuleContext(PrefixExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			prefixExpr();
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

	public static class TerminalContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SnippetContext snippet() {
			return getRuleContext(SnippetContext.class,0);
		}
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitTerminal(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_terminal);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOUN:
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				term();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				literal();
				}
				break;
			case SNIPPET:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				snippet();
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

	public static class VerbContext extends ParserRuleContext {
		public TerminalNode VERB() { return getToken(MiaParser.VERB, 0); }
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitVerb(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_verb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(VERB);
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(MiaParser.VARIABLE, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitVariableName(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(VARIABLE);
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

	public static class VariableContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			variableName();
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

	public static class TermContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode NOUN() { return getToken(MiaParser.NOUN, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_term);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				variable();
				}
				break;
			case NOUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(NOUN);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MiaParser.STRING, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(STRING);
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

	public static class SnippetContext extends ParserRuleContext {
		public TerminalNode SNIPPET() { return getToken(MiaParser.SNIPPET, 0); }
		public SnippetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_snippet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterSnippet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitSnippet(this);
		}
	}

	public final SnippetContext snippet() throws RecognitionException {
		SnippetContext _localctx = new SnippetContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_snippet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(SNIPPET);
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

	public static class ParagraphContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(MiaParser.INDENT, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode OUTDENT() { return getToken(MiaParser.OUTDENT, 0); }
		public ParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitParagraph(this);
		}
	}

	public final ParagraphContext paragraph() throws RecognitionException {
		ParagraphContext _localctx = new ParagraphContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_paragraph);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERB:
			case NOT:
			case PLUS:
			case MINUS:
			case MINUSPLUS:
			case STAR:
			case SLASH:
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				sentence();
				}
				break;
			case NOUN:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				term();
				setState(260);
				match(INDENT);
				setState(261);
				exprlist(0);
				setState(262);
				match(OUTDENT);
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

	public static class SentenceContext extends ParserRuleContext {
		public ClauseContext clause() {
			return getRuleContext(ClauseContext.class,0);
		}
		public CommalistContext commalist() {
			return getRuleContext(CommalistContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sentence);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				clause();
				setState(268);
				match(COMMA);
				setState(269);
				commalist(0);
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

	public static class ClauseContext extends ParserRuleContext {
		public SimpleclauseContext simpleclause() {
			return getRuleContext(SimpleclauseContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitClause(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_clause);
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				simpleclause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				simpleclause();
				setState(275);
				properties(0);
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

	public static class SimpleclauseContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public SimpleclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterSimpleclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitSimpleclause(this);
		}
	}

	public final SimpleclauseContext simpleclause() throws RecognitionException {
		SimpleclauseContext _localctx = new SimpleclauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_simpleclause);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				expression();
				setState(280);
				verb();
				setState(281);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				expression();
				setState(284);
				verb();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				verb();
				setState(287);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				verb();
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(MiaParser.TYPE, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(TYPE);
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

	public static class PropertyNameContext extends ParserRuleContext {
		public TerminalNode PROPERTY() { return getToken(MiaParser.PROPERTY, 0); }
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitPropertyName(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_propertyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(PROPERTY);
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

	public static class PropertyContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_property);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				propertyName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				propertyName();
				setState(298);
				expression();
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

	public static class PropertiesContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitProperties(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		return properties(0);
	}

	private PropertiesContext properties(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PropertiesContext _localctx = new PropertiesContext(_ctx, _parentState);
		PropertiesContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_properties, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(303);
			property();
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PropertiesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_properties);
					setState(305);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(306);
					property();
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParenExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitParenExpr(this);
		}
	}

	public final ParenExprContext parenExpr() throws RecognitionException {
		ParenExprContext _localctx = new ParenExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parenExpr);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(LPAREN);
				setState(313);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(LPAREN);
				setState(315);
				expression();
				setState(316);
				match(RPAREN);
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

	public static class PrefixExprContext extends ParserRuleContext {
		public TypedContext typed() {
			return getRuleContext(TypedContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public AssertExprContext assertExpr() {
			return getRuleContext(AssertExprContext.class,0);
		}
		public RetractContext retract() {
			return getRuleContext(RetractContext.class,0);
		}
		public ModifyContext modify() {
			return getRuleContext(ModifyContext.class,0);
		}
		public ProposeContext propose() {
			return getRuleContext(ProposeContext.class,0);
		}
		public SlashContext slash() {
			return getRuleContext(SlashContext.class,0);
		}
		public PrefixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterPrefixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitPrefixExpr(this);
		}
	}

	public final PrefixExprContext prefixExpr() throws RecognitionException {
		PrefixExprContext _localctx = new PrefixExprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_prefixExpr);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				typed();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				not();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				assertExpr();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				retract();
				}
				break;
			case MINUSPLUS:
				enterOuterAlt(_localctx, 5);
				{
				setState(324);
				modify();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(325);
				propose();
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 7);
				{
				setState(326);
				slash();
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

	public static class PostfixExprContext extends ParserRuleContext {
		public AchieveContext achieve() {
			return getRuleContext(AchieveContext.class,0);
		}
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitPostfixExpr(this);
		}
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_postfixExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			achieve();
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

	public static class TypedContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterTyped(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitTyped(this);
		}
	}

	public final TypedContext typed() throws RecognitionException {
		TypedContext _localctx = new TypedContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			typeName();
			setState(332);
			expression();
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

	public static class NotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MiaParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitNot(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(NOT);
			setState(335);
			expression();
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

	public static class AssertExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssertExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterAssertExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitAssertExpr(this);
		}
	}

	public final AssertExprContext assertExpr() throws RecognitionException {
		AssertExprContext _localctx = new AssertExprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_assertExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(PLUS);
			setState(338);
			expression();
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

	public static class RetractContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retract; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterRetract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitRetract(this);
		}
	}

	public final RetractContext retract() throws RecognitionException {
		RetractContext _localctx = new RetractContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_retract);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(MINUS);
			setState(341);
			expression();
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

	public static class ModifyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ModifyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modify; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterModify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitModify(this);
		}
	}

	public final ModifyContext modify() throws RecognitionException {
		ModifyContext _localctx = new ModifyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_modify);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(MINUSPLUS);
			setState(344);
			expression();
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

	public static class ProposeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ProposeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterPropose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitPropose(this);
		}
	}

	public final ProposeContext propose() throws RecognitionException {
		ProposeContext _localctx = new ProposeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_propose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(STAR);
			setState(347);
			expression();
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

	public static class AchieveContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AchieveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_achieve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterAchieve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitAchieve(this);
		}
	}

	public final AchieveContext achieve() throws RecognitionException {
		AchieveContext _localctx = new AchieveContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_achieve);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			expression();
			setState(350);
			match(BANG);
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

	public static class SlashContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SlashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitSlash(this);
		}
	}

	public final SlashContext slash() throws RecognitionException {
		SlashContext _localctx = new SlashContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_slash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(SLASH);
			setState(353);
			expression();
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

	public static class BinaryExprContext extends ParserRuleContext {
		public ContextExprContext contextExpr() {
			return getRuleContext(ContextExprContext.class,0);
		}
		public InjectExprContext injectExpr() {
			return getRuleContext(InjectExprContext.class,0);
		}
		public TypeOfExprContext typeOfExpr() {
			return getRuleContext(TypeOfExprContext.class,0);
		}
		public BindExprContext bindExpr() {
			return getRuleContext(BindExprContext.class,0);
		}
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public NotEqualExprContext notEqualExpr() {
			return getRuleContext(NotEqualExprContext.class,0);
		}
		public BinaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitBinaryExpr(this);
		}
	}

	public final BinaryExprContext binaryExpr() throws RecognitionException {
		BinaryExprContext _localctx = new BinaryExprContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_binaryExpr);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				contextExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				injectExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				typeOfExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				bindExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(359);
				assignExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(360);
				notEqualExpr();
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

	public static class ContextExprContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(MiaParser.INDENT, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode OUTDENT() { return getToken(MiaParser.OUTDENT, 0); }
		public ContextExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterContextExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitContextExpr(this);
		}
	}

	public final ContextExprContext contextExpr() throws RecognitionException {
		ContextExprContext _localctx = new ContextExprContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_contextExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			expression();
			setState(364);
			match(LEFTANGLECOLON);
			setState(365);
			match(INDENT);
			setState(366);
			exprlist(0);
			setState(367);
			match(OUTDENT);
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

	public static class InjectExprContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InjectExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterInjectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitInjectExpr(this);
		}
	}

	public final InjectExprContext injectExpr() throws RecognitionException {
		InjectExprContext _localctx = new InjectExprContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_injectExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			expression();
			setState(370);
			match(LEFTANGLE2COLON);
			setState(371);
			expression();
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

	public static class TypeOfExprContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeOfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOfExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterTypeOfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitTypeOfExpr(this);
		}
	}

	public final TypeOfExprContext typeOfExpr() throws RecognitionException {
		TypeOfExprContext _localctx = new TypeOfExprContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_typeOfExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			expression();
			setState(374);
			match(HAT);
			setState(375);
			expression();
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

	public static class AssignExprContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitAssignExpr(this);
		}
	}

	public final AssignExprContext assignExpr() throws RecognitionException {
		AssignExprContext _localctx = new AssignExprContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_assignExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			expression();
			setState(378);
			match(EQ);
			setState(379);
			expression();
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

	public static class BindExprContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BindExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterBindExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitBindExpr(this);
		}
	}

	public final BindExprContext bindExpr() throws RecognitionException {
		BindExprContext _localctx = new BindExprContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_bindExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			expression();
			setState(382);
			match(ARROW);
			setState(383);
			expression();
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

	public static class NotEqualExprContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public NotEqualExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notEqualExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterNotEqualExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitNotEqualExpr(this);
		}
	}

	public final NotEqualExprContext notEqualExpr() throws RecognitionException {
		NotEqualExprContext _localctx = new NotEqualExprContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_notEqualExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			expression();
			setState(386);
			match(BANGEQ);
			setState(387);
			expression();
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

	public static class ReturnExprContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).enterReturnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiaListener ) ((MiaListener)listener).exitReturnExpr(this);
		}
	}

	public final ReturnExprContext returnExpr() throws RecognitionException {
		ReturnExprContext _localctx = new ReturnExprContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_returnExpr);
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(RETURN);
				setState(390);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(RETURN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return body_sempred((BodyContext)_localctx, predIndex);
		case 5:
			return commalist_sempred((CommalistContext)_localctx, predIndex);
		case 6:
			return exprlist_sempred((ExprlistContext)_localctx, predIndex);
		case 14:
			return lhs_sempred((LhsContext)_localctx, predIndex);
		case 15:
			return rhs_sempred((RhsContext)_localctx, predIndex);
		case 36:
			return properties_sempred((PropertiesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean body_sempred(BodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean commalist_sempred(CommalistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exprlist_sempred(ExprlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lhs_sempred(LhsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean rhs_sempred(RhsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean properties_sempred(PropertiesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u018d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6\u008a\n\6\f\6\16\6\u008d\13\6\3\7\3\7\5\7\u0091\n\7\3\7\3\7\3"+
		"\7\7\7\u0096\n\7\f\7\16\7\u0099\13\7\3\b\3\b\5\b\u009d\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\b\u00a4\n\b\f\b\16\b\u00a7\13\b\3\t\3\t\5\t\u00ab\n\t\3\n\3"+
		"\n\3\n\3\n\5\n\u00b1\n\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\7\20\u00cc\n\20\f\20\16\20\u00cf\13\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u00d9\n\21\f\21\16\21\u00dc\13\21\3\22\3\22\3\22\3"+
		"\22\5\22\u00e2\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\5\30\u00f5\n\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\5\34\u00ff\n\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u010b\n\37\3 \3 \3 \3 \3 \5 \u0112\n \3!\3!\3!\3"+
		"!\5!\u0118\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0125\n"+
		"\"\3#\3#\3$\3$\3%\3%\3%\3%\5%\u012f\n%\3&\3&\3&\3&\3&\7&\u0136\n&\f&\16"+
		"&\u0139\13&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0141\n\'\3(\3(\3(\3(\3(\3(\3"+
		"(\5(\u014a\n(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3"+
		"/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u016c\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\39\39\3"+
		"9\59\u018b\n9\39\2\b\n\f\16\36 J:\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\2\3\6\2%%((++-"+
		"-\2\u017f\2r\3\2\2\2\4t\3\2\2\2\6w\3\2\2\2\b\177\3\2\2\2\n\u0081\3\2\2"+
		"\2\f\u0090\3\2\2\2\16\u009c\3\2\2\2\20\u00aa\3\2\2\2\22\u00b0\3\2\2\2"+
		"\24\u00b2\3\2\2\2\26\u00b5\3\2\2\2\30\u00b7\3\2\2\2\32\u00bb\3\2\2\2\34"+
		"\u00bd\3\2\2\2\36\u00c3\3\2\2\2 \u00d0\3\2\2\2\"\u00e1\3\2\2\2$\u00e3"+
		"\3\2\2\2&\u00e6\3\2\2\2(\u00e9\3\2\2\2*\u00ec\3\2\2\2,\u00ef\3\2\2\2."+
		"\u00f4\3\2\2\2\60\u00f6\3\2\2\2\62\u00f8\3\2\2\2\64\u00fa\3\2\2\2\66\u00fe"+
		"\3\2\2\28\u0100\3\2\2\2:\u0102\3\2\2\2<\u010a\3\2\2\2>\u0111\3\2\2\2@"+
		"\u0117\3\2\2\2B\u0124\3\2\2\2D\u0126\3\2\2\2F\u0128\3\2\2\2H\u012e\3\2"+
		"\2\2J\u0130\3\2\2\2L\u0140\3\2\2\2N\u0149\3\2\2\2P\u014b\3\2\2\2R\u014d"+
		"\3\2\2\2T\u0150\3\2\2\2V\u0153\3\2\2\2X\u0156\3\2\2\2Z\u0159\3\2\2\2\\"+
		"\u015c\3\2\2\2^\u015f\3\2\2\2`\u0162\3\2\2\2b\u016b\3\2\2\2d\u016d\3\2"+
		"\2\2f\u0173\3\2\2\2h\u0177\3\2\2\2j\u017b\3\2\2\2l\u017f\3\2\2\2n\u0183"+
		"\3\2\2\2p\u018a\3\2\2\2rs\t\2\2\2s\3\3\2\2\2tu\5\6\4\2uv\7\2\2\3v\5\3"+
		"\2\2\2wx\5\n\6\2x\7\3\2\2\2yz\7.\2\2z\u0080\7/\2\2{|\7.\2\2|}\5\n\6\2"+
		"}~\7/\2\2~\u0080\3\2\2\2\177y\3\2\2\2\177{\3\2\2\2\u0080\t\3\2\2\2\u0081"+
		"\u0082\b\6\1\2\u0082\u0083\5\20\t\2\u0083\u008b\3\2\2\2\u0084\u0085\f"+
		"\4\2\2\u0085\u0086\7\60\2\2\u0086\u008a\5\20\t\2\u0087\u0088\f\3\2\2\u0088"+
		"\u008a\7\60\2\2\u0089\u0084\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008d\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\13\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0091\b\7\1\2\u008f\u0091\5,\27\2\u0090\u008e\3\2"+
		"\2\2\u0090\u008f\3\2\2\2\u0091\u0097\3\2\2\2\u0092\u0093\f\3\2\2\u0093"+
		"\u0094\7\"\2\2\u0094\u0096\5,\27\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\r\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009d\b\b\1\2\u009b\u009d\5,\27\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009b\3\2\2\2\u009d\u00a5\3\2\2\2\u009e\u009f\f\4\2\2\u009f\u00a0\7\60"+
		"\2\2\u00a0\u00a4\5,\27\2\u00a1\u00a2\f\3\2\2\u00a2\u00a4\7\60\2\2\u00a3"+
		"\u009e\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\17\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab"+
		"\5\22\n\2\u00a9\u00ab\5,\27\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2"+
		"\u00ab\21\3\2\2\2\u00ac\u00b1\5\24\13\2\u00ad\u00b1\5\30\r\2\u00ae\u00b1"+
		"\5\34\17\2\u00af\u00b1\5p9\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\23\3\2\2\2\u00b2\u00b3\7\n\2"+
		"\2\u00b3\u00b4\5,\27\2\u00b4\25\3\2\2\2\u00b5\u00b6\5L\'\2\u00b6\27\3"+
		"\2\2\2\u00b7\u00b8\7\13\2\2\u00b8\u00b9\5\26\f\2\u00b9\u00ba\5\b\5\2\u00ba"+
		"\31\3\2\2\2\u00bb\u00bc\5,\27\2\u00bc\33\3\2\2\2\u00bd\u00be\7\16\2\2"+
		"\u00be\u00bf\7.\2\2\u00bf\u00c0\5\36\20\2\u00c0\u00c1\5 \21\2\u00c1\u00c2"+
		"\7/\2\2\u00c2\35\3\2\2\2\u00c3\u00c4\b\20\1\2\u00c4\u00c5\5\32\16\2\u00c5"+
		"\u00cd\3\2\2\2\u00c6\u00c7\f\4\2\2\u00c7\u00c8\7\60\2\2\u00c8\u00cc\5"+
		"\32\16\2\u00c9\u00ca\f\3\2\2\u00ca\u00cc\7\60\2\2\u00cb\u00c6\3\2\2\2"+
		"\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\37\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\b\21\1\2\u00d1"+
		"\u00d2\5\"\22\2\u00d2\u00da\3\2\2\2\u00d3\u00d4\f\4\2\2\u00d4\u00d5\7"+
		"\60\2\2\u00d5\u00d9\5\"\22\2\u00d6\u00d7\f\3\2\2\u00d7\u00d9\7\60\2\2"+
		"\u00d8\u00d3\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db!\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00e2\5$\23\2\u00de\u00e2\5&\24\2\u00df\u00e2\5(\25\2\u00e0\u00e2\5*"+
		"\26\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2#\3\2\2\2\u00e3\u00e4\7\17\2\2\u00e4\u00e5\5\b\5\2"+
		"\u00e5%\3\2\2\2\u00e6\u00e7\7\20\2\2\u00e7\u00e8\5\b\5\2\u00e8\'\3\2\2"+
		"\2\u00e9\u00ea\7\21\2\2\u00ea\u00eb\5\b\5\2\u00eb)\3\2\2\2\u00ec\u00ed"+
		"\7\22\2\2\u00ed\u00ee\5\b\5\2\u00ee+\3\2\2\2\u00ef\u00f0\5N(\2\u00f0-"+
		"\3\2\2\2\u00f1\u00f5\5\66\34\2\u00f2\u00f5\58\35\2\u00f3\u00f5\5:\36\2"+
		"\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5/\3"+
		"\2\2\2\u00f6\u00f7\7\5\2\2\u00f7\61\3\2\2\2\u00f8\u00f9\7\35\2\2\u00f9"+
		"\63\3\2\2\2\u00fa\u00fb\5\62\32\2\u00fb\65\3\2\2\2\u00fc\u00ff\5\64\33"+
		"\2\u00fd\u00ff\7\6\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\67"+
		"\3\2\2\2\u0100\u0101\7*\2\2\u01019\3\2\2\2\u0102\u0103\7)\2\2\u0103;\3"+
		"\2\2\2\u0104\u010b\5> \2\u0105\u0106\5\66\34\2\u0106\u0107\7.\2\2\u0107"+
		"\u0108\5\16\b\2\u0108\u0109\7/\2\2\u0109\u010b\3\2\2\2\u010a\u0104\3\2"+
		"\2\2\u010a\u0105\3\2\2\2\u010b=\3\2\2\2\u010c\u0112\5@!\2\u010d\u010e"+
		"\5@!\2\u010e\u010f\7\"\2\2\u010f\u0110\5\f\7\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010c\3\2\2\2\u0111\u010d\3\2\2\2\u0112?\3\2\2\2\u0113\u0118\5B\"\2\u0114"+
		"\u0115\5B\"\2\u0115\u0116\5J&\2\u0116\u0118\3\2\2\2\u0117\u0113\3\2\2"+
		"\2\u0117\u0114\3\2\2\2\u0118A\3\2\2\2\u0119\u011a\5,\27\2\u011a\u011b"+
		"\5\60\31\2\u011b\u011c\5,\27\2\u011c\u0125\3\2\2\2\u011d\u011e\5,\27\2"+
		"\u011e\u011f\5\60\31\2\u011f\u0125\3\2\2\2\u0120\u0121\5\60\31\2\u0121"+
		"\u0122\5,\27\2\u0122\u0125\3\2\2\2\u0123\u0125\5\60\31\2\u0124\u0119\3"+
		"\2\2\2\u0124\u011d\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0123\3\2\2\2\u0125"+
		"C\3\2\2\2\u0126\u0127\7\36\2\2\u0127E\3\2\2\2\u0128\u0129\7\37\2\2\u0129"+
		"G\3\2\2\2\u012a\u012f\5F$\2\u012b\u012c\5F$\2\u012c\u012d\5,\27\2\u012d"+
		"\u012f\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012b\3\2\2\2\u012fI\3\2\2\2"+
		"\u0130\u0131\b&\1\2\u0131\u0132\5H%\2\u0132\u0137\3\2\2\2\u0133\u0134"+
		"\f\3\2\2\u0134\u0136\5H%\2\u0135\u0133\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138K\3\2\2\2\u0139\u0137\3\2\2\2"+
		"\u013a\u013b\7 \2\2\u013b\u0141\7!\2\2\u013c\u013d\7 \2\2\u013d\u013e"+
		"\5,\27\2\u013e\u013f\7!\2\2\u013f\u0141\3\2\2\2\u0140\u013a\3\2\2\2\u0140"+
		"\u013c\3\2\2\2\u0141M\3\2\2\2\u0142\u014a\5R*\2\u0143\u014a\5T+\2\u0144"+
		"\u014a\5V,\2\u0145\u014a\5X-\2\u0146\u014a\5Z.\2\u0147\u014a\5\\/\2\u0148"+
		"\u014a\5`\61\2\u0149\u0142\3\2\2\2\u0149\u0143\3\2\2\2\u0149\u0144\3\2"+
		"\2\2\u0149\u0145\3\2\2\2\u0149\u0146\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u0148\3\2\2\2\u014aO\3\2\2\2\u014b\u014c\5^\60\2\u014cQ\3\2\2\2\u014d"+
		"\u014e\5D#\2\u014e\u014f\5,\27\2\u014fS\3\2\2\2\u0150\u0151\7\f\2\2\u0151"+
		"\u0152\5,\27\2\u0152U\3\2\2\2\u0153\u0154\7\24\2\2\u0154\u0155\5,\27\2"+
		"\u0155W\3\2\2\2\u0156\u0157\7\25\2\2\u0157\u0158\5,\27\2\u0158Y\3\2\2"+
		"\2\u0159\u015a\7\26\2\2\u015a\u015b\5,\27\2\u015b[\3\2\2\2\u015c\u015d"+
		"\7\27\2\2\u015d\u015e\5,\27\2\u015e]\3\2\2\2\u015f\u0160\5,\27\2\u0160"+
		"\u0161\7\34\2\2\u0161_\3\2\2\2\u0162\u0163\7\31\2\2\u0163\u0164\5,\27"+
		"\2\u0164a\3\2\2\2\u0165\u016c\5d\63\2\u0166\u016c\5f\64\2\u0167\u016c"+
		"\5h\65\2\u0168\u016c\5l\67\2\u0169\u016c\5j\66\2\u016a\u016c\5n8\2\u016b"+
		"\u0165\3\2\2\2\u016b\u0166\3\2\2\2\u016b\u0167\3\2\2\2\u016b\u0168\3\2"+
		"\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016cc\3\2\2\2\u016d\u016e"+
		"\5,\27\2\u016e\u016f\7&\2\2\u016f\u0170\7.\2\2\u0170\u0171\5\16\b\2\u0171"+
		"\u0172\7/\2\2\u0172e\3\2\2\2\u0173\u0174\5,\27\2\u0174\u0175\7\'\2\2\u0175"+
		"\u0176\5,\27\2\u0176g\3\2\2\2\u0177\u0178\5,\27\2\u0178\u0179\7$\2\2\u0179"+
		"\u017a\5,\27\2\u017ai\3\2\2\2\u017b\u017c\5,\27\2\u017c\u017d\7\33\2\2"+
		"\u017d\u017e\5,\27\2\u017ek\3\2\2\2\u017f\u0180\5,\27\2\u0180\u0181\7"+
		"\23\2\2\u0181\u0182\5,\27\2\u0182m\3\2\2\2\u0183\u0184\5,\27\2\u0184\u0185"+
		"\7\32\2\2\u0185\u0186\5,\27\2\u0186o\3\2\2\2\u0187\u0188\7\r\2\2\u0188"+
		"\u018b\5,\27\2\u0189\u018b\7\r\2\2\u018a\u0187\3\2\2\2\u018a\u0189\3\2"+
		"\2\2\u018bq\3\2\2\2\35\177\u0089\u008b\u0090\u0097\u009c\u00a3\u00a5\u00aa"+
		"\u00b0\u00cb\u00cd\u00d8\u00da\u00e1\u00f4\u00fe\u010a\u0111\u0117\u0124"+
		"\u012e\u0137\u0140\u0149\u016b\u018a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}