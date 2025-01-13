#include "../build/bools_build.cpp"
#include "tools.h"

void test_case_true() {
    WhileStandard::Tree * vTrue = fun_true();
    Tools::assert_equals(vTrue->isNil(), false, "Valeur true pas bon");
}

void test_case_false() {
    WhileStandard::Tree * vFalse = fun_false();
    Tools::assert_equals(vFalse->isNil(), true, "Valeur false pas bon");
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

    return result1+result2;
}