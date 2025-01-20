#include "../build/head_tail_build.cpp"
#include "tools.h"

void test_case_head() {
    WhileStandard::Tree vHead = fun_getHead().getHead();
    Tools::assert_equals(static_cast<std::string>(vHead), std::string("ab"), "Valeur head pas bon");
}

void test_case_tail() {
    WhileStandard::Tree vTail = fun_getTail().getHead();
    Tools::assert_equals(static_cast<std::string>(vTail), std::string("cd"), "Valeur tail pas bon");
}

int main(int argc, char** argv)
{
    int result = 0;
    result += Tools::test("fonction head",test_case_head);
    result += Tools::test("fonction tail",test_case_tail);

    return result;
}