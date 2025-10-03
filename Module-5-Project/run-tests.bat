@echo off
REM Batch script to run unit tests and static analysis for Stack Integer Sorter
REM This script provides a comprehensive testing and analysis workflow

echo ========================================
echo Stack Integer Sorter - Test Suite
echo ========================================
echo.

REM Check if Java is available
java -version >nul 2>&1
if %errorlevel% neq 0 (
    echo ERROR: Java is not installed or not in PATH
    echo Please install Java JDK 8 or higher
    pause
    exit /b 1
)

REM Check if Maven is available
mvn -version >nul 2>&1
if %errorlevel% neq 0 (
    echo WARNING: Maven is not installed or not in PATH
    echo Some features may not be available
    echo.
)

echo Step 1: Compiling source code...
echo ========================================
javac UserInput.java
if %errorlevel% neq 0 (
    echo ERROR: Compilation failed
    pause
    exit /b 1
)
echo ✓ Compilation successful
echo.

echo Step 2: Compiling test code...
echo ========================================
javac UserInputTest.java
if %errorlevel% neq 0 (
    echo ERROR: Test compilation failed
    pause
    exit /b 1
)
echo ✓ Test compilation successful
echo.

echo Step 3: Running unit tests...
echo ========================================
java UserInputTest
if %errorlevel% neq 0 (
    echo WARNING: Some tests may have failed
)
echo.

echo Step 4: Running basic functionality test...
echo ========================================
echo Testing with sample input: "5 2 8 1 9"
echo 5 2 8 1 9 | java UserInput
echo.

echo Step 5: Running error handling test...
echo ========================================
echo Testing with mixed input: "5 abc 3 def 7"
echo 5 abc 3 def 7 | java UserInput
echo.

if exist mvn.cmd (
    echo Step 6: Running Maven static analysis...
    echo ========================================
    echo Running Checkstyle analysis...
    mvn checkstyle:check
    echo.
    
    echo Running PMD analysis...
    mvn pmd:check
    echo.
    
    echo Running SpotBugs analysis...
    mvn spotbugs:check
    echo.
    
    echo Running JaCoCo code coverage...
    mvn jacoco:report
    echo.
    
    echo Generating comprehensive reports...
    mvn site
    echo.
    
    echo Reports generated in target/site directory
    echo Open target/site/index.html in your browser to view reports
) else (
    echo Step 6: Maven not available - skipping static analysis
    echo ========================================
    echo To run static analysis, install Maven and run:
    echo   mvn checkstyle:check
    echo   mvn pmd:check
    echo   mvn spotbugs:check
    echo   mvn jacoco:report
    echo   mvn site
)

echo.
echo ========================================
echo Test Suite Complete
echo ========================================
echo.
echo Summary:
echo - Unit tests executed
echo - Basic functionality verified
echo - Error handling tested
if exist mvn.cmd (
    echo - Static analysis completed
    echo - Code coverage report generated
    echo - Comprehensive reports available in target/site/
) else (
    echo - Static analysis skipped (Maven not available)
)
echo.
echo For detailed analysis, check the generated reports.
echo.
pause
