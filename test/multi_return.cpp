#include "../build/multi_return_build.cpp"
#include "tools.h"

void test_case_2returns() {
    Tools::assert_equals(fun_recup1().getHead().getSymbol(), std::string("salut1"), "Devrait être salut1");
    Tools::assert_equals(fun_recup2().getHead().getSymbol(), std::string("salut2"), "Devrait être salut2");
}

int main(int argc, char** argv)
{
    const int result1 = Tools::test("fonction 2 returns",test_case_2returns);
    return result1;
}