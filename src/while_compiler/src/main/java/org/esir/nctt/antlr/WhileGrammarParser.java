// $ANTLR 3.5.3 WhileGrammar.g 2024-12-12 08:28:18
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
		"COMMENT", "DEC", "DEFINITION", "EXPRESSION", "EXPRS", "EXPR_BASE", "EXPR_BASE1", 
		"EXPR_BASE3", "EXPR_CALL", "EXPR_CONSTRUCTOR", "FOR", "FOREACH", "FUNCTION", 
		"IDENT", "IF", "INPUT", "INPUT_STUB", "LEXPR", "MAJ", "MIN", "OUTPUT", 
		"PROGRAM", "SYMBOL", "VARIABLE", "VARS", "WHILE", "WS", "'%'", "'('", 
		"')'", "','", "':'", "':='", "';'", "'=?'", "'cons'", "'do'", "'else'", 
		"'fi'", "'for'", "'foreach'", "'function'", "'hd'", "'if'", "'in'", "'list'", 
		"'nil'", "'nop'", "'od'", "'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
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
	public static final int ASSIGMENT=4;
	public static final int COMMANDS=5;
	public static final int COMMAND_NOP=6;
	public static final int COMMENT=7;
	public static final int DEC=8;
	public static final int DEFINITION=9;
	public static final int EXPRESSION=10;
	public static final int EXPRS=11;
	public static final int EXPR_BASE=12;
	public static final int EXPR_BASE1=13;
	public static final int EXPR_BASE3=14;
	public static final int EXPR_CALL=15;
	public static final int EXPR_CONSTRUCTOR=16;
	public static final int FOR=17;
	public static final int FOREACH=18;
	public static final int FUNCTION=19;
	public static final int IDENT=20;
	public static final int IF=21;
	public static final int INPUT=22;
	public static final int INPUT_STUB=23;
	public static final int LEXPR=24;
	public static final int MAJ=25;
	public static final int MIN=26;
	public static final int OUTPUT=27;
	public static final int PROGRAM=28;
	public static final int SYMBOL=29;
	public static final int VARIABLE=30;
	public static final int VARS=31;
	public static final int WHILE=32;
	public static final int WS=33;

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
	// WhileGrammar.g:54:1: program : ( function )* -> ^( PROGRAM ( function )* ) ;
	public final WhileGrammarParser.program_return program() throws RecognitionException {
		WhileGrammarParser.program_return retval = new WhileGrammarParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function1 =null;

		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");

		try {
			// WhileGrammar.g:54:8: ( ( function )* -> ^( PROGRAM ( function )* ) )
			// WhileGrammar.g:54:10: ( function )*
			{
			// WhileGrammar.g:54:10: ( function )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==48) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// WhileGrammar.g:54:10: function
					{
					pushFollow(FOLLOW_function_in_program425);
					function1=function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_function.add(function1.getTree());
					}
					break;

				default :
					break loop1;
				}
			}


			// AST REWRITE
			// elements: function
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 54:20: -> ^( PROGRAM ( function )* )
			{
				// WhileGrammar.g:54:23: ^( PROGRAM ( function )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				// WhileGrammar.g:54:33: ( function )*
				while ( stream_function.hasNext() ) {
					adaptor.addChild(root_1, stream_function.nextTree());
				}
				stream_function.reset();

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
	// $ANTLR end "program"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// WhileGrammar.g:56:1: function : 'function' SYMBOL ':' definition -> ^( FUNCTION SYMBOL definition ) ;
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
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// WhileGrammar.g:56:9: ( 'function' SYMBOL ':' definition -> ^( FUNCTION SYMBOL definition ) )
			// WhileGrammar.g:56:11: 'function' SYMBOL ':' definition
			{
			string_literal2=(Token)match(input,48,FOLLOW_48_in_function442); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_48.add(string_literal2);

			SYMBOL3=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function444); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SYMBOL.add(SYMBOL3);

			char_literal4=(Token)match(input,38,FOLLOW_38_in_function446); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_38.add(char_literal4);

			pushFollow(FOLLOW_definition_in_function448);
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
			// 56:44: -> ^( FUNCTION SYMBOL definition )
			{
				// WhileGrammar.g:56:47: ^( FUNCTION SYMBOL definition )
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
	// WhileGrammar.g:57:1: definition : 'read' input '%' commands '%' 'write' output -> ^( DEFINITION input commands output ) ;
	public final WhileGrammarParser.definition_return definition() throws RecognitionException {
		WhileGrammarParser.definition_return retval = new WhileGrammarParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal6=null;
		Token char_literal8=null;
		Token char_literal10=null;
		Token string_literal11=null;
		ParserRuleReturnScope input7 =null;
		ParserRuleReturnScope commands9 =null;
		ParserRuleReturnScope output12 =null;

		Object string_literal6_tree=null;
		Object char_literal8_tree=null;
		Object char_literal10_tree=null;
		Object string_literal11_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// WhileGrammar.g:57:11: ( 'read' input '%' commands '%' 'write' output -> ^( DEFINITION input commands output ) )
			// WhileGrammar.g:57:13: 'read' input '%' commands '%' 'write' output
			{
			string_literal6=(Token)match(input,56,FOLLOW_56_in_definition464); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_56.add(string_literal6);

			pushFollow(FOLLOW_input_in_definition466);
			input7=input();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_input.add(input7.getTree());
			char_literal8=(Token)match(input,34,FOLLOW_34_in_definition468); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_34.add(char_literal8);

			pushFollow(FOLLOW_commands_in_definition470);
			commands9=commands();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commands.add(commands9.getTree());
			char_literal10=(Token)match(input,34,FOLLOW_34_in_definition472); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_34.add(char_literal10);

			string_literal11=(Token)match(input,60,FOLLOW_60_in_definition474); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_60.add(string_literal11);

			pushFollow(FOLLOW_output_in_definition476);
			output12=output();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_output.add(output12.getTree());

			// AST REWRITE
			// elements: input, commands, output
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 57:58: -> ^( DEFINITION input commands output )
			{
				// WhileGrammar.g:57:61: ^( DEFINITION input commands output )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_1);
				adaptor.addChild(root_1, stream_input.nextTree());
				adaptor.addChild(root_1, stream_commands.nextTree());
				adaptor.addChild(root_1, stream_output.nextTree());
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
	// $ANTLR end "definition"


	public static class input_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input"
	// WhileGrammar.g:58:1: input : (i= input_stub )? -> ^( INPUT ( $i)? ) ;
	public final WhileGrammarParser.input_return input() throws RecognitionException {
		WhileGrammarParser.input_return retval = new WhileGrammarParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope i =null;

		RewriteRuleSubtreeStream stream_input_stub=new RewriteRuleSubtreeStream(adaptor,"rule input_stub");

		try {
			// WhileGrammar.g:58:6: ( (i= input_stub )? -> ^( INPUT ( $i)? ) )
			// WhileGrammar.g:58:8: (i= input_stub )?
			{
			// WhileGrammar.g:58:9: (i= input_stub )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==VARIABLE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// WhileGrammar.g:58:9: i= input_stub
					{
					pushFollow(FOLLOW_input_stub_in_input496);
					i=input_stub();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_input_stub.add(i.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: i
			// token labels: 
			// rule labels: i, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i",i!=null?i.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 58:22: -> ^( INPUT ( $i)? )
			{
				// WhileGrammar.g:58:25: ^( INPUT ( $i)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);
				// WhileGrammar.g:58:34: ( $i)?
				if ( stream_i.hasNext() ) {
					adaptor.addChild(root_1, stream_i.nextTree());
				}
				stream_i.reset();

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
	// $ANTLR end "input"


	public static class input_stub_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input_stub"
	// WhileGrammar.g:59:1: input_stub : v= VARIABLE ( ',' tail= input_stub )? -> ^( INPUT_STUB $v ( $tail)? ) ;
	public final WhileGrammarParser.input_stub_return input_stub() throws RecognitionException {
		WhileGrammarParser.input_stub_return retval = new WhileGrammarParser.input_stub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token char_literal13=null;
		ParserRuleReturnScope tail =null;

		Object v_tree=null;
		Object char_literal13_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleSubtreeStream stream_input_stub=new RewriteRuleSubtreeStream(adaptor,"rule input_stub");

		try {
			// WhileGrammar.g:59:11: (v= VARIABLE ( ',' tail= input_stub )? -> ^( INPUT_STUB $v ( $tail)? ) )
			// WhileGrammar.g:59:13: v= VARIABLE ( ',' tail= input_stub )?
			{
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_input_stub515); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VARIABLE.add(v);

			// WhileGrammar.g:59:24: ( ',' tail= input_stub )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==37) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// WhileGrammar.g:59:25: ',' tail= input_stub
					{
					char_literal13=(Token)match(input,37,FOLLOW_37_in_input_stub518); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_37.add(char_literal13);

					pushFollow(FOLLOW_input_stub_in_input_stub522);
					tail=input_stub();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_input_stub.add(tail.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: v, tail
			// token labels: v
			// rule labels: tail, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_tail=new RewriteRuleSubtreeStream(adaptor,"rule tail",tail!=null?tail.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 59:47: -> ^( INPUT_STUB $v ( $tail)? )
			{
				// WhileGrammar.g:59:50: ^( INPUT_STUB $v ( $tail)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT_STUB, "INPUT_STUB"), root_1);
				adaptor.addChild(root_1, stream_v.nextNode());
				// WhileGrammar.g:59:67: ( $tail)?
				if ( stream_tail.hasNext() ) {
					adaptor.addChild(root_1, stream_tail.nextTree());
				}
				stream_tail.reset();

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
	// $ANTLR end "input_stub"


	public static class output_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "output"
	// WhileGrammar.g:60:1: output : v= VARIABLE ( ',' tail= output )? -> ^( OUTPUT $v ( $tail)? ) ;
	public final WhileGrammarParser.output_return output() throws RecognitionException {
		WhileGrammarParser.output_return retval = new WhileGrammarParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token char_literal14=null;
		ParserRuleReturnScope tail =null;

		Object v_tree=null;
		Object char_literal14_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");

		try {
			// WhileGrammar.g:60:7: (v= VARIABLE ( ',' tail= output )? -> ^( OUTPUT $v ( $tail)? ) )
			// WhileGrammar.g:60:9: v= VARIABLE ( ',' tail= output )?
			{
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output545); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VARIABLE.add(v);

			// WhileGrammar.g:60:20: ( ',' tail= output )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==37) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// WhileGrammar.g:60:21: ',' tail= output
					{
					char_literal14=(Token)match(input,37,FOLLOW_37_in_output548); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_37.add(char_literal14);

					pushFollow(FOLLOW_output_in_output552);
					tail=output();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_output.add(tail.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: v, tail
			// token labels: v
			// rule labels: tail, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_tail=new RewriteRuleSubtreeStream(adaptor,"rule tail",tail!=null?tail.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 60:39: -> ^( OUTPUT $v ( $tail)? )
			{
				// WhileGrammar.g:60:42: ^( OUTPUT $v ( $tail)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);
				adaptor.addChild(root_1, stream_v.nextNode());
				// WhileGrammar.g:60:55: ( $tail)?
				if ( stream_tail.hasNext() ) {
					adaptor.addChild(root_1, stream_tail.nextTree());
				}
				stream_tail.reset();

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
	// $ANTLR end "output"


	public static class vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// WhileGrammar.g:62:1: vars : v= VARIABLE ( ',' var= vars )? -> ^( VARS $v ( $var)? ) ;
	public final WhileGrammarParser.vars_return vars() throws RecognitionException {
		WhileGrammarParser.vars_return retval = new WhileGrammarParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token char_literal15=null;
		ParserRuleReturnScope var =null;

		Object v_tree=null;
		Object char_literal15_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// WhileGrammar.g:62:5: (v= VARIABLE ( ',' var= vars )? -> ^( VARS $v ( $var)? ) )
			// WhileGrammar.g:62:7: v= VARIABLE ( ',' var= vars )?
			{
			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars576); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VARIABLE.add(v);

			// WhileGrammar.g:62:18: ( ',' var= vars )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==37) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// WhileGrammar.g:62:19: ',' var= vars
					{
					char_literal15=(Token)match(input,37,FOLLOW_37_in_vars579); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_37.add(char_literal15);

					pushFollow(FOLLOW_vars_in_vars583);
					var=vars();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_vars.add(var.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: var, v
			// token labels: v
			// rule labels: var, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_v=new RewriteRuleTokenStream(adaptor,"token v",v);
			RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var",var!=null?var.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 62:34: -> ^( VARS $v ( $var)? )
			{
				// WhileGrammar.g:62:37: ^( VARS $v ( $var)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARS, "VARS"), root_1);
				adaptor.addChild(root_1, stream_v.nextNode());
				// WhileGrammar.g:62:48: ( $var)?
				if ( stream_var.hasNext() ) {
					adaptor.addChild(root_1, stream_var.nextTree());
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
	// WhileGrammar.g:64:1: commands : c= command ( ';' cs= commands )? -> ^( COMMANDS $c ( $cs)? ) ;
	public final WhileGrammarParser.commands_return commands() throws RecognitionException {
		WhileGrammarParser.commands_return retval = new WhileGrammarParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal16=null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope cs =null;

		Object char_literal16_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// WhileGrammar.g:64:9: (c= command ( ';' cs= commands )? -> ^( COMMANDS $c ( $cs)? ) )
			// WhileGrammar.g:64:11: c= command ( ';' cs= commands )?
			{
			pushFollow(FOLLOW_command_in_commands607);
			c=command();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_command.add(c.getTree());
			// WhileGrammar.g:64:21: ( ';' cs= commands )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==40) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// WhileGrammar.g:64:22: ';' cs= commands
					{
					char_literal16=(Token)match(input,40,FOLLOW_40_in_commands610); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_40.add(char_literal16);

					pushFollow(FOLLOW_commands_in_commands614);
					cs=commands();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_commands.add(cs.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: cs, c
			// token labels: 
			// rule labels: cs, c, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_cs=new RewriteRuleSubtreeStream(adaptor,"rule cs",cs!=null?cs.getTree():null);
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 65:5: -> ^( COMMANDS $c ( $cs)? )
			{
				// WhileGrammar.g:65:8: ^( COMMANDS $c ( $cs)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_1);
				adaptor.addChild(root_1, stream_c.nextTree());
				// WhileGrammar.g:65:23: ( $cs)?
				if ( stream_cs.hasNext() ) {
					adaptor.addChild(root_1, stream_cs.nextTree());
				}
				stream_cs.reset();

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
	// WhileGrammar.g:68:1: exprs : expression ( ',' exprs )? -> ^( EXPRS expression ( exprs )? ) ;
	public final WhileGrammarParser.exprs_return exprs() throws RecognitionException {
		WhileGrammarParser.exprs_return retval = new WhileGrammarParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal18=null;
		ParserRuleReturnScope expression17 =null;
		ParserRuleReturnScope exprs19 =null;

		Object char_literal18_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try {
			// WhileGrammar.g:68:6: ( expression ( ',' exprs )? -> ^( EXPRS expression ( exprs )? ) )
			// WhileGrammar.g:68:8: expression ( ',' exprs )?
			{
			pushFollow(FOLLOW_expression_in_exprs642);
			expression17=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression17.getTree());
			// WhileGrammar.g:68:19: ( ',' exprs )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==37) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// WhileGrammar.g:68:20: ',' exprs
					{
					char_literal18=(Token)match(input,37,FOLLOW_37_in_exprs645); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_37.add(char_literal18);

					pushFollow(FOLLOW_exprs_in_exprs647);
					exprs19=exprs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_exprs.add(exprs19.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: expression, exprs
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 69:5: -> ^( EXPRS expression ( exprs )? )
			{
				// WhileGrammar.g:69:8: ^( EXPRS expression ( exprs )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRS, "EXPRS"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				// WhileGrammar.g:69:27: ( exprs )?
				if ( stream_exprs.hasNext() ) {
					adaptor.addChild(root_1, stream_exprs.nextTree());
				}
				stream_exprs.reset();

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
	// WhileGrammar.g:72:1: command_vars : vars ':=' exprs -> ^( ASSIGMENT vars exprs ) ;
	public final WhileGrammarParser.command_vars_return command_vars() throws RecognitionException {
		WhileGrammarParser.command_vars_return retval = new WhileGrammarParser.command_vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal21=null;
		ParserRuleReturnScope vars20 =null;
		ParserRuleReturnScope exprs22 =null;

		Object string_literal21_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// WhileGrammar.g:72:13: ( vars ':=' exprs -> ^( ASSIGMENT vars exprs ) )
			// WhileGrammar.g:72:15: vars ':=' exprs
			{
			pushFollow(FOLLOW_vars_in_command_vars672);
			vars20=vars();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_vars.add(vars20.getTree());
			string_literal21=(Token)match(input,39,FOLLOW_39_in_command_vars674); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_39.add(string_literal21);

			pushFollow(FOLLOW_exprs_in_command_vars676);
			exprs22=exprs();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_exprs.add(exprs22.getTree());

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
			// 72:31: -> ^( ASSIGMENT vars exprs )
			{
				// WhileGrammar.g:72:34: ^( ASSIGMENT vars exprs )
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
	// WhileGrammar.g:73:1: command_if : 'if' expression 'then' b1= commands ( 'else' b2= commands )? 'fi' -> ^( IF expression $b1 ( $b2)? ) ;
	public final WhileGrammarParser.command_if_return command_if() throws RecognitionException {
		WhileGrammarParser.command_if_return retval = new WhileGrammarParser.command_if_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal23=null;
		Token string_literal25=null;
		Token string_literal26=null;
		Token string_literal27=null;
		ParserRuleReturnScope b1 =null;
		ParserRuleReturnScope b2 =null;
		ParserRuleReturnScope expression24 =null;

		Object string_literal23_tree=null;
		Object string_literal25_tree=null;
		Object string_literal26_tree=null;
		Object string_literal27_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// WhileGrammar.g:73:11: ( 'if' expression 'then' b1= commands ( 'else' b2= commands )? 'fi' -> ^( IF expression $b1 ( $b2)? ) )
			// WhileGrammar.g:73:13: 'if' expression 'then' b1= commands ( 'else' b2= commands )? 'fi'
			{
			string_literal23=(Token)match(input,50,FOLLOW_50_in_command_if692); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_50.add(string_literal23);

			pushFollow(FOLLOW_expression_in_command_if694);
			expression24=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression24.getTree());
			string_literal25=(Token)match(input,57,FOLLOW_57_in_command_if696); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_57.add(string_literal25);

			pushFollow(FOLLOW_commands_in_command_if700);
			b1=commands();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commands.add(b1.getTree());
			// WhileGrammar.g:73:48: ( 'else' b2= commands )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==44) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// WhileGrammar.g:73:49: 'else' b2= commands
					{
					string_literal26=(Token)match(input,44,FOLLOW_44_in_command_if703); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_44.add(string_literal26);

					pushFollow(FOLLOW_commands_in_command_if707);
					b2=commands();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_commands.add(b2.getTree());
					}
					break;

			}

			string_literal27=(Token)match(input,45,FOLLOW_45_in_command_if711); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_45.add(string_literal27);


			// AST REWRITE
			// elements: b1, b2, expression
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
			// 73:75: -> ^( IF expression $b1 ( $b2)? )
			{
				// WhileGrammar.g:73:78: ^( IF expression $b1 ( $b2)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_b1.nextTree());
				// WhileGrammar.g:73:99: ( $b2)?
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
	// WhileGrammar.g:74:1: command_while : 'while' expression 'do' commands 'od' -> ^( WHILE expression commands ) ;
	public final WhileGrammarParser.command_while_return command_while() throws RecognitionException {
		WhileGrammarParser.command_while_return retval = new WhileGrammarParser.command_while_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal28=null;
		Token string_literal30=null;
		Token string_literal32=null;
		ParserRuleReturnScope expression29 =null;
		ParserRuleReturnScope commands31 =null;

		Object string_literal28_tree=null;
		Object string_literal30_tree=null;
		Object string_literal32_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// WhileGrammar.g:74:14: ( 'while' expression 'do' commands 'od' -> ^( WHILE expression commands ) )
			// WhileGrammar.g:74:16: 'while' expression 'do' commands 'od'
			{
			string_literal28=(Token)match(input,59,FOLLOW_59_in_command_while732); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_59.add(string_literal28);

			pushFollow(FOLLOW_expression_in_command_while734);
			expression29=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression29.getTree());
			string_literal30=(Token)match(input,43,FOLLOW_43_in_command_while736); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_43.add(string_literal30);

			pushFollow(FOLLOW_commands_in_command_while738);
			commands31=commands();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commands.add(commands31.getTree());
			string_literal32=(Token)match(input,55,FOLLOW_55_in_command_while740); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_55.add(string_literal32);


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
			// 74:54: -> ^( WHILE expression commands )
			{
				// WhileGrammar.g:74:57: ^( WHILE expression commands )
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
	// WhileGrammar.g:75:1: command_for : 'for' expression 'do' commands 'od' -> ^( FOR expression commands ) ;
	public final WhileGrammarParser.command_for_return command_for() throws RecognitionException {
		WhileGrammarParser.command_for_return retval = new WhileGrammarParser.command_for_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal33=null;
		Token string_literal35=null;
		Token string_literal37=null;
		ParserRuleReturnScope expression34 =null;
		ParserRuleReturnScope commands36 =null;

		Object string_literal33_tree=null;
		Object string_literal35_tree=null;
		Object string_literal37_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// WhileGrammar.g:75:12: ( 'for' expression 'do' commands 'od' -> ^( FOR expression commands ) )
			// WhileGrammar.g:75:14: 'for' expression 'do' commands 'od'
			{
			string_literal33=(Token)match(input,46,FOLLOW_46_in_command_for756); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_46.add(string_literal33);

			pushFollow(FOLLOW_expression_in_command_for758);
			expression34=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression34.getTree());
			string_literal35=(Token)match(input,43,FOLLOW_43_in_command_for760); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_43.add(string_literal35);

			pushFollow(FOLLOW_commands_in_command_for762);
			commands36=commands();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commands.add(commands36.getTree());
			string_literal37=(Token)match(input,55,FOLLOW_55_in_command_for764); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_55.add(string_literal37);


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
			// 75:50: -> ^( FOR expression commands )
			{
				// WhileGrammar.g:75:53: ^( FOR expression commands )
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
	// WhileGrammar.g:76:1: command_foreach : 'foreach' v= VARIABLE 'in' expression 'do' commands 'od' -> ^( FOREACH $v expression commands ) ;
	public final WhileGrammarParser.command_foreach_return command_foreach() throws RecognitionException {
		WhileGrammarParser.command_foreach_return retval = new WhileGrammarParser.command_foreach_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token v=null;
		Token string_literal38=null;
		Token string_literal39=null;
		Token string_literal41=null;
		Token string_literal43=null;
		ParserRuleReturnScope expression40 =null;
		ParserRuleReturnScope commands42 =null;

		Object v_tree=null;
		Object string_literal38_tree=null;
		Object string_literal39_tree=null;
		Object string_literal41_tree=null;
		Object string_literal43_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// WhileGrammar.g:76:16: ( 'foreach' v= VARIABLE 'in' expression 'do' commands 'od' -> ^( FOREACH $v expression commands ) )
			// WhileGrammar.g:76:18: 'foreach' v= VARIABLE 'in' expression 'do' commands 'od'
			{
			string_literal38=(Token)match(input,47,FOLLOW_47_in_command_foreach780); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_47.add(string_literal38);

			v=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command_foreach784); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VARIABLE.add(v);

			string_literal39=(Token)match(input,51,FOLLOW_51_in_command_foreach786); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_51.add(string_literal39);

			pushFollow(FOLLOW_expression_in_command_foreach788);
			expression40=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression40.getTree());
			string_literal41=(Token)match(input,43,FOLLOW_43_in_command_foreach790); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_43.add(string_literal41);

			pushFollow(FOLLOW_commands_in_command_foreach792);
			commands42=commands();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commands.add(commands42.getTree());
			string_literal43=(Token)match(input,55,FOLLOW_55_in_command_foreach794); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_55.add(string_literal43);


			// AST REWRITE
			// elements: expression, v, commands
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
			// 76:74: -> ^( FOREACH $v expression commands )
			{
				// WhileGrammar.g:76:77: ^( FOREACH $v expression commands )
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
	// WhileGrammar.g:77:1: command_nop : 'nop' -> ^( COMMAND_NOP ) ;
	public final WhileGrammarParser.command_nop_return command_nop() throws RecognitionException {
		WhileGrammarParser.command_nop_return retval = new WhileGrammarParser.command_nop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal44=null;

		Object string_literal44_tree=null;
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");

		try {
			// WhileGrammar.g:77:12: ( 'nop' -> ^( COMMAND_NOP ) )
			// WhileGrammar.g:77:14: 'nop'
			{
			string_literal44=(Token)match(input,54,FOLLOW_54_in_command_nop813); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_54.add(string_literal44);


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
			// 77:20: -> ^( COMMAND_NOP )
			{
				// WhileGrammar.g:77:23: ^( COMMAND_NOP )
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
	// WhileGrammar.g:80:1: command : ( command_if | command_while | command_for | command_foreach | command_vars | command_nop );
	public final WhileGrammarParser.command_return command() throws RecognitionException {
		WhileGrammarParser.command_return retval = new WhileGrammarParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope command_if45 =null;
		ParserRuleReturnScope command_while46 =null;
		ParserRuleReturnScope command_for47 =null;
		ParserRuleReturnScope command_foreach48 =null;
		ParserRuleReturnScope command_vars49 =null;
		ParserRuleReturnScope command_nop50 =null;


		try {
			// WhileGrammar.g:80:8: ( command_if | command_while | command_for | command_foreach | command_vars | command_nop )
			int alt9=6;
			switch ( input.LA(1) ) {
			case 50:
				{
				alt9=1;
				}
				break;
			case 59:
				{
				alt9=2;
				}
				break;
			case 46:
				{
				alt9=3;
				}
				break;
			case 47:
				{
				alt9=4;
				}
				break;
			case VARIABLE:
				{
				alt9=5;
				}
				break;
			case 54:
				{
				alt9=6;
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
					// WhileGrammar.g:80:10: command_if
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_if_in_command827);
					command_if45=command_if();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_if45.getTree());

					}
					break;
				case 2 :
					// WhileGrammar.g:81:11: command_while
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_while_in_command840);
					command_while46=command_while();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_while46.getTree());

					}
					break;
				case 3 :
					// WhileGrammar.g:82:11: command_for
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_for_in_command853);
					command_for47=command_for();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_for47.getTree());

					}
					break;
				case 4 :
					// WhileGrammar.g:83:11: command_foreach
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_foreach_in_command866);
					command_foreach48=command_foreach();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_foreach48.getTree());

					}
					break;
				case 5 :
					// WhileGrammar.g:84:11: command_vars
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_vars_in_command878);
					command_vars49=command_vars();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_vars49.getTree());

					}
					break;
				case 6 :
					// WhileGrammar.g:85:11: command_nop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_nop_in_command890);
					command_nop50=command_nop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, command_nop50.getTree());

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


	public static class exprbase1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase1"
	// WhileGrammar.g:88:1: exprbase1 : a= ( 'nil' | VARIABLE | SYMBOL ) -> ^( EXPR_BASE1 $a) ;
	public final WhileGrammarParser.exprbase1_return exprbase1() throws RecognitionException {
		WhileGrammarParser.exprbase1_return retval = new WhileGrammarParser.exprbase1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token a=null;

		Object a_tree=null;
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");

		try {
			// WhileGrammar.g:88:10: (a= ( 'nil' | VARIABLE | SYMBOL ) -> ^( EXPR_BASE1 $a) )
			// WhileGrammar.g:88:12: a= ( 'nil' | VARIABLE | SYMBOL )
			{
			// WhileGrammar.g:88:14: ( 'nil' | VARIABLE | SYMBOL )
			int alt10=3;
			switch ( input.LA(1) ) {
			case 53:
				{
				alt10=1;
				}
				break;
			case VARIABLE:
				{
				alt10=2;
				}
				break;
			case SYMBOL:
				{
				alt10=3;
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
					// WhileGrammar.g:88:15: 'nil'
					{
					a=(Token)match(input,53,FOLLOW_53_in_exprbase1909); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_53.add(a);

					}
					break;
				case 2 :
					// WhileGrammar.g:88:23: VARIABLE
					{
					a=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_exprbase1913); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_VARIABLE.add(a);

					}
					break;
				case 3 :
					// WhileGrammar.g:88:34: SYMBOL
					{
					a=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase1917); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SYMBOL.add(a);

					}
					break;

			}


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
			// 89:2: -> ^( EXPR_BASE1 $a)
			{
				// WhileGrammar.g:89:5: ^( EXPR_BASE1 $a)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_BASE1, "EXPR_BASE1"), root_1);
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
	// $ANTLR end "exprbase1"


	public static class expr_constructor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_constructor"
	// WhileGrammar.g:91:1: expr_constructor : (a= 'cons' |a= 'list' ) lexpr -> ^( EXPR_CONSTRUCTOR $a lexpr ) ;
	public final WhileGrammarParser.expr_constructor_return expr_constructor() throws RecognitionException {
		WhileGrammarParser.expr_constructor_return retval = new WhileGrammarParser.expr_constructor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token a=null;
		ParserRuleReturnScope lexpr51 =null;

		Object a_tree=null;
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");

		try {
			// WhileGrammar.g:91:17: ( (a= 'cons' |a= 'list' ) lexpr -> ^( EXPR_CONSTRUCTOR $a lexpr ) )
			// WhileGrammar.g:91:19: (a= 'cons' |a= 'list' ) lexpr
			{
			// WhileGrammar.g:91:19: (a= 'cons' |a= 'list' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==42) ) {
				alt11=1;
			}
			else if ( (LA11_0==52) ) {
				alt11=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// WhileGrammar.g:91:20: a= 'cons'
					{
					a=(Token)match(input,42,FOLLOW_42_in_expr_constructor938); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_42.add(a);

					}
					break;
				case 2 :
					// WhileGrammar.g:91:29: a= 'list'
					{
					a=(Token)match(input,52,FOLLOW_52_in_expr_constructor942); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_52.add(a);

					}
					break;

			}

			pushFollow(FOLLOW_lexpr_in_expr_constructor945);
			lexpr51=lexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_lexpr.add(lexpr51.getTree());

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
			// 92:2: -> ^( EXPR_CONSTRUCTOR $a lexpr )
			{
				// WhileGrammar.g:92:5: ^( EXPR_CONSTRUCTOR $a lexpr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_CONSTRUCTOR, "EXPR_CONSTRUCTOR"), root_1);
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
	// $ANTLR end "expr_constructor"


	public static class exprbase3_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprbase3"
	// WhileGrammar.g:94:1: exprbase3 : a= ( 'hd' | 'tl' ) exprbase -> ^( EXPR_BASE3 $a exprbase ) ;
	public final WhileGrammarParser.exprbase3_return exprbase3() throws RecognitionException {
		WhileGrammarParser.exprbase3_return retval = new WhileGrammarParser.exprbase3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token a=null;
		ParserRuleReturnScope exprbase52 =null;

		Object a_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// WhileGrammar.g:94:10: (a= ( 'hd' | 'tl' ) exprbase -> ^( EXPR_BASE3 $a exprbase ) )
			// WhileGrammar.g:94:12: a= ( 'hd' | 'tl' ) exprbase
			{
			// WhileGrammar.g:94:14: ( 'hd' | 'tl' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==49) ) {
				alt12=1;
			}
			else if ( (LA12_0==58) ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// WhileGrammar.g:94:15: 'hd'
					{
					a=(Token)match(input,49,FOLLOW_49_in_exprbase3967); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_49.add(a);

					}
					break;
				case 2 :
					// WhileGrammar.g:94:20: 'tl'
					{
					a=(Token)match(input,58,FOLLOW_58_in_exprbase3969); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_58.add(a);

					}
					break;

			}

			pushFollow(FOLLOW_exprbase_in_exprbase3972);
			exprbase52=exprbase();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_exprbase.add(exprbase52.getTree());

			// AST REWRITE
			// elements: a, exprbase
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
			// 95:2: -> ^( EXPR_BASE3 $a exprbase )
			{
				// WhileGrammar.g:95:5: ^( EXPR_BASE3 $a exprbase )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_BASE3, "EXPR_BASE3"), root_1);
				adaptor.addChild(root_1, stream_a.nextNode());
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
	// $ANTLR end "exprbase3"


	public static class expr_call_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_call"
	// WhileGrammar.g:98:1: expr_call : SYMBOL lexpr -> ^( EXPR_CALL SYMBOL lexpr ) ;
	public final WhileGrammarParser.expr_call_return expr_call() throws RecognitionException {
		WhileGrammarParser.expr_call_return retval = new WhileGrammarParser.expr_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SYMBOL53=null;
		ParserRuleReturnScope lexpr54 =null;

		Object SYMBOL53_tree=null;
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");

		try {
			// WhileGrammar.g:98:10: ( SYMBOL lexpr -> ^( EXPR_CALL SYMBOL lexpr ) )
			// WhileGrammar.g:98:12: SYMBOL lexpr
			{
			SYMBOL53=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_expr_call992); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SYMBOL.add(SYMBOL53);

			pushFollow(FOLLOW_lexpr_in_expr_call994);
			lexpr54=lexpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_lexpr.add(lexpr54.getTree());

			// AST REWRITE
			// elements: SYMBOL, lexpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 99:2: -> ^( EXPR_CALL SYMBOL lexpr )
			{
				// WhileGrammar.g:99:5: ^( EXPR_CALL SYMBOL lexpr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR_CALL, "EXPR_CALL"), root_1);
				adaptor.addChild(root_1, stream_SYMBOL.nextNode());
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
	// WhileGrammar.g:102:1: exprbase : ( exprbase1 | ( '(' ( expr_constructor | exprbase3 | expr_call ) ')' ) );
	public final WhileGrammarParser.exprbase_return exprbase() throws RecognitionException {
		WhileGrammarParser.exprbase_return retval = new WhileGrammarParser.exprbase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal56=null;
		Token char_literal60=null;
		ParserRuleReturnScope exprbase155 =null;
		ParserRuleReturnScope expr_constructor57 =null;
		ParserRuleReturnScope exprbase358 =null;
		ParserRuleReturnScope expr_call59 =null;

		Object char_literal56_tree=null;
		Object char_literal60_tree=null;

		try {
			// WhileGrammar.g:102:9: ( exprbase1 | ( '(' ( expr_constructor | exprbase3 | expr_call ) ')' ) )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= SYMBOL && LA14_0 <= VARIABLE)||LA14_0==53) ) {
				alt14=1;
			}
			else if ( (LA14_0==35) ) {
				alt14=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// WhileGrammar.g:102:11: exprbase1
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exprbase1_in_exprbase1013);
					exprbase155=exprbase1();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbase155.getTree());

					}
					break;
				case 2 :
					// WhileGrammar.g:102:23: ( '(' ( expr_constructor | exprbase3 | expr_call ) ')' )
					{
					root_0 = (Object)adaptor.nil();


					// WhileGrammar.g:102:23: ( '(' ( expr_constructor | exprbase3 | expr_call ) ')' )
					// WhileGrammar.g:102:25: '(' ( expr_constructor | exprbase3 | expr_call ) ')'
					{
					char_literal56=(Token)match(input,35,FOLLOW_35_in_exprbase1019); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal56_tree = (Object)adaptor.create(char_literal56);
					adaptor.addChild(root_0, char_literal56_tree);
					}

					// WhileGrammar.g:102:29: ( expr_constructor | exprbase3 | expr_call )
					int alt13=3;
					switch ( input.LA(1) ) {
					case 42:
					case 52:
						{
						alt13=1;
						}
						break;
					case 49:
					case 58:
						{
						alt13=2;
						}
						break;
					case SYMBOL:
						{
						alt13=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}
					switch (alt13) {
						case 1 :
							// WhileGrammar.g:102:30: expr_constructor
							{
							pushFollow(FOLLOW_expr_constructor_in_exprbase1022);
							expr_constructor57=expr_constructor();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_constructor57.getTree());

							}
							break;
						case 2 :
							// WhileGrammar.g:102:49: exprbase3
							{
							pushFollow(FOLLOW_exprbase3_in_exprbase1026);
							exprbase358=exprbase3();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, exprbase358.getTree());

							}
							break;
						case 3 :
							// WhileGrammar.g:102:61: expr_call
							{
							pushFollow(FOLLOW_expr_call_in_exprbase1030);
							expr_call59=expr_call();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_call59.getTree());

							}
							break;

					}

					char_literal60=(Token)match(input,36,FOLLOW_36_in_exprbase1033); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal60_tree = (Object)adaptor.create(char_literal60);
					adaptor.addChild(root_0, char_literal60_tree);
					}

					}

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


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// WhileGrammar.g:104:1: expression : c= exprbase ( '=?' d= exprbase )? -> ^( EXPRESSION $c ( $d)? ) ;
	public final WhileGrammarParser.expression_return expression() throws RecognitionException {
		WhileGrammarParser.expression_return retval = new WhileGrammarParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal61=null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope d =null;

		Object string_literal61_tree=null;
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// WhileGrammar.g:104:11: (c= exprbase ( '=?' d= exprbase )? -> ^( EXPRESSION $c ( $d)? ) )
			// WhileGrammar.g:104:13: c= exprbase ( '=?' d= exprbase )?
			{
			pushFollow(FOLLOW_exprbase_in_expression1044);
			c=exprbase();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_exprbase.add(c.getTree());
			// WhileGrammar.g:104:24: ( '=?' d= exprbase )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==41) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// WhileGrammar.g:104:25: '=?' d= exprbase
					{
					string_literal61=(Token)match(input,41,FOLLOW_41_in_expression1047); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_41.add(string_literal61);

					pushFollow(FOLLOW_exprbase_in_expression1051);
					d=exprbase();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_exprbase.add(d.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: d, c
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
			// 105:5: -> ^( EXPRESSION $c ( $d)? )
			{
				// WhileGrammar.g:105:8: ^( EXPRESSION $c ( $d)? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);
				adaptor.addChild(root_1, stream_c.nextTree());
				// WhileGrammar.g:105:25: ( $d)?
				if ( stream_d.hasNext() ) {
					adaptor.addChild(root_1, stream_d.nextTree());
				}
				stream_d.reset();

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
	// $ANTLR end "expression"


	public static class lexpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lexpr"
	// WhileGrammar.g:108:1: lexpr : ( exprbase lexpr )? -> ^( LEXPR ( exprbase )? ( lexpr )? ) ;
	public final WhileGrammarParser.lexpr_return lexpr() throws RecognitionException {
		WhileGrammarParser.lexpr_return retval = new WhileGrammarParser.lexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprbase62 =null;
		ParserRuleReturnScope lexpr63 =null;

		RewriteRuleSubtreeStream stream_lexpr=new RewriteRuleSubtreeStream(adaptor,"rule lexpr");
		RewriteRuleSubtreeStream stream_exprbase=new RewriteRuleSubtreeStream(adaptor,"rule exprbase");

		try {
			// WhileGrammar.g:108:6: ( ( exprbase lexpr )? -> ^( LEXPR ( exprbase )? ( lexpr )? ) )
			// WhileGrammar.g:108:8: ( exprbase lexpr )?
			{
			// WhileGrammar.g:108:8: ( exprbase lexpr )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( ((LA16_0 >= SYMBOL && LA16_0 <= VARIABLE)||LA16_0==35||LA16_0==53) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// WhileGrammar.g:108:9: exprbase lexpr
					{
					pushFollow(FOLLOW_exprbase_in_lexpr1079);
					exprbase62=exprbase();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_exprbase.add(exprbase62.getTree());
					pushFollow(FOLLOW_lexpr_in_lexpr1081);
					lexpr63=lexpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_lexpr.add(lexpr63.getTree());
					}
					break;

			}


			// AST REWRITE
			// elements: exprbase, lexpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 108:26: -> ^( LEXPR ( exprbase )? ( lexpr )? )
			{
				// WhileGrammar.g:108:29: ^( LEXPR ( exprbase )? ( lexpr )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LEXPR, "LEXPR"), root_1);
				// WhileGrammar.g:108:37: ( exprbase )?
				if ( stream_exprbase.hasNext() ) {
					adaptor.addChild(root_1, stream_exprbase.nextTree());
				}
				stream_exprbase.reset();

				// WhileGrammar.g:108:47: ( lexpr )?
				if ( stream_lexpr.hasNext() ) {
					adaptor.addChild(root_1, stream_lexpr.nextTree());
				}
				stream_lexpr.reset();

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

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program425 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_function442 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SYMBOL_in_function444 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_function446 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_definition_in_function448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_definition464 = new BitSet(new long[]{0x0000000440000000L});
	public static final BitSet FOLLOW_input_in_definition466 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_definition468 = new BitSet(new long[]{0x0844C00040000000L});
	public static final BitSet FOLLOW_commands_in_definition470 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_definition472 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_definition474 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_output_in_definition476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_stub_in_input496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_input_stub515 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_input_stub518 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_input_stub_in_input_stub522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_output545 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_output548 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_output_in_output552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_vars576 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_vars579 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_vars_in_vars583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands607 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_commands610 = new BitSet(new long[]{0x0844C00040000000L});
	public static final BitSet FOLLOW_commands_in_commands614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs642 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_exprs645 = new BitSet(new long[]{0x0020000860000000L});
	public static final BitSet FOLLOW_exprs_in_exprs647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command_vars672 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_command_vars674 = new BitSet(new long[]{0x0020000860000000L});
	public static final BitSet FOLLOW_exprs_in_command_vars676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_command_if692 = new BitSet(new long[]{0x0020000860000000L});
	public static final BitSet FOLLOW_expression_in_command_if694 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_57_in_command_if696 = new BitSet(new long[]{0x0844C00040000000L});
	public static final BitSet FOLLOW_commands_in_command_if700 = new BitSet(new long[]{0x0000300000000000L});
	public static final BitSet FOLLOW_44_in_command_if703 = new BitSet(new long[]{0x0844C00040000000L});
	public static final BitSet FOLLOW_commands_in_command_if707 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_command_if711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_command_while732 = new BitSet(new long[]{0x0020000860000000L});
	public static final BitSet FOLLOW_expression_in_command_while734 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_command_while736 = new BitSet(new long[]{0x0844C00040000000L});
	public static final BitSet FOLLOW_commands_in_command_while738 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_command_while740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_command_for756 = new BitSet(new long[]{0x0020000860000000L});
	public static final BitSet FOLLOW_expression_in_command_for758 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_command_for760 = new BitSet(new long[]{0x0844C00040000000L});
	public static final BitSet FOLLOW_commands_in_command_for762 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_command_for764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_command_foreach780 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_VARIABLE_in_command_foreach784 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_command_foreach786 = new BitSet(new long[]{0x0020000860000000L});
	public static final BitSet FOLLOW_expression_in_command_foreach788 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_command_foreach790 = new BitSet(new long[]{0x0844C00040000000L});
	public static final BitSet FOLLOW_commands_in_command_foreach792 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_command_foreach794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_command_nop813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_if_in_command827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_while_in_command840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_for_in_command853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_foreach_in_command866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_vars_in_command878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_nop_in_command890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_exprbase1909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_exprbase1913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase1917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_expr_constructor938 = new BitSet(new long[]{0x0020000860000000L});
	public static final BitSet FOLLOW_52_in_expr_constructor942 = new BitSet(new long[]{0x0020000860000000L});
	public static final BitSet FOLLOW_lexpr_in_expr_constructor945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_exprbase3967 = new BitSet(new long[]{0x0020000860000000L});
	public static final BitSet FOLLOW_58_in_exprbase3969 = new BitSet(new long[]{0x0020000860000000L});
	public static final BitSet FOLLOW_exprbase_in_exprbase3972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_expr_call992 = new BitSet(new long[]{0x0020000860000000L});
	public static final BitSet FOLLOW_lexpr_in_expr_call994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase1_in_exprbase1013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_exprbase1019 = new BitSet(new long[]{0x0412040020000000L});
	public static final BitSet FOLLOW_expr_constructor_in_exprbase1022 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_exprbase3_in_exprbase1026 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_expr_call_in_exprbase1030 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_exprbase1033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_expression1044 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_41_in_expression1047 = new BitSet(new long[]{0x0020000860000000L});
	public static final BitSet FOLLOW_exprbase_in_expression1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_lexpr1079 = new BitSet(new long[]{0x0020000860000000L});
	public static final BitSet FOLLOW_lexpr_in_lexpr1081 = new BitSet(new long[]{0x0000000000000002L});
}
