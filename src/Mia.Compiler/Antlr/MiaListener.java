// Generated from Mia.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiaParser}.
 */
public interface MiaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiaParser#ignore}.
	 * @param ctx the parse tree
	 */
	void enterIgnore(MiaParser.IgnoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#ignore}.
	 * @param ctx the parse tree
	 */
	void exitIgnore(MiaParser.IgnoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(MiaParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(MiaParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(MiaParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(MiaParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MiaParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MiaParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#commalist}.
	 * @param ctx the parse tree
	 */
	void enterCommalist(MiaParser.CommalistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#commalist}.
	 * @param ctx the parse tree
	 */
	void exitCommalist(MiaParser.CommalistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(MiaParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(MiaParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(MiaParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(MiaParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(MiaParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(MiaParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#trigger}.
	 * @param ctx the parse tree
	 */
	void enterTrigger(MiaParser.TriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#trigger}.
	 * @param ctx the parse tree
	 */
	void exitTrigger(MiaParser.TriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#ruledef}.
	 * @param ctx the parse tree
	 */
	void enterRuledef(MiaParser.RuledefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#ruledef}.
	 * @param ctx the parse tree
	 */
	void exitRuledef(MiaParser.RuledefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MiaParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MiaParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(MiaParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(MiaParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(MiaParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(MiaParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(MiaParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(MiaParser.RhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(MiaParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(MiaParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#whereTrue}.
	 * @param ctx the parse tree
	 */
	void enterWhereTrue(MiaParser.WhereTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#whereTrue}.
	 * @param ctx the parse tree
	 */
	void exitWhereTrue(MiaParser.WhereTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#whereFalse}.
	 * @param ctx the parse tree
	 */
	void enterWhereFalse(MiaParser.WhereFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#whereFalse}.
	 * @param ctx the parse tree
	 */
	void exitWhereFalse(MiaParser.WhereFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#whereAllTrue}.
	 * @param ctx the parse tree
	 */
	void enterWhereAllTrue(MiaParser.WhereAllTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#whereAllTrue}.
	 * @param ctx the parse tree
	 */
	void exitWhereAllTrue(MiaParser.WhereAllTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#whereAllFalse}.
	 * @param ctx the parse tree
	 */
	void enterWhereAllFalse(MiaParser.WhereAllFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#whereAllFalse}.
	 * @param ctx the parse tree
	 */
	void exitWhereAllFalse(MiaParser.WhereAllFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(MiaParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(MiaParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(MiaParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(MiaParser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(MiaParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(MiaParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MiaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MiaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MiaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MiaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MiaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MiaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#snippet}.
	 * @param ctx the parse tree
	 */
	void enterSnippet(MiaParser.SnippetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#snippet}.
	 * @param ctx the parse tree
	 */
	void exitSnippet(MiaParser.SnippetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterParagraph(MiaParser.ParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitParagraph(MiaParser.ParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(MiaParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(MiaParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(MiaParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(MiaParser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#simpleclause}.
	 * @param ctx the parse tree
	 */
	void enterSimpleclause(MiaParser.SimpleclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#simpleclause}.
	 * @param ctx the parse tree
	 */
	void exitSimpleclause(MiaParser.SimpleclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(MiaParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(MiaParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(MiaParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(MiaParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(MiaParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(MiaParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(MiaParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(MiaParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#parenExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(MiaParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#parenExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(MiaParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#prefixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpr(MiaParser.PrefixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#prefixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpr(MiaParser.PrefixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(MiaParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#postfixExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(MiaParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#typed}.
	 * @param ctx the parse tree
	 */
	void enterTyped(MiaParser.TypedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#typed}.
	 * @param ctx the parse tree
	 */
	void exitTyped(MiaParser.TypedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(MiaParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(MiaParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#assertExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssertExpr(MiaParser.AssertExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#assertExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssertExpr(MiaParser.AssertExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#retract}.
	 * @param ctx the parse tree
	 */
	void enterRetract(MiaParser.RetractContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#retract}.
	 * @param ctx the parse tree
	 */
	void exitRetract(MiaParser.RetractContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#modify}.
	 * @param ctx the parse tree
	 */
	void enterModify(MiaParser.ModifyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#modify}.
	 * @param ctx the parse tree
	 */
	void exitModify(MiaParser.ModifyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#propose}.
	 * @param ctx the parse tree
	 */
	void enterPropose(MiaParser.ProposeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#propose}.
	 * @param ctx the parse tree
	 */
	void exitPropose(MiaParser.ProposeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#achieve}.
	 * @param ctx the parse tree
	 */
	void enterAchieve(MiaParser.AchieveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#achieve}.
	 * @param ctx the parse tree
	 */
	void exitAchieve(MiaParser.AchieveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#slash}.
	 * @param ctx the parse tree
	 */
	void enterSlash(MiaParser.SlashContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#slash}.
	 * @param ctx the parse tree
	 */
	void exitSlash(MiaParser.SlashContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(MiaParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#binaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(MiaParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#contextExpr}.
	 * @param ctx the parse tree
	 */
	void enterContextExpr(MiaParser.ContextExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#contextExpr}.
	 * @param ctx the parse tree
	 */
	void exitContextExpr(MiaParser.ContextExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#injectExpr}.
	 * @param ctx the parse tree
	 */
	void enterInjectExpr(MiaParser.InjectExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#injectExpr}.
	 * @param ctx the parse tree
	 */
	void exitInjectExpr(MiaParser.InjectExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#typeOfExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfExpr(MiaParser.TypeOfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#typeOfExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfExpr(MiaParser.TypeOfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(MiaParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#assignExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(MiaParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#bindExpr}.
	 * @param ctx the parse tree
	 */
	void enterBindExpr(MiaParser.BindExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#bindExpr}.
	 * @param ctx the parse tree
	 */
	void exitBindExpr(MiaParser.BindExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#notEqualExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualExpr(MiaParser.NotEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#notEqualExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualExpr(MiaParser.NotEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiaParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpr(MiaParser.ReturnExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiaParser#returnExpr}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpr(MiaParser.ReturnExprContext ctx);
}