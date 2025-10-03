# Module 4 Project 4 - How to Access and Use Guide

## 📋 Quick Start Instructions

This guide provides step-by-step instructions for accessing, compiling, running, and testing the Module 4 Project 4.

## 🚀 Prerequisites

- **Java 17 or higher** installed on your system
- **Command line access** (Command Prompt on Windows, Terminal on Mac/Linux)
- **Git** (optional, for cloning the repository)

## 📁 Project Structure Overview

```
Module_4_Project_4/
├── src/
│   └── UserInput.java          # Main application
├── test/
│   ├── java/
│   │   ├── UserInputTest.java  # Unit tests
│   │   └── TestRunner.java     # Test runner
│   └── resources/              # Test resources
├── docs/                       # Documentation
├── config/                     # Configuration files
├── build.bat                   # Windows build script
├── build.sh                    # Unix/Linux build script
├── test.bat                    # Windows test script
├── test.sh                     # Unix/Linux test script
└── README.md                   # Project overview
```

## 🔧 Step 1: Access the Project

### Option A: Direct File Access
1. Navigate to the project directory: `C:\Users\larry\OneDrive\Desktop\Module_4_Project_4`
2. Open Command Prompt or Terminal in this directory

### Option B: Git Clone (if repository exists)
```bash
git clone [repository-url]
cd Module_4_Project_4
```

## 🏗️ Step 2: Compile the Project

### Windows (Command Prompt)
```cmd
# Navigate to project directory
cd C:\Users\larry\OneDrive\Desktop\Module_4_Project_4

# Compile the main application
javac src/UserInput.java

# Compile the test files
javac -cp "src;test" test/java/*.java
```

### Unix/Linux/Mac (Terminal)
```bash
# Navigate to project directory
cd /path/to/Module_4_Project_4

# Compile the main application
javac src/UserInput.java

# Compile the test files
javac -cp "src:test" test/java/*.java
```

### Alternative: Use Build Scripts
```bash
# Windows
build.bat

# Unix/Linux/Mac
./build.sh
```

## 🚀 Step 3: Run the Application

### Basic Execution
```bash
# Windows
java -cp src UserInput

# Unix/Linux/Mac
java -cp src UserInput
```

### Interactive Usage
1. Run the command above
2. When prompted, enter integers separated by spaces or commas
3. Example inputs:
   - `1 5 3 9 2`
   - `10, 20, 5, 15`
   - `1,2,3,4,5`
4. Press Enter to see the sorted results

### Example Session
```
Enter a series of integers seperated by a space or comma: 5 1 9 3 7
User Entered: [1, 3, 5, 7, 9]
```

## 🧪 Step 4: Run the Tests

### Windows (Command Prompt)
```cmd
# Run all tests
test.bat

# Or run manually
java -cp "src;test" org.junit.platform.console.ConsoleLauncher --scan-classpath
```

### Unix/Linux/Mac (Terminal)
```bash
# Run all tests
./test.sh

# Or run manually
java -cp "src:test" org.junit.platform.console.ConsoleLauncher --scan-classpath
```

### Test Categories
The test suite includes:
- **Input Processing Tests** (10 tests)
- **Input Validation Tests** (7 tests)
- **Integer Counting Tests** (8 tests)
- **Edge Cases and Error Conditions** (4 tests)
- **Performance and Scalability Tests** (2 tests)
- **Code Reuse Verification Tests** (3 tests)

## 🔍 Step 5: Run Static Analysis

### Checkstyle Analysis
```bash
# Download Checkstyle (if not already present)
wget https://github.com/checkstyle/checkstyle/releases/download/checkstyle-10.12.4/checkstyle-10.12.4-all.jar

# Run Checkstyle
java -jar checkstyle-10.12.4-all.jar -c config/checkstyle.xml src/UserInput.java
```

### SpotBugs Analysis
```bash
# Download SpotBugs (if not already present)
wget https://github.com/spotbugs/spotbugs/releases/download/4.7.3/spotbugs-4.7.3.zip
unzip spotbugs-4.7.3.zip

# Run SpotBugs
java -jar spotbugs-4.7.3/lib/spotbugs.jar -textui -include config/spotbugs.xml src/
```

## 📚 Step 6: Access Documentation

