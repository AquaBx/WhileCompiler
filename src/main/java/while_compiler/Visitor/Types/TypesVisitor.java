package while_compiler.Visitor.Types;

import antlr.WhileGrammarLexer;
import org.antlr.runtime.tree.Tree;
import while_compiler.FunctionSignature;
import while_compiler.LibraryFunctions;
import while_compiler.Visitor.Visitor;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TypesVisitor extends Visitor {

    HashMap<String, FunctionSignature> functionSignatures = new HashMap<>();

    @Override
    public void visit_program(Tree program) throws Exception {

        LibraryFunctions.addTo(functionSignatures, FunctionSignature::new);

        for (int i = 0; i < program.getChildCount(); i++) {
            Tree function = program.getChild(i);

            int input = function.getChild(1).getChildCount();
            int output = function.getChild(2).getChildCount();

            String function_name = function.getChild(0).getText();

            // Push Function signature in functionSignatures
            functionSignatures.put(function_name, new FunctionSignature(function_name, input, output));
        }

        // visit each function
        for (int i = 0; i < program.getChildCount(); i++) {
            visit_function(program.getChild(i));
        }
    }

    @Override
    protected void visit_function(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.FUNCTION, tree.getType());

        // Visit Commands
        visit_commands(tree.getChild(3));

    }

    protected Integer visit_expression2(Tree expression) throws Exception {
        if (expression.getType() == WhileGrammarLexer.EXPR_CALL) {
            visit_expr_call(expression);
            return functionSignatures.get(expression.getChild(0).getText()).getOutputs();
        } else {
            return 1;
        }
    }

    protected Integer visit_expressions2(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.EXPRESSIONS, tree.getType());
        Integer sum = 0;
        for (int i = 0; i < tree.getChildCount(); i++) {
            Tree expression = tree.getChild(i);
            sum += visit_expression2(expression);
        }
        return sum;
    }

    @Override
    protected void visit_assignement(Tree tree) throws Exception {
        assertEquals(WhileGrammarLexer.ASSIGNMENT, tree.getType());

        // Important: we visit expressions before the variables
        Integer nbVariables = tree.getChild(0).getChildCount();
        Integer nbExpressions = visit_expressions2(tree.getChild(1));

        if (!nbVariables.equals(nbExpressions)) {
            throw new Exception(
                    String.format("%s variables and %s expressions on assignment", nbVariables, nbExpressions));
        }
        visit_expressions(tree.getChild(1));
    }

    @Override
    protected void visit_expr_call(Tree tree) throws Exception {
        int nbParameters = visit_expressions2(tree.getChild(1));
        int nbRequired = functionSignatures.get(tree.getChild(0).getText()).getInputs();
        if (nbRequired != nbParameters) {
            throw new Exception(String.format("%d parameters provided instead of %d in %s", nbParameters, nbRequired,
                    tree.getChild(0).getText()));
        }
    }

    @Override
    protected void visit_expr_compare(Tree tree) {
    }

    @Override
    protected void visit_variables(Tree tree) {
    }

    @Override
    protected void visit_nop(Tree tree) {
    }

    @Override
    protected void visit_expr_symbol(Tree tree) {
    }

    @Override
    protected void visit_expr_variable(Tree tree) {
    }

    @Override
    protected void visit_expr_nil(Tree tree) {
    }

    @Override
    protected void visit_expr_constructor_list(Tree tree) {
    }

    @Override
    protected void visit_expr_constructor_cons(Tree tree) throws Exception {
        Tree listExpressions = tree.getChild(0);
        visit_expressions(listExpressions);
    }

    @Override
    protected void visit_inputs(Tree tree) {
    }

    @Override
    protected void visit_outputs(Tree tree) {
    }
}