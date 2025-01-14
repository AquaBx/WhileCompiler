#include "../build/integers_build.cpp"
#include "tools.h"

void test_case_add() {
    WhileStandard::Tree zero;
    WhileStandard::Tree un = zero + 1;
    WhileStandard::Tree deux = fun_add(un,un).getHead();
    WhileStandard::Tree trois = fun_add(deux,un).getHead();

    Tools::assert_equals((int)trois, 3, "Devrait être égal à 3");
    Tools::assert_equals((int)deux, 2, "Devrait être égal à 2");
    Tools::assert_equals((int)un, 1, "Devrait être égal à 1");
    Tools::assert_equals((int)zero, 0, "Devrait être égal à 0");
}

void test_case_sub() {
    WhileStandard::Tree zero;
    WhileStandard::Tree un = zero + 1;
    WhileStandard::Tree deux = zero + 2;
    WhileStandard::Tree trois = zero + 3;

    Tools::assert_equals((int)fun_sub(trois,zero).getHead(), 3, "Devrait être égal à 3");

    Tools::assert_equals((int)fun_sub(trois,un).getHead(), 2, "Devrait être égal à 2");
    Tools::assert_equals((int)fun_sub(deux,zero).getHead(), 2, "Devrait être égal à 2");

    Tools::assert_equals((int)fun_sub(trois,deux).getHead(), 1, "Devrait être égal à 1");
    Tools::assert_equals((int)fun_sub(deux,un).getHead(), 1, "Devrait être égal à 1");
    Tools::assert_equals((int)fun_sub(un,zero).getHead(), 1, "Devrait être égal à 1");

    Tools::assert_equals((int)fun_sub(zero,zero).getHead(), 0, "Devrait être égal à 0");
    Tools::assert_equals((int)fun_sub(un,un).getHead(), 0, "Devrait être égal à 0");
    Tools::assert_equals((int)fun_sub(deux,deux).getHead(), 0, "Devrait être égal à 0");
    Tools::assert_equals((int)fun_sub(trois,trois).getHead(), 0, "Devrait être égal à 0");
}

void test_case_mul() {
    WhileStandard::Tree zero;
    WhileStandard::Tree un = zero + 1;
    WhileStandard::Tree deux = zero + 2;
    WhileStandard::Tree trois = zero + 3;

    Tools::assert_equals((int)fun_mul(trois,trois).getHead(), 9, "Devrait être égal à 9");
    Tools::assert_equals((int)fun_mul(trois,deux).getHead(), 6, "Devrait être égal à 6");
    Tools::assert_equals((int)fun_mul(deux,trois).getHead(), 6, "Devrait être égal à 6");
    Tools::assert_equals((int)fun_mul(trois,zero).getHead(), 0, "Devrait être égal à 0");
}

int main(int argc, char** argv)
{
    std::cout << "--------- test --------" << std::endl;
    std::cout << "Description : fonction add" << std::endl;
    const int result1 = Tools::test(test_case_add);
    std::cout << "Error Code : " << result1 << std::endl;
    std::cout << "---- test finished ----" << std::endl;


    std::cout << "--------- test --------" << std::endl;
    std::cout << "Description : fonction sub" << std::endl;
    const int result2 = Tools::test(test_case_sub);
    std::cout << "Error Code : " << result2 << std::endl;
    std::cout << "---- test finished ----" << std::endl;

    std::cout << "--------- test --------" << std::endl;
    std::cout << "Description : fonction mul" << std::endl;
    const int result3 = Tools::test(test_case_mul);
    std::cout << "Error Code : " << result3 << std::endl;
    std::cout << "---- test finished ----" << std::endl;

    return result1 + result2 + result3;
}