//
// Created by tomch on 17/10/2024.
//
#pragma once

#include <stdexcept>
#include <string>
#include <iostream>

namespace Tools
{

    typedef void (*vFunctionCall)();

    template <typename T>
    void assert_equals(T expected, T actual, std::string message)
    {
        if (expected != actual)
        {
            std::cout << expected << "!=" << actual << std::endl;
            throw std::runtime_error(message);
        }
    }

    int test(std::string testName, const vFunctionCall function)
    {
        try
        {
            function();
            std::cout << testName << " " << "ok" << std::endl;
            return 0;
        }
        catch (std::exception &e)
        {
            std::cout << testName << " " << "failed" << std::endl;
            std::cout << e.what() << std::endl;
            return 1;
        }
    }
}