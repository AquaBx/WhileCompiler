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

void test_case_tailnil() {
    WhileStandard::Tree vTail = fun_getTailNil().getHead();
    Tools::assert_equals(vTail.isNil(), true, "Valeur tail pas bon");
}

void test_case_headnil() {
    WhileStandard::Tree vHead = fun_getHeadNil().getHead();
    Tools::assert_equals(vHead.isNil(), true, "Valeur head pas bon");
}


int main(int argc, char** argv)
{
    int result = 0;
    result += Tools::test("fonction head",test_case_head);
    result += Tools::test("fonction tail",test_case_tail);
    result += Tools::test("fonction headnil",test_case_headnil);
    result += Tools::test("fonction tailnil",test_case_tailnil);

    return result;
}