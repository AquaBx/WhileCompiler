// $ANTLR 3.5.3 WhileGrammar.g 2024-12-10 16:44:08
 package org.esir.nctt.antlr; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class WhileGrammarLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "WhileGrammar.g"; }

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:4:7: ( '%' )
			// WhileGrammar.g:4:9: '%'
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:5:7: ( '(' )
			// WhileGrammar.g:5:9: '('
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:6:7: ( ')' )
			// WhileGrammar.g:6:9: ')'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:7:7: ( ',' )
			// WhileGrammar.g:7:9: ','
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:8:7: ( ':' )
			// WhileGrammar.g:8:9: ':'
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:9:7: ( ':=' )
			// WhileGrammar.g:9:9: ':='
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:10:7: ( ';' )
			// WhileGrammar.g:10:9: ';'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:11:7: ( '=?' )
			// WhileGrammar.g:11:9: '=?'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:12:7: ( 'cons' )
			// WhileGrammar.g:12:9: 'cons'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:13:7: ( 'do' )
			// WhileGrammar.g:13:9: 'do'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:14:7: ( 'else' )
			// WhileGrammar.g:14:9: 'else'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:15:7: ( 'fi' )
			// WhileGrammar.g:15:9: 'fi'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:16:7: ( 'for' )
			// WhileGrammar.g:16:9: 'for'
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:17:7: ( 'foreach' )
			// WhileGrammar.g:17:9: 'foreach'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:18:7: ( 'function' )
			// WhileGrammar.g:18:9: 'function'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:19:7: ( 'hd' )
			// WhileGrammar.g:19:9: 'hd'
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:20:7: ( 'if' )
			// WhileGrammar.g:20:9: 'if'
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:21:7: ( 'in' )
			// WhileGrammar.g:21:9: 'in'
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:22:7: ( 'list' )
			// WhileGrammar.g:22:9: 'list'
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:23:7: ( 'nil' )
			// WhileGrammar.g:23:9: 'nil'
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:24:7: ( 'nop' )
			// WhileGrammar.g:24:9: 'nop'
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:25:7: ( 'od' )
			// WhileGrammar.g:25:9: 'od'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:26:7: ( 'read' )
			// WhileGrammar.g:26:9: 'read'
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:27:7: ( 'then' )
			// WhileGrammar.g:27:9: 'then'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:28:7: ( 'tl' )
			// WhileGrammar.g:28:9: 'tl'
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:29:7: ( 'while' )
			// WhileGrammar.g:29:9: 'while'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// WhileGrammar.g:30:7: ( 'write' )
			// WhileGrammar.g:30:9: 'write'
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
	// $ANTLR end "T__38"

	// $ANTLR start "DEC"
	public final void mDEC() throws RecognitionException {
		try {
			// WhileGrammar.g:12:13: ( '0' .. '9' )
			// WhileGrammar.g:
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
			// WhileGrammar.g:13:14: ( 'A' .. 'Z' )
			// WhileGrammar.g:
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
			// WhileGrammar.g:14:14: ( 'a' .. 'z' )
			// WhileGrammar.g:
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
			// WhileGrammar.g:16:10: ( MAJ ( MAJ | MIN | DEC )* ( '!' | '?' )? )
			// WhileGrammar.g:16:12: MAJ ( MAJ | MIN | DEC )* ( '!' | '?' )?
			{
			mMAJ(); 

			// WhileGrammar.g:16:16: ( MAJ | MIN | DEC )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// WhileGrammar.g:
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

			// WhileGrammar.g:16:35: ( '!' | '?' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='!'||LA2_0=='?') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// WhileGrammar.g:
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
			// WhileGrammar.g:17:7: ( MIN ( MAJ | MIN | DEC )* ( '!' | '?' )? )
			// WhileGrammar.g:17:9: MIN ( MAJ | MIN | DEC )* ( '!' | '?' )?
			{
			mMIN(); 

			// WhileGrammar.g:17:13: ( MAJ | MIN | DEC )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// WhileGrammar.g:
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

			// WhileGrammar.g:17:31: ( '!' | '?' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='!'||LA4_0=='?') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// WhileGrammar.g:
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
			// WhileGrammar.g:19:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// WhileGrammar.g:19:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// WhileGrammar.g:19:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// WhileGrammar.g:
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
			// WhileGrammar.g:21:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// WhileGrammar.g:21:5: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// WhileGrammar.g:24:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
					// WhileGrammar.g:24:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// WhileGrammar.g:24:14: (~ ( '\\n' | '\\r' ) )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// WhileGrammar.g:
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

					// WhileGrammar.g:24:28: ( '\\r' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='\r') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// WhileGrammar.g:24:28: '\\r'
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
					// WhileGrammar.g:25:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// WhileGrammar.g:25:14: ( options {greedy=false; } : . )*
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
							// WhileGrammar.g:25:42: .
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
		// WhileGrammar.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | VARIABLE | SYMBOL | IDENT | WS | COMMENT )
		int alt10=32;
		alt10 = dfa10.predict(input);
		switch (alt10) {
			case 1 :
				// WhileGrammar.g:1:10: T__12
				{
				mT__12(); 

				}
				break;
			case 2 :
				// WhileGrammar.g:1:16: T__13
				{
				mT__13(); 

				}
				break;
			case 3 :
				// WhileGrammar.g:1:22: T__14
				{
				mT__14(); 

				}
				break;
			case 4 :
				// WhileGrammar.g:1:28: T__15
				{
				mT__15(); 

				}
				break;
			case 5 :
				// WhileGrammar.g:1:34: T__16
				{
				mT__16(); 

				}
				break;
			case 6 :
				// WhileGrammar.g:1:40: T__17
				{
				mT__17(); 

				}
				break;
			case 7 :
				// WhileGrammar.g:1:46: T__18
				{
				mT__18(); 

				}
				break;
			case 8 :
				// WhileGrammar.g:1:52: T__19
				{
				mT__19(); 

				}
				break;
			case 9 :
				// WhileGrammar.g:1:58: T__20
				{
				mT__20(); 

				}
				break;
			case 10 :
				// WhileGrammar.g:1:64: T__21
				{
				mT__21(); 

				}
				break;
			case 11 :
				// WhileGrammar.g:1:70: T__22
				{
				mT__22(); 

				}
				break;
			case 12 :
				// WhileGrammar.g:1:76: T__23
				{
				mT__23(); 

				}
				break;
			case 13 :
				// WhileGrammar.g:1:82: T__24
				{
				mT__24(); 

				}
				break;
			case 14 :
				// WhileGrammar.g:1:88: T__25
				{
				mT__25(); 

				}
				break;
			case 15 :
				// WhileGrammar.g:1:94: T__26
				{
				mT__26(); 

				}
				break;
			case 16 :
				// WhileGrammar.g:1:100: T__27
				{
				mT__27(); 

				}
				break;
			case 17 :
				// WhileGrammar.g:1:106: T__28
				{
				mT__28(); 

				}
				break;
			case 18 :
				// WhileGrammar.g:1:112: T__29
				{
				mT__29(); 

				}
				break;
			case 19 :
				// WhileGrammar.g:1:118: T__30
				{
				mT__30(); 

				}
				break;
			case 20 :
				// WhileGrammar.g:1:124: T__31
				{
				mT__31(); 

				}
				break;
			case 21 :
				// WhileGrammar.g:1:130: T__32
				{
				mT__32(); 

				}
				break;
			case 22 :
				// WhileGrammar.g:1:136: T__33
				{
				mT__33(); 

				}
				break;
			case 23 :
				// WhileGrammar.g:1:142: T__34
				{
				mT__34(); 

				}
				break;
			case 24 :
				// WhileGrammar.g:1:148: T__35
				{
				mT__35(); 

				}
				break;
			case 25 :
				// WhileGrammar.g:1:154: T__36
				{
				mT__36(); 

				}
				break;
			case 26 :
				// WhileGrammar.g:1:160: T__37
				{
				mT__37(); 

				}
				break;
			case 27 :
				// WhileGrammar.g:1:166: T__38
				{
				mT__38(); 

				}
				break;
			case 28 :
				// WhileGrammar.g:1:172: VARIABLE
				{
				mVARIABLE(); 

				}
				break;
			case 29 :
				// WhileGrammar.g:1:181: SYMBOL
				{
				mSYMBOL(); 

				}
				break;
			case 30 :
				// WhileGrammar.g:1:188: IDENT
				{
				mIDENT(); 

				}
				break;
			case 31 :
				// WhileGrammar.g:1:194: WS
				{
				mWS(); 

				}
				break;
			case 32 :
				// WhileGrammar.g:1:197: COMMENT
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
			return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | VARIABLE | SYMBOL | IDENT | WS | COMMENT );";
		}
	}

}
