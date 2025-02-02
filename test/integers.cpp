#include "../build/integers_build.cpp"
#include "tools.h"

void test_case_add()
{
    WhileStandard::Tree zero(0);
    WhileStandard::Tree un(1);
    WhileStandard::Tree deux = fun_add(un, un).getHead();
    WhileStandard::Tree trois = fun_add(deux, un).getHead();

    Tools::assert_equals((int)trois, 3, "Devrait être égal à 3");
    Tools::assert_equals((int)deux, 2, "Devrait être égal à 2");
    Tools::assert_equals((int)un, 1, "Devrait être égal à 1");
    Tools::assert_equals((int)zero, 0, "Devrait être égal à 0");
}

void test_case_sub()
{
    WhileStandard::Tree zero(0);
    WhileStandard::Tree un(1);
    WhileStandard::Tree deux(2);
    WhileStandard::Tree trois(3);

    Tools::assert_equals((int)fun_sub(trois, zero).getHead(), 3, "Devrait être égal à 3");
    Tools::assert_equals((int)fun_sub(trois, un).getHead(), 2, "Devrait être égal à 2");
    Tools::assert_equals((int)fun_sub(deux, zero).getHead(), 2, "Devrait être égal à 2");

    Tools::assert_equals((int)fun_sub(trois, deux).getHead(), 1, "Devrait être égal à 1");
    Tools::assert_equals((int)fun_sub(deux, un).getHead(), 1, "Devrait être égal à 1");
    Tools::assert_equals((int)fun_sub(un, zero).getHead(), 1, "Devrait être égal à 1");

    Tools::assert_equals((int)fun_sub(zero, zero).getHead(), 0, "Devrait être égal à 0");
    Tools::assert_equals((int)fun_sub(un, un).getHead(), 0, "Devrait être égal à 0");
    Tools::assert_equals((int)fun_sub(deux, deux).getHead(), 0, "Devrait être égal à 0");
    Tools::assert_equals((int)fun_sub(trois, trois).getHead(), 0, "Devrait être égal à 0");
}

void test_case_mul()
{
    WhileStandard::Tree zero(0);
    WhileStandard::Tree un(1);
    WhileStandard::Tree deux(2);
    WhileStandard::Tree trois(3);

    Tools::assert_equals((int)fun_mul(trois, trois).getHead(), 9, "Devrait être égal à 9");
    Tools::assert_equals((int)fun_mul(trois, deux).getHead(), 6, "Devrait être égal à 6");
    Tools::assert_equals((int)fun_mul(deux, trois).getHead(), 6, "Devrait être égal à 6");
    Tools::assert_equals((int)fun_mul(trois, zero).getHead(), 0, "Devrait être égal à 0");
}

int main(int argc, char **argv)
{
    int result = 0;
    result += Tools::test("fonction add", test_case_add);
    result += Tools::test("fonction sub", test_case_sub);
    result += Tools::test("fonction mul", test_case_mul);

    return result;
}