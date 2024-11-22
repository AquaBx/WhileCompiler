// $ANTLR 3.5.1 /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3 2024-11-22 16:16:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class WhileGrammarParser extends DebugParser {
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


	public static final String[] ruleNames = new String[] {
		"invalidRule", "function", "command_for", "command_foreach", "commands", 
		"exprs", "exprbase4", "input", "command_while", "command", "exprbase3", 
		"definition", "exprbase", "exprbase2", "command_if", "input_stub", "command_vars", 
		"expression", "program", "command_nop", "lexpr", "exprbase1", "output", 
		"vars"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public WhileGrammarParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public WhileGrammarParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public WhileGrammarParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return WhileGrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3"; }



	// $ANTLR start "program"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:19:1: program : function ( program )? ;
	public final void program() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(19, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:19:8: ( function ( program )? )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:19:10: function ( program )?
			{
			dbg.location(19,10);
			pushFollow(FOLLOW_function_in_program225);
			function();
			state._fsp--;
			dbg.location(19,19);
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:19:19: ( program )?
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==26) ) {
				alt1=1;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:19:20: program
					{
					dbg.location(19,20);
					pushFollow(FOLLOW_program_in_program228);
					program();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(19, 28);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "function"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:20:1: function : 'function' SYMBOL ':' definition ;
	public final void function() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:20:9: ( 'function' SYMBOL ':' definition )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:20:11: 'function' SYMBOL ':' definition
			{
			dbg.location(20,11);
			match(input,26,FOLLOW_26_in_function236); dbg.location(20,22);
			match(input,SYMBOL,FOLLOW_SYMBOL_in_function238); dbg.location(20,29);
			match(input,16,FOLLOW_16_in_function240); dbg.location(20,33);
			pushFollow(FOLLOW_definition_in_function242);
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
		dbg.location(20, 42);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "function"



	// $ANTLR start "definition"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:21:1: definition : 'read' input '%' commands '%' 'write' output ;
	public final void definition() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(21, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:21:11: ( 'read' input '%' commands '%' 'write' output )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:21:13: 'read' input '%' commands '%' 'write' output
			{
			dbg.location(21,13);
			match(input,34,FOLLOW_34_in_definition248); dbg.location(21,20);
			pushFollow(FOLLOW_input_in_definition250);
			input();
			state._fsp--;
			dbg.location(21,26);
			match(input,12,FOLLOW_12_in_definition252); dbg.location(21,30);
			pushFollow(FOLLOW_commands_in_definition254);
			commands();
			state._fsp--;
			dbg.location(21,39);
			match(input,12,FOLLOW_12_in_definition256); dbg.location(21,43);
			match(input,38,FOLLOW_38_in_definition258); dbg.location(21,51);
			pushFollow(FOLLOW_output_in_definition260);
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
		dbg.location(21, 56);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "definition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "definition"



	// $ANTLR start "input"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:22:1: input : ( input_stub )? ;
	public final void input() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(22, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:22:6: ( ( input_stub )? )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:22:8: ( input_stub )?
			{
			dbg.location(22,8);
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:22:8: ( input_stub )?
			int alt2=2;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==VARIABLE) ) {
				alt2=1;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:22:8: input_stub
					{
					dbg.location(22,8);
					pushFollow(FOLLOW_input_stub_in_input266);
					input_stub();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(2);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(22, 18);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "input");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "input"



	// $ANTLR start "input_stub"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:23:1: input_stub : VARIABLE ( ',' input_stub )? ;
	public final void input_stub() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "input_stub");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(23, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:23:11: ( VARIABLE ( ',' input_stub )? )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:23:13: VARIABLE ( ',' input_stub )?
			{
			dbg.location(23,13);
			match(input,VARIABLE,FOLLOW_VARIABLE_in_input_stub273); dbg.location(23,22);
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:23:22: ( ',' input_stub )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==15) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:23:23: ',' input_stub
					{
					dbg.location(23,23);
					match(input,15,FOLLOW_15_in_input_stub276); dbg.location(23,27);
					pushFollow(FOLLOW_input_stub_in_input_stub278);
					input_stub();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(3);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(23, 38);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "input_stub");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "input_stub"



	// $ANTLR start "output"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:24:1: output : VARIABLE ( ',' output )? ;
	public final void output() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "output");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(24, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:24:7: ( VARIABLE ( ',' output )? )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:24:9: VARIABLE ( ',' output )?
			{
			dbg.location(24,9);
			match(input,VARIABLE,FOLLOW_VARIABLE_in_output286); dbg.location(24,18);
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:24:18: ( ',' output )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==15) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:24:19: ',' output
					{
					dbg.location(24,19);
					match(input,15,FOLLOW_15_in_output289); dbg.location(24,23);
					pushFollow(FOLLOW_output_in_output291);
					output();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(24, 30);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "output");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "output"



	// $ANTLR start "vars"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:26:1: vars : VARIABLE ( ',' vars )? ;
	public final void vars() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(26, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:26:5: ( VARIABLE ( ',' vars )? )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:26:7: VARIABLE ( ',' vars )?
			{
			dbg.location(26,7);
			match(input,VARIABLE,FOLLOW_VARIABLE_in_vars300); dbg.location(26,16);
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:26:16: ( ',' vars )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==15) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:26:17: ',' vars
					{
					dbg.location(26,17);
					match(input,15,FOLLOW_15_in_vars303); dbg.location(26,21);
					pushFollow(FOLLOW_vars_in_vars305);
					vars();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(5);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(26, 26);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vars");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "vars"



	// $ANTLR start "commands"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:28:1: commands : command ( ';' commands )? ;
	public final void commands() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:28:9: ( command ( ';' commands )? )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:28:11: command ( ';' commands )?
			{
			dbg.location(28,11);
			pushFollow(FOLLOW_command_in_commands314);
			command();
			state._fsp--;
			dbg.location(28,19);
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:28:19: ( ';' commands )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==18) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:28:20: ';' commands
					{
					dbg.location(28,20);
					match(input,18,FOLLOW_18_in_commands317); dbg.location(28,24);
					pushFollow(FOLLOW_commands_in_commands319);
					commands();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(6);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(28, 33);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "commands");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "commands"



	// $ANTLR start "exprs"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:30:1: exprs : expression ( ',' exprs )? ;
	public final void exprs() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:30:6: ( expression ( ',' exprs )? )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:30:8: expression ( ',' exprs )?
			{
			dbg.location(30,8);
			pushFollow(FOLLOW_expression_in_exprs328);
			expression();
			state._fsp--;
			dbg.location(30,19);
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:30:19: ( ',' exprs )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==15) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:30:20: ',' exprs
					{
					dbg.location(30,20);
					match(input,15,FOLLOW_15_in_exprs331); dbg.location(30,24);
					pushFollow(FOLLOW_exprs_in_exprs333);
					exprs();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(7);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(30, 30);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprs");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprs"



	// $ANTLR start "command_vars"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:32:1: command_vars : vars ':=' exprs ;
	public final void command_vars() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "command_vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(32, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:32:13: ( vars ':=' exprs )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:32:15: vars ':=' exprs
			{
			dbg.location(32,15);
			pushFollow(FOLLOW_vars_in_command_vars342);
			vars();
			state._fsp--;
			dbg.location(32,20);
			match(input,17,FOLLOW_17_in_command_vars344); dbg.location(32,25);
			pushFollow(FOLLOW_exprs_in_command_vars346);
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
		dbg.location(32, 29);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "command_vars");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "command_vars"



	// $ANTLR start "command_if"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:33:1: command_if : 'if' expression 'then' commands ( 'else' commands )? 'fi' ;
	public final void command_if() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "command_if");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:33:11: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:33:13: 'if' expression 'then' commands ( 'else' commands )? 'fi'
			{
			dbg.location(33,13);
			match(input,28,FOLLOW_28_in_command_if352); dbg.location(33,18);
			pushFollow(FOLLOW_expression_in_command_if354);
			expression();
			state._fsp--;
			dbg.location(33,29);
			match(input,35,FOLLOW_35_in_command_if356); dbg.location(33,36);
			pushFollow(FOLLOW_commands_in_command_if358);
			commands();
			state._fsp--;
			dbg.location(33,45);
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:33:45: ( 'else' commands )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==22) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:33:46: 'else' commands
					{
					dbg.location(33,46);
					match(input,22,FOLLOW_22_in_command_if361); dbg.location(33,53);
					pushFollow(FOLLOW_commands_in_command_if363);
					commands();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(33,64);
			match(input,23,FOLLOW_23_in_command_if367); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(33, 67);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "command_if");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "command_if"



	// $ANTLR start "command_while"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:34:1: command_while : 'while' expression 'do' commands 'od' ;
	public final void command_while() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "command_while");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:34:14: ( 'while' expression 'do' commands 'od' )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:34:16: 'while' expression 'do' commands 'od'
			{
			dbg.location(34,16);
			match(input,37,FOLLOW_37_in_command_while373); dbg.location(34,24);
			pushFollow(FOLLOW_expression_in_command_while375);
			expression();
			state._fsp--;
			dbg.location(34,35);
			match(input,21,FOLLOW_21_in_command_while377); dbg.location(34,40);
			pushFollow(FOLLOW_commands_in_command_while379);
			commands();
			state._fsp--;
			dbg.location(34,49);
			match(input,33,FOLLOW_33_in_command_while381); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(34, 52);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "command_while");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "command_while"



	// $ANTLR start "command_for"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:35:1: command_for : 'for' expression 'do' commands 'od' ;
	public final void command_for() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "command_for");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(35, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:35:12: ( 'for' expression 'do' commands 'od' )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:35:14: 'for' expression 'do' commands 'od'
			{
			dbg.location(35,14);
			match(input,24,FOLLOW_24_in_command_for387); dbg.location(35,20);
			pushFollow(FOLLOW_expression_in_command_for389);
			expression();
			state._fsp--;
			dbg.location(35,31);
			match(input,21,FOLLOW_21_in_command_for391); dbg.location(35,36);
			pushFollow(FOLLOW_commands_in_command_for393);
			commands();
			state._fsp--;
			dbg.location(35,45);
			match(input,33,FOLLOW_33_in_command_for395); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(35, 48);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "command_for");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "command_for"



	// $ANTLR start "command_foreach"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:36:1: command_foreach : 'foreach' VARIABLE 'in' expression 'do' commands 'od' ;
	public final void command_foreach() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "command_foreach");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(36, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:36:16: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:36:18: 'foreach' VARIABLE 'in' expression 'do' commands 'od'
			{
			dbg.location(36,18);
			match(input,25,FOLLOW_25_in_command_foreach401); dbg.location(36,28);
			match(input,VARIABLE,FOLLOW_VARIABLE_in_command_foreach403); dbg.location(36,37);
			match(input,29,FOLLOW_29_in_command_foreach405); dbg.location(36,42);
			pushFollow(FOLLOW_expression_in_command_foreach407);
			expression();
			state._fsp--;
			dbg.location(36,53);
			match(input,21,FOLLOW_21_in_command_foreach409); dbg.location(36,58);
			pushFollow(FOLLOW_commands_in_command_foreach411);
			commands();
			state._fsp--;
			dbg.location(36,67);
			match(input,33,FOLLOW_33_in_command_foreach413); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(36, 70);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "command_foreach");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "command_foreach"



	// $ANTLR start "command_nop"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:37:1: command_nop : 'nop' ;
	public final void command_nop() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "command_nop");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:37:12: ( 'nop' )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:37:14: 'nop'
			{
			dbg.location(37,14);
			match(input,32,FOLLOW_32_in_command_nop419); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(37, 18);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "command_nop");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "command_nop"



	// $ANTLR start "command"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:39:1: command : ( command_if | command_while | command_for | command_foreach | command_vars | command_nop );
	public final void command() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "command");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(39, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:39:8: ( command_if | command_while | command_for | command_foreach | command_vars | command_nop )
			int alt9=6;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:39:10: command_if
					{
					dbg.location(39,10);
					pushFollow(FOLLOW_command_if_in_command426);
					command_if();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:40:11: command_while
					{
					dbg.location(40,11);
					pushFollow(FOLLOW_command_while_in_command439);
					command_while();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:41:11: command_for
					{
					dbg.location(41,11);
					pushFollow(FOLLOW_command_for_in_command452);
					command_for();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:42:11: command_foreach
					{
					dbg.location(42,11);
					pushFollow(FOLLOW_command_foreach_in_command465);
					command_foreach();
					state._fsp--;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:43:11: command_vars
					{
					dbg.location(43,11);
					pushFollow(FOLLOW_command_vars_in_command477);
					command_vars();
					state._fsp--;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:44:11: command_nop
					{
					dbg.location(44,11);
					pushFollow(FOLLOW_command_nop_in_command489);
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
		dbg.location(45, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "command");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "command"



	// $ANTLR start "exprbase1"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:47:1: exprbase1 : ( 'nil' | VARIABLE | SYMBOL );
	public final void exprbase1() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprbase1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(47, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:47:10: ( 'nil' | VARIABLE | SYMBOL )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:
			{
			dbg.location(47,10);
			if ( (input.LA(1) >= SYMBOL && input.LA(1) <= VARIABLE)||input.LA(1)==31 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
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
		dbg.location(47, 36);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprbase1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprbase1"



	// $ANTLR start "exprbase2"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:48:1: exprbase2 : ( 'cons' | 'list' ) lexpr ;
	public final void exprbase2() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprbase2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(48, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:48:10: ( ( 'cons' | 'list' ) lexpr )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:48:12: ( 'cons' | 'list' ) lexpr
			{
			dbg.location(48,12);
			if ( input.LA(1)==20||input.LA(1)==30 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}dbg.location(48,28);
			pushFollow(FOLLOW_lexpr_in_exprbase2525);
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
		dbg.location(48, 32);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprbase2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprbase2"



	// $ANTLR start "exprbase3"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:49:1: exprbase3 : ( 'hd' | 'tl' ) exprbase ;
	public final void exprbase3() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprbase3");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(49, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:49:10: ( ( 'hd' | 'tl' ) exprbase )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:49:12: ( 'hd' | 'tl' ) exprbase
			{
			dbg.location(49,12);
			if ( input.LA(1)==27||input.LA(1)==36 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}dbg.location(49,24);
			pushFollow(FOLLOW_exprbase_in_exprbase3537);
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
		dbg.location(49, 31);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprbase3");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprbase3"



	// $ANTLR start "exprbase4"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:50:1: exprbase4 : SYMBOL lexpr ;
	public final void exprbase4() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprbase4");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(50, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:50:10: ( SYMBOL lexpr )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:50:12: SYMBOL lexpr
			{
			dbg.location(50,12);
			match(input,SYMBOL,FOLLOW_SYMBOL_in_exprbase4543); dbg.location(50,19);
			pushFollow(FOLLOW_lexpr_in_exprbase4545);
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
		dbg.location(50, 23);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprbase4");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprbase4"



	// $ANTLR start "exprbase"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:52:1: exprbase : ( exprbase1 | ( '(' ( exprbase2 | exprbase3 | exprbase4 ) ')' ) );
	public final void exprbase() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprbase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:52:9: ( exprbase1 | ( '(' ( exprbase2 | exprbase3 | exprbase4 ) ')' ) )
			int alt11=2;
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:52:11: exprbase1
					{
					dbg.location(52,11);
					pushFollow(FOLLOW_exprbase1_in_exprbase552);
					exprbase1();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:52:23: ( '(' ( exprbase2 | exprbase3 | exprbase4 ) ')' )
					{
					dbg.location(52,23);
					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:52:23: ( '(' ( exprbase2 | exprbase3 | exprbase4 ) ')' )
					dbg.enterAlt(1);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:52:25: '(' ( exprbase2 | exprbase3 | exprbase4 ) ')'
					{
					dbg.location(52,25);
					match(input,13,FOLLOW_13_in_exprbase558); dbg.location(52,29);
					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:52:29: ( exprbase2 | exprbase3 | exprbase4 )
					int alt10=3;
					try { dbg.enterSubRule(10);
					try { dbg.enterDecision(10, decisionCanBacktrack[10]);

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
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(10);}

					switch (alt10) {
						case 1 :
							dbg.enterAlt(1);

							// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:52:30: exprbase2
							{
							dbg.location(52,30);
							pushFollow(FOLLOW_exprbase2_in_exprbase561);
							exprbase2();
							state._fsp--;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:52:42: exprbase3
							{
							dbg.location(52,42);
							pushFollow(FOLLOW_exprbase3_in_exprbase565);
							exprbase3();
							state._fsp--;

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:52:54: exprbase4
							{
							dbg.location(52,54);
							pushFollow(FOLLOW_exprbase4_in_exprbase569);
							exprbase4();
							state._fsp--;

							}
							break;

					}
					} finally {dbg.exitSubRule(10);}
					dbg.location(52,65);
					match(input,14,FOLLOW_14_in_exprbase572); 
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
		dbg.location(52, 69);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprbase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprbase"



	// $ANTLR start "expression"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:54:1: expression : exprbase ( '=?' exprbase )? ;
	public final void expression() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:54:11: ( exprbase ( '=?' exprbase )? )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:54:13: exprbase ( '=?' exprbase )?
			{
			dbg.location(54,13);
			pushFollow(FOLLOW_exprbase_in_expression581);
			exprbase();
			state._fsp--;
			dbg.location(54,22);
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:54:22: ( '=?' exprbase )?
			int alt12=2;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==19) ) {
				alt12=1;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:54:23: '=?' exprbase
					{
					dbg.location(54,23);
					match(input,19,FOLLOW_19_in_expression584); dbg.location(54,28);
					pushFollow(FOLLOW_exprbase_in_expression586);
					exprbase();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(12);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(54, 37);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expression"



	// $ANTLR start "lexpr"
	// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:56:1: lexpr : ( exprbase lexpr )? ;
	public final void lexpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "lexpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(56, 0);

		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:56:6: ( ( exprbase lexpr )? )
			dbg.enterAlt(1);

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:56:8: ( exprbase lexpr )?
			{
			dbg.location(56,8);
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:56:8: ( exprbase lexpr )?
			int alt13=2;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= SYMBOL && LA13_0 <= VARIABLE)||LA13_0==13||LA13_0==31) ) {
				alt13=1;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/WhileGrammar.g3:56:9: exprbase lexpr
					{
					dbg.location(56,9);
					pushFollow(FOLLOW_exprbase_in_lexpr596);
					exprbase();
					state._fsp--;
					dbg.location(56,18);
					pushFollow(FOLLOW_lexpr_in_lexpr598);
					lexpr();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(13);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(56, 24);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lexpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "lexpr"

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program225 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_program_in_program228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_function236 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_SYMBOL_in_function238 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_function240 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_definition_in_function242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_definition248 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_input_in_definition250 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_definition252 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_definition254 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_definition256 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_definition258 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_output_in_definition260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_stub_in_input266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_input_stub273 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_input_stub276 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_input_stub_in_input_stub278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_output286 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_output289 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_output_in_output291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_vars300 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_vars303 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_vars_in_vars305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands314 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_commands317 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_commands319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs328 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_exprs331 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_exprs_in_exprs333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command_vars342 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_command_vars344 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_exprs_in_command_vars346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_command_if352 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_expression_in_command_if354 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_command_if356 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_if358 = new BitSet(new long[]{0x0000000000C00000L});
	public static final BitSet FOLLOW_22_in_command_if361 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_if363 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_command_if367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_command_while373 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_expression_in_command_while375 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_command_while377 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_while379 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command_while381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_command_for387 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_expression_in_command_for389 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_command_for391 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_for393 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command_for395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_command_foreach401 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_VARIABLE_in_command_foreach403 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_command_foreach405 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_expression_in_command_foreach407 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_command_foreach409 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_foreach411 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command_foreach413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_command_nop419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_if_in_command426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_while_in_command439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_for_in_command452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_foreach_in_command465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_vars_in_command477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_nop_in_command489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_exprbase2519 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_lexpr_in_exprbase2525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_exprbase3531 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_exprbase_in_exprbase3537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_exprbase4543 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_lexpr_in_exprbase4545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase1_in_exprbase552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_exprbase558 = new BitSet(new long[]{0x0000001048100200L});
	public static final BitSet FOLLOW_exprbase2_in_exprbase561 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_exprbase3_in_exprbase565 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_exprbase4_in_exprbase569 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_exprbase572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_expression581 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_expression584 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_exprbase_in_expression586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_lexpr596 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_lexpr_in_lexpr598 = new BitSet(new long[]{0x0000000000000002L});
}
