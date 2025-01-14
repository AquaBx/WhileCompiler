#include "../build/multi_return_build.cpp"
#include "tools.h"

void test_case_2returns() {
    Tools::assert_equals(fun_recup1().getSymbol(), std::string("salut1"), "Devrait être salut1");
    Tools::assert_equals(fun_recup2().getSymbol(), std::string("salut2"), "Devrait être salut2");
}

int main(int argc, char** argv)
{
    std::cout << "--------- test --------" << std::endl;
    std::cout << "Description : fonction 2 returns" << std::endl;
    const int result1 = Tools::test(test_case_2returns);
    std::cout << "Error Code : " << result1 << std::endl;
    std::cout << "---- test finished ----" << std::endl;

    return result1;
}