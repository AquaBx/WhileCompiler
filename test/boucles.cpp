#include "../build/boucles_build.cpp"
#include "tools.h"

void test_case_foreach()
{
    WhileStandard::Tree zero(0);
    WhileStandard::Tree un(1);
    WhileStandard::Tree deux(2);
    WhileStandard::Tree trois(3);
    WhileStandard::Tree quatre(4);
    WhileStandard::Tree cinq(5);

    Tools::assert_equals(static_cast<int>(fun_testforeach(un, deux, trois, quatre, cinq).getHead()), 15, "Devrait être 15");
}

void test_case_for1()
{
    Tools::assert_equals(static_cast<int>(fun_testfor1().getHead()), 3, "Devrait être 3");
}

void test_case_for2()
{
    Tools::assert_equals(static_cast<int>(fun_testfor2().getHead()), 6, "Devrait être 6");
}

void test_case_while()
{
    Tools::assert_equals(static_cast<int>(fun_testwhile().getHead()), 0, "Devrait être 0");
}

int main(int argc, char **argv)
{
    int result = 0;
    result += Tools::test("Description : foreach somme", test_case_foreach);
    result += Tools::test("Description : for somme", test_case_for1);
    result += Tools::test("Description : for double", test_case_for2);
    result += Tools::test("Description : while", test_case_while);
    return result;
}