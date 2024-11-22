// $ANTLR 3.5.3 WhileGrammar.g 2024-11-22 17:54:33
 package org.esir.nctt.antlr; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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

	@Override public String[] getTokenNames() { return WhileGrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "WhileGrammar.g"; }



	// $ANTLR start "program"
	// WhileGrammar.g:24:1: program : function ( program )? ;
	public final void program() throws RecognitionException {
		try {
			// WhileGrammar.g:24:8: ( function ( program )? )
			// WhileGrammar.g:24:10: function ( program )?
			{
			pushFollow(FOLLOW_function_in_program242);
			function();
			state._fsp--;

			// WhileGrammar.g:24:19: ( program )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==26) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// WhileGrammar.g:24:20: program
					{
					pushFollow(FOLLOW_program_in_program245);
					program();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "function"
	// WhileGrammar.g:25:1: function : 'function' SYMBOL ':' definition ;
	public final void function() throws RecognitionException {
		try {
			// WhileGrammar.g:25:9: ( 'function' SYMBOL ':' definition )
			// WhileGrammar.g:25:11: 'function' SYMBOL ':' definition
			{
			match(input,26,FOLLOW_26_in_function253); 
			match(input,SYMBOL,FOLLOW_SYMBOL_in_function255); 
			match(input,16,FOLLOW_16_in_function257); 
			pushFollow(FOLLOW_definition_in_function259);
			definition();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "function"



	// $ANTLR start "definition"
	// WhileGrammar.g:26:1: definition : 'read' input '%' commands '%' 'write' output ;
	public final void definition() throws RecognitionException {
		try {
			// WhileGrammar.g:26:11: ( 'read' input '%' commands '%' 'write' output )
			// WhileGrammar.g:26:13: 'read' input '%' commands '%' 'write' output
			{
			match(input,34,FOLLOW_34_in_definition265); 
			pushFollow(FOLLOW_input_in_definition267);
			input();
			state._fsp--;

			match(input,12,FOLLOW_12_in_definition269); 
			pushFollow(FOLLOW_commands_in_definition271);
			commands();
			state._fsp--;

			match(input,12,FOLLOW_12_in_definition273); 
			match(input,38,FOLLOW_38_in_definition275); 
			pushFollow(FOLLOW_output_in_definition277);
			output();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "definition"



	// $ANTLR start "input"
	// WhileGrammar.g:27:1: input : ( input_stub )? ;
	public final void input() throws RecognitionException {
		try {
			// WhileGrammar.g:27:6: ( ( input_stub )? )
			// WhileGrammar.g:27:8: ( input_stub )?
			{
			// WhileGrammar.g:27:8: ( input_stub )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==VARIABLE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// WhileGrammar.g:27:8: input_stub
					{
					pushFollow(FOLLOW_input_stub_in_input283);
					input_stub();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "input"



	// $ANTLR start "input_stub"
	// WhileGrammar.g:28:1: input_stub : VARIABLE ( ',' input_stub )? ;
	public final void input_stub() throws RecognitionException {
		try {
			// WhileGrammar.g:28:11: ( VARIABLE ( ',' input_stub )? )
			// WhileGrammar.g:28:13: VARIABLE ( ',' input_stub )?
			{
			match(input,VARIABLE,FOLLOW_VARIABLE_in_input_stub290); 
			// WhileGrammar.g:28:22: ( ',' input_stub )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==15) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// WhileGrammar.g:28:23: ',' input_stub
					{
					match(input,15,FOLLOW_15_in_input_stub293); 
					pushFollow(FOLLOW_input_stub_in_input_stub295);
					input_stub();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "input_stub"



	// $ANTLR start "output"
	// WhileGrammar.g:29:1: output : VARIABLE ( ',' output )? ;
	public final void output() throws RecognitionException {
		try {
			// WhileGrammar.g:29:7: ( VARIABLE ( ',' output )? )
			// WhileGrammar.g:29:9: VARIABLE ( ',' output )?
			{
			match(input,VARIABLE,FOLLOW_VARIABLE_in_output303); 
			// WhileGrammar.g:29:18: ( ',' output )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==15) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// WhileGrammar.g:29:19: ',' output
					{
					match(input,15,FOLLOW_15_in_output306); 
					pushFollow(FOLLOW_output_in_output308);
					output();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "output"



	// $ANTLR start "vars"
	// WhileGrammar.g:31:1: vars : VARIABLE ( ',' vars )? ;
	public final void vars() throws RecognitionException {
		try {
			// WhileGrammar.g:31:5: ( VARIABLE ( ',' vars )? )
			// WhileGrammar.g:31:7: VARIABLE ( ',' vars )?
			{
			match(input,VARIABLE,FOLLOW_VARIABLE_in_vars317); 
			// WhileGrammar.g:31:16: ( ',' vars )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==15) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// WhileGrammar.g:31:17: ',' vars
					{
					match(input,15,FOLLOW_15_in_vars320); 
					pushFollow(FOLLOW_vars_in_vars322);
					vars();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "vars"



	// $ANTLR start "commands"
	// WhileGrammar.g:33:1: commands : command ( ';' commands )? ;
	public final void commands() throws RecognitionException {
		try {
			// WhileGrammar.g:33:9: ( command ( ';' commands )? )
			// WhileGrammar.g:33:11: command ( ';' commands )?
			{
			pushFollow(FOLLOW_command_in_commands331);
			command();
			state._fsp--;

			// WhileGrammar.g:33:19: ( ';' commands )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==18) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// WhileGrammar.g:33:20: ';' commands
					{
					match(input,18,FOLLOW_18_in_commands334); 
					pushFollow(FOLLOW_commands_in_commands336);
					commands();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "commands"



	// $ANTLR start "exprs"
	// WhileGrammar.g:35:1: exprs : expression ( ',' exprs )? ;
	public final void exprs() throws RecognitionException {
		try {
			// WhileGrammar.g:35:6: ( expression ( ',' exprs )? )
			// WhileGrammar.g:35:8: expression ( ',' exprs )?
			{
			pushFollow(FOLLOW_expression_in_exprs345);
			expression();
			state._fsp--;

			// WhileGrammar.g:35:19: ( ',' exprs )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==15) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// WhileGrammar.g:35:20: ',' exprs
					{
					match(input,15,FOLLOW_15_in_exprs348); 
					pushFollow(FOLLOW_exprs_in_exprs350);
					exprs();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exprs"



	// $ANTLR start "command_vars"
	// WhileGrammar.g:37:1: command_vars : vars ':=' exprs ;
	public final void command_vars() throws RecognitionException {
		try {
			// WhileGrammar.g:37:13: ( vars ':=' exprs )
			// WhileGrammar.g:37:15: vars ':=' exprs
			{
			pushFollow(FOLLOW_vars_in_command_vars359);
			vars();
			state._fsp--;

			match(input,17,FOLLOW_17_in_command_vars361); 
			pushFollow(FOLLOW_exprs_in_command_vars363);
			exprs();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "command_vars"



	// $ANTLR start "command_if"
	// WhileGrammar.g:38:1: command_if : 'if' expression 'then' commands ( 'else' commands )? 'fi' ;
	public final void command_if() throws RecognitionException {
		try {
			// WhileGrammar.g:38:11: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
			// WhileGrammar.g:38:13: 'if' expression 'then' commands ( 'else' commands )? 'fi'
			{
			match(input,28,FOLLOW_28_in_command_if369); 
			pushFollow(FOLLOW_expression_in_command_if371);
			expression();
			state._fsp--;

			match(input,35,FOLLOW_35_in_command_if373); 
			pushFollow(FOLLOW_commands_in_command_if375);
			commands();
			state._fsp--;

			// WhileGrammar.g:38:45: ( 'else' commands )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==22) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// WhileGrammar.g:38:46: 'else' commands
					{
					match(input,22,FOLLOW_22_in_command_if378); 
					pushFollow(FOLLOW_commands_in_command_if380);
					commands();
					state._fsp--;

					}
					break;

			}

			match(input,23,FOLLOW_23_in_command_if384); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "command_if"



	// $ANTLR start "command_while"
	// WhileGrammar.g:39:1: command_while : 'while' expression 'do' commands 'od' ;
	public final void command_while() throws RecognitionException {
		try {
			// WhileGrammar.g:39:14: ( 'while' expression 'do' commands 'od' )
			// WhileGrammar.g:39:16: 'while' expression 'do' commands 'od'
			{
			match(input,37,FOLLOW_37_in_command_while390); 
			pushFollow(FOLLOW_expression_in_command_while392);
			expression();
			state._fsp--;

			match(input,21,FOLLOW_21_in_command_while394); 
			pushFollow(FOLLOW_commands_in_command_while396);
			commands();
			state._fsp--;

			match(input,33,FOLLOW_33_in_command_while398); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "command_while"



	// $ANTLR start "command_for"
	// WhileGrammar.g:40:1: command_for : 'for' expression 'do' commands 'od' ;
	public final void command_for() throws RecognitionException {
		try {
			// WhileGrammar.g:40:12: ( 'for' expression 'do' commands 'od' )
			// WhileGrammar.g:40:14: 'for' expression 'do' commands 'od'
			{
			match(input,24,FOLLOW_24_in_command_for404); 
			pushFollow(FOLLOW_expression_in_command_for406);
			expression();
			state._fsp--;

			match(input,21,FOLLOW_21_in_command_for408); 
			pushFollow(FOLLOW_commands_in_command_for410);
			commands();
			state._fsp--;

			match(input,33,FOLLOW_33_in_command_for412); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "command_for"



	// $ANTLR start "command_foreach"
	// WhileGrammar.g:41:1: command_foreach : 'foreach' VARIABLE 'in' expression 'do' commands 'od' ;
	public final void command_foreach() throws RecognitionException {
		try {
			// WhileGrammar.g:41:16: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
			// WhileGrammar.g:41:18: 'foreach' VARIABLE 'in' expression 'do' commands 'od'
			{
			match(input,25,FOLLOW_25_in_command_foreach418); 
			match(input,VARIABLE,FOLLOW_VARIABLE_in_command_foreach420); 
			match(input,29,FOLLOW_29_in_command_foreach422); 
			pushFollow(FOLLOW_expression_in_command_foreach424);
			expression();
			state._fsp--;

			match(input,21,FOLLOW_21_in_command_foreach426); 
			pushFollow(FOLLOW_commands_in_command_foreach428);
			commands();
			state._fsp--;

			match(input,33,FOLLOW_33_in_command_foreach430); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "command_foreach"



	// $ANTLR start "command_nop"
	// WhileGrammar.g:42:1: command_nop : 'nop' ;
	public final void command_nop() throws RecognitionException {
		try {
			// WhileGrammar.g:42:12: ( 'nop' )
			// WhileGrammar.g:42:14: 'nop'
			{
			match(input,32,FOLLOW_32_in_command_nop436); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "command_nop"



	// $ANTLR start "command"
	// WhileGrammar.g:44:1: command : ( command_if | command_while | command_for | command_foreach | command_vars | command_nop );
	public final void command() throws RecognitionException {
		try {
			// WhileGrammar.g:44:8: ( command_if | command_while | command_for | command_foreach | command_vars | command_nop )
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
					// WhileGrammar.g:44:10: command_if
					{
					pushFollow(FOLLOW_command_if_in_command443);
					command_if();
					state._fsp--;

					}
					break;
				case 2 :
					// WhileGrammar.g:45:11: command_while
					{
					pushFollow(FOLLOW_command_while_in_command456);
					command_while();
					state._fsp--;

					}
					break;
				case 3 :
					// WhileGrammar.g:46:11: command_for
					{
					pushFollow(FOLLOW_command_for_in_command469);
					command_for();
					state._fsp--;

					}
					break;
				case 4 :
					// WhileGrammar.g:47:11: command_foreach
					{
					pushFollow(FOLLOW_command_foreach_in_command482);
					command_foreach();
					state._fsp--;

					}
					break;
				case 5 :
					// WhileGrammar.g:48:11: command_vars
					{
					pushFollow(FOLLOW_command_vars_in_command494);
					command_vars();
					state._fsp--;

					}
					break;
				case 6 :
					// WhileGrammar.g:49:11: command_nop
					{
					pushFollow(FOLLOW_command_nop_in_command506);
					command_nop();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "command"



	// $ANTLR start "exprbase1"
	// WhileGrammar.g:52:1: exprbase1 : ( 'nil' | VARIABLE | SYMBOL );
	public final void exprbase1() throws RecognitionException {
		try {
			// WhileGrammar.g:52:10: ( 'nil' | VARIABLE | SYMBOL )
			// WhileGrammar.g:
			{
			if ( (input.LA(1) >= SYMBOL && input.LA(1) <= VARIABLE)||input.LA(1)==31 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exprbase1"



	// $ANTLR start "expr_constructor"
	// WhileGrammar.g:53:1: expr_constructor : ( 'cons' | 'list' ) lexpr ;
	public final void expr_constructor() throws RecognitionException {
		try {
			// WhileGrammar.g:53:17: ( ( 'cons' | 'list' ) lexpr )
			// WhileGrammar.g:53:19: ( 'cons' | 'list' ) lexpr
			{
			if ( input.LA(1)==20||input.LA(1)==30 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_lexpr_in_expr_constructor542);
			lexpr();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr_constructor"



	// $ANTLR start "exprbase3"
	// WhileGrammar.g:54:1: exprbase3 : ( 'hd' | 'tl' ) exprbase ;
	public final void exprbase3() throws RecognitionException {
		try {
			// WhileGrammar.g:54:10: ( ( 'hd' | 'tl' ) exprbase )
			// WhileGrammar.g:54:12: ( 'hd' | 'tl' ) exprbase
			{
			if ( input.LA(1)==27||input.LA(1)==36 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_exprbase_in_exprbase3554);
			exprbase();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exprbase3"



	// $ANTLR start "expr_call"
	// WhileGrammar.g:55:1: expr_call : SYMBOL lexpr ;
	public final void expr_call() throws RecognitionException {
		try {
			// WhileGrammar.g:55:10: ( SYMBOL lexpr )
			// WhileGrammar.g:55:12: SYMBOL lexpr
			{
			match(input,SYMBOL,FOLLOW_SYMBOL_in_expr_call560); 
			pushFollow(FOLLOW_lexpr_in_expr_call562);
			lexpr();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr_call"



	// $ANTLR start "exprbase"
	// WhileGrammar.g:57:1: exprbase : ( exprbase1 | ( '(' ( expr_constructor | exprbase3 | expr_call ) ')' ) );
	public final void exprbase() throws RecognitionException {
		try {
			// WhileGrammar.g:57:9: ( exprbase1 | ( '(' ( expr_constructor | exprbase3 | expr_call ) ')' ) )
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
					// WhileGrammar.g:57:11: exprbase1
					{
					pushFollow(FOLLOW_exprbase1_in_exprbase569);
					exprbase1();
					state._fsp--;

					}
					break;
				case 2 :
					// WhileGrammar.g:57:23: ( '(' ( expr_constructor | exprbase3 | expr_call ) ')' )
					{
					// WhileGrammar.g:57:23: ( '(' ( expr_constructor | exprbase3 | expr_call ) ')' )
					// WhileGrammar.g:57:25: '(' ( expr_constructor | exprbase3 | expr_call ) ')'
					{
					match(input,13,FOLLOW_13_in_exprbase575); 
					// WhileGrammar.g:57:29: ( expr_constructor | exprbase3 | expr_call )
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
							// WhileGrammar.g:57:30: expr_constructor
							{
							pushFollow(FOLLOW_expr_constructor_in_exprbase578);
							expr_constructor();
							state._fsp--;

							}
							break;
						case 2 :
							// WhileGrammar.g:57:49: exprbase3
							{
							pushFollow(FOLLOW_exprbase3_in_exprbase582);
							exprbase3();
							state._fsp--;

							}
							break;
						case 3 :
							// WhileGrammar.g:57:61: expr_call
							{
							pushFollow(FOLLOW_expr_call_in_exprbase586);
							expr_call();
							state._fsp--;

							}
							break;

					}

					match(input,14,FOLLOW_14_in_exprbase589); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exprbase"



	// $ANTLR start "expression"
	// WhileGrammar.g:59:1: expression : exprbase ( '=?' exprbase )? ;
	public final void expression() throws RecognitionException {
		try {
			// WhileGrammar.g:59:11: ( exprbase ( '=?' exprbase )? )
			// WhileGrammar.g:59:13: exprbase ( '=?' exprbase )?
			{
			pushFollow(FOLLOW_exprbase_in_expression598);
			exprbase();
			state._fsp--;

			// WhileGrammar.g:59:22: ( '=?' exprbase )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==19) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// WhileGrammar.g:59:23: '=?' exprbase
					{
					match(input,19,FOLLOW_19_in_expression601); 
					pushFollow(FOLLOW_exprbase_in_expression603);
					exprbase();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "lexpr"
	// WhileGrammar.g:61:1: lexpr : ( exprbase lexpr )? ;
	public final void lexpr() throws RecognitionException {
		try {
			// WhileGrammar.g:61:6: ( ( exprbase lexpr )? )
			// WhileGrammar.g:61:8: ( exprbase lexpr )?
			{
			// WhileGrammar.g:61:8: ( exprbase lexpr )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= SYMBOL && LA13_0 <= VARIABLE)||LA13_0==13||LA13_0==31) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// WhileGrammar.g:61:9: exprbase lexpr
					{
					pushFollow(FOLLOW_exprbase_in_lexpr613);
					exprbase();
					state._fsp--;

					pushFollow(FOLLOW_lexpr_in_lexpr615);
					lexpr();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lexpr"

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program242 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_program_in_program245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_function253 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_SYMBOL_in_function255 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_function257 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_definition_in_function259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_definition265 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_input_in_definition267 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_definition269 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_definition271 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_definition273 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_definition275 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_output_in_definition277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_stub_in_input283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_input_stub290 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_input_stub293 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_input_stub_in_input_stub295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_output303 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_output306 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_output_in_output308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_vars317 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_vars320 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_vars_in_vars322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands331 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_commands334 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_commands336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs345 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_exprs348 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_exprs_in_exprs350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command_vars359 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_command_vars361 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_exprs_in_command_vars363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_command_if369 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_expression_in_command_if371 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_command_if373 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_if375 = new BitSet(new long[]{0x0000000000C00000L});
	public static final BitSet FOLLOW_22_in_command_if378 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_if380 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_command_if384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_command_while390 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_expression_in_command_while392 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_command_while394 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_while396 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command_while398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_command_for404 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_expression_in_command_for406 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_command_for408 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_for410 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command_for412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_command_foreach418 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_VARIABLE_in_command_foreach420 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_command_foreach422 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_expression_in_command_foreach424 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_command_foreach426 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_foreach428 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command_foreach430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_command_nop436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_if_in_command443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_while_in_command456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_for_in_command469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_foreach_in_command482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_vars_in_command494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_nop_in_command506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_expr_constructor536 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_lexpr_in_expr_constructor542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_exprbase3548 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_exprbase_in_exprbase3554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_expr_call560 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_lexpr_in_expr_call562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase1_in_exprbase569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_exprbase575 = new BitSet(new long[]{0x0000001048100200L});
	public static final BitSet FOLLOW_expr_constructor_in_exprbase578 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_exprbase3_in_exprbase582 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_expr_call_in_exprbase586 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_exprbase589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_expression598 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_expression601 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_exprbase_in_expression603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_lexpr613 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_lexpr_in_lexpr615 = new BitSet(new long[]{0x0000000000000002L});
}
