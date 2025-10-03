#!/bin/bash

echo "Building Module 4 Project 4 - UserInput Integer Sorter"
echo "====================================================="

echo ""
echo "Compiling Java source files..."
javac src/UserInput.java

if [ $? -ne 0 ]; then
    echo "ERROR: Compilation failed!"
    exit 1
fi

echo "✅ Compilation successful!"

echo ""
echo "Creating JAR file..."
jar cfm UserInput.jar MANIFEST.MF -C src UserInput.class

if [ $? -ne 0 ]; then
    echo "ERROR: JAR creation failed!"
    exit 1
fi

echo "✅ JAR file created successfully!"

echo ""
echo "Running the program..."
echo "====================="
java -cp src UserInput

echo ""
echo "Build completed successfully!"

