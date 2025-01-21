#include "../build/boucles_build.cpp"
#include "tools.h"

void test_case_foreach() {
    WhileStandard::Tree zero;
    WhileStandard::Tree un = zero + 1;
    WhileStandard::Tree deux = un + 1;
    WhileStandard::Tree trois = deux + 1;
    WhileStandard::Tree quatre = trois + 1;
    WhileStandard::Tree cinq = quatre + 1;

    Tools::assert_equals(static_cast<int>(fun_testforeach(un,deux,trois,quatre,cinq).getHead()), 15, "Devrait être 15");
}


void test_case_for1() {
    Tools::assert_equals(static_cast<int>(fun_testfor1().getHead()), 3, "Devrait être 3");
}

void test_case_for2() {
    Tools::assert_equals(static_cast<int>(fun_testfor2().getHead()), 6, "Devrait être 6");
}

int main(int argc, char** argv)
{
    int result = 0;
    result += Tools::test("Description : foreach somme",test_case_foreach);
    result += Tools::test("Description : for somme",test_case_for1);
    result += Tools::test("Description : for double",test_case_for2);
    return result;
}