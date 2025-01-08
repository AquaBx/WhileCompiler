package org.esir.nctt.while_compiler;
import org.antlr.runtime.tree.Tree;

public abstract class Visitor {
    public abstract void visit_program(Tree program);
    protected abstract void visit_function(Tree tree);
    protected abstract void visit_inputs(Tree tree);
    protected abstract void visit_outputs(Tree tree);
    protected abstract void visit_commands(Tree tree);
    protected abstract void visit_if(Tree tree);
    protected abstract void visit_while(Tree tree);
    protected abstract void visit_for(Tree tree);
    protected abstract void visit_foreach(Tree tree);
    protected abstract void visit_assignement(Tree tree);
    protected abstract void visit_nop(Tree tree);
    protected abstract void visit_command(Tree command);
    protected abstract void visit_expr_symbol(Tree tree);
    protected abstract void visit_expr_variable(Tree tree);
    protected abstract void visit_expr_nil(Tree tree);
    protected abstract void visit_expr_construcor_list(Tree tree);
    protected abstract void visit_expr_construcor_cons(Tree tree);
    protected abstract void visit_expr_head(Tree tree);
    protected abstract void visit_expr_tail(Tree tree);
    protected abstract void visit_expr_call(Tree tree);
    protected abstract void visit_expr_compare(Tree tree);
    protected abstract void visit_expression(Tree expression);
    protected abstract void visit_expressions(Tree tree);
    protected abstract void visit_variables(Tree tree);
}