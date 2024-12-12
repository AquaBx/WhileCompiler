grammar WhileGrammar;

options {
    output=AST; // Configure ANTLR pour générer un AST
    backtrack=true;
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
    EXPR_CHILD;
    EXPR_CONSTRUCTOR;
    EXPR_PRIMITIVE;
    EXPRS;
    EXPR_CHILD_RIGHT;
    EXPR_CHILD_LEFT;
    EXPR_CONSTRUCTOR_LIST;
    EXPR_CONSTRUCTOR_CONS;
    EXPR_NIL;
    EXPR_VARIABLE;
    EXPR_SYMBOL;
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
    
program: function*;

function: 'function' SYMBOL ':' definition -> ^(FUNCTION SYMBOL definition);
definition: 'read' i=io '%' c=commands '%' 'write' o=io -> ^(INPUT $i) ^(OUTPUT $o) $c;
io: VARIABLE? (',' VARIABLE)* -> VARIABLE*;

vars: v=VARIABLE (',' var=VARIABLE)* -> ^(VARS $v $var?);

commands: command (';' command)*
    -> ^(COMMANDS command*)
;

exprs: expression (',' c=expression)*
    -> ^(EXPRS expression $c?)
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

exprbase_symbol: a=SYMBOL
 -> ^(EXPR_SYMBOL $a)
;

exprbase_variable: a=VARIABLE
 -> ^(EXPR_VARIABLE $a)
;

exprbase_nil: 'nil'
 -> ^(EXPR_NIL)
;

expr_constructor_list: '(' 'list' lexpr ')' 
 -> ^(EXPR_CONSTRUCTOR_LIST lexpr)
;

expr_constructor_cons: '(' 'cons' lexpr ')' 
 -> ^(EXPR_CONSTRUCTOR_CONS lexpr )
;

exprbasechildleft: '(' 'hd' exprbase ')' 
 -> ^(EXPR_CHILD_LEFT exprbase)
;

exprbasechildright: '(' 'tl' exprbase ')' 
 -> ^(EXPR_CHILD_RIGHT exprbase)
;

expr_call: '(' a=SYMBOL lexpr ')'
 -> ^(EXPR_CALL $a lexpr)
;

exprbase: exprbase_nil | exprbase_variable | expr_constructor_list | expr_constructor_cons | exprbasechildleft  | exprbasechildright |  expr_call | exprbase_symbol;

expression_a: c=exprbase '=?' d=exprbase
    -> ^(EXPRESSION $c $d)
;

expression: expression_a | exprbase
;

lexpr: exprbase* -> ^(LEXPR exprbase*);


