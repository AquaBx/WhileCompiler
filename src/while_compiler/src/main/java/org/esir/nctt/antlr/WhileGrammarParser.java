// $ANTLR 3.5.3 WhileGrammar.g 2024-12-10 17:17:12
 package org.esir.nctt.antlr; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
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

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("WhileGrammarParserTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return WhileGrammarParser.tokenNames; }
	@Override public String getGrammarFileName() { return "WhileGrammar.g"; }


	public static class program_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "program"
	// WhileGrammar.g:29:1: program : function ( program )? ;
	public final WhileGrammarParser.program_return program() throws RecognitionException {
		WhileGrammarParser.program_return retval = new WhileGrammarParser.program_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:29:8: ( function ( program )? )
			// WhileGrammar.g:29:10: function ( program )?
			{
			pushFollow(FOLLOW_function_in_program258);
			function();
			state._fsp--;

			// WhileGrammar.g:29:19: ( program )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==26) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// WhileGrammar.g:29:20: program
					{
					pushFollow(FOLLOW_program_in_program261);
					program();
					state._fsp--;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class function_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "function"
	// WhileGrammar.g:30:1: function : 'function' SYMBOL ':' definition ;
	public final WhileGrammarParser.function_return function() throws RecognitionException {
		WhileGrammarParser.function_return retval = new WhileGrammarParser.function_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:30:9: ( 'function' SYMBOL ':' definition )
			// WhileGrammar.g:30:11: 'function' SYMBOL ':' definition
			{
			match(input,26,FOLLOW_26_in_function269); 
			match(input,SYMBOL,FOLLOW_SYMBOL_in_function271); 
			match(input,16,FOLLOW_16_in_function273); 
			pushFollow(FOLLOW_definition_in_function275);
			definition();
			state._fsp--;

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class definition_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "definition"
	// WhileGrammar.g:31:1: definition : 'read' input '%' commands '%' 'write' output ;
	public final WhileGrammarParser.definition_return definition() throws RecognitionException {
		WhileGrammarParser.definition_return retval = new WhileGrammarParser.definition_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:31:11: ( 'read' input '%' commands '%' 'write' output )
			// WhileGrammar.g:31:13: 'read' input '%' commands '%' 'write' output
			{
			match(input,34,FOLLOW_34_in_definition281); 
			pushFollow(FOLLOW_input_in_definition283);
			input();
			state._fsp--;

			match(input,12,FOLLOW_12_in_definition285); 
			pushFollow(FOLLOW_commands_in_definition287);
			commands();
			state._fsp--;

			match(input,12,FOLLOW_12_in_definition289); 
			match(input,38,FOLLOW_38_in_definition291); 
			pushFollow(FOLLOW_output_in_definition293);
			output();
			state._fsp--;

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "definition"


	public static class input_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "input"
	// WhileGrammar.g:32:1: input : ( input_stub )? ;
	public final WhileGrammarParser.input_return input() throws RecognitionException {
		WhileGrammarParser.input_return retval = new WhileGrammarParser.input_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:32:6: ( ( input_stub )? )
			// WhileGrammar.g:32:8: ( input_stub )?
			{
			// WhileGrammar.g:32:8: ( input_stub )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==VARIABLE) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// WhileGrammar.g:32:8: input_stub
					{
					pushFollow(FOLLOW_input_stub_in_input299);
					input_stub();
					state._fsp--;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "input"


	public static class input_stub_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "input_stub"
	// WhileGrammar.g:33:1: input_stub : VARIABLE ( ',' input_stub )? ;
	public final WhileGrammarParser.input_stub_return input_stub() throws RecognitionException {
		WhileGrammarParser.input_stub_return retval = new WhileGrammarParser.input_stub_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:33:11: ( VARIABLE ( ',' input_stub )? )
			// WhileGrammar.g:33:13: VARIABLE ( ',' input_stub )?
			{
			match(input,VARIABLE,FOLLOW_VARIABLE_in_input_stub306); 
			// WhileGrammar.g:33:22: ( ',' input_stub )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==15) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// WhileGrammar.g:33:23: ',' input_stub
					{
					match(input,15,FOLLOW_15_in_input_stub309); 
					pushFollow(FOLLOW_input_stub_in_input_stub311);
					input_stub();
					state._fsp--;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "input_stub"


	public static class output_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "output"
	// WhileGrammar.g:34:1: output : VARIABLE ( ',' output )? ;
	public final WhileGrammarParser.output_return output() throws RecognitionException {
		WhileGrammarParser.output_return retval = new WhileGrammarParser.output_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:34:7: ( VARIABLE ( ',' output )? )
			// WhileGrammar.g:34:9: VARIABLE ( ',' output )?
			{
			match(input,VARIABLE,FOLLOW_VARIABLE_in_output319); 
			// WhileGrammar.g:34:18: ( ',' output )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==15) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// WhileGrammar.g:34:19: ',' output
					{
					match(input,15,FOLLOW_15_in_output322); 
					pushFollow(FOLLOW_output_in_output324);
					output();
					state._fsp--;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "output"


	public static class vars_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "vars"
	// WhileGrammar.g:36:1: vars : VARIABLE ( ',' vars )? ;
	public final WhileGrammarParser.vars_return vars() throws RecognitionException {
		WhileGrammarParser.vars_return retval = new WhileGrammarParser.vars_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:36:5: ( VARIABLE ( ',' vars )? )
			// WhileGrammar.g:36:7: VARIABLE ( ',' vars )?
			{
			match(input,VARIABLE,FOLLOW_VARIABLE_in_vars333); 
			// WhileGrammar.g:36:16: ( ',' vars )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==15) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// WhileGrammar.g:36:17: ',' vars
					{
					match(input,15,FOLLOW_15_in_vars336); 
					pushFollow(FOLLOW_vars_in_vars338);
					vars();
					state._fsp--;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "vars"


	public static class commands_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "commands"
	// WhileGrammar.g:38:1: commands : command ( ';' commands )? ;
	public final WhileGrammarParser.commands_return commands() throws RecognitionException {
		WhileGrammarParser.commands_return retval = new WhileGrammarParser.commands_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:38:9: ( command ( ';' commands )? )
			// WhileGrammar.g:38:11: command ( ';' commands )?
			{
			pushFollow(FOLLOW_command_in_commands347);
			command();
			state._fsp--;

			// WhileGrammar.g:38:19: ( ';' commands )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==18) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// WhileGrammar.g:38:20: ';' commands
					{
					match(input,18,FOLLOW_18_in_commands350); 
					pushFollow(FOLLOW_commands_in_commands352);
					commands();
					state._fsp--;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "commands"


	public static class exprs_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "exprs"
	// WhileGrammar.g:40:1: exprs : expression ( ',' exprs )? ;
	public final WhileGrammarParser.exprs_return exprs() throws RecognitionException {
		WhileGrammarParser.exprs_return retval = new WhileGrammarParser.exprs_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:40:6: ( expression ( ',' exprs )? )
			// WhileGrammar.g:40:8: expression ( ',' exprs )?
			{
			pushFollow(FOLLOW_expression_in_exprs361);
			expression();
			state._fsp--;

			// WhileGrammar.g:40:19: ( ',' exprs )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==15) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// WhileGrammar.g:40:20: ',' exprs
					{
					match(input,15,FOLLOW_15_in_exprs364); 
					pushFollow(FOLLOW_exprs_in_exprs366);
					exprs();
					state._fsp--;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprs"


	public static class command_vars_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "command_vars"
	// WhileGrammar.g:42:1: command_vars : vars ':=' exprs ;
	public final WhileGrammarParser.command_vars_return command_vars() throws RecognitionException {
		WhileGrammarParser.command_vars_return retval = new WhileGrammarParser.command_vars_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:42:13: ( vars ':=' exprs )
			// WhileGrammar.g:42:15: vars ':=' exprs
			{
			pushFollow(FOLLOW_vars_in_command_vars375);
			vars();
			state._fsp--;

			match(input,17,FOLLOW_17_in_command_vars377); 
			pushFollow(FOLLOW_exprs_in_command_vars379);
			exprs();
			state._fsp--;

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command_vars"


	public static class command_if_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "command_if"
	// WhileGrammar.g:43:1: command_if : 'if' expression 'then' commands ( 'else' commands )? 'fi' ;
	public final WhileGrammarParser.command_if_return command_if() throws RecognitionException {
		WhileGrammarParser.command_if_return retval = new WhileGrammarParser.command_if_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:43:11: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
			// WhileGrammar.g:43:13: 'if' expression 'then' commands ( 'else' commands )? 'fi'
			{
			match(input,28,FOLLOW_28_in_command_if385); 
			pushFollow(FOLLOW_expression_in_command_if387);
			expression();
			state._fsp--;

			match(input,35,FOLLOW_35_in_command_if389); 
			pushFollow(FOLLOW_commands_in_command_if391);
			commands();
			state._fsp--;

			// WhileGrammar.g:43:45: ( 'else' commands )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==22) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// WhileGrammar.g:43:46: 'else' commands
					{
					match(input,22,FOLLOW_22_in_command_if394); 
					pushFollow(FOLLOW_commands_in_command_if396);
					commands();
					state._fsp--;

					}
					break;

			}

			match(input,23,FOLLOW_23_in_command_if400); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command_if"


	public static class command_while_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "command_while"
	// WhileGrammar.g:44:1: command_while : 'while' expression 'do' commands 'od' ;
	public final WhileGrammarParser.command_while_return command_while() throws RecognitionException {
		WhileGrammarParser.command_while_return retval = new WhileGrammarParser.command_while_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:44:14: ( 'while' expression 'do' commands 'od' )
			// WhileGrammar.g:44:16: 'while' expression 'do' commands 'od'
			{
			match(input,37,FOLLOW_37_in_command_while406); 
			pushFollow(FOLLOW_expression_in_command_while408);
			expression();
			state._fsp--;

			match(input,21,FOLLOW_21_in_command_while410); 
			pushFollow(FOLLOW_commands_in_command_while412);
			commands();
			state._fsp--;

			match(input,33,FOLLOW_33_in_command_while414); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command_while"


	public static class command_for_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "command_for"
	// WhileGrammar.g:45:1: command_for : 'for' expression 'do' commands 'od' ;
	public final WhileGrammarParser.command_for_return command_for() throws RecognitionException {
		WhileGrammarParser.command_for_return retval = new WhileGrammarParser.command_for_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:45:12: ( 'for' expression 'do' commands 'od' )
			// WhileGrammar.g:45:14: 'for' expression 'do' commands 'od'
			{
			match(input,24,FOLLOW_24_in_command_for420); 
			pushFollow(FOLLOW_expression_in_command_for422);
			expression();
			state._fsp--;

			match(input,21,FOLLOW_21_in_command_for424); 
			pushFollow(FOLLOW_commands_in_command_for426);
			commands();
			state._fsp--;

			match(input,33,FOLLOW_33_in_command_for428); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command_for"


	public static class command_foreach_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "command_foreach"
	// WhileGrammar.g:46:1: command_foreach : 'foreach' VARIABLE 'in' expression 'do' commands 'od' ;
	public final WhileGrammarParser.command_foreach_return command_foreach() throws RecognitionException {
		WhileGrammarParser.command_foreach_return retval = new WhileGrammarParser.command_foreach_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:46:16: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
			// WhileGrammar.g:46:18: 'foreach' VARIABLE 'in' expression 'do' commands 'od'
			{
			match(input,25,FOLLOW_25_in_command_foreach434); 
			match(input,VARIABLE,FOLLOW_VARIABLE_in_command_foreach436); 
			match(input,29,FOLLOW_29_in_command_foreach438); 
			pushFollow(FOLLOW_expression_in_command_foreach440);
			expression();
			state._fsp--;

			match(input,21,FOLLOW_21_in_command_foreach442); 
			pushFollow(FOLLOW_commands_in_command_foreach444);
			commands();
			state._fsp--;

			match(input,33,FOLLOW_33_in_command_foreach446); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command_foreach"


	public static class command_nop_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "command_nop"
	// WhileGrammar.g:47:1: command_nop : 'nop' ;
	public final WhileGrammarParser.command_nop_return command_nop() throws RecognitionException {
		WhileGrammarParser.command_nop_return retval = new WhileGrammarParser.command_nop_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:47:12: ( 'nop' )
			// WhileGrammar.g:47:14: 'nop'
			{
			match(input,32,FOLLOW_32_in_command_nop452); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command_nop"


	public static class command_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "command"
	// WhileGrammar.g:49:1: command : ( command_if | command_while | command_for | command_foreach | command_vars | command_nop );
	public final WhileGrammarParser.command_return command() throws RecognitionException {
		WhileGrammarParser.command_return retval = new WhileGrammarParser.command_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:49:8: ( command_if | command_while | command_for | command_foreach | command_vars | command_nop )
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
					// WhileGrammar.g:49:10: command_if
					{
					pushFollow(FOLLOW_command_if_in_command459);
					command_if();
					state._fsp--;

					}
					break;
				case 2 :
					// WhileGrammar.g:50:11: command_while
					{
					pushFollow(FOLLOW_command_while_in_command472);
					command_while();
					state._fsp--;

					}
					break;
				case 3 :
					// WhileGrammar.g:51:11: command_for
					{
					pushFollow(FOLLOW_command_for_in_command485);
					command_for();
					state._fsp--;

					}
					break;
				case 4 :
					// WhileGrammar.g:52:11: command_foreach
					{
					pushFollow(FOLLOW_command_foreach_in_command498);
					command_foreach();
					state._fsp--;

					}
					break;
				case 5 :
					// WhileGrammar.g:53:11: command_vars
					{
					pushFollow(FOLLOW_command_vars_in_command510);
					command_vars();
					state._fsp--;

					}
					break;
				case 6 :
					// WhileGrammar.g:54:11: command_nop
					{
					pushFollow(FOLLOW_command_nop_in_command522);
					command_nop();
					state._fsp--;

					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command"


	public static class exprbase1_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "exprbase1"
	// WhileGrammar.g:57:1: exprbase1 : ( 'nil' | VARIABLE | SYMBOL );
	public final WhileGrammarParser.exprbase1_return exprbase1() throws RecognitionException {
		WhileGrammarParser.exprbase1_return retval = new WhileGrammarParser.exprbase1_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:57:10: ( 'nil' | VARIABLE | SYMBOL )
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

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprbase1"


	public static class expr_constructor_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr_constructor"
	// WhileGrammar.g:58:1: expr_constructor : ( 'cons' | 'list' ) lexpr ;
	public final WhileGrammarParser.expr_constructor_return expr_constructor() throws RecognitionException {
		WhileGrammarParser.expr_constructor_return retval = new WhileGrammarParser.expr_constructor_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:58:17: ( ( 'cons' | 'list' ) lexpr )
			// WhileGrammar.g:58:19: ( 'cons' | 'list' ) lexpr
			{
			if ( input.LA(1)==20||input.LA(1)==30 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_lexpr_in_expr_constructor558);
			lexpr();
			state._fsp--;

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_constructor"


	public static class exprbase3_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "exprbase3"
	// WhileGrammar.g:59:1: exprbase3 : ( 'hd' | 'tl' ) exprbase ;
	public final WhileGrammarParser.exprbase3_return exprbase3() throws RecognitionException {
		WhileGrammarParser.exprbase3_return retval = new WhileGrammarParser.exprbase3_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:59:10: ( ( 'hd' | 'tl' ) exprbase )
			// WhileGrammar.g:59:12: ( 'hd' | 'tl' ) exprbase
			{
			if ( input.LA(1)==27||input.LA(1)==36 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_exprbase_in_exprbase3570);
			exprbase();
			state._fsp--;

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprbase3"


	public static class expr_call_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr_call"
	// WhileGrammar.g:60:1: expr_call : SYMBOL lexpr ;
	public final WhileGrammarParser.expr_call_return expr_call() throws RecognitionException {
		WhileGrammarParser.expr_call_return retval = new WhileGrammarParser.expr_call_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:60:10: ( SYMBOL lexpr )
			// WhileGrammar.g:60:12: SYMBOL lexpr
			{
			match(input,SYMBOL,FOLLOW_SYMBOL_in_expr_call576); 
			pushFollow(FOLLOW_lexpr_in_expr_call578);
			lexpr();
			state._fsp--;

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_call"


	public static class exprbase_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "exprbase"
	// WhileGrammar.g:62:1: exprbase : ( exprbase1 | ( '(' ( expr_constructor | exprbase3 | expr_call ) ')' ) );
	public final WhileGrammarParser.exprbase_return exprbase() throws RecognitionException {
		WhileGrammarParser.exprbase_return retval = new WhileGrammarParser.exprbase_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:62:9: ( exprbase1 | ( '(' ( expr_constructor | exprbase3 | expr_call ) ')' ) )
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
					// WhileGrammar.g:62:11: exprbase1
					{
					pushFollow(FOLLOW_exprbase1_in_exprbase585);
					exprbase1();
					state._fsp--;

					}
					break;
				case 2 :
					// WhileGrammar.g:62:23: ( '(' ( expr_constructor | exprbase3 | expr_call ) ')' )
					{
					// WhileGrammar.g:62:23: ( '(' ( expr_constructor | exprbase3 | expr_call ) ')' )
					// WhileGrammar.g:62:25: '(' ( expr_constructor | exprbase3 | expr_call ) ')'
					{
					match(input,13,FOLLOW_13_in_exprbase591); 
					// WhileGrammar.g:62:29: ( expr_constructor | exprbase3 | expr_call )
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
							// WhileGrammar.g:62:30: expr_constructor
							{
							pushFollow(FOLLOW_expr_constructor_in_exprbase594);
							expr_constructor();
							state._fsp--;

							}
							break;
						case 2 :
							// WhileGrammar.g:62:49: exprbase3
							{
							pushFollow(FOLLOW_exprbase3_in_exprbase598);
							exprbase3();
							state._fsp--;

							}
							break;
						case 3 :
							// WhileGrammar.g:62:61: expr_call
							{
							pushFollow(FOLLOW_expr_call_in_exprbase602);
							expr_call();
							state._fsp--;

							}
							break;

					}

					match(input,14,FOLLOW_14_in_exprbase605); 
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exprbase"


	public static class expression_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expression"
	// WhileGrammar.g:64:1: expression : exprbase ( '=?' exprbase )? ;
	public final WhileGrammarParser.expression_return expression() throws RecognitionException {
		WhileGrammarParser.expression_return retval = new WhileGrammarParser.expression_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:64:11: ( exprbase ( '=?' exprbase )? )
			// WhileGrammar.g:64:13: exprbase ( '=?' exprbase )?
			{
			pushFollow(FOLLOW_exprbase_in_expression614);
			exprbase();
			state._fsp--;

			// WhileGrammar.g:64:22: ( '=?' exprbase )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==19) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// WhileGrammar.g:64:23: '=?' exprbase
					{
					match(input,19,FOLLOW_19_in_expression617); 
					pushFollow(FOLLOW_exprbase_in_expression619);
					exprbase();
					state._fsp--;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class lexpr_return extends ParserRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "lexpr"
	// WhileGrammar.g:66:1: lexpr : ( exprbase lexpr )? ;
	public final WhileGrammarParser.lexpr_return lexpr() throws RecognitionException {
		WhileGrammarParser.lexpr_return retval = new WhileGrammarParser.lexpr_return();
		retval.start = input.LT(1);

		try {
			// WhileGrammar.g:66:6: ( ( exprbase lexpr )? )
			// WhileGrammar.g:66:8: ( exprbase lexpr )?
			{
			// WhileGrammar.g:66:8: ( exprbase lexpr )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( ((LA13_0 >= SYMBOL && LA13_0 <= VARIABLE)||LA13_0==13||LA13_0==31) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// WhileGrammar.g:66:9: exprbase lexpr
					{
					pushFollow(FOLLOW_exprbase_in_lexpr629);
					exprbase();
					state._fsp--;

					pushFollow(FOLLOW_lexpr_in_lexpr631);
					lexpr();
					state._fsp--;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lexpr"

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program258 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_program_in_program261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_function269 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_SYMBOL_in_function271 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_function273 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_definition_in_function275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_definition281 = new BitSet(new long[]{0x0000000000001400L});
	public static final BitSet FOLLOW_input_in_definition283 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_definition285 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_definition287 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_definition289 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_definition291 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_output_in_definition293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_input_stub_in_input299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_input_stub306 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_input_stub309 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_input_stub_in_input_stub311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_output319 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_output322 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_output_in_output324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_vars333 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_vars336 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_vars_in_vars338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands347 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_commands350 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_commands352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs361 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_exprs364 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_exprs_in_exprs366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command_vars375 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_command_vars377 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_exprs_in_command_vars379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_command_if385 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_expression_in_command_if387 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_command_if389 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_if391 = new BitSet(new long[]{0x0000000000C00000L});
	public static final BitSet FOLLOW_22_in_command_if394 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_if396 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_command_if400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_command_while406 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_expression_in_command_while408 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_command_while410 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_while412 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command_while414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_command_for420 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_expression_in_command_for422 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_command_for424 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_for426 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command_for428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_command_foreach434 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_VARIABLE_in_command_foreach436 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_command_foreach438 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_expression_in_command_foreach440 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_command_foreach442 = new BitSet(new long[]{0x0000002113000400L});
	public static final BitSet FOLLOW_commands_in_command_foreach444 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command_foreach446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_command_nop452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_if_in_command459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_while_in_command472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_for_in_command485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_foreach_in_command498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_vars_in_command510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_nop_in_command522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_expr_constructor552 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_lexpr_in_expr_constructor558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_exprbase3564 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_exprbase_in_exprbase3570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_expr_call576 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_lexpr_in_expr_call578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase1_in_exprbase585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_exprbase591 = new BitSet(new long[]{0x0000001048100200L});
	public static final BitSet FOLLOW_expr_constructor_in_exprbase594 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_exprbase3_in_exprbase598 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_expr_call_in_exprbase602 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_exprbase605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_expression614 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_expression617 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_exprbase_in_expression619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprbase_in_lexpr629 = new BitSet(new long[]{0x0000000080002600L});
	public static final BitSet FOLLOW_lexpr_in_lexpr631 = new BitSet(new long[]{0x0000000000000002L});
}
