#include "../build/cons_build.cpp"
#include "tools.h"

void test_case_1()
{
    Tools::assert_equals(fun_consnil().getHead().isNil(), true, "Devrait être nil");
}

void test_case_2()
{
    Tools::assert_equals(fun_consone().getHead().getSymbol(), std::string("a"), "Devrait être a");
}

void test_case_3()
{
    WhileStandard::Tree retour = fun_constwo().getHead();
    Tools::assert_equals(retour.getHead().getSymbol(), std::string("a"), "Devrait être a");
    Tools::assert_equals(retour.getTail().getSymbol(), std::string("b"), "Devrait être b");
}

void test_case_4()
{
    WhileStandard::Tree retour = fun_consthree().getHead();
    WhileStandard::Tree head = retour.getTail();
    Tools::assert_equals(retour.getHead().getSymbol(), std::string("a"), "Devrait être a");
    Tools::assert_equals(head.getHead().getSymbol(), std::string("b"), "Devrait être b");
    Tools::assert_equals(head.getTail().getSymbol(), std::string("c"), "Devrait être c");
}

void test_case_5()
{
    Tools::assert_equals(static_cast<std::string>(fun_consnine()), std::string("abcdefghi"), "Devrait être abcdefghi");
}

int main(int argc, char **argv)
{
    int result = 0;
    result += Tools::test("Description : cons nil", test_case_1);
    result += Tools::test("Description : cons copy", test_case_2);
    result += Tools::test("Description : cons normal", test_case_3);
    result += Tools::test("Description : cons 3 params", test_case_4);
    result += Tools::test("Description : cons 9 params", test_case_5);
    return result;
}