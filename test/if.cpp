#include "../build/if_build.cpp"
#include "tools.h"

void test_case_1()
{
    WhileStandard::Tree faux;
    WhileStandard::Tree vrai;
    vrai.setHead(faux);
    vrai.setTail(faux);

    Tools::assert_equals(fun_oneif(faux).getHead().isNil(), true, "Devrait être nil");
    Tools::assert_equals(fun_oneif(vrai).getHead().isNil(), false, "Ne devrait pas être nil");
}

void test_case_2()
{
    WhileStandard::Tree faux;
    WhileStandard::Tree vrai;
    vrai.setHead(faux);
    vrai.setTail(faux);

    Tools::assert_equals(fun_twoif(faux).getHead().isNil(), true, "Devrait être nil");
    Tools::assert_equals(fun_twoif(vrai).getHead().isNil(), false, "Ne devrait pas être nil");
}

int main(int argc, char **argv)
{
    int result = 0;
    result += Tools::test("Description : if simple", test_case_1);
    result += Tools::test("Description : if else", test_case_2);
    return result;
}