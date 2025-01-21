cmake -S . -B build
cmake --build build --target clean
cmake --build build
ctest build --test-dir build  -C Debug --output-on-failure