### Main Documentation Files
1. **README.md** - Project overview and features
2. **PROJECT_SUMMARY.md** - Complete project summary
3. **docs/DESIGN_DOCUMENTATION.md** - Detailed architecture
4. **docs/CODE_REUSE_DOCUMENTATION.md** - Code reuse analysis
5. **TESTING_DOCUMENTATION.md** - Testing framework details
6. **TESTING_AND_ANALYSIS_SUMMARY.md** - Testing implementation summary

### JavaDoc Documentation
```bash
# Generate JavaDoc (if not already present)
javadoc -d docs/javadoc -sourcepath src -subpackages .

# View JavaDoc
# Open docs/javadoc/index.html in a web browser
```

## 🎯 Step 7: Verify Project Features

### Core Features to Test
1. **Pipeline Architecture**: Sequential data processing
2. **Code Reuse**: 8+ Java API components reused
3. **Design Patterns**: Facade, Strategy, Collection, Template Method
4. **Input Flexibility**: Space and comma delimiters
5. **Sorting**: Optimized TimSort algorithm
6. **Error Handling**: Proper exception management

### Test Scenarios
```bash
# Test 1: Space-separated integers
echo "5 1 9 3 7" | java -cp src UserInput

# Test 2: Comma-separated integers
echo "10,20,5,15" | java -cp src UserInput

# Test 3: Mixed delimiters
echo "1, 2 3, 4 5" | java -cp src UserInput

# Test 4: Negative numbers
echo "-5 10 -3 0 7" | java -cp src UserInput

# Test 5: Single integer
echo "42" | java -cp src UserInput
```

## 🚨 Troubleshooting

### Common Issues

#### Compilation Errors
```bash
# Ensure Java 17+ is installed
java -version

# Check classpath syntax
# Windows: use semicolon (;)
# Unix/Linux: use colon (:)
```

#### Test Execution Issues
```bash
# Ensure test files are compiled
javac -cp "src:test" test/java/*.java

# Check JUnit 5 is available
java -cp "src:test" org.junit.platform.console.ConsoleLauncher --version
```

#### Permission Issues (Unix/Linux)
```bash
# Make scripts executable
chmod +x build.sh test.sh
```

## 📊 Expected Results

### Successful Compilation
```
# No output means successful compilation
javac src/UserInput.java
```

### Successful Test Execution
```
==========================================
Running UserInput Unit Tests
==========================================

✅ Input Processing Tests
  ✅ Should process space-separated integers correctly
  ✅ Should process comma-separated integers correctly
  ... (25+ tests total)

==========================================
Test execution completed
==========================================
```

### Successful Static Analysis
```
Checkstyle Analysis:
✅ No style violations found
✅ Code follows Google Java Style Guide

SpotBugs Analysis:
✅ No critical bugs found
✅ No security vulnerabilities
```

## 🎓 Academic Requirements Met

### Project Demonstrates
- ✅ **Pipeline Architecture Pattern**
- ✅ **Extensive Code Reuse** (8+ Java API components)
- ✅ **Design Patterns** (5 patterns implemented)
- ✅ **Comprehensive Testing** (25+ test cases)
- ✅ **Static Analysis** (Checkstyle + SpotBugs)
- ✅ **Professional Documentation**
- ✅ **CI/CD Integration**
- ✅ **Best Practices** (Clean code, error handling)

### Learning Objectives Achieved
- Software architecture design
- Code reuse and API utilization
- Design pattern implementation
- Unit testing and quality assurance
- Static analysis and code quality
- Professional documentation
- Build automation and CI/CD

## 📞 Support and Help

### If You Encounter Issues
1. Check the troubleshooting section above
2. Review the documentation files
3. Ensure Java 17+ is properly installed
4. Verify all files are in the correct locations
5. Check file permissions (Unix/Linux)

### Documentation References
- [README.md](README.md) - Project overview
- [PROJECT_SUMMARY.md](PROJECT_SUMMARY.md) - Complete summary
- [TESTING_DOCUMENTATION.md](TESTING_DOCUMENTATION.md) - Testing details
- [docs/DESIGN_DOCUMENTATION.md](docs/DESIGN_DOCUMENTATION.md) - Architecture details

---

**🎉 Your Module 4 Project 4 is ready for academic submission and professional demonstration!**

This guide provides everything needed to access, compile, run, test, and analyze the project successfully.
