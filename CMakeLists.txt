cmake_minimum_required(VERSION 3.29)
project(TextEditor)
set (CMAKE_LIBRARY_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR})
set (CMAKE_RUNTIME_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR})
set(CMAKE_CXX_STANDARD 26)

# Tests

add_custom_command ( 
        OUTPUT bools_build.cpp
        COMMAND java -jar ${CMAKE_CURRENT_SOURCE_DIR}/src/while_compiler/target/while_compiler-all.jar -i test/lang/bools.while -o ${CMAKE_BINARY_DIR}/bools_build.cpp
        WORKING_DIRECTORY ${CMAKE_CURRENT_SOURCE_DIR}
)
add_library(test_bools bools_build.cpp)

enable_testing()

add_executable(bools ${CMAKE_CURRENT_SOURCE_DIR}/test/bools.cpp)
add_test(NAME TestBools COMMAND bools)