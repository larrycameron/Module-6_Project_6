# Module 4 Project 4 - Command Reference

## 🚀 Essential Commands

### Compile & Run
```cmd
# Compile main application
javac src/UserInput.java

# Run application
java -cp src UserInput

# Compile tests
javac -cp "src;test" test/java/*.java

# Run tests
java -cp "src;test" org.junit.platform.console.ConsoleLauncher --scan-classpath
```

### Build Scripts
```cmd
# Windows - Build
build.bat

# Windows - Test
test.bat

# Unix/Linux - Build
./build.sh

# Unix/Linux - Test
./test.sh
```

### Static Analysis
```cmd
# Checkstyle
java -jar checkstyle-10.12.4-all.jar -c config/checkstyle.xml src/UserInput.java

# SpotBugs
java -jar spotbugs-4.7.3/lib/spotbugs.jar -textui -include config/spotbugs.xml src/
```

### Documentation
```cmd
# Generate JavaDoc
javadoc -d docs/javadoc -sourcepath src -subpackages .

# View JavaDoc (open in browser)
start docs/javadoc/index.html
```

## 📋 Test Input Examples

### Space-separated
```
5 1 9 3 7
```

### Comma-separated
```
10,20,5,15
```

### Mixed delimiters
```
1, 2 3, 4 5
```

### Negative numbers
```
-5 10 -3 0 7
```

### Single integer
```
42
```

## 🔍 Verification Commands

### Check Java Version
```cmd
java -version
```

### Verify Compilation
```cmd
javac -version
```

### Test Classpath
```cmd
# Windows
java -cp "src;test" UserInput

# Unix/Linux
java -cp "src:test" UserInput
```

## 📊 Expected Output

### Successful Run
```
Enter a series of integers seperated by a space or comma: 5 1 9 3 7
User Entered: [1, 3, 5, 7, 9]
```

### Successful Tests
```
==========================================
Running UserInput Unit Tests
==========================================
✅ Input Processing Tests
✅ Input Validation Tests
✅ Integer Counting Tests
✅ Edge Cases and Error Conditions
✅ Performance and Scalability Tests
✅ Code Reuse Verification Tests
==========================================
Test execution completed
==========================================
```

### Successful Static Analysis
```
Checkstyle Analysis:
✅ No style violations found

SpotBugs Analysis:
✅ No critical bugs found
```

## 🚨 Troubleshooting

### Compilation Issues
```cmd
# Check Java installation
java -version

# Verify file locations
dir src
dir test\java

# Check classpath syntax
# Windows: semicolon (;)
# Unix/Linux: colon (:)
```

### Test Issues
```cmd
# Ensure JUnit 5 is available
java -cp "src;test" org.junit.platform.console.ConsoleLauncher --version

# Compile test files first
javac -cp "src;test" test/java/*.java
```

### Permission Issues (Unix/Linux)
```cmd
# Make scripts executable
chmod +x build.sh test.sh
```

## 📁 File Locations

### Source Code
- `src/UserInput.java` - Main application

### Test Files
- `test/java/UserInputTest.java` - Unit tests
- `test/java/TestRunner.java` - Test runner

### Documentation
- `README.md` - Project overview
- `HOW_TO_ACCESS_AND_USE.md` - Detailed instructions
- `INSTRUCTOR_QUICK_REFERENCE.md` - Quick reference
- `docs/` - Technical documentation

### Configuration
- `config/checkstyle.xml` - Checkstyle rules
- `config/spotbugs.xml` - SpotBugs configuration

### Build Scripts
- `build.bat` / `build.sh` - Build scripts
- `test.bat` / `test.sh` - Test scripts

---

**💡 Tip**: Start with `build.bat` (Windows) or `./build.sh` (Unix/Linux) for automated compilation and testing.
