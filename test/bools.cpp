#include "../build/bools_build.cpp"
#include "tools.h"

void test_case_true() {
    WhileStandard::Tree vTrue = fun_true();
    Tools::assert_equals(vTrue.isNil(), false, "Valeur true pas bon");
}

void test_case_false() {
    WhileStandard::Tree vFalse = fun_false();
    Tools::assert_equals(vFalse.isNil(), true, "Valeur false pas bon");
}

void test_case_not() {
    WhileStandard::Tree vFalse = fun_false();
    WhileStandard::Tree vTrue = fun_not(vFalse);
    WhileStandard::Tree vFalse2 = fun_not(vTrue);
    
    Tools::assert_equals(vFalse.isNil(), true, "Valeur false a été changé");
    Tools::assert_equals(vTrue.isNil(), false, "Valeur not pas bon");
    Tools::assert_equals(vTrue.isNil(), false, "Valeur true a été changé");
    Tools::assert_equals(vFalse2.isNil(), true, "Valeur false2 pas bonne");
}

void test_case_and() {
    WhileStandard::Tree vFalse = fun_false();
    WhileStandard::Tree vTrue = fun_true();
    
    Tools::assert_equals(fun_and(vFalse,vFalse).isNil(), true, "1 Devrait être false");
    Tools::assert_equals(fun_and(vFalse,vTrue).isNil(), true, "2 Devrait être false");
    Tools::assert_equals(fun_and(vTrue,vFalse).isNil(), true, "3 Devrait être false");
    Tools::assert_equals(fun_and(vTrue,vTrue).isNil(), false, "4 Devrait être true");
}

int main(int argc, char** argv)
{
    std::cout << "--------- test --------" << std::endl;
    std::cout << "Description : fonction true" << std::endl;
    const int result1 = Tools::test(test_case_true);
    std::cout << "Error Code : " << result1 << std::endl;
    std::cout << "---- test finished ----" << std::endl;

    std::cout << "--------- test --------" << std::endl;
    std::cout << "Description : fonction false" << std::endl;
    const int result2 = Tools::test(test_case_false);
    std::cout << "Error Code : " << result2 << std::endl;
    std::cout << "---- test finished ----" << std::endl;

    std::cout << "--------- test --------" << std::endl;
    std::cout << "Description : fonction not" << std::endl;
    const int result3 = Tools::test(test_case_not);
    std::cout << "Error Code : " << result3 << std::endl;
    std::cout << "---- test finished ----" << std::endl;

    std::cout << "--------- test --------" << std::endl;
    std::cout << "Description : fonction and" << std::endl;
    const int result4 = Tools::test(test_case_and);
    std::cout << "Error Code : " << result4 << std::endl;
    std::cout << "---- test finished ----" << std::endl;

    return result1+result2+result3+result4;
}