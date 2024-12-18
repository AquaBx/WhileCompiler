// $ANTLR 3.5.3 WhileGrammar.g 2024-12-18 00:59:18
 package org.esir.nctt.antlr; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class WhileGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGNMENT", "COMMANDS", "COMMAND_NOP", 
		"COMMENT", "DEC", "DEFINITION", "EXPRESSION", "EXPRESSIONS", "EXPR_CALL", 
		"EXPR_CHILD", "EXPR_COMPARE", "EXPR_CONSTRUCTOR", "EXPR_CONSTRUCTOR_CONS", 
		"EXPR_CONSTRUCTOR_LIST", "EXPR_HEAD", "EXPR_NIL", "EXPR_PRIMITIVE", "EXPR_SYMBOL", 
		"EXPR_TAIL", "EXPR_VARIABLE", "FOR", "FOREACH", "FUNCTION", "IF", "INPUT", 
		"INPUT_STUB", "MAJ", "MIN", "OUTPUT", "PROGRAM", "SYMBOL", "VARIABLE", 
		"VARIABLES", "WHILE", "WS", "'%'", "'('", "')'", "','", "':'", "':='", 
		"';'", "'=?'", "'cons'", "'do'", "'else'", "'fi'", "'for'", "'foreach'", 
		"'function'", "'hd'", "'if'", "'in'", "'list'", "'nil'", "'nop'", "'od'", 
		"'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int ASSIGNMENT=4;
	public static final int COMMANDS=5;
	public static final int COMMAND_NOP=6;
	public static final int COMMENT=7;
	public static final int DEC=8;
	public static final int DEFINITION=9;
	public static final int EXPRESSION=10;
	public static final int EXPRESSIONS=11;
	public static final int EXPR_CALL=12;
	public static final int EXPR_CHILD=13;
	public static final int EXPR_COMPARE=14;
	public static final int EXPR_CONSTRUCTOR=15;
	public static final int EXPR_CONSTRUCTOR_CONS=16;
	public static final int EXPR_CONSTRUCTOR_LIST=17;
	public static final int EXPR_HEAD=18;
	public static final int EXPR_NIL=19;
	public static final int EXPR_PRIMITIVE=20;
	public static final int EXPR_SYMBOL=21;
	public static final int EXPR_TAIL=22;
	public static final int EXPR_VARIABLE=23;
	public static final int FOR=24;
	public static final int FOREACH=25;
	public static final int FUNCTION=26;
	public static final int IF=27;
	public static final int INPUT=28;
	public static final int INPUT_STUB=29;
	public static final int MAJ=30;
	public static final int MIN=31;
	public static final int OUTPUT=32;
	public static final int PROGRAM=33;
	public static final int SYMBOL=34;
	public static final int VARIABLE=35;
	public static final int VARIABLES=36;
	public static final int WHILE=37;
	public static final int WS=38;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public WhileGrammarParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public WhileGrammarParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return WhileGrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "WhileGrammar.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// WhileGrammar.g:58:1: program : ( function )* ;
	public final WhileGrammarParser.program_return program() throws RecognitionException {
		WhileGrammarParser.program_return retval = new WhileGrammarParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function1 =null;


		try {
			// WhileGrammar.g:58:8: ( ( function )* )
			// WhileGrammar.g:58:10: ( function )*
			{
			root_0 = (Object)adaptor.nil();


			// WhileGrammar.g:58:10: ( function )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==53) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// WhileGrammar.g:58:10: function
					{
					pushFollow(FOLLOW_function_in_program429);
					function1=function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function1.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// WhileGrammar.g:60:1: function : 'function' SYMBOL ':' definition -> ^( FUNCTION SYMBOL definition ) ;
	public final WhileGrammarParser.function_return function() throws RecognitionException {
		WhileGrammarParser.function_return retval = new WhileGrammarParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal2=null;
		Token SYMBOL3=null;
		Token char_literal4=null;
		ParserRuleReturnScope definition5 =null;

		Object string_literal2_tree=null;
		Object SYMBOL3_tree=null;
		Object char_literal4_tree=null;
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// WhileGrammar.g:60:9: ( 'function' SYMBOL ':' definition -> ^( FUNCTION SYMBOL definition ) )
			// WhileGrammar.g:60:11: 'function' SYMBOL ':' definition
			{
			string_literal2=(Token)match(input,53,FOLLOW_53_in_function437); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(string_literal2);

			SYMBOL3=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function439); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SYMBOL.add(SYMBOL3);

			char_literal4=(Token)match(input,43,FOLLOW_43_in_function441); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_43.add(char_literal4);

			pushFollow(FOLLOW_definition_in_function443);
			definition5=definition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_definition.add(definition5.getTree());

			// AST REWRITE
			// elements: SYMBOL, definition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 60:44: -> ^( FUNCTION SYMBOL definition )
			{
				// WhileGrammar.g:60:47: ^( FUNCTION SYMBOL definition )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_SYMBOL.nextNode());
				adaptor.addChild(root_1, stream_definition.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// WhileGrammar.g:61:1: definition : 'read' (i= io )? '%' c= commands '%' 'write' o= io -> ^( INPUT ( $i)? ) ^( OUTPUT $o) $c;
	public final WhileGrammarParser.definition_return definition() throws RecognitionException {
		WhileGrammarParser.definition_return retval = new WhileGrammarParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal6=null;
		Token char_literal7=null;
		Token char_literal8=null;
		Token string_literal9=null;
		ParserRuleReturnScope i =null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope o =null;

		Object string_literal6_tree=null;
		Object char_literal7_tree=null;
		Object char_literal8_tree=null;
		Object string_literal9_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_io=new RewriteRuleSubtreeStream(adaptor,"rule io");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// WhileGrammar.g:61:11: ( 'read' (i= io )? '%' c= commands '%' 'write' o= io -> ^( INPUT ( $i)? ) ^( OUTPUT $o) $c)
			// WhileGrammar.g:61:13: 'read' (i= io )? '%' c= commands '%' 'write' o= io
			{
			string_literal6=(Token)match(input,61,FOLLOW_61_in_definition459); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_61.add(string_literal6);

			// WhileGrammar.g:61:21: (i= io )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==VARIABLE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// WhileGrammar.g:61:21: i= io
					{
					pushFollow(FOLLOW_io_in_definition463);
					i=io();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_io.add(i.getTree());
					}
					break;

			}

			char_literal7=(Token)match(input,39,FOLLOW_39_in_definition466); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_39.add(char_literal7);

			pushFollow(FOLLOW_commands_in_definition470);
			c=commands();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commands.add(c.getTree());
			char_literal8=(Token)match(input,39,FOLLOW_39_in_definition472); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_39.add(char_literal8);

			string_literal9=(Token)match(input,65,FOLLOW_65_in_definition474); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_65.add(string_literal9);

			pushFollow(FOLLOW_io_in_definition478);
			o=io();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_io.add(o.getTree());

			// AST REWRITE
			// elements: i, c, o
			// token labels: 
			// rule labels: c, i, retval, o
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i",i!=null?i.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 61:58: -> ^( INPUT ( $i)? ) ^( OUTPUT $o) $c
			{
				// WhileGrammar.g:61:61: ^( INPUT ( $i)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);
				// WhileGrammar.g:61:70: ( $i)?
				if ( stream_i.hasNext() ) {
					adaptor.addChild(root_1, stream_i.nextTree());
				}
				stream_i.reset();

				adaptor.addChild(root_0, root_1);
				}

				// WhileGrammar.g:61:74: ^( OUTPUT $o)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);
				adaptor.addChild(root_1, stream_o.nextTree());
				adaptor.addChild(root_0, root_1);
				}

				adaptor.addChild(root_0, stream_c.nextTree());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "definition"


	public static class io_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "io"
	// WhileGrammar.g:62:1: io : VARIABLE ( ',' VARIABLE )* -> ( VARIABLE )* ;
	public final WhileGrammarParser.io_return io() throws RecognitionException {
		WhileGrammarParser.io_return retval = new WhileGrammarParser.io_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE10=null;
		Token char_literal11=null;
		Token VARIABLE12=null;

		Object VARIABLE10_tree=null;
		Object char_literal11_tree=null;
		Object VARIABLE12_tree=null;
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");

		try {
			// WhileGrammar.g:62:3: ( VARIABLE ( ',' VARIABLE )* -> ( VARIABLE )* )
			// WhileGrammar.g:62:5: VARIABLE ( ',' VARIABLE )*
			{
			VARIABLE10=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_io504); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE10);

			// WhileGrammar.g:62:14: ( ',' VARIABLE )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==42) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// WhileGrammar.g:62:15: ',' VARIABLE
					{
					char_literal11=(Token)match(input,42,FOLLOW_42_in_io507); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_42.add(char_literal11);

					VARIABLE12=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_io509); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE12);

					}
					break;

				default :
					break loop3;
				}
			}


			// AST REWRITE
			// elements: VARIABLE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 62:30: -> ( VARIABLE )*
			{
				// WhileGrammar.g:62:33: ( VARIABLE )*
				while ( stream_VARIABLE.hasNext() ) {
					adaptor.addChild(root_0, stream_VARIABLE.nextNode());
				}
				stream_VARIABLE.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "io"


	public static class vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// WhileGrammar.g:64:1: vars : v= VARIABLE ( ',' var= VARIABLE )* -> ^( VARIABLES $v ( $var)? ) ;
	public final WhileGrammarParser.vars_return vars() throws RecognitionException {
		WhileGrammarParser.vars_return retval = new WhileGrammarParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token var=null;
		Token char_literal13=null;

		Object v_tree=null;
		Object var_tree=null;
		Object char_literal13_tree=null;
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");

		try {
			// WhileGrammar.g:64:5: (v= VARIABLE ( ',' var= VARIABLE )* -> ^( VARIABLES $v ( $var)? ) )
			// WhileGrammar.g:64:7: v= VARIABLE ( ',' var= VARIABLE )*
			{
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars525); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VARIABLE.add(v);

			// WhileGrammar.g:64:18: ( ',' var= VARIABLE )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==42) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// WhileGrammar.g:64:19: ',' var= VARIABLE
					{
					char_literal13=(Token)match(input,42,FOLLOW_42_in_vars528); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_42.add(char_literal13);

					var=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars532); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARIABLE.add(var);

					}
					break;

				default :
					break loop4;
				}
			}


			// AST REWRITE
			// elements: v, var
			// token labels: v, var
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleTokenStream stream_var=new RewriteRuleTokenStream(adaptor,"token var",var);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 64:38: -> ^( VARIABLES $v ( $var)? )
			{
				// WhileGrammar.g:64:41: ^( VARIABLES $v ( $var)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_1);
				adaptor.addChild(root_1, stream_v.nextNode());
				// WhileGrammar.g:64:57: ( $var)?
				if ( stream_var.hasNext() ) {
					adaptor.addChild(root_1, stream_var.nextNode());
				}
				stream_var.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "vars"


	public static class commands_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commands"
	// WhileGrammar.g:66:1: commands : command ( ';' command )* -> ^( COMMANDS ( command )* ) ;
	public final WhileGrammarParser.commands_return commands() throws RecognitionException {
		WhileGrammarParser.commands_return retval = new WhileGrammarParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal15=null;
		ParserRuleReturnScope command14 =null;
		ParserRuleReturnScope command16 =null;

		Object char_literal15_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");

		try {
			// WhileGrammar.g:66:9: ( command ( ';' command )* -> ^( COMMANDS ( command )* ) )
			// WhileGrammar.g:66:11: command ( ';' command )*
			{
			pushFollow(FOLLOW_command_in_commands554);
			command14=command();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_command.add(command14.getTree());
			// WhileGrammar.g:66:19: ( ';' command )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==45) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// WhileGrammar.g:66:20: ';' command
					{
					char_literal15=(Token)match(input,45,FOLLOW_45_in_commands557); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_45.add(char_literal15);

					pushFollow(FOLLOW_command_in_commands559);
					command16=command();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_command.add(command16.getTree());
					}
					break;

				default :
					break loop5;
				}
			}


			// AST REWRITE
			// elements: command
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 67:5: -> ^( COMMANDS ( command )* )
			{
				// WhileGrammar.g:67:8: ^( COMMANDS ( command )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_1);
				// WhileGrammar.g:67:19: ( command )*
				while ( stream_command.hasNext() ) {
					adaptor.addChild(root_1, stream_command.nextTree());
				}
				stream_command.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "commands"


	public static class command_vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_vars"
	// WhileGrammar.g:70:1: command_vars : vars ':=' exprs -> ^( ASSIGNMENT vars exprs ) ;
	public final WhileGrammarParser.command_vars_return command_vars() throws RecognitionException {
		WhileGrammarParser.command_vars_return retval = new WhileGrammarParser.command_vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal18=null;
		ParserRuleReturnScope vars17 =null;
		ParserRuleReturnScope exprs19 =null;

		Object string_literal18_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// WhileGrammar.g:70:13: ( vars ':=' exprs -> ^( ASSIGNMENT vars exprs ) )
			// WhileGrammar.g:70:15: vars ':=' exprs
			{
			pushFollow(FOLLOW_vars_in_command_vars582);
			vars17=vars();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_vars.add(vars17.getTree());
			string_literal18=(Token)match(input,44,FOLLOW_44_in_command_vars584); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_44.add(string_literal18);

			pushFollow(FOLLOW_exprs_in_command_vars586);
			exprs19=exprs();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_exprs.add(exprs19.getTree());

			// AST REWRITE
			// elements: exprs, vars
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 70:31: -> ^( ASSIGNMENT vars exprs )
			{
				// WhileGrammar.g:70:34: ^( ASSIGNMENT vars exprs )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
				adaptor.addChild(root_1, stream_vars.nextTree());
				adaptor.addChild(root_1, stream_exprs.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command_vars"


	public static class command_if_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_if"
	// WhileGrammar.g:71:1: command_if : 'if' expression 'then' b1= commands ( 'else' b2= commands )? 'fi' -> ^( IF expression $b1 ( $b2)? ) ;
	public final WhileGrammarParser.command_if_return command_if() throws RecognitionException {
		WhileGrammarParser.command_if_return retval = new WhileGrammarParser.command_if_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal20=null;
		Token string_literal22=null;
		Token string_literal23=null;
		Token string_literal24=null;
		ParserRuleReturnScope b1 =null;
		ParserRuleReturnScope b2 =null;
		ParserRuleReturnScope expression21 =null;

		Object string_literal20_tree=null;
		Object string_literal22_tree=null;
		Object string_literal23_tree=null;
		Object string_literal24_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// WhileGrammar.g:71:11: ( 'if' expression 'then' b1= commands ( 'else' b2= commands )? 'fi' -> ^( IF expression $b1 ( $b2)? ) )
			// WhileGrammar.g:71:13: 'if' expression 'then' b1= commands ( 'else' b2= commands )? 'fi'
			{
			string_literal20=(Token)match(input,55,FOLLOW_55_in_command_if602); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_55.add(string_literal20);

			pushFollow(FOLLOW_expression_in_command_if604);
			expression21=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression21.getTree());
			string_literal22=(Token)match(input,62,FOLLOW_62_in_command_if606); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_62.add(string_literal22);

			pushFollow(FOLLOW_commands_in_command_if610);
			b1=commands();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commands.add(b1.getTree());
			// WhileGrammar.g:71:48: ( 'else' b2= commands )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==49) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// WhileGrammar.g:71:49: 'else' b2= commands
					{
					string_literal23=(Token)match(input,49,FOLLOW_49_in_command_if613); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_49.add(string_literal23);

					pushFollow(FOLLOW_commands_in_command_if617);
					b2=commands();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_commands.add(b2.getTree());
					}
					break;

			}

			string_literal24=(Token)match(input,50,FOLLOW_50_in_command_if621); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_50.add(string_literal24);


			// AST REWRITE
			// elements: b1, expression, b2
			// token labels: 
			// rule labels: b2, retval, b1
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_b2=new RewriteRuleSubtreeStream(adaptor,"rule b2",b2!=null?b2.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_b1=new RewriteRuleSubtreeStream(adaptor,"rule b1",b1!=null?b1.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 71:75: -> ^( IF expression $b1 ( $b2)? )
			{
				// WhileGrammar.g:71:78: ^( IF expression $b1 ( $b2)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_b1.nextTree());
				// WhileGrammar.g:71:99: ( $b2)?
				if ( stream_b2.hasNext() ) {
					adaptor.addChild(root_1, stream_b2.nextTree());
				}
				stream_b2.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command_if"


	public static class command_while_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_while"
	// WhileGrammar.g:72:1: command_while : 'while' expression 'do' commands 'od' -> ^( WHILE expression commands ) ;
	public final WhileGrammarParser.command_while_return command_while() throws RecognitionException {
		WhileGrammarParser.command_while_return retval = new WhileGrammarParser.command_while_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal25=null;
		Token string_literal27=null;
		Token string_literal29=null;
		ParserRuleReturnScope expression26 =null;
		ParserRuleReturnScope commands28 =null;

		Object string_literal25_tree=null;
		Object string_literal27_tree=null;
		Object string_literal29_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// WhileGrammar.g:72:14: ( 'while' expression 'do' commands 'od' -> ^( WHILE expression commands ) )
			// WhileGrammar.g:72:16: 'while' expression 'do' commands 'od'
			{
			string_literal25=(Token)match(input,64,FOLLOW_64_in_command_while642); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_64.add(string_literal25);

			pushFollow(FOLLOW_expression_in_command_while644);
			expression26=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression26.getTree());
			string_literal27=(Token)match(input,48,FOLLOW_48_in_command_while646); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_48.add(string_literal27);

			pushFollow(FOLLOW_commands_in_command_while648);
			commands28=commands();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commands.add(commands28.getTree());
			string_literal29=(Token)match(input,60,FOLLOW_60_in_command_while650); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_60.add(string_literal29);


			// AST REWRITE
			// elements: expression, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 72:54: -> ^( WHILE expression commands )
			{
				// WhileGrammar.g:72:57: ^( WHILE expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_commands.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command_while"


	public static class command_for_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_for"
	// WhileGrammar.g:73:1: command_for : 'for' expression 'do' commands 'od' -> ^( FOR expression commands ) ;
	public final WhileGrammarParser.command_for_return command_for() throws RecognitionException {
		WhileGrammarParser.command_for_return retval = new WhileGrammarParser.command_for_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal30=null;
		Token string_literal32=null;
		Token string_literal34=null;
		ParserRuleReturnScope expression31 =null;
		ParserRuleReturnScope commands33 =null;

		Object string_literal30_tree=null;
		Object string_literal32_tree=null;
		Object string_literal34_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// WhileGrammar.g:73:12: ( 'for' expression 'do' commands 'od' -> ^( FOR expression commands ) )
			// WhileGrammar.g:73:14: 'for' expression 'do' commands 'od'
			{
			string_literal30=(Token)match(input,51,FOLLOW_51_in_command_for666); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_51.add(string_literal30);

			pushFollow(FOLLOW_expression_in_command_for668);
			expression31=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression31.getTree());
			string_literal32=(Token)match(input,48,FOLLOW_48_in_command_for670); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_48.add(string_literal32);

			pushFollow(FOLLOW_commands_in_command_for672);
			commands33=commands();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commands.add(commands33.getTree());
			string_literal34=(Token)match(input,60,FOLLOW_60_in_command_for674); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_60.add(string_literal34);


			// AST REWRITE
			// elements: expression, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 73:50: -> ^( FOR expression commands )
			{
				// WhileGrammar.g:73:53: ^( FOR expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_commands.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command_for"


	public static class command_foreach_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_foreach"
	// WhileGrammar.g:74:1: command_foreach : 'foreach' v= VARIABLE 'in' expression 'do' commands 'od' -> ^( FOREACH $v expression commands ) ;
	public final WhileGrammarParser.command_foreach_return command_foreach() throws RecognitionException {
		WhileGrammarParser.command_foreach_return retval = new WhileGrammarParser.command_foreach_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token string_literal35=null;
		Token string_literal36=null;
		Token string_literal38=null;
		Token string_literal40=null;
		ParserRuleReturnScope expression37 =null;
		ParserRuleReturnScope commands39 =null;

		Object v_tree=null;
		Object string_literal35_tree=null;
		Object string_literal36_tree=null;
		Object string_literal38_tree=null;
		Object string_literal40_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// WhileGrammar.g:74:16: ( 'foreach' v= VARIABLE 'in' expression 'do' commands 'od' -> ^( FOREACH $v expression commands ) )
			// WhileGrammar.g:74:18: 'foreach' v= VARIABLE 'in' expression 'do' commands 'od'
			{
			string_literal35=(Token)match(input,52,FOLLOW_52_in_command_foreach690); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_52.add(string_literal35);

			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command_foreach694); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VARIABLE.add(v);

			string_literal36=(Token)match(input,56,FOLLOW_56_in_command_foreach696); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_56.add(string_literal36);

			pushFollow(FOLLOW_expression_in_command_foreach698);
			expression37=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression37.getTree());
			string_literal38=(Token)match(input,48,FOLLOW_48_in_command_foreach700); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_48.add(string_literal38);

			pushFollow(FOLLOW_commands_in_command_foreach702);
			commands39=commands();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commands.add(commands39.getTree());
			string_literal40=(Token)match(input,60,FOLLOW_60_in_command_foreach704); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_60.add(string_literal40);


			// AST REWRITE
			// elements: commands, expression, v
			// token labels: v
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 74:74: -> ^( FOREACH $v expression commands )
			{
				// WhileGrammar.g:74:77: ^( FOREACH $v expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
				adaptor.addChild(root_1, stream_v.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_commands.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command_foreach"


	public static class command_nop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_nop"
	// WhileGrammar.g:75:1: command_nop : 'nop' -> ^( COMMAND_NOP ) ;
	public final WhileGrammarParser.command_nop_return command_nop() throws RecognitionException {
		WhileGrammarParser.command_nop_return retval = new WhileGrammarParser.command_nop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal41=null;

		Object string_literal41_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");

		try {
			// WhileGrammar.g:75:12: ( 'nop' -> ^( COMMAND_NOP ) )
			// WhileGrammar.g:75:14: 'nop'
			{
			string_literal41=(Token)match(input,59,FOLLOW_59_in_command_nop723); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_59.add(string_literal41);


			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 75:20: -> ^( COMMAND_NOP )
			{
				// WhileGrammar.g:75:23: ^( COMMAND_NOP )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMAND_NOP, "COMMAND_NOP"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command_nop"


	public static class command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command"
	// WhileGrammar.g:78:1: command : ( command_if | command_while | command_for | command_foreach | command_vars | command_nop );
	public final WhileGrammarParser.command_return command() throws RecognitionException {
		WhileGrammarParser.command_return retval = new WhileGrammarParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope command_if42 =null;
		ParserRuleReturnScope command_while43 =null;
		ParserRuleReturnScope command_for44 =null;
		ParserRuleReturnScope command_foreach45 =null;
		ParserRuleReturnScope command_vars46 =null;
		ParserRuleReturnScope command_nop47 =null;


		try {
			// WhileGrammar.g:78:8: ( command_if | command_while | command_for | command_foreach | command_vars | command_nop )
			int alt7=6;
			switch ( input.LA(1) ) {
			case 55:
				{
				alt7=1;
				}
				break;
			case 64:
				{
				alt7=2;
				}
				break;
			case 51:
				{
				alt7=3;
				}
				break;
			case 52:
				{
				alt7=4;
				}
				break;
			case VARIABLE:
				{
				alt7=5;
				}
				break;
			case 59:
				{
				alt7=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// WhileGrammar.g:78:10: command_if
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_if_in_command737);
					command_if42=command_if();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_if42.getTree());

					}
					break;
				case 2 :
					// WhileGrammar.g:79:11: command_while
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_while_in_command750);
					command_while43=command_while();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_while43.getTree());

					}
					break;
				case 3 :
					// WhileGrammar.g:80:11: command_for
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_for_in_command763);
					command_for44=command_for();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_for44.getTree());

					}
					break;
				case 4 :
					// WhileGrammar.g:81:11: command_foreach
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_foreach_in_command776);
					command_foreach45=command_foreach();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_foreach45.getTree());

					}
					break;
				case 5 :
					// WhileGrammar.g:82:11: command_vars
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_vars_in_command788);
					command_vars46=command_vars();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_vars46.getTree());

					}
					break;
				case 6 :
					// WhileGrammar.g:83:11: command_nop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_nop_in_command800);
					command_nop47=command_nop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_nop47.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command"


	public static class expr_symbol_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_symbol"
	// WhileGrammar.g:86:1: expr_symbol : a= SYMBOL -> ^( EXPR_SYMBOL $a) ;
	public final WhileGrammarParser.expr_symbol_return expr_symbol() throws RecognitionException {
		WhileGrammarParser.expr_symbol_return retval = new WhileGrammarParser.expr_symbol_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token a=null;

		Object a_tree=null;
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");

		try {
			// WhileGrammar.g:86:12: (a= SYMBOL -> ^( EXPR_SYMBOL $a) )
			// WhileGrammar.g:86:14: a= SYMBOL
			{
			a=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_expr_symbol818); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SYMBOL.add(a);


			// AST REWRITE
			// elements: a
			// token labels: a
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 87:2: -> ^( EXPR_SYMBOL $a)
			{
				// WhileGrammar.g:87:5: ^( EXPR_SYMBOL $a)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_SYMBOL, "EXPR_SYMBOL"), root_1);
				adaptor.addChild(root_1, stream_a.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_symbol"


	public static class expr_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_variable"
	// WhileGrammar.g:90:1: expr_variable : a= VARIABLE -> ^( EXPR_VARIABLE $a) ;
	public final WhileGrammarParser.expr_variable_return expr_variable() throws RecognitionException {
		WhileGrammarParser.expr_variable_return retval = new WhileGrammarParser.expr_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token a=null;

		Object a_tree=null;
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");

		try {
			// WhileGrammar.g:90:14: (a= VARIABLE -> ^( EXPR_VARIABLE $a) )
			// WhileGrammar.g:90:16: a= VARIABLE
			{
			a=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_expr_variable838); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VARIABLE.add(a);


			// AST REWRITE
			// elements: a
			// token labels: a
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 91:2: -> ^( EXPR_VARIABLE $a)
			{
				// WhileGrammar.g:91:5: ^( EXPR_VARIABLE $a)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_VARIABLE, "EXPR_VARIABLE"), root_1);
				adaptor.addChild(root_1, stream_a.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_variable"


	public static class expr_nil_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_nil"
	// WhileGrammar.g:94:1: expr_nil : 'nil' -> ^( EXPR_NIL ) ;
	public final WhileGrammarParser.expr_nil_return expr_nil() throws RecognitionException {
		WhileGrammarParser.expr_nil_return retval = new WhileGrammarParser.expr_nil_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal48=null;

		Object string_literal48_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");

		try {
			// WhileGrammar.g:94:9: ( 'nil' -> ^( EXPR_NIL ) )
			// WhileGrammar.g:94:11: 'nil'
			{
			string_literal48=(Token)match(input,58,FOLLOW_58_in_expr_nil856); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_58.add(string_literal48);


			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 95:2: -> ^( EXPR_NIL )
			{
				// WhileGrammar.g:95:5: ^( EXPR_NIL )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_NIL, "EXPR_NIL"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_nil"


	public static class expr_constructor_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_constructor_list"
	// WhileGrammar.g:98:1: expr_constructor_list : '(' 'list' lexpr ')' -> ^( EXPR_CONSTRUCTOR_LIST lexpr ) ;
	public final WhileGrammarParser.expr_constructor_list_return expr_constructor_list() throws RecognitionException {
		WhileGrammarParser.expr_constructor_list_return retval = new WhileGrammarParser.expr_constructor_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal49=null;
		Token string_literal50=null;
		Token char_literal52=null;
		ParserRuleReturnScope lexpr51 =null;

		Object char_literal49_tree=null;
		Object string_literal50_tree=null;
		Object char_literal52_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");

		try {
			// WhileGrammar.g:98:22: ( '(' 'list' lexpr ')' -> ^( EXPR_CONSTRUCTOR_LIST lexpr ) )
			// WhileGrammar.g:98:24: '(' 'list' lexpr ')'
			{
			char_literal49=(Token)match(input,40,FOLLOW_40_in_expr_constructor_list871); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_40.add(char_literal49);

			string_literal50=(Token)match(input,57,FOLLOW_57_in_expr_constructor_list873); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_57.add(string_literal50);

			pushFollow(FOLLOW_lexpr_in_expr_constructor_list875);
			lexpr51=lexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_lexpr.add(lexpr51.getTree());
			char_literal52=(Token)match(input,41,FOLLOW_41_in_expr_constructor_list877); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_41.add(char_literal52);


			// AST REWRITE
			// elements: lexpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 99:2: -> ^( EXPR_CONSTRUCTOR_LIST lexpr )
			{
				// WhileGrammar.g:99:5: ^( EXPR_CONSTRUCTOR_LIST lexpr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_CONSTRUCTOR_LIST, "EXPR_CONSTRUCTOR_LIST"), root_1);
				adaptor.addChild(root_1, stream_lexpr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_constructor_list"


	public static class expr_constructor_cons_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_constructor_cons"
	// WhileGrammar.g:102:1: expr_constructor_cons : '(' 'cons' lexpr ')' -> ^( EXPR_CONSTRUCTOR_CONS lexpr ) ;
	public final WhileGrammarParser.expr_constructor_cons_return expr_constructor_cons() throws RecognitionException {
		WhileGrammarParser.expr_constructor_cons_return retval = new WhileGrammarParser.expr_constructor_cons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal53=null;
		Token string_literal54=null;
		Token char_literal56=null;
		ParserRuleReturnScope lexpr55 =null;

		Object char_literal53_tree=null;
		Object string_literal54_tree=null;
		Object char_literal56_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");

		try {
			// WhileGrammar.g:102:22: ( '(' 'cons' lexpr ')' -> ^( EXPR_CONSTRUCTOR_CONS lexpr ) )
			// WhileGrammar.g:102:24: '(' 'cons' lexpr ')'
			{
			char_literal53=(Token)match(input,40,FOLLOW_40_in_expr_constructor_cons895); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_40.add(char_literal53);

			string_literal54=(Token)match(input,47,FOLLOW_47_in_expr_constructor_cons897); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_47.add(string_literal54);

			pushFollow(FOLLOW_lexpr_in_expr_constructor_cons899);
			lexpr55=lexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_lexpr.add(lexpr55.getTree());
			char_literal56=(Token)match(input,41,FOLLOW_41_in_expr_constructor_cons901); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_41.add(char_literal56);


			// AST REWRITE
			// elements: lexpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 103:2: -> ^( EXPR_CONSTRUCTOR_CONS lexpr )
			{
				// WhileGrammar.g:103:5: ^( EXPR_CONSTRUCTOR_CONS lexpr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_CONSTRUCTOR_CONS, "EXPR_CONSTRUCTOR_CONS"), root_1);
				adaptor.addChild(root_1, stream_lexpr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_constructor_cons"


	public static class expr_head_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_head"
	// WhileGrammar.g:106:1: expr_head : '(' 'hd' expr ')' -> ^( EXPR_HEAD expr ) ;
	public final WhileGrammarParser.expr_head_return expr_head() throws RecognitionException {
		WhileGrammarParser.expr_head_return retval = new WhileGrammarParser.expr_head_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal57=null;
		Token string_literal58=null;
		Token char_literal60=null;
		ParserRuleReturnScope expr59 =null;

		Object char_literal57_tree=null;
		Object string_literal58_tree=null;
		Object char_literal60_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// WhileGrammar.g:106:10: ( '(' 'hd' expr ')' -> ^( EXPR_HEAD expr ) )
			// WhileGrammar.g:106:12: '(' 'hd' expr ')'
			{
			char_literal57=(Token)match(input,40,FOLLOW_40_in_expr_head920); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_40.add(char_literal57);

			string_literal58=(Token)match(input,54,FOLLOW_54_in_expr_head922); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(string_literal58);

			pushFollow(FOLLOW_expr_in_expr_head924);
			expr59=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr.add(expr59.getTree());
			char_literal60=(Token)match(input,41,FOLLOW_41_in_expr_head926); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_41.add(char_literal60);


			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 107:2: -> ^( EXPR_HEAD expr )
			{
				// WhileGrammar.g:107:5: ^( EXPR_HEAD expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_HEAD, "EXPR_HEAD"), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_head"


	public static class expr_tail_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_tail"
	// WhileGrammar.g:110:1: expr_tail : '(' 'tl' expr ')' -> ^( EXPR_TAIL expr ) ;
	public final WhileGrammarParser.expr_tail_return expr_tail() throws RecognitionException {
		WhileGrammarParser.expr_tail_return retval = new WhileGrammarParser.expr_tail_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal61=null;
		Token string_literal62=null;
		Token char_literal64=null;
		ParserRuleReturnScope expr63 =null;

		Object char_literal61_tree=null;
		Object string_literal62_tree=null;
		Object char_literal64_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// WhileGrammar.g:110:10: ( '(' 'tl' expr ')' -> ^( EXPR_TAIL expr ) )
			// WhileGrammar.g:110:12: '(' 'tl' expr ')'
			{
			char_literal61=(Token)match(input,40,FOLLOW_40_in_expr_tail944); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_40.add(char_literal61);

			string_literal62=(Token)match(input,63,FOLLOW_63_in_expr_tail946); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_63.add(string_literal62);

			pushFollow(FOLLOW_expr_in_expr_tail948);
			expr63=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr.add(expr63.getTree());
			char_literal64=(Token)match(input,41,FOLLOW_41_in_expr_tail950); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_41.add(char_literal64);


			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 111:2: -> ^( EXPR_TAIL expr )
			{
				// WhileGrammar.g:111:5: ^( EXPR_TAIL expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_TAIL, "EXPR_TAIL"), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_tail"


	public static class expr_call_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_call"
	// WhileGrammar.g:114:1: expr_call : '(' a= SYMBOL lexpr ')' -> ^( EXPR_CALL $a lexpr ) ;
	public final WhileGrammarParser.expr_call_return expr_call() throws RecognitionException {
		WhileGrammarParser.expr_call_return retval = new WhileGrammarParser.expr_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token a=null;
		Token char_literal65=null;
		Token char_literal67=null;
		ParserRuleReturnScope lexpr66 =null;

		Object a_tree=null;
		Object char_literal65_tree=null;
		Object char_literal67_tree=null;
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");

		try {
			// WhileGrammar.g:114:10: ( '(' a= SYMBOL lexpr ')' -> ^( EXPR_CALL $a lexpr ) )
			// WhileGrammar.g:114:12: '(' a= SYMBOL lexpr ')'
			{
			char_literal65=(Token)match(input,40,FOLLOW_40_in_expr_call968); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_40.add(char_literal65);

			a=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_expr_call972); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SYMBOL.add(a);

			pushFollow(FOLLOW_lexpr_in_expr_call974);
			lexpr66=lexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_lexpr.add(lexpr66.getTree());
			char_literal67=(Token)match(input,41,FOLLOW_41_in_expr_call976); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_41.add(char_literal67);


			// AST REWRITE
			// elements: lexpr, a
			// token labels: a
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 115:2: -> ^( EXPR_CALL $a lexpr )
			{
				// WhileGrammar.g:115:5: ^( EXPR_CALL $a lexpr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_CALL, "EXPR_CALL"), root_1);
				adaptor.addChild(root_1, stream_a.nextNode());
				adaptor.addChild(root_1, stream_lexpr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_call"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// WhileGrammar.g:118:1: expr : ( expr_nil | expr_variable | expr_constructor_list | expr_constructor_cons | expr_head | expr_tail | expr_call | expr_symbol );
	public final WhileGrammarParser.expr_return expr() throws RecognitionException {
		WhileGrammarParser.expr_return retval = new WhileGrammarParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr_nil68 =null;
		ParserRuleReturnScope expr_variable69 =null;
		ParserRuleReturnScope expr_constructor_list70 =null;
		ParserRuleReturnScope expr_constructor_cons71 =null;
		ParserRuleReturnScope expr_head72 =null;
		ParserRuleReturnScope expr_tail73 =null;
		ParserRuleReturnScope expr_call74 =null;
		ParserRuleReturnScope expr_symbol75 =null;


		try {
			// WhileGrammar.g:118:5: ( expr_nil | expr_variable | expr_constructor_list | expr_constructor_cons | expr_head | expr_tail | expr_call | expr_symbol )
			int alt8=8;
			switch ( input.LA(1) ) {
			case 58:
				{
				alt8=1;
				}
				break;
			case VARIABLE:
				{
				alt8=2;
				}
				break;
			case 40:
				{
				switch ( input.LA(2) ) {
				case 57:
					{
					alt8=3;
					}
					break;
				case 47:
					{
					alt8=4;
					}
					break;
				case 54:
					{
					alt8=5;
					}
					break;
				case 63:
					{
					alt8=6;
					}
					break;
				case SYMBOL:
					{
					alt8=7;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case SYMBOL:
				{
				alt8=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// WhileGrammar.g:118:7: expr_nil
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_nil_in_expr996);
					expr_nil68=expr_nil();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_nil68.getTree());

					}
					break;
				case 2 :
					// WhileGrammar.g:118:18: expr_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_variable_in_expr1000);
					expr_variable69=expr_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_variable69.getTree());

					}
					break;
				case 3 :
					// WhileGrammar.g:118:34: expr_constructor_list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_constructor_list_in_expr1004);
					expr_constructor_list70=expr_constructor_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_constructor_list70.getTree());

					}
					break;
				case 4 :
					// WhileGrammar.g:118:58: expr_constructor_cons
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_constructor_cons_in_expr1008);
					expr_constructor_cons71=expr_constructor_cons();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_constructor_cons71.getTree());

					}
					break;
				case 5 :
					// WhileGrammar.g:118:82: expr_head
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_head_in_expr1012);
					expr_head72=expr_head();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_head72.getTree());

					}
					break;
				case 6 :
					// WhileGrammar.g:118:95: expr_tail
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_tail_in_expr1017);
					expr_tail73=expr_tail();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_tail73.getTree());

					}
					break;
				case 7 :
					// WhileGrammar.g:118:108: expr_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_call_in_expr1022);
					expr_call74=expr_call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_call74.getTree());

					}
					break;
				case 8 :
					// WhileGrammar.g:118:120: expr_symbol
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_symbol_in_expr1026);
					expr_symbol75=expr_symbol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_symbol75.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class expr_compare_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_compare"
	// WhileGrammar.g:120:1: expr_compare : c= expr '=?' d= expr -> ^( EXPR_COMPARE $c $d) ;
	public final WhileGrammarParser.expr_compare_return expr_compare() throws RecognitionException {
		WhileGrammarParser.expr_compare_return retval = new WhileGrammarParser.expr_compare_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal76=null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope d =null;

		Object string_literal76_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// WhileGrammar.g:120:13: (c= expr '=?' d= expr -> ^( EXPR_COMPARE $c $d) )
			// WhileGrammar.g:120:15: c= expr '=?' d= expr
			{
			pushFollow(FOLLOW_expr_in_expr_compare1035);
			c=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr.add(c.getTree());
			string_literal76=(Token)match(input,46,FOLLOW_46_in_expr_compare1037); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_46.add(string_literal76);

			pushFollow(FOLLOW_expr_in_expr_compare1041);
			d=expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expr.add(d.getTree());

			// AST REWRITE
			// elements: c, d
			// token labels: 
			// rule labels: c, d, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_d=new RewriteRuleSubtreeStream(adaptor,"rule d",d!=null?d.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 121:5: -> ^( EXPR_COMPARE $c $d)
			{
				// WhileGrammar.g:121:8: ^( EXPR_COMPARE $c $d)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_COMPARE, "EXPR_COMPARE"), root_1);
				adaptor.addChild(root_1, stream_c.nextTree());
				adaptor.addChild(root_1, stream_d.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_compare"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// WhileGrammar.g:124:1: expression : ( expr_compare | expr );
	public final WhileGrammarParser.expression_return expression() throws RecognitionException {
		WhileGrammarParser.expression_return retval = new WhileGrammarParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr_compare77 =null;
		ParserRuleReturnScope expr78 =null;


		try {
			// WhileGrammar.g:124:11: ( expr_compare | expr )
			int alt9=2;
			switch ( input.LA(1) ) {
			case 58:
				{
				int LA9_1 = input.LA(2);
				if ( (synpred19_WhileGrammar()) ) {
					alt9=1;
				}
				else if ( (true) ) {
					alt9=2;
				}

				}
				break;
			case VARIABLE:
				{
				int LA9_2 = input.LA(2);
				if ( (synpred19_WhileGrammar()) ) {
					alt9=1;
				}
				else if ( (true) ) {
					alt9=2;
				}

				}
				break;
			case 40:
				{
				int LA9_3 = input.LA(2);
				if ( (synpred19_WhileGrammar()) ) {
					alt9=1;
				}
				else if ( (true) ) {
					alt9=2;
				}

				}
				break;
			case SYMBOL:
				{
				int LA9_4 = input.LA(2);
				if ( (synpred19_WhileGrammar()) ) {
					alt9=1;
				}
				else if ( (true) ) {
					alt9=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// WhileGrammar.g:124:13: expr_compare
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_compare_in_expression1065);
					expr_compare77=expr_compare();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_compare77.getTree());

					}
					break;
				case 2 :
					// WhileGrammar.g:124:28: expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_in_expression1069);
					expr78=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr78.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class lexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lexpr"
	// WhileGrammar.g:127:1: lexpr : ( expr )* -> ^( EXPRESSIONS ( expr )* ) ;
	public final WhileGrammarParser.lexpr_return lexpr() throws RecognitionException {
		WhileGrammarParser.lexpr_return retval = new WhileGrammarParser.lexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr79 =null;

		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// WhileGrammar.g:127:6: ( ( expr )* -> ^( EXPRESSIONS ( expr )* ) )
			// WhileGrammar.g:127:8: ( expr )*
			{
			// WhileGrammar.g:127:8: ( expr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= SYMBOL && LA10_0 <= VARIABLE)||LA10_0==40||LA10_0==58) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// WhileGrammar.g:127:8: expr
					{
					pushFollow(FOLLOW_expr_in_lexpr1077);
					expr79=expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr.add(expr79.getTree());
					}
					break;

				default :
					break loop10;
				}
			}


			// AST REWRITE
			// elements: expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 127:14: -> ^( EXPRESSIONS ( expr )* )
			{
				// WhileGrammar.g:127:17: ^( EXPRESSIONS ( expr )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSIONS, "EXPRESSIONS"), root_1);
				// WhileGrammar.g:127:31: ( expr )*
				while ( stream_expr.hasNext() ) {
					adaptor.addChild(root_1, stream_expr.nextTree());
				}
				stream_expr.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lexpr"


	public static class exprs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprs"
	// WhileGrammar.g:129:1: exprs : expression ( ',' expression )* -> ^( EXPRESSIONS ( expression )* ) ;
	public final WhileGrammarParser.exprs_return exprs() throws RecognitionException {
		WhileGrammarParser.exprs_return retval = new WhileGrammarParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal81=null;
		ParserRuleReturnScope expression80 =null;
		ParserRuleReturnScope expression82 =null;

		Object char_literal81_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// WhileGrammar.g:129:6: ( expression ( ',' expression )* -> ^( EXPRESSIONS ( expression )* ) )
			// WhileGrammar.g:129:8: expression ( ',' expression )*
			{
			pushFollow(FOLLOW_expression_in_exprs1094);
			expression80=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression80.getTree());
			// WhileGrammar.g:129:19: ( ',' expression )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==42) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// WhileGrammar.g:129:20: ',' expression
					{
					char_literal81=(Token)match(input,42,FOLLOW_42_in_exprs1097); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_42.add(char_literal81);

					pushFollow(FOLLOW_expression_in_exprs1099);
					expression82=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression82.getTree());
					}
					break;

				default :
					break loop11;
				}
			}


			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 130:5: -> ^( EXPRESSIONS ( expression )* )
			{
				// WhileGrammar.g:130:8: ^( EXPRESSIONS ( expression )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSIONS, "EXPRESSIONS"), root_1);
				// WhileGrammar.g:130:22: ( expression )*
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprs"

	// $ANTLR start synpred19_WhileGrammar
	public final void synpred19_WhileGrammar_fragment() throws RecognitionException {
		// WhileGrammar.g:124:13: ( expr_compare )
		// WhileGrammar.g:124:13: expr_compare
		{
		pushFollow(FOLLOW_expr_compare_in_synpred19_WhileGrammar1065);
		expr_compare();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred19_WhileGrammar

	// Delegated rules

	public final boolean synpred19_WhileGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_WhileGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_function_in_program429 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_53_in_function437 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_SYMBOL_in_function439 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_function441 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_definition_in_function443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_definition459 = new BitSet(new long[]{0x0000008800000000L});
	public static final BitSet FOLLOW_io_in_definition463 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_definition466 = new BitSet(new long[]{0x0898000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_definition470 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_definition472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_definition474 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_io_in_definition478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_io504 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_io507 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_VARIABLE_in_io509 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_vars525 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_vars528 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_VARIABLE_in_vars532 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_command_in_commands554 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_45_in_commands557 = new BitSet(new long[]{0x0898000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_command_in_commands559 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_vars_in_command_vars582 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_command_vars584 = new BitSet(new long[]{0x0400010C00000000L});
	public static final BitSet FOLLOW_exprs_in_command_vars586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_command_if602 = new BitSet(new long[]{0x0400010C00000000L});
	public static final BitSet FOLLOW_expression_in_command_if604 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_command_if606 = new BitSet(new long[]{0x0898000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_command_if610 = new BitSet(new long[]{0x0006000000000000L});
	public static final BitSet FOLLOW_49_in_command_if613 = new BitSet(new long[]{0x0898000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_command_if617 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_command_if621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_command_while642 = new BitSet(new long[]{0x0400010C00000000L});
	public static final BitSet FOLLOW_expression_in_command_while644 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_command_while646 = new BitSet(new long[]{0x0898000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_command_while648 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_command_while650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_command_for666 = new BitSet(new long[]{0x0400010C00000000L});
	public static final BitSet FOLLOW_expression_in_command_for668 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_command_for670 = new BitSet(new long[]{0x0898000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_command_for672 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_command_for674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_command_foreach690 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_VARIABLE_in_command_foreach694 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_command_foreach696 = new BitSet(new long[]{0x0400010C00000000L});
	public static final BitSet FOLLOW_expression_in_command_foreach698 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_command_foreach700 = new BitSet(new long[]{0x0898000800000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_commands_in_command_foreach702 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_command_foreach704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_command_nop723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_if_in_command737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_while_in_command750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_for_in_command763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_foreach_in_command776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_vars_in_command788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_nop_in_command800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_expr_symbol818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_expr_variable838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_expr_nil856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_expr_constructor_list871 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_expr_constructor_list873 = new BitSet(new long[]{0x0400030C00000000L});
	public static final BitSet FOLLOW_lexpr_in_expr_constructor_list875 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_expr_constructor_list877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_expr_constructor_cons895 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_expr_constructor_cons897 = new BitSet(new long[]{0x0400030C00000000L});
	public static final BitSet FOLLOW_lexpr_in_expr_constructor_cons899 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_expr_constructor_cons901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_expr_head920 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_expr_head922 = new BitSet(new long[]{0x0400010C00000000L});
	public static final BitSet FOLLOW_expr_in_expr_head924 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_expr_head926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_expr_tail944 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_63_in_expr_tail946 = new BitSet(new long[]{0x0400010C00000000L});
	public static final BitSet FOLLOW_expr_in_expr_tail948 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_expr_tail950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_expr_call968 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_SYMBOL_in_expr_call972 = new BitSet(new long[]{0x0400030C00000000L});
	public static final BitSet FOLLOW_lexpr_in_expr_call974 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_expr_call976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_nil_in_expr996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_variable_in_expr1000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_constructor_list_in_expr1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_constructor_cons_in_expr1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_head_in_expr1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_tail_in_expr1017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_call_in_expr1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_symbol_in_expr1026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expr_compare1035 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_expr_compare1037 = new BitSet(new long[]{0x0400010C00000000L});
	public static final BitSet FOLLOW_expr_in_expr_compare1041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_compare_in_expression1065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_expression1069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_lexpr1077 = new BitSet(new long[]{0x0400010C00000002L});
	public static final BitSet FOLLOW_expression_in_exprs1094 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_exprs1097 = new BitSet(new long[]{0x0400010C00000000L});
	public static final BitSet FOLLOW_expression_in_exprs1099 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_expr_compare_in_synpred19_WhileGrammar1065 = new BitSet(new long[]{0x0000000000000002L});
}
