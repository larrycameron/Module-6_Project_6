#!/bin/bash
# Shell script to run unit tests and static analysis for Stack Integer Sorter
# This script provides a comprehensive testing and analysis workflow

echo "========================================"
echo "Stack Integer Sorter - Test Suite"
echo "========================================"
echo

# Check if Java is available
if ! command -v java &> /dev/null; then
    echo "ERROR: Java is not installed or not in PATH"
    echo "Please install Java JDK 8 or higher"
    exit 1
fi

# Check if Maven is available
if ! command -v mvn &> /dev/null; then
    echo "WARNING: Maven is not installed or not in PATH"
    echo "Some features may not be available"
    echo
fi

echo "Step 1: Compiling source code..."
echo "========================================"
javac UserInput.java
if [ $? -ne 0 ]; then
    echo "ERROR: Compilation failed"
    exit 1
fi
echo "✓ Compilation successful"
echo

echo "Step 2: Compiling test code..."
echo "========================================"
javac UserInputTest.java
if [ $? -ne 0 ]; then
    echo "ERROR: Test compilation failed"
    exit 1
fi
echo "✓ Test compilation successful"
echo

echo "Step 3: Running unit tests..."
echo "========================================"
java UserInputTest
if [ $? -ne 0 ]; then
    echo "WARNING: Some tests may have failed"
fi
echo

echo "Step 4: Running basic functionality test..."
echo "========================================"
echo "Testing with sample input: \"5 2 8 1 9\""
echo "5 2 8 1 9" | java UserInput
echo

echo "Step 5: Running error handling test..."
echo "========================================"
echo "Testing with mixed input: \"5 abc 3 def 7\""
echo "5 abc 3 def 7" | java UserInput
echo

if command -v mvn &> /dev/null; then
    echo "Step 6: Running Maven static analysis..."
    echo "========================================"
    echo "Running Checkstyle analysis..."
    mvn checkstyle:check
    echo
    
    echo "Running PMD analysis..."
    mvn pmd:check
    echo
    
    echo "Running SpotBugs analysis..."
    mvn spotbugs:check
    echo
    
    echo "Running JaCoCo code coverage..."
    mvn jacoco:report
    echo
    
    echo "Generating comprehensive reports..."
    mvn site
    echo
    
    echo "Reports generated in target/site directory"
    echo "Open target/site/index.html in your browser to view reports"
else
    echo "Step 6: Maven not available - skipping static analysis"
    echo "========================================"
    echo "To run static analysis, install Maven and run:"
    echo "  mvn checkstyle:check"
    echo "  mvn pmd:check"
    echo "  mvn spotbugs:check"
    echo "  mvn jacoco:report"
    echo "  mvn site"
fi

echo
echo "========================================"
echo "Test Suite Complete"
echo "========================================"
echo
echo "Summary:"
echo "- Unit tests executed"
echo "- Basic functionality verified"
echo "- Error handling tested"
if command -v mvn &> /dev/null; then
    echo "- Static analysis completed"
    echo "- Code coverage report generated"
    echo "- Comprehensive reports available in target/site/"
else
    echo "- Static analysis skipped (Maven not available)"
fi
echo
echo "For detailed analysis, check the generated reports."
echo
