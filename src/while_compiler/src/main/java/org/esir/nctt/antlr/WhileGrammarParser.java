// $ANTLR 3.5.3 WhileGrammar.g 2024-12-10 16:55:21
 package org.esir.nctt.antlr; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class WhileGrammarParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DEC", "IDENT", "MAJ", 
		"MIN", "SYMBOL", "VARIABLE", "WS", "'%'", "'('", "')'", "','", "':'", 
		"':='", "';'", "'=?'", "'cons'", "'do'", "'else'", "'fi'", "'for'", "'foreach'", 
		"'function'", "'hd'", "'if'", "'in'", "'list'", "'nil'", "'nop'", "'od'", 
		"'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int COMMENT=4;
	public static final int DEC=5;
	public static final int IDENT=6;
	public static final int MAJ=7;
	public static final int MIN=8;
	public static final int SYMBOL=9;
	public static final int VARIABLE=10;
	public static final int WS=11;

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
	// WhileGrammar.g:28:1: program : function ( program )? ;
	public final WhileGrammarParser.program_return program() throws RecognitionException {
		WhileGrammarParser.program_return retval = new WhileGrammarParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function1 =null;
		ParserRuleReturnScope program2 =null;


		try {
			// WhileGrammar.g:28:8: ( function ( program )? )
			// WhileGrammar.g:28:10: function ( program )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_function_in_program257);
			function1=function();
			state._fsp--;

			adaptor.addChild(root_0, function1.getTree());

			// WhileGrammar.g:28:19: ( program )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==26) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// WhileGrammar.g:28:20: program
					{
					pushFollow(FOLLOW_program_in_program260);
					program2=program();
					state._fsp--;

					adaptor.addChild(root_0, program2.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:29:1: function : 'function' SYMBOL ':' definition ;
	public final WhileGrammarParser.function_return function() throws RecognitionException {
		WhileGrammarParser.function_return retval = new WhileGrammarParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal3=null;
		Token SYMBOL4=null;
		Token char_literal5=null;
		ParserRuleReturnScope definition6 =null;

		Object string_literal3_tree=null;
		Object SYMBOL4_tree=null;
		Object char_literal5_tree=null;

		try {
			// WhileGrammar.g:29:9: ( 'function' SYMBOL ':' definition )
			// WhileGrammar.g:29:11: 'function' SYMBOL ':' definition
			{
			root_0 = (Object)adaptor.nil();


			string_literal3=(Token)match(input,26,FOLLOW_26_in_function268); 
			string_literal3_tree = (Object)adaptor.create(string_literal3);
			adaptor.addChild(root_0, string_literal3_tree);

			SYMBOL4=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function270); 
			SYMBOL4_tree = (Object)adaptor.create(SYMBOL4);
			adaptor.addChild(root_0, SYMBOL4_tree);

			char_literal5=(Token)match(input,16,FOLLOW_16_in_function272); 
			char_literal5_tree = (Object)adaptor.create(char_literal5);
			adaptor.addChild(root_0, char_literal5_tree);

			pushFollow(FOLLOW_definition_in_function274);
			definition6=definition();
			state._fsp--;

			adaptor.addChild(root_0, definition6.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:30:1: definition : 'read' input '%' commands '%' 'write' output ;
	public final WhileGrammarParser.definition_return definition() throws RecognitionException {
		WhileGrammarParser.definition_return retval = new WhileGrammarParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal7=null;
		Token char_literal9=null;
		Token char_literal11=null;
		Token string_literal12=null;
		ParserRuleReturnScope input8 =null;
		ParserRuleReturnScope commands10 =null;
		ParserRuleReturnScope output13 =null;

		Object string_literal7_tree=null;
		Object char_literal9_tree=null;
		Object char_literal11_tree=null;
		Object string_literal12_tree=null;

		try {
			// WhileGrammar.g:30:11: ( 'read' input '%' commands '%' 'write' output )
			// WhileGrammar.g:30:13: 'read' input '%' commands '%' 'write' output
			{
			root_0 = (Object)adaptor.nil();


			string_literal7=(Token)match(input,34,FOLLOW_34_in_definition280); 
			string_literal7_tree = (Object)adaptor.create(string_literal7);
			adaptor.addChild(root_0, string_literal7_tree);

			pushFollow(FOLLOW_input_in_definition282);
			input8=input();
			state._fsp--;

			adaptor.addChild(root_0, input8.getTree());

			char_literal9=(Token)match(input,12,FOLLOW_12_in_definition284); 
			char_literal9_tree = (Object)adaptor.create(char_literal9);
			adaptor.addChild(root_0, char_literal9_tree);

			pushFollow(FOLLOW_commands_in_definition286);
			commands10=commands();
			state._fsp--;

			adaptor.addChild(root_0, commands10.getTree());

			char_literal11=(Token)match(input,12,FOLLOW_12_in_definition288); 
			char_literal11_tree = (Object)adaptor.create(char_literal11);
			adaptor.addChild(root_0, char_literal11_tree);

			string_literal12=(Token)match(input,38,FOLLOW_38_in_definition290); 
			string_literal12_tree = (Object)adaptor.create(string_literal12);
			adaptor.addChild(root_0, string_literal12_tree);

			pushFollow(FOLLOW_output_in_definition292);
			output13=output();
			state._fsp--;

			adaptor.addChild(root_0, output13.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:31:1: input : ( input_stub )? ;
	public final WhileGrammarParser.input_return input() throws RecognitionException {
		WhileGrammarParser.input_return retval = new WhileGrammarParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope input_stub14 =null;


		try {
			// WhileGrammar.g:31:6: ( ( input_stub )? )
			// WhileGrammar.g:31:8: ( input_stub )?
			{
			root_0 = (Object)adaptor.nil();


			// WhileGrammar.g:31:8: ( input_stub )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==VARIABLE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// WhileGrammar.g:31:8: input_stub
					{
					pushFollow(FOLLOW_input_stub_in_input298);
					input_stub14=input_stub();
					state._fsp--;

					adaptor.addChild(root_0, input_stub14.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:32:1: input_stub : VARIABLE ( ',' input_stub )? ;
	public final WhileGrammarParser.input_stub_return input_stub() throws RecognitionException {
		WhileGrammarParser.input_stub_return retval = new WhileGrammarParser.input_stub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE15=null;
		Token char_literal16=null;
		ParserRuleReturnScope input_stub17 =null;

		Object VARIABLE15_tree=null;
		Object char_literal16_tree=null;

		try {
			// WhileGrammar.g:32:11: ( VARIABLE ( ',' input_stub )? )
			// WhileGrammar.g:32:13: VARIABLE ( ',' input_stub )?
			{
			root_0 = (Object)adaptor.nil();


			VARIABLE15=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_input_stub305); 
			VARIABLE15_tree = (Object)adaptor.create(VARIABLE15);
			adaptor.addChild(root_0, VARIABLE15_tree);

			// WhileGrammar.g:32:22: ( ',' input_stub )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==15) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// WhileGrammar.g:32:23: ',' input_stub
					{
					char_literal16=(Token)match(input,15,FOLLOW_15_in_input_stub308); 
					char_literal16_tree = (Object)adaptor.create(char_literal16);
					adaptor.addChild(root_0, char_literal16_tree);

					pushFollow(FOLLOW_input_stub_in_input_stub310);
					input_stub17=input_stub();
					state._fsp--;

					adaptor.addChild(root_0, input_stub17.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:33:1: output : VARIABLE ( ',' output )? ;
	public final WhileGrammarParser.output_return output() throws RecognitionException {
		WhileGrammarParser.output_return retval = new WhileGrammarParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE18=null;
		Token char_literal19=null;
		ParserRuleReturnScope output20 =null;

		Object VARIABLE18_tree=null;
		Object char_literal19_tree=null;

		try {
			// WhileGrammar.g:33:7: ( VARIABLE ( ',' output )? )
			// WhileGrammar.g:33:9: VARIABLE ( ',' output )?
			{
			root_0 = (Object)adaptor.nil();


			VARIABLE18=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output318); 
			VARIABLE18_tree = (Object)adaptor.create(VARIABLE18);
			adaptor.addChild(root_0, VARIABLE18_tree);

			// WhileGrammar.g:33:18: ( ',' output )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==15) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// WhileGrammar.g:33:19: ',' output
					{
					char_literal19=(Token)match(input,15,FOLLOW_15_in_output321); 
					char_literal19_tree = (Object)adaptor.create(char_literal19);
					adaptor.addChild(root_0, char_literal19_tree);

					pushFollow(FOLLOW_output_in_output323);
					output20=output();
					state._fsp--;

					adaptor.addChild(root_0, output20.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:35:1: vars : VARIABLE ( ',' vars )? ;
	public final WhileGrammarParser.vars_return vars() throws RecognitionException {
		WhileGrammarParser.vars_return retval = new WhileGrammarParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE21=null;
		Token char_literal22=null;
		ParserRuleReturnScope vars23 =null;

		Object VARIABLE21_tree=null;
		Object char_literal22_tree=null;

		try {
			// WhileGrammar.g:35:5: ( VARIABLE ( ',' vars )? )
			// WhileGrammar.g:35:7: VARIABLE ( ',' vars )?
			{
			root_0 = (Object)adaptor.nil();


			VARIABLE21=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars332); 
			VARIABLE21_tree = (Object)adaptor.create(VARIABLE21);
			adaptor.addChild(root_0, VARIABLE21_tree);

			// WhileGrammar.g:35:16: ( ',' vars )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==15) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// WhileGrammar.g:35:17: ',' vars
					{
					char_literal22=(Token)match(input,15,FOLLOW_15_in_vars335); 
					char_literal22_tree = (Object)adaptor.create(char_literal22);
					adaptor.addChild(root_0, char_literal22_tree);

					pushFollow(FOLLOW_vars_in_vars337);
					vars23=vars();
					state._fsp--;

					adaptor.addChild(root_0, vars23.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:37:1: commands : command ( ';' commands )? ;
	public final WhileGrammarParser.commands_return commands() throws RecognitionException {
		WhileGrammarParser.commands_return retval = new WhileGrammarParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal25=null;
		ParserRuleReturnScope command24 =null;
		ParserRuleReturnScope commands26 =null;

		Object char_literal25_tree=null;

		try {
			// WhileGrammar.g:37:9: ( command ( ';' commands )? )
			// WhileGrammar.g:37:11: command ( ';' commands )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_command_in_commands346);
			command24=command();
			state._fsp--;

			adaptor.addChild(root_0, command24.getTree());

			// WhileGrammar.g:37:19: ( ';' commands )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==18) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// WhileGrammar.g:37:20: ';' commands
					{
					char_literal25=(Token)match(input,18,FOLLOW_18_in_commands349); 
					char_literal25_tree = (Object)adaptor.create(char_literal25);
					adaptor.addChild(root_0, char_literal25_tree);

					pushFollow(FOLLOW_commands_in_commands351);
					commands26=commands();
					state._fsp--;

					adaptor.addChild(root_0, commands26.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:39:1: exprs : expression ( ',' exprs )? ;
	public final WhileGrammarParser.exprs_return exprs() throws RecognitionException {
		WhileGrammarParser.exprs_return retval = new WhileGrammarParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal28=null;
		ParserRuleReturnScope expression27 =null;
		ParserRuleReturnScope exprs29 =null;

		Object char_literal28_tree=null;

		try {
			// WhileGrammar.g:39:6: ( expression ( ',' exprs )? )
			// WhileGrammar.g:39:8: expression ( ',' exprs )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_exprs360);
			expression27=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression27.getTree());

			// WhileGrammar.g:39:19: ( ',' exprs )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==15) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// WhileGrammar.g:39:20: ',' exprs
					{
					char_literal28=(Token)match(input,15,FOLLOW_15_in_exprs363); 
					char_literal28_tree = (Object)adaptor.create(char_literal28);
					adaptor.addChild(root_0, char_literal28_tree);

					pushFollow(FOLLOW_exprs_in_exprs365);
					exprs29=exprs();
					state._fsp--;

					adaptor.addChild(root_0, exprs29.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:41:1: command_vars : vars ':=' exprs ;
	public final WhileGrammarParser.command_vars_return command_vars() throws RecognitionException {
		WhileGrammarParser.command_vars_return retval = new WhileGrammarParser.command_vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal31=null;
		ParserRuleReturnScope vars30 =null;
		ParserRuleReturnScope exprs32 =null;

		Object string_literal31_tree=null;

		try {
			// WhileGrammar.g:41:13: ( vars ':=' exprs )
			// WhileGrammar.g:41:15: vars ':=' exprs
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_vars_in_command_vars374);
			vars30=vars();
			state._fsp--;

			adaptor.addChild(root_0, vars30.getTree());

			string_literal31=(Token)match(input,17,FOLLOW_17_in_command_vars376); 
			string_literal31_tree = (Object)adaptor.create(string_literal31);
			adaptor.addChild(root_0, string_literal31_tree);

			pushFollow(FOLLOW_exprs_in_command_vars378);
			exprs32=exprs();
			state._fsp--;

			adaptor.addChild(root_0, exprs32.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:42:1: command_if : 'if' expression 'then' commands ( 'else' commands )? 'fi' ;
	public final WhileGrammarParser.command_if_return command_if() throws RecognitionException {
		WhileGrammarParser.command_if_return retval = new WhileGrammarParser.command_if_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal33=null;
		Token string_literal35=null;
		Token string_literal37=null;
		Token string_literal39=null;
		ParserRuleReturnScope expression34 =null;
		ParserRuleReturnScope commands36 =null;
		ParserRuleReturnScope commands38 =null;

		Object string_literal33_tree=null;
		Object string_literal35_tree=null;
		Object string_literal37_tree=null;
		Object string_literal39_tree=null;

		try {
			// WhileGrammar.g:42:11: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
			// WhileGrammar.g:42:13: 'if' expression 'then' commands ( 'else' commands )? 'fi'
			{
			root_0 = (Object)adaptor.nil();


			string_literal33=(Token)match(input,28,FOLLOW_28_in_command_if384); 
			string_literal33_tree = (Object)adaptor.create(string_literal33);
			adaptor.addChild(root_0, string_literal33_tree);

			pushFollow(FOLLOW_expression_in_command_if386);
			expression34=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression34.getTree());

			string_literal35=(Token)match(input,35,FOLLOW_35_in_command_if388); 
			string_literal35_tree = (Object)adaptor.create(string_literal35);
			adaptor.addChild(root_0, string_literal35_tree);

			pushFollow(FOLLOW_commands_in_command_if390);
			commands36=commands();
			state._fsp--;

			adaptor.addChild(root_0, commands36.getTree());

			// WhileGrammar.g:42:45: ( 'else' commands )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==22) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// WhileGrammar.g:42:46: 'else' commands
					{
					string_literal37=(Token)match(input,22,FOLLOW_22_in_command_if393); 
					string_literal37_tree = (Object)adaptor.create(string_literal37);
					adaptor.addChild(root_0, string_literal37_tree);

					pushFollow(FOLLOW_commands_in_command_if395);
					commands38=commands();
					state._fsp--;

					adaptor.addChild(root_0, commands38.getTree());

					}
					break;

			}

			string_literal39=(Token)match(input,23,FOLLOW_23_in_command_if399); 
			string_literal39_tree = (Object)adaptor.create(string_literal39);
			adaptor.addChild(root_0, string_literal39_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:43:1: command_while : 'while' expression 'do' commands 'od' ;
	public final WhileGrammarParser.command_while_return command_while() throws RecognitionException {
		WhileGrammarParser.command_while_return retval = new WhileGrammarParser.command_while_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal40=null;
		Token string_literal42=null;
		Token string_literal44=null;
		ParserRuleReturnScope expression41 =null;
		ParserRuleReturnScope commands43 =null;

		Object string_literal40_tree=null;
		Object string_literal42_tree=null;
		Object string_literal44_tree=null;

		try {
			// WhileGrammar.g:43:14: ( 'while' expression 'do' commands 'od' )
			// WhileGrammar.g:43:16: 'while' expression 'do' commands 'od'
			{
			root_0 = (Object)adaptor.nil();


			string_literal40=(Token)match(input,37,FOLLOW_37_in_command_while405); 
			string_literal40_tree = (Object)adaptor.create(string_literal40);
			adaptor.addChild(root_0, string_literal40_tree);

			pushFollow(FOLLOW_expression_in_command_while407);
			expression41=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression41.getTree());

			string_literal42=(Token)match(input,21,FOLLOW_21_in_command_while409); 
			string_literal42_tree = (Object)adaptor.create(string_literal42);
			adaptor.addChild(root_0, string_literal42_tree);

			pushFollow(FOLLOW_commands_in_command_while411);
			commands43=commands();
			state._fsp--;

			adaptor.addChild(root_0, commands43.getTree());

			string_literal44=(Token)match(input,33,FOLLOW_33_in_command_while413); 
			string_literal44_tree = (Object)adaptor.create(string_literal44);
			adaptor.addChild(root_0, string_literal44_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:44:1: command_for : 'for' expression 'do' commands 'od' ;
	public final WhileGrammarParser.command_for_return command_for() throws RecognitionException {
		WhileGrammarParser.command_for_return retval = new WhileGrammarParser.command_for_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal45=null;
		Token string_literal47=null;
		Token string_literal49=null;
		ParserRuleReturnScope expression46 =null;
		ParserRuleReturnScope commands48 =null;

		Object string_literal45_tree=null;
		Object string_literal47_tree=null;
		Object string_literal49_tree=null;

		try {
			// WhileGrammar.g:44:12: ( 'for' expression 'do' commands 'od' )
			// WhileGrammar.g:44:14: 'for' expression 'do' commands 'od'
			{
			root_0 = (Object)adaptor.nil();


			string_literal45=(Token)match(input,24,FOLLOW_24_in_command_for419); 
			string_literal45_tree = (Object)adaptor.create(string_literal45);
			adaptor.addChild(root_0, string_literal45_tree);

			pushFollow(FOLLOW_expression_in_command_for421);
			expression46=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression46.getTree());

			string_literal47=(Token)match(input,21,FOLLOW_21_in_command_for423); 
			string_literal47_tree = (Object)adaptor.create(string_literal47);
			adaptor.addChild(root_0, string_literal47_tree);

			pushFollow(FOLLOW_commands_in_command_for425);
			commands48=commands();
			state._fsp--;

			adaptor.addChild(root_0, commands48.getTree());

			string_literal49=(Token)match(input,33,FOLLOW_33_in_command_for427); 
			string_literal49_tree = (Object)adaptor.create(string_literal49);
			adaptor.addChild(root_0, string_literal49_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:45:1: command_foreach : 'foreach' VARIABLE 'in' expression 'do' commands 'od' ;
	public final WhileGrammarParser.command_foreach_return command_foreach() throws RecognitionException {
		WhileGrammarParser.command_foreach_return retval = new WhileGrammarParser.command_foreach_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal50=null;
		Token VARIABLE51=null;
		Token string_literal52=null;
		Token string_literal54=null;
		Token string_literal56=null;
		ParserRuleReturnScope expression53 =null;
		ParserRuleReturnScope commands55 =null;

		Object string_literal50_tree=null;
		Object VARIABLE51_tree=null;
		Object string_literal52_tree=null;
		Object string_literal54_tree=null;
		Object string_literal56_tree=null;

		try {
			// WhileGrammar.g:45:16: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
			// WhileGrammar.g:45:18: 'foreach' VARIABLE 'in' expression 'do' commands 'od'
			{
			root_0 = (Object)adaptor.nil();


			string_literal50=(Token)match(input,25,FOLLOW_25_in_command_foreach433); 
			string_literal50_tree = (Object)adaptor.create(string_literal50);
			adaptor.addChild(root_0, string_literal50_tree);

			VARIABLE51=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command_foreach435); 
			VARIABLE51_tree = (Object)adaptor.create(VARIABLE51);
			adaptor.addChild(root_0, VARIABLE51_tree);

			string_literal52=(Token)match(input,29,FOLLOW_29_in_command_foreach437); 
			string_literal52_tree = (Object)adaptor.create(string_literal52);
			adaptor.addChild(root_0, string_literal52_tree);

			pushFollow(FOLLOW_expression_in_command_foreach439);
			expression53=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression53.getTree());

			string_literal54=(Token)match(input,21,FOLLOW_21_in_command_foreach441); 
			string_literal54_tree = (Object)adaptor.create(string_literal54);
			adaptor.addChild(root_0, string_literal54_tree);

			pushFollow(FOLLOW_commands_in_command_foreach443);
			commands55=commands();
			state._fsp--;

			adaptor.addChild(root_0, commands55.getTree());

			string_literal56=(Token)match(input,33,FOLLOW_33_in_command_foreach445); 
			string_literal56_tree = (Object)adaptor.create(string_literal56);
			adaptor.addChild(root_0, string_literal56_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:46:1: command_nop : 'nop' ;
	public final WhileGrammarParser.command_nop_return command_nop() throws RecognitionException {
		WhileGrammarParser.command_nop_return retval = new WhileGrammarParser.command_nop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal57=null;

		Object string_literal57_tree=null;

		try {
			// WhileGrammar.g:46:12: ( 'nop' )
			// WhileGrammar.g:46:14: 'nop'
			{
			root_0 = (Object)adaptor.nil();


			string_literal57=(Token)match(input,32,FOLLOW_32_in_command_nop451); 
			string_literal57_tree = (Object)adaptor.create(string_literal57);
			adaptor.addChild(root_0, string_literal57_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:48:1: command : ( command_if | command_while | command_for | command_foreach | command_vars | command_nop );
	public final WhileGrammarParser.command_return command() throws RecognitionException {
		WhileGrammarParser.command_return retval = new WhileGrammarParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope command_if58 =null;
		ParserRuleReturnScope command_while59 =null;
		ParserRuleReturnScope command_for60 =null;
		ParserRuleReturnScope command_foreach61 =null;
		ParserRuleReturnScope command_vars62 =null;
		ParserRuleReturnScope command_nop63 =null;


		try {
			// WhileGrammar.g:48:8: ( command_if | command_while | command_for | command_foreach | command_vars | command_nop )
			int alt9=6;
			switch ( input.LA(1) ) {
			case 28:
				{
				alt9=1;
				}
				break;
			case 37:
				{
				alt9=2;
				}
				break;
			case 24:
				{
				alt9=3;
				}
				break;
			case 25:
				{
				alt9=4;
				}
				break;
			case VARIABLE:
				{
				alt9=5;
				}
				break;
			case 32:
				{
				alt9=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// WhileGrammar.g:48:10: command_if
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_if_in_command458);
					command_if58=command_if();
					state._fsp--;

					adaptor.addChild(root_0, command_if58.getTree());

					}
					break;
				case 2 :
					// WhileGrammar.g:49:11: command_while
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_while_in_command471);
					command_while59=command_while();
					state._fsp--;

					adaptor.addChild(root_0, command_while59.getTree());

					}
					break;
				case 3 :
					// WhileGrammar.g:50:11: command_for
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_for_in_command484);
					command_for60=command_for();
					state._fsp--;

					adaptor.addChild(root_0, command_for60.getTree());

					}
					break;
				case 4 :
					// WhileGrammar.g:51:11: command_foreach
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_foreach_in_command497);
					command_foreach61=command_foreach();
					state._fsp--;

					adaptor.addChild(root_0, command_foreach61.getTree());

					}
					break;
				case 5 :
					// WhileGrammar.g:52:11: command_vars
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_vars_in_command509);
					command_vars62=command_vars();
					state._fsp--;

					adaptor.addChild(root_0, command_vars62.getTree());

					}
					break;
				case 6 :
					// WhileGrammar.g:53:11: command_nop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_command_nop_in_command521);
					command_nop63=command_nop();
					state._fsp--;

					adaptor.addChild(root_0, command_nop63.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:56:1: exprbase1 : ( 'nil' | VARIABLE | SYMBOL );
	public final WhileGrammarParser.exprbase1_return exprbase1() throws RecognitionException {
		WhileGrammarParser.exprbase1_return retval = new WhileGrammarParser.exprbase1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set64=null;

		Object set64_tree=null;

		try {
			// WhileGrammar.g:56:10: ( 'nil' | VARIABLE | SYMBOL )
			// WhileGrammar.g:
			{
			root_0 = (Object)adaptor.nil();


			set64=input.LT(1);
			if ( (input.LA(1) >= SYMBOL && input.LA(1) <= VARIABLE)||input.LA(1)==31 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set64));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:57:1: expr_constructor : ( 'cons' | 'list' ) lexpr ;
	public final WhileGrammarParser.expr_constructor_return expr_constructor() throws RecognitionException {
		WhileGrammarParser.expr_constructor_return retval = new WhileGrammarParser.expr_constructor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set65=null;
		ParserRuleReturnScope lexpr66 =null;

		Object set65_tree=null;

		try {
			// WhileGrammar.g:57:17: ( ( 'cons' | 'list' ) lexpr )
			// WhileGrammar.g:57:19: ( 'cons' | 'list' ) lexpr
			{
			root_0 = (Object)adaptor.nil();


			set65=input.LT(1);
			if ( input.LA(1)==20||input.LA(1)==30 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set65));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_lexpr_in_expr_constructor557);
			lexpr66=lexpr();
			state._fsp--;

			adaptor.addChild(root_0, lexpr66.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:58:1: exprbase3 : ( 'hd' | 'tl' ) exprbase ;
	public final WhileGrammarParser.exprbase3_return exprbase3() throws RecognitionException {
		WhileGrammarParser.exprbase3_return retval = new WhileGrammarParser.exprbase3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set67=null;
		ParserRuleReturnScope exprbase68 =null;

		Object set67_tree=null;

		try {
			// WhileGrammar.g:58:10: ( ( 'hd' | 'tl' ) exprbase )
			// WhileGrammar.g:58:12: ( 'hd' | 'tl' ) exprbase
			{
			root_0 = (Object)adaptor.nil();


			set67=input.LT(1);
			if ( input.LA(1)==27||input.LA(1)==36 ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set67));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_exprbase_in_exprbase3569);
			exprbase68=exprbase();
			state._fsp--;

			adaptor.addChild(root_0, exprbase68.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:59:1: expr_call : SYMBOL lexpr ;
	public final WhileGrammarParser.expr_call_return expr_call() throws RecognitionException {
		WhileGrammarParser.expr_call_return retval = new WhileGrammarParser.expr_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SYMBOL69=null;
		ParserRuleReturnScope lexpr70 =null;

		Object SYMBOL69_tree=null;

		try {
			// WhileGrammar.g:59:10: ( SYMBOL lexpr )
			// WhileGrammar.g:59:12: SYMBOL lexpr
			{
			root_0 = (Object)adaptor.nil();


			SYMBOL69=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_expr_call575); 
			SYMBOL69_tree = (Object)adaptor.create(SYMBOL69);
			adaptor.addChild(root_0, SYMBOL69_tree);

			pushFollow(FOLLOW_lexpr_in_expr_call577);
			lexpr70=lexpr();
			state._fsp--;

			adaptor.addChild(root_0, lexpr70.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:61:1: exprbase : ( exprbase1 | ( '(' ( expr_constructor | exprbase3 | expr_call ) ')' ) );
	public final WhileGrammarParser.exprbase_return exprbase() throws RecognitionException {
		WhileGrammarParser.exprbase_return retval = new WhileGrammarParser.exprbase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal72=null;
		Token char_literal76=null;
		ParserRuleReturnScope exprbase171 =null;
		ParserRuleReturnScope expr_constructor73 =null;
		ParserRuleReturnScope exprbase374 =null;
		ParserRuleReturnScope expr_call75 =null;

		Object char_literal72_tree=null;
		Object char_literal76_tree=null;

		try {
			// WhileGrammar.g:61:9: ( exprbase1 | ( '(' ( expr_constructor | exprbase3 | expr_call ) ')' ) )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( ((LA11_0 >= SYMBOL && LA11_0 <= VARIABLE)||LA11_0==31) ) {
				alt11=1;
			}
			else if ( (LA11_0==13) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// WhileGrammar.g:61:11: exprbase1
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exprbase1_in_exprbase584);
					exprbase171=exprbase1();
					state._fsp--;

					adaptor.addChild(root_0, exprbase171.getTree());

					}
					break;
				case 2 :
					// WhileGrammar.g:61:23: ( '(' ( expr_constructor | exprbase3 | expr_call ) ')' )
					{
					root_0 = (Object)adaptor.nil();


					// WhileGrammar.g:61:23: ( '(' ( expr_constructor | exprbase3 | expr_call ) ')' )
					// WhileGrammar.g:61:25: '(' ( expr_constructor | exprbase3 | expr_call ) ')'
					{
					char_literal72=(Token)match(input,13,FOLLOW_13_in_exprbase590); 
					char_literal72_tree = (Object)adaptor.create(char_literal72);
					adaptor.addChild(root_0, char_literal72_tree);

					// WhileGrammar.g:61:29: ( expr_constructor | exprbase3 | expr_call )
					int alt10=3;
					switch ( input.LA(1) ) {
					case 20:
					case 30:
						{
						alt10=1;
						}
						break;
					case 27:
					case 36:
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
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}
					switch (alt10) {
						case 1 :
							// WhileGrammar.g:61:30: expr_constructor
							{
							pushFollow(FOLLOW_expr_constructor_in_exprbase593);
							expr_constructor73=expr_constructor();
							state._fsp--;

							adaptor.addChild(root_0, expr_constructor73.getTree());

							}
							break;
						case 2 :
							// WhileGrammar.g:61:49: exprbase3
							{
							pushFollow(FOLLOW_exprbase3_in_exprbase597);
							exprbase374=exprbase3();
							state._fsp--;

							adaptor.addChild(root_0, exprbase374.getTree());

							}
							break;
						case 3 :
							// WhileGrammar.g:61:61: expr_call
							{
							pushFollow(FOLLOW_expr_call_in_exprbase601);
							expr_call75=expr_call();
							state._fsp--;

							adaptor.addChild(root_0, expr_call75.getTree());

							}
							break;

					}

					char_literal76=(Token)match(input,14,FOLLOW_14_in_exprbase604); 
					char_literal76_tree = (Object)adaptor.create(char_literal76);
					adaptor.addChild(root_0, char_literal76_tree);

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:63:1: expression : exprbase ( '=?' exprbase )? ;
	public final WhileGrammarParser.expression_return expression() throws RecognitionException {
		WhileGrammarParser.expression_return retval = new WhileGrammarParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal78=null;
		ParserRuleReturnScope exprbase77 =null;
		ParserRuleReturnScope exprbase79 =null;

		Object string_literal78_tree=null;

		try {
			// WhileGrammar.g:63:11: ( exprbase ( '=?' exprbase )? )
			// WhileGrammar.g:63:13: exprbase ( '=?' exprbase )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_exprbase_in_expression613);
			exprbase77=exprbase();
			state._fsp--;

			adaptor.addChild(root_0, exprbase77.getTree());

			// WhileGrammar.g:63:22: ( '=?' exprbase )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==19) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// WhileGrammar.g:63:23: '=?' exprbase
					{
					string_literal78=(Token)match(input,19,FOLLOW_19_in_expression616); 
					string_literal78_tree = (Object)adaptor.create(string_literal78);
					adaptor.addChild(root_0, string_literal78_tree);

					pushFollow(FOLLOW_exprbase_in_expression618);
					exprbase79=exprbase();
					state._fsp--;

					adaptor.addChild(root_0, exprbase79.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// WhileGrammar.g:65:1: lexpr : ( exprbase lexpr )? ;
	public final WhileGrammarParser.lexpr_return lexpr() throws RecognitionException {
		WhileGrammarParser.lexpr_return retval = new WhileGrammarParser.lexpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprbase80 =null;
		ParserRuleReturnScope lexpr81 =null;


		try {
			// WhileGrammar.g:65:6: ( ( exprbase lexpr )? )
			// WhileGrammar.g:65:8: ( exprbase lexpr )?
			{
			root_0 = (Object)adaptor.nil();


			// WhileGrammar.g:65:8: ( exprbase lexpr )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= SYMBOL && LA13_0 <= VARIABLE)||LA13_0==13||LA13_0==31) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// WhileGrammar.g:65:9: exprbase lexpr
					{
					pushFollow(FOLLOW_exprbase_in_lexpr628);
					exprbase80=exprbase();
					state._fsp--;

					adaptor.addChild(root_0, exprbase80.getTree());

					pushFollow(FOLLOW_lexpr_in_lexpr630);
					lexpr81=lexpr();
					state._fsp--;

					adaptor.addChild(root_0, lexpr81.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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



	public static final BitSet FOLLOW_function_in_program257 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_program_in_program260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_function268 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_SYMBOL_in_function270 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_function272 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_definition_in_function274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_definition280 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_input_in_definition282 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_definition284 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_definition286 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_definition288 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_definition290 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_output_in_definition292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_stub_in_input298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_input_stub305 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_input_stub308 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_input_stub_in_input_stub310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_output318 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_output321 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_output_in_output323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_vars332 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_vars335 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_vars_in_vars337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands346 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_commands349 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_commands351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs360 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_exprs363 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_exprs_in_exprs365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command_vars374 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_command_vars376 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_exprs_in_command_vars378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_command_if384 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_expression_in_command_if386 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_command_if388 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_if390 = new BitSet(new long[]{0x0000000000C00000L});
	public static final BitSet FOLLOW_22_in_command_if393 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_if395 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_command_if399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_command_while405 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_expression_in_command_while407 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_command_while409 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_while411 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command_while413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_command_for419 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_expression_in_command_for421 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_command_for423 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_for425 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command_for427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_command_foreach433 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_VARIABLE_in_command_foreach435 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_command_foreach437 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_expression_in_command_foreach439 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_command_foreach441 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_foreach443 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command_foreach445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_command_nop451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_if_in_command458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_while_in_command471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_for_in_command484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_foreach_in_command497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_vars_in_command509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_nop_in_command521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_expr_constructor551 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_lexpr_in_expr_constructor557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_exprbase3563 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_exprbase_in_exprbase3569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_expr_call575 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_lexpr_in_expr_call577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase1_in_exprbase584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_exprbase590 = new BitSet(new long[]{0x0000001048100200L});
	public static final BitSet FOLLOW_expr_constructor_in_exprbase593 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_exprbase3_in_exprbase597 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_expr_call_in_exprbase601 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_exprbase604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_expression613 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_expression616 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_exprbase_in_expression618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_lexpr628 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_lexpr_in_lexpr630 = new BitSet(new long[]{0x0000000000000002L});
}
