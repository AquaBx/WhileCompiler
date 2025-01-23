package while_compiler.Visitor;

import antlr.WhileGrammarLexer;
import org.antlr.runtime.tree.Tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class Visitor {
    public abstract void visit_program(Tree program) throws Exception;

    protected abstract void visit_function(Tree tree) throws Exception;

    protected abstract void visit_inputs(Tree tree);

    protected abstract void visit_outputs(Tree tree);

    protected abstract void visit_nop(Tree tree);

    protected abstract void visit_expr_symbol(Tree tree);

    protected abstract void visit_expr_variable(Tree tree);

    protected abstract void visit_expr_nil(Tree tree);

    protected abstract void visit_expr_constructor_list(Tree tree) throws Exception;

    protected abstract void visit_expr_constructor_cons(Tree tree) throws Exception;

    protected abstract void visit_expr_call(Tree tree) throws Exception;

    protected abstract void visit_expr_compare(Tree tree) throws Exception;

    protected abstract void visit_variables(Tree tree);

    protected void visit_expr_head(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.EXPR_HEAD, tree.getType());

        visit_expression(tree.getChild(0));
    }

    protected void visit_expr_tail(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.EXPR_TAIL, tree.getType());

        visit_expression(tree.getChild(0));
    }

    protected void visit_command(Tree command) throws Exception {
        if (command.getType() == WhileGrammarLexer.IF) {
            visit_if(command);
        } else if (command.getType() == WhileGrammarLexer.WHILE) {
            visit_while(command);
        } else if (command.getType() == WhileGrammarLexer.FOR) {
            visit_for(command);
        } else if (command.getType() == WhileGrammarLexer.FOREACH) {
            visit_foreach(command);
        } else if (command.getType() == WhileGrammarLexer.ASSIGNMENT) {
            visit_assignement(command);
        } else if (command.getType() == WhileGrammarLexer.NOP) {
            visit_nop(command);
        }
    }

    protected void visit_expression(Tree expression) throws Exception {
        if (expression.getType() == WhileGrammarLexer.EXPR_SYMBOL) {
            visit_expr_symbol(expression);
        } else if (expression.getType() == WhileGrammarLexer.EXPR_VARIABLE) {
            visit_expr_variable(expression);
        } else if (expression.getType() == WhileGrammarLexer.EXPR_NIL) {
            visit_expr_nil(expression);
        } else if (expression.getType() == WhileGrammarLexer.EXPR_CONSTRUCTOR_LIST) {
            visit_expr_constructor_list(expression);
        } else if (expression.getType() == WhileGrammarLexer.EXPR_CONSTRUCTOR_CONS) {
            visit_expr_constructor_cons(expression);
        } else if (expression.getType() == WhileGrammarLexer.EXPR_HEAD) {
            visit_expr_head(expression);
        } else if (expression.getType() == WhileGrammarLexer.EXPR_TAIL) {
            visit_expr_tail(expression);
        } else if (expression.getType() == WhileGrammarLexer.EXPR_CALL) {
            visit_expr_call(expression);
        } else if (expression.getType() == WhileGrammarLexer.EXPR_COMPARE) {
            visit_expr_compare(expression);
        }
    }

    protected void visit_expressions(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.EXPRESSIONS, tree.getType());

        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree expression = tree.getChild(i);
            visit_expression(expression);
        }
    }

    protected void visit_commands(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.COMMANDS, tree.getType());

        for (int i = 0; i < tree.getChildCount(); i++) {
            visit_command(tree.getChild(i));
        }
    }

    protected void visit_if(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.IF, tree.getType());

        visit_expression(tree.getChild(0));

        for (int i = 1; i < tree.getChildCount(); i++) {
            visit_commands(tree.getChild(i));
        }
    }

    protected void visit_while(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.WHILE, tree.getType());

        visit_expression(tree.getChild(0));
        visit_commands(tree.getChild(1));
    }

    protected void visit_for(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.FOR, tree.getType());

        visit_expression(tree.getChild(0));
        visit_commands(tree.getChild(1));
    }

    protected void visit_assignement(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.ASSIGNMENT, tree.getType());

        // Important: we visit expressions before the variables
        visit_expressions(tree.getChild(1));
        visit_variables(tree.getChild(0));
    }

    protected void visit_foreach(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.FOREACH, tree.getType());

        visit_expression(tree.getChild(1));
        visit_commands(tree.getChild(2));
    }

}