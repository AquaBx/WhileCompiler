grammar WhileGrammar;

options {
    output=AST; // Configure ANTLR pour générer un AST
}

tokens {
    PROGRAM;
    FUNCTION;
    DEFINITION;
    WHILE;
    FOR;
    IF;
    ASSIGMENT;
    VARS;
    COMMANDS;
    FOREACH;
    INPUT;
    INPUT_STUB;
    OUTPUT;
    EXPR_BASE;
    EXPRESSION;
    LEXPR;
    EXPR_CALL;
    COMMAND_NOP;
    EXPR_BASE1;
    EXPR_CONSTRUCTOR;
    EXPR_BASE3;
    EXPRS;
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
    
program: function (program)? 
    -> ^(PROGRAM function program?);
function: 'function' SYMBOL ':' definition -> ^(FUNCTION SYMBOL definition);
definition: 'read' input '%' commands '%' 'write' output -> ^(DEFINITION input commands output);
input: i=input_stub? -> ^(INPUT $i?);
input_stub: v=VARIABLE (',' tail=input_stub)? -> ^(INPUT_STUB $v $tail?);
output: v=VARIABLE (',' tail=output)? -> ^(OUTPUT $v $tail?);

vars: v=VARIABLE (',' var=vars)? -> ^(VARS $v $var?);

commands: c=command (';' cs=commands)? 
    -> ^(COMMANDS $c $cs?)
;

exprs: e=expression (',' exp=exprs)?
    -> ^(EXPRS $e $exp?)
;

command_vars: vars ':=' exprs -> ^(ASSIGMENT vars exprs);
command_if: 'if' expression 'then' b1=commands ('else' b2=commands)? 'fi' -> ^(IF expression $b1 $b2?);
command_while: 'while' expression 'do' commands 'od' -> ^(WHILE expression commands);
command_for: 'for' expression 'do' commands 'od' -> ^(FOR expression commands);
command_foreach: 'foreach' v=VARIABLE 'in' expression 'do' commands 'od' -> ^(FOREACH $v expression commands);
command_nop: 'nop' -> ^(COMMAND_NOP)
;

command: command_if 
        | command_while 
        | command_for 
        | command_foreach
        | command_vars
        | command_nop

        ;

exprbase1: a=('nil' | VARIABLE | SYMBOL)
 -> ^(EXPR_BASE1 $a)
;
expr_constructor: a=('cons'|'list') lexpr
 -> ^(EXPR_CONSTRUCTOR $a lexpr)
;
exprbase3: a=('hd'|'tl') exprbase
 -> ^(EXPR_BASE3 $a exprbase)

;
expr_call: SYMBOL lexpr
 -> ^(EXPR_CALL SYMBOL lexpr)
;

exprbase: 
    (exprbase1 -> ^(EXPR_BASE exprbase1) ) 
    | ('(' c=(expr_constructor | exprbase3 | expr_call) ')' -> ^(EXPR_BASE $c) )
;

expression: c=exprbase ('=?' d=exprbase)?
    -> ^(EXPRESSION $c $d?)
;

lexpr: (exprbase lexpr -> ^(LEXPR exprbase lexpr))?;


