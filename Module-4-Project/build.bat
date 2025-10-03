@echo off
echo Building Module 4 Project 4
echo ============================

echo.
echo Compiling source code...
javac src/UserInput.java
if %ERRORLEVEL% NEQ 0 (
    echo ERROR: Source compilation failed!
    pause
    exit /b 1
)
echo ✅ Source compilation successful!

echo.
echo Compiling demo version...
javac -cp src src/UserInputDemo.java
if %ERRORLEVEL% NEQ 0 (
    echo ERROR: Demo compilation failed!
    pause
    exit /b 1
)
echo ✅ Demo compilation successful!

echo.
echo Compiling test code...
javac -cp "src;test" test/java/SimpleTest.java
if %ERRORLEVEL% NEQ 0 (
    echo ERROR: Test compilation failed!
    pause
    exit /b 1
)
echo ✅ Test compilation successful!

echo.
echo Build completed successfully!
echo.
echo Available programs:
echo - UserInput: Interactive integer sorter
echo - UserInputDemo: Non-interactive demo with test cases
echo - SimpleTest: Comprehensive test suite
echo.
pause