#include "../build/list_build.cpp"
#include "tools.h"

void test_case_1()
{
    Tools::assert_equals(fun_listnil().getHead().isNil(), true, "Devrait être nil");
}

void test_case_2()
{
    WhileStandard::Tree retour = fun_listone().getHead();
    Tools::assert_equals(retour.getHead().getSymbol(), std::string("a"), "Devrait être a");
}

void test_case_3()
{
    WhileStandard::Tree retour = fun_listtwo().getHead();
    Tools::assert_equals(retour.getHead().getSymbol(), std::string("a"), "Devrait être a");
    Tools::assert_equals(retour.getTail().getHead().getSymbol(), std::string("b"), "Devrait être b");
}

void test_case_5()
{
    Tools::assert_equals(static_cast<std::string>(fun_listnine()), std::string("abcdefghi"), "Devrait être abcdefghi");
}

int main(int argc, char **argv)
{
    int result = 0;
    result += Tools::test("Description : list nil", test_case_1);
    result += Tools::test("Description : list 1 param", test_case_2);
    result += Tools::test("Description : list 2 params", test_case_3);
    result += Tools::test("Description : list 9 params", test_case_5);
    return result;
}