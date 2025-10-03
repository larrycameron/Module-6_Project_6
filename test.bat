@echo off
echo Running Unit Tests and Static Analysis
echo =====================================

echo.
echo Compiling source code...
javac -cp "src" src/UserInput.java
if %ERRORLEVEL% NEQ 0 (
    echo ERROR: Source compilation failed!
    pause
    exit /b 1
)
echo ✅ Source compilation successful!

echo.
echo Compiling test code...
javac -cp "src;test" test/java/*.java
if %ERRORLEVEL% NEQ 0 (
    echo ERROR: Test compilation failed!
    pause
    exit /b 1
)
echo ✅ Test compilation successful!

echo.
echo Running unit tests...
java -cp "src;test" org.junit.platform.console.ConsoleLauncher --scan-classpath --details=verbose
if %ERRORLEVEL% NEQ 0 (
    echo WARNING: Some tests failed!
) else (
    echo ✅ All tests passed!
)

echo.
echo Running static analysis with Checkstyle...
java -jar tools/checkstyle-10.12.4-all.jar -c config/checkstyle.xml src/UserInput.java
if %ERRORLEVEL% NEQ 0 (
    echo WARNING: Checkstyle found issues!
) else (
    echo ✅ Checkstyle analysis passed!
)

echo.
echo Test execution completed!
pause

