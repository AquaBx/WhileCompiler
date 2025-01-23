cmake_minimum_required(VERSION 3.29)
project(TextEditor)
set (CMAKE_LIBRARY_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR})
set (CMAKE_RUNTIME_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR})
set(CMAKE_CXX_STANDARD 26)
set(CMAKE_EXPORT_COMPILE_COMMANDS ON)

# Tests


list(APPEND testlist bools integers multi_return head_tail cons list if boucles)
set (whilecompile java -jar ${CMAKE_CURRENT_SOURCE_DIR}/src/while_compiler/target/while_compiler-all.jar)

enable_testing()

foreach(X IN LISTS testlist)
 
add_custom_command ( 
        WORKING_DIRECTORY ${CMAKE_CURRENT_SOURCE_DIR} OUTPUT ${X}_build.cpp 
        COMMAND ${whilecompile} -i test/lang/${X}.while -o ${CMAKE_BINARY_DIR}/${X}_build.cpp
)
add_library(test_${X} ${X}_build.cpp)

add_executable(${X} ${CMAKE_CURRENT_SOURCE_DIR}/test/${X}.cpp)
add_test(NAME Test${X} COMMAND ${X})

endforeach()