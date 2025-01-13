cmake -S . -B build
cmake --build build --target clean
cmake --build build
ctest build -C Debug --test-dir build