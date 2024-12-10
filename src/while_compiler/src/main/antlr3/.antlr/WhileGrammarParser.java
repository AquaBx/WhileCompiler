// Generated from /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g by ANTLR 4.13.1
 package org.esir.nctt.antlr; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class WhileGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, VARIABLE=28, SYMBOL=29, IDENT=30, WS=31, 
		COMMENT=32;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_definition = 2, RULE_input = 3, 
		RULE_input_stub = 4, RULE_output = 5, RULE_vars = 6, RULE_commands = 7, 
		RULE_exprs = 8, RULE_command_vars = 9, RULE_command_if = 10, RULE_command_while = 11, 
		RULE_command_for = 12, RULE_command_foreach = 13, RULE_command_nop = 14, 
		RULE_command = 15, RULE_exprbase1 = 16, RULE_expr_constructor = 17, RULE_exprbase3 = 18, 
		RULE_expr_call = 19, RULE_exprbase = 20, RULE_expression = 21, RULE_lexpr = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "definition", "input", "input_stub", "output", 
			"vars", "commands", "exprs", "command_vars", "command_if", "command_while", 
			"command_for", "command_foreach", "command_nop", "command", "exprbase1", 
			"expr_constructor", "exprbase3", "expr_call", "exprbase", "expression", 
			"lexpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", 
			"':='", "'if'", "'then'", "'else'", "'fi'", "'while'", "'do'", "'od'", 
			"'for'", "'foreach'", "'in'", "'nop'", "'nil'", "'cons'", "'list'", "'hd'", 
			"'tl'", "'('", "')'", "'=?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "VARIABLE", "SYMBOL", "IDENT", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "WhileGrammar.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WhileGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			function();
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(47);
				program();
				}
				break;
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(WhileGrammarParser.SYMBOL, 0); }
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(51);
			match(SYMBOL);
			setState(52);
			match(T__1);
			setState(53);
			definition();
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
	public static class DefinitionContext extends ParserRuleContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__2);
			setState(56);
			input();
			setState(57);
			match(T__3);
			setState(58);
			commands();
			setState(59);
			match(T__3);
			setState(60);
			match(T__4);
			setState(61);
			output();
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
	public static class InputContext extends ParserRuleContext {
		public Input_stubContext input_stub() {
			return getRuleContext(Input_stubContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VARIABLE) {
				{
				setState(63);
				input_stub();
				}
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
	public static class Input_stubContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(WhileGrammarParser.VARIABLE, 0); }
		public Input_stubContext input_stub() {
			return getRuleContext(Input_stubContext.class,0);
		}
		public Input_stubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_stub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterInput_stub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitInput_stub(this);
		}
	}

	public final Input_stubContext input_stub() throws RecognitionException {
		Input_stubContext _localctx = new Input_stubContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_input_stub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(VARIABLE);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(67);
				match(T__5);
				setState(68);
				input_stub();
				}
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
	public static class OutputContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(WhileGrammarParser.VARIABLE, 0); }
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(VARIABLE);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(72);
				match(T__5);
				setState(73);
				output();
				}
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
	public static class VarsContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(WhileGrammarParser.VARIABLE, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(VARIABLE);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(77);
				match(T__5);
				setState(78);
				vars();
				}
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
	public static class CommandsContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitCommands(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			command();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(82);
				match(T__6);
				setState(83);
				commands();
				}
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
	public static class ExprsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitExprs(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			expression();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(87);
				match(T__5);
				setState(88);
				exprs();
				}
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
	public static class Command_varsContext extends ParserRuleContext {
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public Command_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterCommand_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitCommand_vars(this);
		}
	}

	public final Command_varsContext command_vars() throws RecognitionException {
		Command_varsContext _localctx = new Command_varsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_command_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			vars();
			setState(92);
			match(T__7);
			setState(93);
			exprs();
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
	public static class Command_ifContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public Command_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterCommand_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitCommand_if(this);
		}
	}

	public final Command_ifContext command_if() throws RecognitionException {
		Command_ifContext _localctx = new Command_ifContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_command_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__8);
			setState(96);
			expression();
			setState(97);
			match(T__9);
			setState(98);
			commands();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(99);
				match(T__10);
				setState(100);
				commands();
				}
			}

			setState(103);
			match(T__11);
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
	public static class Command_whileContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public Command_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterCommand_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitCommand_while(this);
		}
	}

	public final Command_whileContext command_while() throws RecognitionException {
		Command_whileContext _localctx = new Command_whileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_command_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__12);
			setState(106);
			expression();
			setState(107);
			match(T__13);
			setState(108);
			commands();
			setState(109);
			match(T__14);
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
	public static class Command_forContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public Command_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterCommand_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitCommand_for(this);
		}
	}

	public final Command_forContext command_for() throws RecognitionException {
		Command_forContext _localctx = new Command_forContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_command_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__15);
			setState(112);
			expression();
			setState(113);
			match(T__13);
			setState(114);
			commands();
			setState(115);
			match(T__14);
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
	public static class Command_foreachContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(WhileGrammarParser.VARIABLE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public Command_foreachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterCommand_foreach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitCommand_foreach(this);
		}
	}

	public final Command_foreachContext command_foreach() throws RecognitionException {
		Command_foreachContext _localctx = new Command_foreachContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_command_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__16);
			setState(118);
			match(VARIABLE);
			setState(119);
			match(T__17);
			setState(120);
			expression();
			setState(121);
			match(T__13);
			setState(122);
			commands();
			setState(123);
			match(T__14);
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
	public static class Command_nopContext extends ParserRuleContext {
		public Command_nopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_nop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterCommand_nop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitCommand_nop(this);
		}
	}

	public final Command_nopContext command_nop() throws RecognitionException {
		Command_nopContext _localctx = new Command_nopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_command_nop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__18);
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
	public static class CommandContext extends ParserRuleContext {
		public Command_ifContext command_if() {
			return getRuleContext(Command_ifContext.class,0);
		}
		public Command_whileContext command_while() {
			return getRuleContext(Command_whileContext.class,0);
		}
		public Command_forContext command_for() {
			return getRuleContext(Command_forContext.class,0);
		}
		public Command_foreachContext command_foreach() {
			return getRuleContext(Command_foreachContext.class,0);
		}
		public Command_varsContext command_vars() {
			return getRuleContext(Command_varsContext.class,0);
		}
		public Command_nopContext command_nop() {
			return getRuleContext(Command_nopContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_command);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				command_if();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				command_while();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				command_for();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				command_foreach();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				command_vars();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				command_nop();
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
	public static class Exprbase1Context extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(WhileGrammarParser.VARIABLE, 0); }
		public TerminalNode SYMBOL() { return getToken(WhileGrammarParser.SYMBOL, 0); }
		public Exprbase1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprbase1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterExprbase1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitExprbase1(this);
		}
	}

	public final Exprbase1Context exprbase1() throws RecognitionException {
		Exprbase1Context _localctx = new Exprbase1Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprbase1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 806354944L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_constructorContext extends ParserRuleContext {
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public Expr_constructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterExpr_constructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitExpr_constructor(this);
		}
	}

	public final Expr_constructorContext expr_constructor() throws RecognitionException {
		Expr_constructorContext _localctx = new Expr_constructorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(138);
			lexpr();
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
	public static class Exprbase3Context extends ParserRuleContext {
		public ExprbaseContext exprbase() {
			return getRuleContext(ExprbaseContext.class,0);
		}
		public Exprbase3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprbase3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterExprbase3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitExprbase3(this);
		}
	}

	public final Exprbase3Context exprbase3() throws RecognitionException {
		Exprbase3Context _localctx = new Exprbase3Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprbase3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(141);
			exprbase();
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
	public static class Expr_callContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(WhileGrammarParser.SYMBOL, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public Expr_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterExpr_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitExpr_call(this);
		}
	}

	public final Expr_callContext expr_call() throws RecognitionException {
		Expr_callContext _localctx = new Expr_callContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(SYMBOL);
			setState(144);
			lexpr();
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
	public static class ExprbaseContext extends ParserRuleContext {
		public Exprbase1Context exprbase1() {
			return getRuleContext(Exprbase1Context.class,0);
		}
		public Expr_constructorContext expr_constructor() {
			return getRuleContext(Expr_constructorContext.class,0);
		}
		public Exprbase3Context exprbase3() {
			return getRuleContext(Exprbase3Context.class,0);
		}
		public Expr_callContext expr_call() {
			return getRuleContext(Expr_callContext.class,0);
		}
		public ExprbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprbase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterExprbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitExprbase(this);
		}
	}

	public final ExprbaseContext exprbase() throws RecognitionException {
		ExprbaseContext _localctx = new ExprbaseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exprbase);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case VARIABLE:
			case SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				exprbase1();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(147);
				match(T__24);
				setState(151);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__20:
				case T__21:
					{
					setState(148);
					expr_constructor();
					}
					break;
				case T__22:
				case T__23:
					{
					setState(149);
					exprbase3();
					}
					break;
				case SYMBOL:
					{
					setState(150);
					expr_call();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(153);
				match(T__25);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<ExprbaseContext> exprbase() {
			return getRuleContexts(ExprbaseContext.class);
		}
		public ExprbaseContext exprbase(int i) {
			return getRuleContext(ExprbaseContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			exprbase();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(158);
				match(T__26);
				setState(159);
				exprbase();
				}
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
	public static class LexprContext extends ParserRuleContext {
		public ExprbaseContext exprbase() {
			return getRuleContext(ExprbaseContext.class,0);
		}
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public LexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).enterLexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WhileGrammarListener ) ((WhileGrammarListener)listener).exitLexpr(this);
		}
	}

	public final LexprContext lexpr() throws RecognitionException {
		LexprContext _localctx = new LexprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_lexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 839909376L) != 0)) {
				{
				setState(162);
				exprbase();
				setState(163);
				lexpr();
				}
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

	public static final String _serializedATN =
		"\u0004\u0001 \u00a8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0003\u00001\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0003\u0003A\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004F\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005K\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"P\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007U\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0003\bZ\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nf\b\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0086\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0098\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u009c\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00a1\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u00a6\b\u0016\u0001\u0016\u0000\u0000"+
		"\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,\u0000\u0003\u0002\u0000\u0014\u0014\u001c\u001d"+
		"\u0001\u0000\u0015\u0016\u0001\u0000\u0017\u0018\u00a2\u0000.\u0001\u0000"+
		"\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000"+
		"\u0006@\u0001\u0000\u0000\u0000\bB\u0001\u0000\u0000\u0000\nG\u0001\u0000"+
		"\u0000\u0000\fL\u0001\u0000\u0000\u0000\u000eQ\u0001\u0000\u0000\u0000"+
		"\u0010V\u0001\u0000\u0000\u0000\u0012[\u0001\u0000\u0000\u0000\u0014_"+
		"\u0001\u0000\u0000\u0000\u0016i\u0001\u0000\u0000\u0000\u0018o\u0001\u0000"+
		"\u0000\u0000\u001au\u0001\u0000\u0000\u0000\u001c}\u0001\u0000\u0000\u0000"+
		"\u001e\u0085\u0001\u0000\u0000\u0000 \u0087\u0001\u0000\u0000\u0000\""+
		"\u0089\u0001\u0000\u0000\u0000$\u008c\u0001\u0000\u0000\u0000&\u008f\u0001"+
		"\u0000\u0000\u0000(\u009b\u0001\u0000\u0000\u0000*\u009d\u0001\u0000\u0000"+
		"\u0000,\u00a5\u0001\u0000\u0000\u0000.0\u0003\u0002\u0001\u0000/1\u0003"+
		"\u0000\u0000\u00000/\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u0000"+
		"1\u0001\u0001\u0000\u0000\u000023\u0005\u0001\u0000\u000034\u0005\u001d"+
		"\u0000\u000045\u0005\u0002\u0000\u000056\u0003\u0004\u0002\u00006\u0003"+
		"\u0001\u0000\u0000\u000078\u0005\u0003\u0000\u000089\u0003\u0006\u0003"+
		"\u00009:\u0005\u0004\u0000\u0000:;\u0003\u000e\u0007\u0000;<\u0005\u0004"+
		"\u0000\u0000<=\u0005\u0005\u0000\u0000=>\u0003\n\u0005\u0000>\u0005\u0001"+
		"\u0000\u0000\u0000?A\u0003\b\u0004\u0000@?\u0001\u0000\u0000\u0000@A\u0001"+
		"\u0000\u0000\u0000A\u0007\u0001\u0000\u0000\u0000BE\u0005\u001c\u0000"+
		"\u0000CD\u0005\u0006\u0000\u0000DF\u0003\b\u0004\u0000EC\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000F\t\u0001\u0000\u0000\u0000GJ\u0005\u001c"+
		"\u0000\u0000HI\u0005\u0006\u0000\u0000IK\u0003\n\u0005\u0000JH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000K\u000b\u0001\u0000\u0000\u0000"+
		"LO\u0005\u001c\u0000\u0000MN\u0005\u0006\u0000\u0000NP\u0003\f\u0006\u0000"+
		"OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\r\u0001\u0000\u0000"+
		"\u0000QT\u0003\u001e\u000f\u0000RS\u0005\u0007\u0000\u0000SU\u0003\u000e"+
		"\u0007\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u000f"+
		"\u0001\u0000\u0000\u0000VY\u0003*\u0015\u0000WX\u0005\u0006\u0000\u0000"+
		"XZ\u0003\u0010\b\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z\u0011\u0001\u0000\u0000\u0000[\\\u0003\f\u0006\u0000\\]\u0005\b\u0000"+
		"\u0000]^\u0003\u0010\b\u0000^\u0013\u0001\u0000\u0000\u0000_`\u0005\t"+
		"\u0000\u0000`a\u0003*\u0015\u0000ab\u0005\n\u0000\u0000be\u0003\u000e"+
		"\u0007\u0000cd\u0005\u000b\u0000\u0000df\u0003\u000e\u0007\u0000ec\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"gh\u0005\f\u0000\u0000h\u0015\u0001\u0000\u0000\u0000ij\u0005\r\u0000"+
		"\u0000jk\u0003*\u0015\u0000kl\u0005\u000e\u0000\u0000lm\u0003\u000e\u0007"+
		"\u0000mn\u0005\u000f\u0000\u0000n\u0017\u0001\u0000\u0000\u0000op\u0005"+
		"\u0010\u0000\u0000pq\u0003*\u0015\u0000qr\u0005\u000e\u0000\u0000rs\u0003"+
		"\u000e\u0007\u0000st\u0005\u000f\u0000\u0000t\u0019\u0001\u0000\u0000"+
		"\u0000uv\u0005\u0011\u0000\u0000vw\u0005\u001c\u0000\u0000wx\u0005\u0012"+
		"\u0000\u0000xy\u0003*\u0015\u0000yz\u0005\u000e\u0000\u0000z{\u0003\u000e"+
		"\u0007\u0000{|\u0005\u000f\u0000\u0000|\u001b\u0001\u0000\u0000\u0000"+
		"}~\u0005\u0013\u0000\u0000~\u001d\u0001\u0000\u0000\u0000\u007f\u0086"+
		"\u0003\u0014\n\u0000\u0080\u0086\u0003\u0016\u000b\u0000\u0081\u0086\u0003"+
		"\u0018\f\u0000\u0082\u0086\u0003\u001a\r\u0000\u0083\u0086\u0003\u0012"+
		"\t\u0000\u0084\u0086\u0003\u001c\u000e\u0000\u0085\u007f\u0001\u0000\u0000"+
		"\u0000\u0085\u0080\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000\u0000"+
		"\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u001f\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0007\u0000\u0000\u0000\u0088!\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0007\u0001\u0000\u0000\u008a\u008b\u0003,\u0016\u0000\u008b"+
		"#\u0001\u0000\u0000\u0000\u008c\u008d\u0007\u0002\u0000\u0000\u008d\u008e"+
		"\u0003(\u0014\u0000\u008e%\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u001d"+
		"\u0000\u0000\u0090\u0091\u0003,\u0016\u0000\u0091\'\u0001\u0000\u0000"+
		"\u0000\u0092\u009c\u0003 \u0010\u0000\u0093\u0097\u0005\u0019\u0000\u0000"+
		"\u0094\u0098\u0003\"\u0011\u0000\u0095\u0098\u0003$\u0012\u0000\u0096"+
		"\u0098\u0003&\u0013\u0000\u0097\u0094\u0001\u0000\u0000\u0000\u0097\u0095"+
		"\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u001a\u0000\u0000\u009a\u009c"+
		"\u0001\u0000\u0000\u0000\u009b\u0092\u0001\u0000\u0000\u0000\u009b\u0093"+
		"\u0001\u0000\u0000\u0000\u009c)\u0001\u0000\u0000\u0000\u009d\u00a0\u0003"+
		"(\u0014\u0000\u009e\u009f\u0005\u001b\u0000\u0000\u009f\u00a1\u0003(\u0014"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1+\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003(\u0014\u0000\u00a3"+
		"\u00a4\u0003,\u0016\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6-\u0001"+
		"\u0000\u0000\u0000\r0@EJOTYe\u0085\u0097\u009b\u00a0\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}