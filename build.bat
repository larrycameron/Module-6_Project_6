@echo off
echo Building Module 4 Project 4 - UserInput Integer Sorter
echo =====================================================

echo.
echo Compiling Java source files...
javac src/UserInput.java

if %ERRORLEVEL% NEQ 0 (
    echo ERROR: Compilation failed!
    pause
    exit /b 1
)

echo ✅ Compilation successful!

echo.
echo Creating JAR file...
jar cfm UserInput.jar MANIFEST.MF -C src UserInput.class

if %ERRORLEVEL% NEQ 0 (
    echo ERROR: JAR creation failed!
    pause
    exit /b 1
)

echo ✅ JAR file created successfully!

echo.
echo Running the program...
echo =====================
java -cp src UserInput

echo.
echo Build completed successfully!
pause

