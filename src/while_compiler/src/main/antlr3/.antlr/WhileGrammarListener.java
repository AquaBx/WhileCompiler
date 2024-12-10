// Generated from /home/titouan/Documents/ESIR/S7/TLC/Projet/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g by ANTLR 4.9.2
 package org.esir.nctt.antlr; 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WhileGrammarParser}.
 */
public interface WhileGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(WhileGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(WhileGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(WhileGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(WhileGrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(WhileGrammarParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(WhileGrammarParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(WhileGrammarParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(WhileGrammarParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#input_stub}.
	 * @param ctx the parse tree
	 */
	void enterInput_stub(WhileGrammarParser.Input_stubContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#input_stub}.
	 * @param ctx the parse tree
	 */
	void exitInput_stub(WhileGrammarParser.Input_stubContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(WhileGrammarParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(WhileGrammarParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(WhileGrammarParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(WhileGrammarParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(WhileGrammarParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(WhileGrammarParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(WhileGrammarParser.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(WhileGrammarParser.ExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#command_vars}.
	 * @param ctx the parse tree
	 */
	void enterCommand_vars(WhileGrammarParser.Command_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#command_vars}.
	 * @param ctx the parse tree
	 */
	void exitCommand_vars(WhileGrammarParser.Command_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#command_if}.
	 * @param ctx the parse tree
	 */
	void enterCommand_if(WhileGrammarParser.Command_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#command_if}.
	 * @param ctx the parse tree
	 */
	void exitCommand_if(WhileGrammarParser.Command_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#command_while}.
	 * @param ctx the parse tree
	 */
	void enterCommand_while(WhileGrammarParser.Command_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#command_while}.
	 * @param ctx the parse tree
	 */
	void exitCommand_while(WhileGrammarParser.Command_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#command_for}.
	 * @param ctx the parse tree
	 */
	void enterCommand_for(WhileGrammarParser.Command_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#command_for}.
	 * @param ctx the parse tree
	 */
	void exitCommand_for(WhileGrammarParser.Command_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#command_foreach}.
	 * @param ctx the parse tree
	 */
	void enterCommand_foreach(WhileGrammarParser.Command_foreachContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#command_foreach}.
	 * @param ctx the parse tree
	 */
	void exitCommand_foreach(WhileGrammarParser.Command_foreachContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#command_nop}.
	 * @param ctx the parse tree
	 */
	void enterCommand_nop(WhileGrammarParser.Command_nopContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#command_nop}.
	 * @param ctx the parse tree
	 */
	void exitCommand_nop(WhileGrammarParser.Command_nopContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(WhileGrammarParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(WhileGrammarParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#exprbase1}.
	 * @param ctx the parse tree
	 */
	void enterExprbase1(WhileGrammarParser.Exprbase1Context ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#exprbase1}.
	 * @param ctx the parse tree
	 */
	void exitExprbase1(WhileGrammarParser.Exprbase1Context ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#expr_constructor}.
	 * @param ctx the parse tree
	 */
	void enterExpr_constructor(WhileGrammarParser.Expr_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#expr_constructor}.
	 * @param ctx the parse tree
	 */
	void exitExpr_constructor(WhileGrammarParser.Expr_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#exprbase3}.
	 * @param ctx the parse tree
	 */
	void enterExprbase3(WhileGrammarParser.Exprbase3Context ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#exprbase3}.
	 * @param ctx the parse tree
	 */
	void exitExprbase3(WhileGrammarParser.Exprbase3Context ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#expr_call}.
	 * @param ctx the parse tree
	 */
	void enterExpr_call(WhileGrammarParser.Expr_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#expr_call}.
	 * @param ctx the parse tree
	 */
	void exitExpr_call(WhileGrammarParser.Expr_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#exprbase}.
	 * @param ctx the parse tree
	 */
	void enterExprbase(WhileGrammarParser.ExprbaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#exprbase}.
	 * @param ctx the parse tree
	 */
	void exitExprbase(WhileGrammarParser.ExprbaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(WhileGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(WhileGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhileGrammarParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void enterLexpr(WhileGrammarParser.LexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhileGrammarParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void exitLexpr(WhileGrammarParser.LexprContext ctx);
}