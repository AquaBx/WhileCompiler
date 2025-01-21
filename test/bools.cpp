#include "../build/bools_build.cpp"
#include "tools.h"

void test_case_true()
{
    WhileStandard::Tree vTrue = fun_true().getHead();
    Tools::assert_equals(vTrue.isNil(), false, "Valeur true pas bon");
}

void test_case_false()
{
    WhileStandard::Tree vFalse = fun_false().getHead();
    Tools::assert_equals(vFalse.isNil(), true, "Valeur false pas bon");
}

void test_case_not()
{
    WhileStandard::Tree vFalse = fun_false().getHead();
    WhileStandard::Tree vTrue = fun_not(vFalse).getHead();
    WhileStandard::Tree vFalse2 = fun_not(vTrue).getHead();

    Tools::assert_equals(vFalse.isNil(), true, "Valeur false a été changé");
    Tools::assert_equals(vTrue.isNil(), false, "Valeur not pas bon");
    Tools::assert_equals(vTrue.isNil(), false, "Valeur true a été changé");
    Tools::assert_equals(vFalse2.isNil(), true, "Valeur false2 pas bonne");
}

void test_case_and()
{
    WhileStandard::Tree vFalse = fun_false().getHead();
    WhileStandard::Tree vTrue = fun_true().getHead();

    Tools::assert_equals(fun_and(vFalse, vFalse).getHead().isNil(), true, "1 Devrait être false");
    Tools::assert_equals(fun_and(vFalse, vTrue).getHead().isNil(), true, "2 Devrait être false");
    Tools::assert_equals(fun_and(vTrue, vFalse).getHead().isNil(), true, "3 Devrait être false");
    Tools::assert_equals(fun_and(vTrue, vTrue).getHead().isNil(), false, "4 Devrait être true");
}

int main(int argc, char **argv)
{
    int result = 0;

    result += Tools::test("fonction true", test_case_true);
    result += Tools::test("fonction false", test_case_false);
    result += Tools::test("fonction not", test_case_not);
    result += Tools::test("fonction and", test_case_and);

    return result;
}