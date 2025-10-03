#!/bin/bash

echo "Running Unit Tests and Static Analysis"
echo "====================================="

echo ""
echo "Compiling source code..."
javac -cp "src" src/UserInput.java
if [ $? -ne 0 ]; then
    echo "ERROR: Source compilation failed!"
    exit 1
fi
echo "✅ Source compilation successful!"

echo ""
echo "Compiling test code..."
javac -cp "src:test" test/java/*.java
if [ $? -ne 0 ]; then
    echo "ERROR: Test compilation failed!"
    exit 1
fi
echo "✅ Test compilation successful!"

echo ""
echo "Running unit tests..."
java -cp "src:test" org.junit.platform.console.ConsoleLauncher --scan-classpath --details=verbose
if [ $? -ne 0 ]; then
    echo "WARNING: Some tests failed!"
else
    echo "✅ All tests passed!"
fi

echo ""
echo "Running static analysis with Checkstyle..."
java -jar tools/checkstyle-10.12.4-all.jar -c config/checkstyle.xml src/UserInput.java
if [ $? -ne 0 ]; then
    echo "WARNING: Checkstyle found issues!"
else
    echo "✅ Checkstyle analysis passed!"
fi

echo ""
echo "Test execution completed!"

