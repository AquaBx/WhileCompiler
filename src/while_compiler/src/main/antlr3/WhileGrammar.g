grammar WhileGrammar;

options {
    output=AST; // Configure ANTLR pour générer un AST
}

@parser::header
{ package org.esir.nctt.antlr; }
@lexer::header
{ package org.esir.nctt.antlr; }

fragment DEC: '0'..'9';
fragment MAJ : 'A'..'Z';
fragment MIN : 'a'..'z';

VARIABLE : MAJ (MAJ | MIN | DEC)* ('!'|'?')?;
SYMBOL: MIN (MAJ | MIN | DEC)*('!'|'?')?;

IDENT: ( 'a'..'z'|'A'..'Z'|'_' ) ( 'a'..'z'|'A'..'Z'|'0'..'9'|'_' )*;

WS: (' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;
    
program: function (program)?;
function: 'function' SYMBOL ':' definition;
definition: 'read' input '%' commands '%' 'write' output;
input: input_stub?;
input_stub: VARIABLE (',' input_stub)?;
output: VARIABLE (',' output)?;

vars: VARIABLE (',' vars)?;

commands: command (';' commands)?;

exprs: expression (',' exprs)?;

command_vars: vars ':=' exprs;
command_if: 'if' expression 'then' commands ('else' commands)? 'fi';
command_while: 'while' expression 'do' commands 'od';
command_for: 'for' expression 'do' commands 'od';
command_foreach: 'foreach' VARIABLE 'in' expression 'do' commands 'od';
command_nop: 'nop';

command: command_if 
        | command_while 
        | command_for 
        | command_foreach
        | command_vars
        | command_nop
        ;

exprbase1: 'nil' | VARIABLE | SYMBOL;
expr_constructor: ('cons'|'list') lexpr;
exprbase3: ('hd'|'tl') exprbase;
expr_call: SYMBOL lexpr;

exprbase: exprbase1 | ( '(' (expr_constructor | exprbase3 | expr_call) ')' );

expression: exprbase ('=?' exprbase)?;

lexpr: (exprbase lexpr)?;