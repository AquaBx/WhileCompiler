// $ANTLR 3.5.3 WhileGrammar.g 2024-12-17 09:26:53
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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGMENT", "COMMANDS", "COMMAND_NOP", 
		"COMMENT", "DEC", "DEFINITION", "EXPRESSION", "EXPRS", "EXPR_BASE", "EXPR_CALL", 
		"EXPR_CHILD", "EXPR_CHILD_LEFT", "EXPR_CHILD_RIGHT", "EXPR_CONSTRUCTOR", 
		"EXPR_CONSTRUCTOR_CONS", "EXPR_CONSTRUCTOR_LIST", "EXPR_NIL", "EXPR_PRIMITIVE", 
		"EXPR_SYMBOL", "EXPR_VARIABLE", "FOR", "FOREACH", "FUNCTION", "IDENT", 
		"IF", "INPUT", "INPUT_STUB", "LEXPR", "MAJ", "MIN", "OUTPUT", "PROGRAM", 
		"SYMBOL", "VARIABLE", "VARS", "WHILE", "WS", "'%'", "'('", "')'", "','", 
		"':'", "':='", "';'", "'=?'", "'cons'", "'do'", "'else'", "'fi'", "'for'", 
		"'foreach'", "'function'", "'hd'", "'if'", "'in'", "'list'", "'nil'", 
		"'nop'", "'od'", "'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
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
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int ASSIGMENT=4;
	public static final int COMMANDS=5;
	public static final int COMMAND_NOP=6;
	public static final int COMMENT=7;
	public static final int DEC=8;
	public static final int DEFINITION=9;
	public static final int EXPRESSION=10;
	public static final int EXPRS=11;
	public static final int EXPR_BASE=12;
	public static final int EXPR_CALL=13;
	public static final int EXPR_CHILD=14;
	public static final int EXPR_CHILD_LEFT=15;
	public static final int EXPR_CHILD_RIGHT=16;
	public static final int EXPR_CONSTRUCTOR=17;
	public static final int EXPR_CONSTRUCTOR_CONS=18;
	public static final int EXPR_CONSTRUCTOR_LIST=19;
	public static final int EXPR_NIL=20;
	public static final int EXPR_PRIMITIVE=21;
	public static final int EXPR_SYMBOL=22;
	public static final int EXPR_VARIABLE=23;
	public static final int FOR=24;
	public static final int FOREACH=25;
	public static final int FUNCTION=26;
	public static final int IDENT=27;
	public static final int IF=28;
	public static final int INPUT=29;
	public static final int INPUT_STUB=30;
	public static final int LEXPR=31;
	public static final int MAJ=32;
	public static final int MIN=33;
	public static final int OUTPUT=34;
	public static final int PROGRAM=35;
	public static final int SYMBOL=36;
	public static final int VARIABLE=37;
	public static final int VARS=38;
	public static final int WHILE=39;
	public static final int WS=40;

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
	// WhileGrammar.g:61:1: program : ( function )* ;
	public final WhileGrammarParser.program_return program() throws RecognitionException {
		WhileGrammarParser.program_return retval = new WhileGrammarParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function1 =null;


		try {
			// WhileGrammar.g:61:8: ( ( function )* )
			// WhileGrammar.g:61:10: ( function )*
			{
			root_0 = (Object)adaptor.nil();


			// WhileGrammar.g:61:10: ( function )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==55) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// WhileGrammar.g:61:10: function
					{
					pushFollow(FOLLOW_function_in_program474);
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
	// WhileGrammar.g:63:1: function : 'function' SYMBOL ':' definition -> ^( FUNCTION SYMBOL definition ) ;
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
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// WhileGrammar.g:63:9: ( 'function' SYMBOL ':' definition -> ^( FUNCTION SYMBOL definition ) )
			// WhileGrammar.g:63:11: 'function' SYMBOL ':' definition
			{
			string_literal2=(Token)match(input,55,FOLLOW_55_in_function482); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_55.add(string_literal2);

			SYMBOL3=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function484); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SYMBOL.add(SYMBOL3);

			char_literal4=(Token)match(input,45,FOLLOW_45_in_function486); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_45.add(char_literal4);

			pushFollow(FOLLOW_definition_in_function488);
			definition5=definition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_definition.add(definition5.getTree());

			// AST REWRITE
			// elements: definition, SYMBOL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 63:44: -> ^( FUNCTION SYMBOL definition )
			{
				// WhileGrammar.g:63:47: ^( FUNCTION SYMBOL definition )
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
	// WhileGrammar.g:64:1: definition : 'read' (i= io )? '%' c= commands '%' 'write' o= io -> ^( INPUT ( $i)? ) ^( OUTPUT $o) $c;
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
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_io=new RewriteRuleSubtreeStream(adaptor,"rule io");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// WhileGrammar.g:64:11: ( 'read' (i= io )? '%' c= commands '%' 'write' o= io -> ^( INPUT ( $i)? ) ^( OUTPUT $o) $c)
			// WhileGrammar.g:64:13: 'read' (i= io )? '%' c= commands '%' 'write' o= io
			{
			string_literal6=(Token)match(input,63,FOLLOW_63_in_definition504); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_63.add(string_literal6);

			// WhileGrammar.g:64:21: (i= io )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==VARIABLE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// WhileGrammar.g:64:21: i= io
					{
					pushFollow(FOLLOW_io_in_definition508);
					i=io();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_io.add(i.getTree());
					}
					break;

			}

			char_literal7=(Token)match(input,41,FOLLOW_41_in_definition511); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_41.add(char_literal7);

			pushFollow(FOLLOW_commands_in_definition515);
			c=commands();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commands.add(c.getTree());
			char_literal8=(Token)match(input,41,FOLLOW_41_in_definition517); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_41.add(char_literal8);

			string_literal9=(Token)match(input,67,FOLLOW_67_in_definition519); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_67.add(string_literal9);

			pushFollow(FOLLOW_io_in_definition523);
			o=io();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_io.add(o.getTree());

			// AST REWRITE
			// elements: i, o, c
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
			// 64:58: -> ^( INPUT ( $i)? ) ^( OUTPUT $o) $c
			{
				// WhileGrammar.g:64:61: ^( INPUT ( $i)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);
				// WhileGrammar.g:64:70: ( $i)?
				if ( stream_i.hasNext() ) {
					adaptor.addChild(root_1, stream_i.nextTree());
				}
				stream_i.reset();

				adaptor.addChild(root_0, root_1);
				}

				// WhileGrammar.g:64:74: ^( OUTPUT $o)
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
	// WhileGrammar.g:65:1: io : VARIABLE ( ',' VARIABLE )* -> ( VARIABLE )* ;
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
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");

		try {
			// WhileGrammar.g:65:3: ( VARIABLE ( ',' VARIABLE )* -> ( VARIABLE )* )
			// WhileGrammar.g:65:5: VARIABLE ( ',' VARIABLE )*
			{
			VARIABLE10=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_io549); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE10);

			// WhileGrammar.g:65:14: ( ',' VARIABLE )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==44) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// WhileGrammar.g:65:15: ',' VARIABLE
					{
					char_literal11=(Token)match(input,44,FOLLOW_44_in_io552); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_44.add(char_literal11);

					VARIABLE12=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_io554); if (state.failed) return retval; 
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
			// 65:30: -> ( VARIABLE )*
			{
				// WhileGrammar.g:65:33: ( VARIABLE )*
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
	// WhileGrammar.g:67:1: vars : v= VARIABLE ( ',' var= VARIABLE )* -> ^( VARS $v ( $var)? ) ;
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
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");

		try {
			// WhileGrammar.g:67:5: (v= VARIABLE ( ',' var= VARIABLE )* -> ^( VARS $v ( $var)? ) )
			// WhileGrammar.g:67:7: v= VARIABLE ( ',' var= VARIABLE )*
			{
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars570); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VARIABLE.add(v);

			// WhileGrammar.g:67:18: ( ',' var= VARIABLE )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==44) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// WhileGrammar.g:67:19: ',' var= VARIABLE
					{
					char_literal13=(Token)match(input,44,FOLLOW_44_in_vars573); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_44.add(char_literal13);

					var=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars577); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARIABLE.add(var);

					}
					break;

				default :
					break loop4;
				}
			}


			// AST REWRITE
			// elements: var, v
			// token labels: var, v
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_var=new RewriteRuleTokenStream(adaptor,"token var",var);
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 67:38: -> ^( VARS $v ( $var)? )
			{
				// WhileGrammar.g:67:41: ^( VARS $v ( $var)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARS, "VARS"), root_1);
				adaptor.addChild(root_1, stream_v.nextNode());
				// WhileGrammar.g:67:52: ( $var)?
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
	// WhileGrammar.g:69:1: commands : command ( ';' command )* -> ^( COMMANDS ( command )* ) ;
	public final WhileGrammarParser.commands_return commands() throws RecognitionException {
		WhileGrammarParser.commands_return retval = new WhileGrammarParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal15=null;
		ParserRuleReturnScope command14 =null;
		ParserRuleReturnScope command16 =null;

		Object char_literal15_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");

		try {
			// WhileGrammar.g:69:9: ( command ( ';' command )* -> ^( COMMANDS ( command )* ) )
			// WhileGrammar.g:69:11: command ( ';' command )*
			{
			pushFollow(FOLLOW_command_in_commands599);
			command14=command();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_command.add(command14.getTree());
			// WhileGrammar.g:69:19: ( ';' command )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==47) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// WhileGrammar.g:69:20: ';' command
					{
					char_literal15=(Token)match(input,47,FOLLOW_47_in_commands602); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_47.add(char_literal15);

					pushFollow(FOLLOW_command_in_commands604);
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
			// 70:5: -> ^( COMMANDS ( command )* )
			{
				// WhileGrammar.g:70:8: ^( COMMANDS ( command )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_1);
				// WhileGrammar.g:70:19: ( command )*
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


	public static class exprs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprs"
	// WhileGrammar.g:73:1: exprs : expression ( ',' c= expression )* -> ^( EXPRS expression ( $c)? ) ;
	public final WhileGrammarParser.exprs_return exprs() throws RecognitionException {
		WhileGrammarParser.exprs_return retval = new WhileGrammarParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal18=null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope expression17 =null;

		Object char_literal18_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// WhileGrammar.g:73:6: ( expression ( ',' c= expression )* -> ^( EXPRS expression ( $c)? ) )
			// WhileGrammar.g:73:8: expression ( ',' c= expression )*
			{
			pushFollow(FOLLOW_expression_in_exprs627);
			expression17=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression17.getTree());
			// WhileGrammar.g:73:19: ( ',' c= expression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==44) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// WhileGrammar.g:73:20: ',' c= expression
					{
					char_literal18=(Token)match(input,44,FOLLOW_44_in_exprs630); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_44.add(char_literal18);

					pushFollow(FOLLOW_expression_in_exprs634);
					c=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(c.getTree());
					}
					break;

				default :
					break loop6;
				}
			}


			// AST REWRITE
			// elements: c, expression
			// token labels: 
			// rule labels: c, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 74:5: -> ^( EXPRS expression ( $c)? )
			{
				// WhileGrammar.g:74:8: ^( EXPRS expression ( $c)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRS, "EXPRS"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				// WhileGrammar.g:74:28: ( $c)?
				if ( stream_c.hasNext() ) {
					adaptor.addChild(root_1, stream_c.nextTree());
				}
				stream_c.reset();

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


	public static class command_vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command_vars"
	// WhileGrammar.g:77:1: command_vars : vars ':=' exprs -> ^( ASSIGMENT vars exprs ) ;
	public final WhileGrammarParser.command_vars_return command_vars() throws RecognitionException {
		WhileGrammarParser.command_vars_return retval = new WhileGrammarParser.command_vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal20=null;
		ParserRuleReturnScope vars19 =null;
		ParserRuleReturnScope exprs21 =null;

		Object string_literal20_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// WhileGrammar.g:77:13: ( vars ':=' exprs -> ^( ASSIGMENT vars exprs ) )
			// WhileGrammar.g:77:15: vars ':=' exprs
			{
			pushFollow(FOLLOW_vars_in_command_vars660);
			vars19=vars();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_vars.add(vars19.getTree());
			string_literal20=(Token)match(input,46,FOLLOW_46_in_command_vars662); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_46.add(string_literal20);

			pushFollow(FOLLOW_exprs_in_command_vars664);
			exprs21=exprs();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_exprs.add(exprs21.getTree());

			// AST REWRITE
			// elements: vars, exprs
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 77:31: -> ^( ASSIGMENT vars exprs )
			{
				// WhileGrammar.g:77:34: ^( ASSIGMENT vars exprs )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGMENT, "ASSIGMENT"), root_1);
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
	// WhileGrammar.g:78:1: command_if : 'if' expression 'then' b1= commands ( 'else' b2= commands )? 'fi' -> ^( IF expression $b1 ( $b2)? ) ;
	public final WhileGrammarParser.command_if_return command_if() throws RecognitionException {
		WhileGrammarParser.command_if_return retval = new WhileGrammarParser.command_if_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal22=null;
		Token string_literal24=null;
		Token string_literal25=null;
		Token string_literal26=null;
		ParserRuleReturnScope b1 =null;
		ParserRuleReturnScope b2 =null;
		ParserRuleReturnScope expression23 =null;

		Object string_literal22_tree=null;
		Object string_literal24_tree=null;
		Object string_literal25_tree=null;
		Object string_literal26_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// WhileGrammar.g:78:11: ( 'if' expression 'then' b1= commands ( 'else' b2= commands )? 'fi' -> ^( IF expression $b1 ( $b2)? ) )
			// WhileGrammar.g:78:13: 'if' expression 'then' b1= commands ( 'else' b2= commands )? 'fi'
			{
			string_literal22=(Token)match(input,57,FOLLOW_57_in_command_if680); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_57.add(string_literal22);

			pushFollow(FOLLOW_expression_in_command_if682);
			expression23=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression23.getTree());
			string_literal24=(Token)match(input,64,FOLLOW_64_in_command_if684); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_64.add(string_literal24);

			pushFollow(FOLLOW_commands_in_command_if688);
			b1=commands();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commands.add(b1.getTree());
			// WhileGrammar.g:78:48: ( 'else' b2= commands )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==51) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// WhileGrammar.g:78:49: 'else' b2= commands
					{
					string_literal25=(Token)match(input,51,FOLLOW_51_in_command_if691); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_51.add(string_literal25);

					pushFollow(FOLLOW_commands_in_command_if695);
					b2=commands();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_commands.add(b2.getTree());
					}
					break;

			}

			string_literal26=(Token)match(input,52,FOLLOW_52_in_command_if699); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_52.add(string_literal26);


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
			// 78:75: -> ^( IF expression $b1 ( $b2)? )
			{
				// WhileGrammar.g:78:78: ^( IF expression $b1 ( $b2)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_b1.nextTree());
				// WhileGrammar.g:78:99: ( $b2)?
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
	// WhileGrammar.g:79:1: command_while : 'while' expression 'do' commands 'od' -> ^( WHILE expression commands ) ;
	public final WhileGrammarParser.command_while_return command_while() throws RecognitionException {
		WhileGrammarParser.command_while_return retval = new WhileGrammarParser.command_while_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal27=null;
		Token string_literal29=null;
		Token string_literal31=null;
		ParserRuleReturnScope expression28 =null;
		ParserRuleReturnScope commands30 =null;

		Object string_literal27_tree=null;
		Object string_literal29_tree=null;
		Object string_literal31_tree=null;
		RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// WhileGrammar.g:79:14: ( 'while' expression 'do' commands 'od' -> ^( WHILE expression commands ) )
			// WhileGrammar.g:79:16: 'while' expression 'do' commands 'od'
			{
			string_literal27=(Token)match(input,66,FOLLOW_66_in_command_while720); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_66.add(string_literal27);

			pushFollow(FOLLOW_expression_in_command_while722);
			expression28=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression28.getTree());
			string_literal29=(Token)match(input,50,FOLLOW_50_in_command_while724); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_50.add(string_literal29);

			pushFollow(FOLLOW_commands_in_command_while726);
			commands30=commands();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commands.add(commands30.getTree());
			string_literal31=(Token)match(input,62,FOLLOW_62_in_command_while728); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_62.add(string_literal31);


			// AST REWRITE
			// elements: commands, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 79:54: -> ^( WHILE expression commands )
			{
				// WhileGrammar.g:79:57: ^( WHILE expression commands )
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
	// WhileGrammar.g:80:1: command_for : 'for' expression 'do' commands 'od' -> ^( FOR expression commands ) ;
	public final WhileGrammarParser.command_for_return command_for() throws RecognitionException {
		WhileGrammarParser.command_for_return retval = new WhileGrammarParser.command_for_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal32=null;
		Token string_literal34=null;
		Token string_literal36=null;
		ParserRuleReturnScope expression33 =null;
		ParserRuleReturnScope commands35 =null;

		Object string_literal32_tree=null;
		Object string_literal34_tree=null;
		Object string_literal36_tree=null;
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// WhileGrammar.g:80:12: ( 'for' expression 'do' commands 'od' -> ^( FOR expression commands ) )
			// WhileGrammar.g:80:14: 'for' expression 'do' commands 'od'
			{
			string_literal32=(Token)match(input,53,FOLLOW_53_in_command_for744); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_53.add(string_literal32);

			pushFollow(FOLLOW_expression_in_command_for746);
			expression33=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression33.getTree());
			string_literal34=(Token)match(input,50,FOLLOW_50_in_command_for748); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_50.add(string_literal34);

			pushFollow(FOLLOW_commands_in_command_for750);
			commands35=commands();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commands.add(commands35.getTree());
			string_literal36=(Token)match(input,62,FOLLOW_62_in_command_for752); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_62.add(string_literal36);


			// AST REWRITE
			// elements: commands, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 80:50: -> ^( FOR expression commands )
			{
				// WhileGrammar.g:80:53: ^( FOR expression commands )
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
	// WhileGrammar.g:81:1: command_foreach : 'foreach' v= VARIABLE 'in' expression 'do' commands 'od' -> ^( FOREACH $v expression commands ) ;
	public final WhileGrammarParser.command_foreach_return command_foreach() throws RecognitionException {
		WhileGrammarParser.command_foreach_return retval = new WhileGrammarParser.command_foreach_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token string_literal37=null;
		Token string_literal38=null;
		Token string_literal40=null;
		Token string_literal42=null;
		ParserRuleReturnScope expression39 =null;
		ParserRuleReturnScope commands41 =null;

		Object v_tree=null;
		Object string_literal37_tree=null;
		Object string_literal38_tree=null;
		Object string_literal40_tree=null;
		Object string_literal42_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// WhileGrammar.g:81:16: ( 'foreach' v= VARIABLE 'in' expression 'do' commands 'od' -> ^( FOREACH $v expression commands ) )
			// WhileGrammar.g:81:18: 'foreach' v= VARIABLE 'in' expression 'do' commands 'od'
			{
			string_literal37=(Token)match(input,54,FOLLOW_54_in_command_foreach768); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(string_literal37);

			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command_foreach772); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VARIABLE.add(v);

			string_literal38=(Token)match(input,58,FOLLOW_58_in_command_foreach774); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_58.add(string_literal38);

			pushFollow(FOLLOW_expression_in_command_foreach776);
			expression39=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression39.getTree());
			string_literal40=(Token)match(input,50,FOLLOW_50_in_command_foreach778); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_50.add(string_literal40);

			pushFollow(FOLLOW_commands_in_command_foreach780);
			commands41=commands();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commands.add(commands41.getTree());
			string_literal42=(Token)match(input,62,FOLLOW_62_in_command_foreach782); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_62.add(string_literal42);


			// AST REWRITE
			// elements: commands, v, expression
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
			// 81:74: -> ^( FOREACH $v expression commands )
			{
				// WhileGrammar.g:81:77: ^( FOREACH $v expression commands )
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
	// WhileGrammar.g:82:1: command_nop : 'nop' -> ^( COMMAND_NOP ) ;
	public final WhileGrammarParser.command_nop_return command_nop() throws RecognitionException {
		WhileGrammarParser.command_nop_return retval = new WhileGrammarParser.command_nop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal43=null;

		Object string_literal43_tree=null;
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");

		try {
			// WhileGrammar.g:82:12: ( 'nop' -> ^( COMMAND_NOP ) )
			// WhileGrammar.g:82:14: 'nop'
			{
			string_literal43=(Token)match(input,61,FOLLOW_61_in_command_nop801); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_61.add(string_literal43);


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
			// 82:20: -> ^( COMMAND_NOP )
			{
				// WhileGrammar.g:82:23: ^( COMMAND_NOP )
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
	// WhileGrammar.g:85:1: command : ( command_if | command_while | command_for | command_foreach | command_vars | command_nop );
	public final WhileGrammarParser.command_return command() throws RecognitionException {
		WhileGrammarParser.command_return retval = new WhileGrammarParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope command_if44 =null;
		ParserRuleReturnScope command_while45 =null;
		ParserRuleReturnScope command_for46 =null;
		ParserRuleReturnScope command_foreach47 =null;
		ParserRuleReturnScope command_vars48 =null;
		ParserRuleReturnScope command_nop49 =null;


		try {
			// WhileGrammar.g:85:8: ( command_if | command_while | command_for | command_foreach | command_vars | command_nop )
			int alt8=6;
			switch ( input.LA(1) ) {
			case 57:
				{
				alt8=1;
				}
				break;
			case 66:
				{
				alt8=2;
				}
				break;
			case 53:
				{
				alt8=3;
				}
				break;
			case 54:
				{
				alt8=4;
				}
				break;
			case VARIABLE:
				{
				alt8=5;
				}
				break;
			case 61:
				{
				alt8=6;
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
					// WhileGrammar.g:85:10: command_if
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_if_in_command815);
					command_if44=command_if();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_if44.getTree());

					}
					break;
				case 2 :
					// WhileGrammar.g:86:11: command_while
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_while_in_command828);
					command_while45=command_while();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_while45.getTree());

					}
					break;
				case 3 :
					// WhileGrammar.g:87:11: command_for
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_for_in_command841);
					command_for46=command_for();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_for46.getTree());

					}
					break;
				case 4 :
					// WhileGrammar.g:88:11: command_foreach
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_foreach_in_command854);
					command_foreach47=command_foreach();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_foreach47.getTree());

					}
					break;
				case 5 :
					// WhileGrammar.g:89:11: command_vars
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_vars_in_command866);
					command_vars48=command_vars();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_vars48.getTree());

					}
					break;
				case 6 :
					// WhileGrammar.g:90:11: command_nop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_nop_in_command878);
					command_nop49=command_nop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_nop49.getTree());

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


	public static class exprbase_symbol_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase_symbol"
	// WhileGrammar.g:93:1: exprbase_symbol : a= SYMBOL -> ^( EXPR_SYMBOL $a) ;
	public final WhileGrammarParser.exprbase_symbol_return exprbase_symbol() throws RecognitionException {
		WhileGrammarParser.exprbase_symbol_return retval = new WhileGrammarParser.exprbase_symbol_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token a=null;

		Object a_tree=null;
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");

		try {
			// WhileGrammar.g:93:16: (a= SYMBOL -> ^( EXPR_SYMBOL $a) )
			// WhileGrammar.g:93:18: a= SYMBOL
			{
			a=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase_symbol896); if (state.failed) return retval; 
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
			// 94:2: -> ^( EXPR_SYMBOL $a)
			{
				// WhileGrammar.g:94:5: ^( EXPR_SYMBOL $a)
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
	// $ANTLR end "exprbase_symbol"


	public static class exprbase_variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase_variable"
	// WhileGrammar.g:97:1: exprbase_variable : a= VARIABLE -> ^( EXPR_VARIABLE $a) ;
	public final WhileGrammarParser.exprbase_variable_return exprbase_variable() throws RecognitionException {
		WhileGrammarParser.exprbase_variable_return retval = new WhileGrammarParser.exprbase_variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token a=null;

		Object a_tree=null;
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");

		try {
			// WhileGrammar.g:97:18: (a= VARIABLE -> ^( EXPR_VARIABLE $a) )
			// WhileGrammar.g:97:20: a= VARIABLE
			{
			a=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_exprbase_variable916); if (state.failed) return retval; 
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
			// 98:2: -> ^( EXPR_VARIABLE $a)
			{
				// WhileGrammar.g:98:5: ^( EXPR_VARIABLE $a)
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
	// $ANTLR end "exprbase_variable"


	public static class exprbase_nil_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase_nil"
	// WhileGrammar.g:101:1: exprbase_nil : 'nil' -> ^( EXPR_NIL ) ;
	public final WhileGrammarParser.exprbase_nil_return exprbase_nil() throws RecognitionException {
		WhileGrammarParser.exprbase_nil_return retval = new WhileGrammarParser.exprbase_nil_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal50=null;

		Object string_literal50_tree=null;
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");

		try {
			// WhileGrammar.g:101:13: ( 'nil' -> ^( EXPR_NIL ) )
			// WhileGrammar.g:101:15: 'nil'
			{
			string_literal50=(Token)match(input,60,FOLLOW_60_in_exprbase_nil934); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_60.add(string_literal50);


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
			// 102:2: -> ^( EXPR_NIL )
			{
				// WhileGrammar.g:102:5: ^( EXPR_NIL )
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
	// $ANTLR end "exprbase_nil"


	public static class expr_constructor_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_constructor_list"
	// WhileGrammar.g:105:1: expr_constructor_list : '(' 'list' lexpr ')' -> ^( EXPR_CONSTRUCTOR_LIST lexpr ) ;
	public final WhileGrammarParser.expr_constructor_list_return expr_constructor_list() throws RecognitionException {
		WhileGrammarParser.expr_constructor_list_return retval = new WhileGrammarParser.expr_constructor_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal51=null;
		Token string_literal52=null;
		Token char_literal54=null;
		ParserRuleReturnScope lexpr53 =null;

		Object char_literal51_tree=null;
		Object string_literal52_tree=null;
		Object char_literal54_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");

		try {
			// WhileGrammar.g:105:22: ( '(' 'list' lexpr ')' -> ^( EXPR_CONSTRUCTOR_LIST lexpr ) )
			// WhileGrammar.g:105:24: '(' 'list' lexpr ')'
			{
			char_literal51=(Token)match(input,42,FOLLOW_42_in_expr_constructor_list949); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_42.add(char_literal51);

			string_literal52=(Token)match(input,59,FOLLOW_59_in_expr_constructor_list951); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_59.add(string_literal52);

			pushFollow(FOLLOW_lexpr_in_expr_constructor_list953);
			lexpr53=lexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_lexpr.add(lexpr53.getTree());
			char_literal54=(Token)match(input,43,FOLLOW_43_in_expr_constructor_list955); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_43.add(char_literal54);


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
			// 106:2: -> ^( EXPR_CONSTRUCTOR_LIST lexpr )
			{
				// WhileGrammar.g:106:5: ^( EXPR_CONSTRUCTOR_LIST lexpr )
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
	// WhileGrammar.g:109:1: expr_constructor_cons : '(' 'cons' lexpr ')' -> ^( EXPR_CONSTRUCTOR_CONS lexpr ) ;
	public final WhileGrammarParser.expr_constructor_cons_return expr_constructor_cons() throws RecognitionException {
		WhileGrammarParser.expr_constructor_cons_return retval = new WhileGrammarParser.expr_constructor_cons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal55=null;
		Token string_literal56=null;
		Token char_literal58=null;
		ParserRuleReturnScope lexpr57 =null;

		Object char_literal55_tree=null;
		Object string_literal56_tree=null;
		Object char_literal58_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");

		try {
			// WhileGrammar.g:109:22: ( '(' 'cons' lexpr ')' -> ^( EXPR_CONSTRUCTOR_CONS lexpr ) )
			// WhileGrammar.g:109:24: '(' 'cons' lexpr ')'
			{
			char_literal55=(Token)match(input,42,FOLLOW_42_in_expr_constructor_cons973); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_42.add(char_literal55);

			string_literal56=(Token)match(input,49,FOLLOW_49_in_expr_constructor_cons975); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_49.add(string_literal56);

			pushFollow(FOLLOW_lexpr_in_expr_constructor_cons977);
			lexpr57=lexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_lexpr.add(lexpr57.getTree());
			char_literal58=(Token)match(input,43,FOLLOW_43_in_expr_constructor_cons979); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_43.add(char_literal58);


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
			// 110:2: -> ^( EXPR_CONSTRUCTOR_CONS lexpr )
			{
				// WhileGrammar.g:110:5: ^( EXPR_CONSTRUCTOR_CONS lexpr )
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


	public static class exprbasechildleft_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbasechildleft"
	// WhileGrammar.g:113:1: exprbasechildleft : '(' 'hd' exprbase ')' -> ^( EXPR_CHILD_LEFT exprbase ) ;
	public final WhileGrammarParser.exprbasechildleft_return exprbasechildleft() throws RecognitionException {
		WhileGrammarParser.exprbasechildleft_return retval = new WhileGrammarParser.exprbasechildleft_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal59=null;
		Token string_literal60=null;
		Token char_literal62=null;
		ParserRuleReturnScope exprbase61 =null;

		Object char_literal59_tree=null;
		Object string_literal60_tree=null;
		Object char_literal62_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// WhileGrammar.g:113:18: ( '(' 'hd' exprbase ')' -> ^( EXPR_CHILD_LEFT exprbase ) )
			// WhileGrammar.g:113:20: '(' 'hd' exprbase ')'
			{
			char_literal59=(Token)match(input,42,FOLLOW_42_in_exprbasechildleft998); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_42.add(char_literal59);

			string_literal60=(Token)match(input,56,FOLLOW_56_in_exprbasechildleft1000); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_56.add(string_literal60);

			pushFollow(FOLLOW_exprbase_in_exprbasechildleft1002);
			exprbase61=exprbase();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_exprbase.add(exprbase61.getTree());
			char_literal62=(Token)match(input,43,FOLLOW_43_in_exprbasechildleft1004); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_43.add(char_literal62);


			// AST REWRITE
			// elements: exprbase
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 114:2: -> ^( EXPR_CHILD_LEFT exprbase )
			{
				// WhileGrammar.g:114:5: ^( EXPR_CHILD_LEFT exprbase )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_CHILD_LEFT, "EXPR_CHILD_LEFT"), root_1);
				adaptor.addChild(root_1, stream_exprbase.nextTree());
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
	// $ANTLR end "exprbasechildleft"


	public static class exprbasechildright_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbasechildright"
	// WhileGrammar.g:117:1: exprbasechildright : '(' 'tl' exprbase ')' -> ^( EXPR_CHILD_RIGHT exprbase ) ;
	public final WhileGrammarParser.exprbasechildright_return exprbasechildright() throws RecognitionException {
		WhileGrammarParser.exprbasechildright_return retval = new WhileGrammarParser.exprbasechildright_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal63=null;
		Token string_literal64=null;
		Token char_literal66=null;
		ParserRuleReturnScope exprbase65 =null;

		Object char_literal63_tree=null;
		Object string_literal64_tree=null;
		Object char_literal66_tree=null;
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// WhileGrammar.g:117:19: ( '(' 'tl' exprbase ')' -> ^( EXPR_CHILD_RIGHT exprbase ) )
			// WhileGrammar.g:117:21: '(' 'tl' exprbase ')'
			{
			char_literal63=(Token)match(input,42,FOLLOW_42_in_exprbasechildright1022); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_42.add(char_literal63);

			string_literal64=(Token)match(input,65,FOLLOW_65_in_exprbasechildright1024); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_65.add(string_literal64);

			pushFollow(FOLLOW_exprbase_in_exprbasechildright1026);
			exprbase65=exprbase();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_exprbase.add(exprbase65.getTree());
			char_literal66=(Token)match(input,43,FOLLOW_43_in_exprbasechildright1028); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_43.add(char_literal66);


			// AST REWRITE
			// elements: exprbase
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 118:2: -> ^( EXPR_CHILD_RIGHT exprbase )
			{
				// WhileGrammar.g:118:5: ^( EXPR_CHILD_RIGHT exprbase )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_CHILD_RIGHT, "EXPR_CHILD_RIGHT"), root_1);
				adaptor.addChild(root_1, stream_exprbase.nextTree());
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
	// $ANTLR end "exprbasechildright"


	public static class expr_call_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_call"
	// WhileGrammar.g:121:1: expr_call : '(' a= SYMBOL lexpr ')' -> ^( EXPR_CALL $a lexpr ) ;
	public final WhileGrammarParser.expr_call_return expr_call() throws RecognitionException {
		WhileGrammarParser.expr_call_return retval = new WhileGrammarParser.expr_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token a=null;
		Token char_literal67=null;
		Token char_literal69=null;
		ParserRuleReturnScope lexpr68 =null;

		Object a_tree=null;
		Object char_literal67_tree=null;
		Object char_literal69_tree=null;
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");

		try {
			// WhileGrammar.g:121:10: ( '(' a= SYMBOL lexpr ')' -> ^( EXPR_CALL $a lexpr ) )
			// WhileGrammar.g:121:12: '(' a= SYMBOL lexpr ')'
			{
			char_literal67=(Token)match(input,42,FOLLOW_42_in_expr_call1046); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_42.add(char_literal67);

			a=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_expr_call1050); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SYMBOL.add(a);

			pushFollow(FOLLOW_lexpr_in_expr_call1052);
			lexpr68=lexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_lexpr.add(lexpr68.getTree());
			char_literal69=(Token)match(input,43,FOLLOW_43_in_expr_call1054); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_43.add(char_literal69);


			// AST REWRITE
			// elements: a, lexpr
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
			// 122:2: -> ^( EXPR_CALL $a lexpr )
			{
				// WhileGrammar.g:122:5: ^( EXPR_CALL $a lexpr )
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


	public static class exprbase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase"
	// WhileGrammar.g:125:1: exprbase : ( exprbase_nil | exprbase_variable | expr_constructor_list | expr_constructor_cons | exprbasechildleft | exprbasechildright | expr_call | exprbase_symbol );
	public final WhileGrammarParser.exprbase_return exprbase() throws RecognitionException {
		WhileGrammarParser.exprbase_return retval = new WhileGrammarParser.exprbase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprbase_nil70 =null;
		ParserRuleReturnScope exprbase_variable71 =null;
		ParserRuleReturnScope expr_constructor_list72 =null;
		ParserRuleReturnScope expr_constructor_cons73 =null;
		ParserRuleReturnScope exprbasechildleft74 =null;
		ParserRuleReturnScope exprbasechildright75 =null;
		ParserRuleReturnScope expr_call76 =null;
		ParserRuleReturnScope exprbase_symbol77 =null;


		try {
			// WhileGrammar.g:125:9: ( exprbase_nil | exprbase_variable | expr_constructor_list | expr_constructor_cons | exprbasechildleft | exprbasechildright | expr_call | exprbase_symbol )
			int alt9=8;
			switch ( input.LA(1) ) {
			case 60:
				{
				alt9=1;
				}
				break;
			case VARIABLE:
				{
				alt9=2;
				}
				break;
			case 42:
				{
				switch ( input.LA(2) ) {
				case 59:
					{
					alt9=3;
					}
					break;
				case 49:
					{
					alt9=4;
					}
					break;
				case 56:
					{
					alt9=5;
					}
					break;
				case 65:
					{
					alt9=6;
					}
					break;
				case SYMBOL:
					{
					alt9=7;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case SYMBOL:
				{
				alt9=8;
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
					// WhileGrammar.g:125:11: exprbase_nil
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exprbase_nil_in_exprbase1074);
					exprbase_nil70=exprbase_nil();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbase_nil70.getTree());

					}
					break;
				case 2 :
					// WhileGrammar.g:125:26: exprbase_variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exprbase_variable_in_exprbase1078);
					exprbase_variable71=exprbase_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbase_variable71.getTree());

					}
					break;
				case 3 :
					// WhileGrammar.g:125:46: expr_constructor_list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_constructor_list_in_exprbase1082);
					expr_constructor_list72=expr_constructor_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_constructor_list72.getTree());

					}
					break;
				case 4 :
					// WhileGrammar.g:125:70: expr_constructor_cons
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_constructor_cons_in_exprbase1086);
					expr_constructor_cons73=expr_constructor_cons();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_constructor_cons73.getTree());

					}
					break;
				case 5 :
					// WhileGrammar.g:125:94: exprbasechildleft
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exprbasechildleft_in_exprbase1090);
					exprbasechildleft74=exprbasechildleft();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbasechildleft74.getTree());

					}
					break;
				case 6 :
					// WhileGrammar.g:125:115: exprbasechildright
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exprbasechildright_in_exprbase1095);
					exprbasechildright75=exprbasechildright();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbasechildright75.getTree());

					}
					break;
				case 7 :
					// WhileGrammar.g:125:137: expr_call
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_call_in_exprbase1100);
					expr_call76=expr_call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_call76.getTree());

					}
					break;
				case 8 :
					// WhileGrammar.g:125:149: exprbase_symbol
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exprbase_symbol_in_exprbase1104);
					exprbase_symbol77=exprbase_symbol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbase_symbol77.getTree());

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
	// $ANTLR end "exprbase"


	public static class expression_a_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression_a"
	// WhileGrammar.g:127:1: expression_a : c= exprbase '=?' d= exprbase -> ^( EXPRESSION $c $d) ;
	public final WhileGrammarParser.expression_a_return expression_a() throws RecognitionException {
		WhileGrammarParser.expression_a_return retval = new WhileGrammarParser.expression_a_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal78=null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope d =null;

		Object string_literal78_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// WhileGrammar.g:127:13: (c= exprbase '=?' d= exprbase -> ^( EXPRESSION $c $d) )
			// WhileGrammar.g:127:15: c= exprbase '=?' d= exprbase
			{
			pushFollow(FOLLOW_exprbase_in_expression_a1113);
			c=exprbase();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_exprbase.add(c.getTree());
			string_literal78=(Token)match(input,48,FOLLOW_48_in_expression_a1115); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_48.add(string_literal78);

			pushFollow(FOLLOW_exprbase_in_expression_a1119);
			d=exprbase();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_exprbase.add(d.getTree());

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
			// 128:5: -> ^( EXPRESSION $c $d)
			{
				// WhileGrammar.g:128:8: ^( EXPRESSION $c $d)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);
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
	// $ANTLR end "expression_a"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// WhileGrammar.g:131:1: expression : ( expression_a | exprbase );
	public final WhileGrammarParser.expression_return expression() throws RecognitionException {
		WhileGrammarParser.expression_return retval = new WhileGrammarParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression_a79 =null;
		ParserRuleReturnScope exprbase80 =null;


		try {
			// WhileGrammar.g:131:11: ( expression_a | exprbase )
			int alt10=2;
			switch ( input.LA(1) ) {
			case 60:
				{
				int LA10_1 = input.LA(2);
				if ( (synpred20_WhileGrammar()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case VARIABLE:
				{
				int LA10_2 = input.LA(2);
				if ( (synpred20_WhileGrammar()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case 42:
				{
				int LA10_3 = input.LA(2);
				if ( (synpred20_WhileGrammar()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			case SYMBOL:
				{
				int LA10_4 = input.LA(2);
				if ( (synpred20_WhileGrammar()) ) {
					alt10=1;
				}
				else if ( (true) ) {
					alt10=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// WhileGrammar.g:131:13: expression_a
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_a_in_expression1143);
					expression_a79=expression_a();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_a79.getTree());

					}
					break;
				case 2 :
					// WhileGrammar.g:131:28: exprbase
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exprbase_in_expression1147);
					exprbase80=exprbase();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbase80.getTree());

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
	// WhileGrammar.g:134:1: lexpr : ( exprbase )* -> ^( LEXPR ( exprbase )* ) ;
	public final WhileGrammarParser.lexpr_return lexpr() throws RecognitionException {
		WhileGrammarParser.lexpr_return retval = new WhileGrammarParser.lexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprbase81 =null;

		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// WhileGrammar.g:134:6: ( ( exprbase )* -> ^( LEXPR ( exprbase )* ) )
			// WhileGrammar.g:134:8: ( exprbase )*
			{
			// WhileGrammar.g:134:8: ( exprbase )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= SYMBOL && LA11_0 <= VARIABLE)||LA11_0==42||LA11_0==60) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// WhileGrammar.g:134:8: exprbase
					{
					pushFollow(FOLLOW_exprbase_in_lexpr1155);
					exprbase81=exprbase();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_exprbase.add(exprbase81.getTree());
					}
					break;

				default :
					break loop11;
				}
			}


			// AST REWRITE
			// elements: exprbase
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 134:18: -> ^( LEXPR ( exprbase )* )
			{
				// WhileGrammar.g:134:21: ^( LEXPR ( exprbase )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LEXPR, "LEXPR"), root_1);
				// WhileGrammar.g:134:29: ( exprbase )*
				while ( stream_exprbase.hasNext() ) {
					adaptor.addChild(root_1, stream_exprbase.nextTree());
				}
				stream_exprbase.reset();

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

	// $ANTLR start synpred20_WhileGrammar
	public final void synpred20_WhileGrammar_fragment() throws RecognitionException {
		// WhileGrammar.g:131:13: ( expression_a )
		// WhileGrammar.g:131:13: expression_a
		{
		pushFollow(FOLLOW_expression_a_in_synpred20_WhileGrammar1143);
		expression_a();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred20_WhileGrammar

	// Delegated rules

	public final boolean synpred20_WhileGrammar() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_WhileGrammar_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_function_in_program474 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_function482 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_SYMBOL_in_function484 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_function486 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_definition_in_function488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_definition504 = new BitSet(new long[]{0x0000022000000000L});
	public static final BitSet FOLLOW_io_in_definition508 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_definition511 = new BitSet(new long[]{0x2260002000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_commands_in_definition515 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_definition517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_67_in_definition519 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_io_in_definition523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_io549 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_io552 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_VARIABLE_in_io554 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_vars570 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_vars573 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_VARIABLE_in_vars577 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_command_in_commands599 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_commands602 = new BitSet(new long[]{0x2260002000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_command_in_commands604 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_expression_in_exprs627 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_exprs630 = new BitSet(new long[]{0x1000043000000000L});
	public static final BitSet FOLLOW_expression_in_exprs634 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_vars_in_command_vars660 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command_vars662 = new BitSet(new long[]{0x1000043000000000L});
	public static final BitSet FOLLOW_exprs_in_command_vars664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_command_if680 = new BitSet(new long[]{0x1000043000000000L});
	public static final BitSet FOLLOW_expression_in_command_if682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_command_if684 = new BitSet(new long[]{0x2260002000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_commands_in_command_if688 = new BitSet(new long[]{0x0018000000000000L});
	public static final BitSet FOLLOW_51_in_command_if691 = new BitSet(new long[]{0x2260002000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_commands_in_command_if695 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_command_if699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_command_while720 = new BitSet(new long[]{0x1000043000000000L});
	public static final BitSet FOLLOW_expression_in_command_while722 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_command_while724 = new BitSet(new long[]{0x2260002000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_commands_in_command_while726 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_command_while728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_command_for744 = new BitSet(new long[]{0x1000043000000000L});
	public static final BitSet FOLLOW_expression_in_command_for746 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_command_for748 = new BitSet(new long[]{0x2260002000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_commands_in_command_for750 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_command_for752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_command_foreach768 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_VARIABLE_in_command_foreach772 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_58_in_command_foreach774 = new BitSet(new long[]{0x1000043000000000L});
	public static final BitSet FOLLOW_expression_in_command_foreach776 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_50_in_command_foreach778 = new BitSet(new long[]{0x2260002000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_commands_in_command_foreach780 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_62_in_command_foreach782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_command_nop801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_if_in_command815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_while_in_command828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_for_in_command841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_foreach_in_command854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_vars_in_command866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_nop_in_command878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase_symbol896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_exprbase_variable916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_exprbase_nil934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_expr_constructor_list949 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_59_in_expr_constructor_list951 = new BitSet(new long[]{0x10000C3000000000L});
	public static final BitSet FOLLOW_lexpr_in_expr_constructor_list953 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_expr_constructor_list955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_expr_constructor_cons973 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_expr_constructor_cons975 = new BitSet(new long[]{0x10000C3000000000L});
	public static final BitSet FOLLOW_lexpr_in_expr_constructor_cons977 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_expr_constructor_cons979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_exprbasechildleft998 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_56_in_exprbasechildleft1000 = new BitSet(new long[]{0x1000043000000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbasechildleft1002 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_exprbasechildleft1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_exprbasechildright1022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_exprbasechildright1024 = new BitSet(new long[]{0x1000043000000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbasechildright1026 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_exprbasechildright1028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_expr_call1046 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_SYMBOL_in_expr_call1050 = new BitSet(new long[]{0x10000C3000000000L});
	public static final BitSet FOLLOW_lexpr_in_expr_call1052 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_expr_call1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_nil_in_exprbase1074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_variable_in_exprbase1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_constructor_list_in_exprbase1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_constructor_cons_in_exprbase1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbasechildleft_in_exprbase1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbasechildright_in_exprbase1095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_call_in_exprbase1100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_symbol_in_exprbase1104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_expression_a1113 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_expression_a1115 = new BitSet(new long[]{0x1000043000000000L});
	public static final BitSet FOLLOW_exprbase_in_expression_a1119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_a_in_expression1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_expression1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_lexpr1155 = new BitSet(new long[]{0x1000043000000002L});
	public static final BitSet FOLLOW_expression_a_in_synpred20_WhileGrammar1143 = new BitSet(new long[]{0x0000000000000002L});
}
