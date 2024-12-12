// $ANTLR 3.5.1 /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g 2024-12-12 08:26:41
 package org.esir.nctt.antlr; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class WhileGrammarLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public WhileGrammarLexer() {} 
	public WhileGrammarLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public WhileGrammarLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g"; }

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:4:7: ( '%' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:4:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:5:7: ( '(' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:5:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:6:7: ( ')' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:6:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:7:7: ( ',' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:7:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:8:7: ( ':' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:8:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:9:7: ( ':=' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:9:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:10:7: ( ';' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:10:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:11:7: ( '=?' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:11:9: '=?'
			{
			match("=?"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:12:7: ( 'cons' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:12:9: 'cons'
			{
			match("cons"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:13:7: ( 'do' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:13:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:14:7: ( 'else' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:14:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:15:7: ( 'fi' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:15:9: 'fi'
			{
			match("fi"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:16:7: ( 'for' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:16:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:17:7: ( 'foreach' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:17:9: 'foreach'
			{
			match("foreach"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:18:7: ( 'function' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:18:9: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:19:7: ( 'hd' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:19:9: 'hd'
			{
			match("hd"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:20:7: ( 'if' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:20:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:21:7: ( 'in' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:21:9: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:22:7: ( 'list' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:22:9: 'list'
			{
			match("list"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:23:7: ( 'nil' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:23:9: 'nil'
			{
			match("nil"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:24:7: ( 'nop' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:24:9: 'nop'
			{
			match("nop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:25:7: ( 'od' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:25:9: 'od'
			{
			match("od"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:26:7: ( 'read' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:26:9: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:27:7: ( 'then' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:27:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:28:7: ( 'tl' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:28:9: 'tl'
			{
			match("tl"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:29:7: ( 'while' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:29:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:30:7: ( 'write' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:30:9: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "DEC"
	public final void mDEC() throws RecognitionException {
		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:38:13: ( '0' .. '9' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC"

	// $ANTLR start "MAJ"
	public final void mMAJ() throws RecognitionException {
		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:39:14: ( 'A' .. 'Z' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAJ"

	// $ANTLR start "MIN"
	public final void mMIN() throws RecognitionException {
		try {
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:40:14: ( 'a' .. 'z' )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIN"

	// $ANTLR start "VARIABLE"
	public final void mVARIABLE() throws RecognitionException {
		try {
			int _type = VARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:42:10: ( MAJ ( MAJ | MIN | DEC )* ( '!' | '?' )? )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:42:12: MAJ ( MAJ | MIN | DEC )* ( '!' | '?' )?
			{
			mMAJ(); 

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:42:16: ( MAJ | MIN | DEC )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:42:35: ( '!' | '?' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='!'||LA2_0=='?') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLE"

	// $ANTLR start "SYMBOL"
	public final void mSYMBOL() throws RecognitionException {
		try {
			int _type = SYMBOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:43:7: ( MIN ( MAJ | MIN | DEC )* ( '!' | '?' )? )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:43:9: MIN ( MAJ | MIN | DEC )* ( '!' | '?' )?
			{
			mMIN(); 

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:43:13: ( MAJ | MIN | DEC )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:43:31: ( '!' | '?' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='!'||LA4_0=='?') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYMBOL"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:45:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:45:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:45:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:47:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:47:5: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:50:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='/') ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1=='/') ) {
					alt9=1;
				}
				else if ( (LA9_1=='*') ) {
					alt9=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:50:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:50:14: (~ ( '\\n' | '\\r' ) )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop6;
						}
					}

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:50:28: ( '\\r' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='\r') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:50:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:51:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:51:14: ( options {greedy=false; } : . )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0=='*') ) {
							int LA8_1 = input.LA(2);
							if ( (LA8_1=='/') ) {
								alt8=2;
							}
							else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
								alt8=1;
							}

						}
						else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:51:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop8;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:8: ( T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | VARIABLE | SYMBOL | IDENT | WS | COMMENT )
		int alt10=32;
		alt10 = dfa10.predict(input);
		switch (alt10) {
			case 1 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:10: T__34
				{
				mT__34(); 

				}
				break;
			case 2 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:16: T__35
				{
				mT__35(); 

				}
				break;
			case 3 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:22: T__36
				{
				mT__36(); 

				}
				break;
			case 4 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:28: T__37
				{
				mT__37(); 

				}
				break;
			case 5 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:34: T__38
				{
				mT__38(); 

				}
				break;
			case 6 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:40: T__39
				{
				mT__39(); 

				}
				break;
			case 7 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:46: T__40
				{
				mT__40(); 

				}
				break;
			case 8 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:52: T__41
				{
				mT__41(); 

				}
				break;
			case 9 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:58: T__42
				{
				mT__42(); 

				}
				break;
			case 10 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:64: T__43
				{
				mT__43(); 

				}
				break;
			case 11 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:70: T__44
				{
				mT__44(); 

				}
				break;
			case 12 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:76: T__45
				{
				mT__45(); 

				}
				break;
			case 13 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:82: T__46
				{
				mT__46(); 

				}
				break;
			case 14 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:88: T__47
				{
				mT__47(); 

				}
				break;
			case 15 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:94: T__48
				{
				mT__48(); 

				}
				break;
			case 16 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:100: T__49
				{
				mT__49(); 

				}
				break;
			case 17 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:106: T__50
				{
				mT__50(); 

				}
				break;
			case 18 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:112: T__51
				{
				mT__51(); 

				}
				break;
			case 19 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:118: T__52
				{
				mT__52(); 

				}
				break;
			case 20 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:124: T__53
				{
				mT__53(); 

				}
				break;
			case 21 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:130: T__54
				{
				mT__54(); 

				}
				break;
			case 22 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:136: T__55
				{
				mT__55(); 

				}
				break;
			case 23 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:142: T__56
				{
				mT__56(); 

				}
				break;
			case 24 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:148: T__57
				{
				mT__57(); 

				}
				break;
			case 25 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:154: T__58
				{
				mT__58(); 

				}
				break;
			case 26 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:160: T__59
				{
				mT__59(); 

				}
				break;
			case 27 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:166: T__60
				{
				mT__60(); 

				}
				break;
			case 28 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:172: VARIABLE
				{
				mVARIABLE(); 

				}
				break;
			case 29 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:181: SYMBOL
				{
				mSYMBOL(); 

				}
				break;
			case 30 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:188: IDENT
				{
				mIDENT(); 

				}
				break;
			case 31 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:194: WS
				{
				mWS(); 

				}
				break;
			case 32 :
				// /Users/tomchauvel/Documents/GitHub/s7-tlc-projet/src/while_compiler/src/main/antlr3/WhileGrammar.g:1:197: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}


	protected DFA10 dfa10 = new DFA10(this);
	static final String DFA10_eotS =
		"\5\uffff\1\32\2\uffff\14\34\1\57\1\34\5\uffff\1\34\1\uffff\1\34\1\62\1"+
		"\34\1\64\2\34\1\67\1\70\1\71\3\34\1\75\2\34\1\100\2\34\1\uffff\1\57\1"+
		"\34\1\uffff\1\34\1\uffff\1\106\1\34\3\uffff\1\34\1\111\1\112\1\uffff\2"+
		"\34\1\uffff\2\34\1\117\1\120\1\34\1\uffff\1\34\1\123\2\uffff\1\124\1\125"+
		"\2\34\2\uffff\2\34\3\uffff\1\132\1\133\2\34\2\uffff\1\136\1\34\1\uffff"+
		"\1\140\1\uffff";
	static final String DFA10_eofS =
		"\141\uffff";
	static final String DFA10_minS =
		"\1\11\4\uffff\1\75\2\uffff\16\60\5\uffff\1\60\1\uffff\1\60\1\41\1\60\1"+
		"\41\2\60\3\41\3\60\1\41\2\60\1\41\2\60\1\uffff\2\60\1\uffff\1\60\1\uffff"+
		"\1\41\1\60\3\uffff\1\60\2\41\1\uffff\2\60\1\uffff\2\60\2\41\1\60\1\uffff"+
		"\1\60\1\41\2\uffff\2\41\2\60\2\uffff\2\60\3\uffff\2\41\2\60\2\uffff\1"+
		"\41\1\60\1\uffff\1\41\1\uffff";
	static final String DFA10_maxS =
		"\1\172\4\uffff\1\75\2\uffff\16\172\5\uffff\1\172\1\uffff\22\172\1\uffff"+
		"\2\172\1\uffff\1\172\1\uffff\2\172\3\uffff\3\172\1\uffff\2\172\1\uffff"+
		"\5\172\1\uffff\2\172\2\uffff\4\172\2\uffff\2\172\3\uffff\4\172\2\uffff"+
		"\2\172\1\uffff\1\172\1\uffff";
	static final String DFA10_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\16\uffff\1\36\1\37\1\40\1\6"+
		"\1\5\1\uffff\1\35\22\uffff\1\34\2\uffff\1\12\1\uffff\1\14\2\uffff\1\20"+
		"\1\21\1\22\3\uffff\1\26\2\uffff\1\31\5\uffff\1\15\2\uffff\1\24\1\25\4"+
		"\uffff\1\11\1\13\2\uffff\1\23\1\27\1\30\4\uffff\1\32\1\33\2\uffff\1\16"+
		"\1\uffff\1\17";
	static final String DFA10_specialS =
		"\141\uffff}>";
	static final String[] DFA10_transitionS = {
			"\2\27\2\uffff\1\27\22\uffff\1\27\4\uffff\1\1\2\uffff\1\2\1\3\2\uffff"+
			"\1\4\2\uffff\1\30\12\uffff\1\5\1\6\1\uffff\1\7\3\uffff\32\24\4\uffff"+
			"\1\26\1\uffff\2\25\1\10\1\11\1\12\1\13\1\25\1\14\1\15\2\25\1\16\1\25"+
			"\1\17\1\20\2\25\1\21\1\25\1\22\2\25\1\23\3\25",
			"",
			"",
			"",
			"",
			"\1\31",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\16\35\1\33\13\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\16\35\1\36\13\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\13\35\1\37\16\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\10\35\1\40\5\35\1\41\5\35"+
			"\1\42\5\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\3\35\1\43\26\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\5\35\1\44\7\35\1\45\14\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\10\35\1\46\21\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\10\35\1\47\5\35\1\50\13\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\3\35\1\51\26\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\4\35\1\52\25\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\7\35\1\53\3\35\1\54\16\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\7\35\1\55\11\35\1\56\10\35",
			"\12\60\7\uffff\32\60\4\uffff\1\26\1\uffff\32\60",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\32\35",
			"",
			"",
			"",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\15\35\1\61\14\35",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\32\35",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\22\35\1\63\7\35",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\21\35\1\65\10\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\15\35\1\66\14\35",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\22\35\1\72\7\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\13\35\1\73\16\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\17\35\1\74\12\35",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\1\76\31\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\4\35\1\77\25\35",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\10\35\1\101\21\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\10\35\1\102\21\35",
			"",
			"\12\60\7\uffff\32\60\4\uffff\1\26\1\uffff\32\60",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\22\35\1\103\7\35",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\4\35\1\104\25\35",
			"",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\4\35\1\105\25\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\2\35\1\107\27\35",
			"",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\23\35\1\110\6\35",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\3\35\1\113\26\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\15\35\1\114\14\35",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\13\35\1\115\16\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\23\35\1\116\6\35",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\1\121\31\35",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\23\35\1\122\6\35",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			"",
			"",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\4\35\1\126\25\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\4\35\1\127\25\35",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\2\35\1\130\27\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\10\35\1\131\21\35",
			"",
			"",
			"",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\7\35\1\134\22\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\16\35\1\135\13\35",
			"",
			"",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\26\1\uffff\15\35\1\137\14\35",
			"",
			"\1\34\16\uffff\12\35\5\uffff\1\34\1\uffff\32\35\4\uffff\1\26\1\uffff"+
			"\32\35",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | VARIABLE | SYMBOL | IDENT | WS | COMMENT );";
		}
	}

}
