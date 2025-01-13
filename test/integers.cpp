#include "../build/integers_build.cpp"
#include "tools.h"

void test_case_add() {
    WhileStandard::Tree zero;
    WhileStandard::Tree un;
    un += 1;
    WhileStandard::Tree deux = fun_add(un,un);
    WhileStandard::Tree trois = fun_add(deux,un);

    Tools::assert_equals((int)(trois), 3, "Devrait être égal à 3");
    Tools::assert_equals((int)deux, 2, "Devrait être égal à 2");
    Tools::assert_equals((int)un, 1, "Devrait être égal à 1");
    Tools::assert_equals((int)zero, 0, "Devrait être égal à 0");
}

int main(int argc, char** argv)
{
    std::cout << "--------- test --------" << std::endl;
    std::cout << "Description : fonction add" << std::endl;
    const int result1 = Tools::test(test_case_add);
    std::cout << "Error Code : " << result1 << std::endl;
    std::cout << "---- test finished ----" << std::endl;

    return result1;
}