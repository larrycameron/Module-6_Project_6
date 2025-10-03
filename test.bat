@echo off
echo Running Module 4 Project 4 Tests
echo =================================

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
echo Compiling test code...
javac -cp "src;test" test/java/SimpleTest.java
if %ERRORLEVEL% NEQ 0 (
    echo ERROR: Test compilation failed!
    pause
    exit /b 1
)
echo ✅ Test compilation successful!

echo.
echo Running comprehensive tests...
java -cp "src;test\java" SimpleTest
if %ERRORLEVEL% NEQ 0 (
    echo WARNING: Tests failed!
    pause
    exit /b 1
) else (
    echo ✅ All tests passed!
)

echo.
echo Running demo to showcase features...
java -cp src UserInputDemo
if %ERRORLEVEL% NEQ 0 (
    echo WARNING: Demo failed!
    pause
    exit /b 1
) else (
    echo ✅ Demo completed successfully!
)

echo.
echo Test execution completed successfully!
echo.
pause