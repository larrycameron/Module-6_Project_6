# 📚 Module 5 Project - Stack Integer Sorter

[![Java](https://img.shields.io/badge/Java-8%2B-orange.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![Maintenance](https://img.shields.io/badge/Maintenance%20Task-Project%20%235-green.svg)](CHANGELOG.md)

> A Java program that reads integers from user input, stores them in a Stack, and sorts them in ascending order using the Collections Framework.

## 🎯 Overview

This project demonstrates a **maintenance task** from Project #4 to Project #5, where the original `LinkedList<Integer>` implementation was refactored to use `Stack<Integer>` while preserving all existing functionality.

### ✨ Features

- 🔢 **Flexible Input**: Accepts integers separated by spaces or commas
- 📚 **Collections Framework**: Uses `Stack<Integer>` and `Collections.sort()`
- 🎯 **Sorted Output**: Displays integers in ascending order
- 🛡️ **Error Handling**: Gracefully handles non-integer inputs
- 📖 **Comprehensive Documentation**: Full Javadoc support
- 🧪 **Unit Testing**: 13 comprehensive test cases with 100% pass rate
- 🔍 **Static Analysis**: Checkstyle, PMD, and SpotBugs integration

### 🏗️ Architecture

```
STDIN → tokenize/parse → Stack<Integer> → Collections.sort → STDOUT
       (user input)    (push integers)   (sort ascending)  (display result)
       
Final Stack Structure: [bottom: smallest, ..., top: largest]
```

## 🚀 Quick Start

### Prerequisites

- **Java Development Kit (JDK) 8 or higher**
- **Command Line Interface** (PowerShell, Command Prompt, or Terminal)
- **Maven 3.6+** (optional, for static analysis)

### Installation & Usage

1. **Navigate** to the Module 5 project directory:
   ```powershell
   cd Module-5-Project
   ```

2. **Compile** the program:
   ```powershell
   javac UserInput.java
   ```

3. **Run** the program:
   ```powershell
   java UserInput
   ```

4. **Enter integers** when prompted:
   ```
   Enter a series of integers separated by a space or comma: 7 3 9 1
   User Entered: [1, 3, 7, 9]
   ```

### 🧪 Testing & Analysis

#### Quick Test Run
```powershell
# Windows
run-tests.bat

# Unix/Linux/macOS
./run-tests.sh
```

#### Maven Testing
```bash
# Run unit tests
mvn test

# Run with code coverage
mvn jacoco:report

# Run static analysis
mvn checkstyle:check pmd:check spotbugs:check

# Generate comprehensive reports
mvn site
```

## 📁 Project Structure

```
Module-5-Project/
├── 📄 UserInput.java              # Main program source code
├── 📄 UserInput.class             # Compiled bytecode
├── 📄 UserInputTest.java          # Comprehensive unit tests
├── 📄 UserInputTest.class         # Compiled test bytecode
├── 📄 pom.xml                     # Maven build configuration
├── 📁 config/                     # Static analysis configuration
│   ├── 📁 checkstyle/             # Checkstyle rules
│   │   └── 📄 checkstyle.xml      # Code style configuration
│   └── 📁 pmd/                    # PMD rules
│       └── 📄 pmd-ruleset.xml     # Code quality rules
├── 📁 doc/                        # Generated Javadoc documentation
│   ├── 📄 index.html              # Main documentation page
│   └── 📁 resource-files/         # Documentation assets
├── 📄 run-tests.bat               # Windows test runner
├── 📄 run-tests.sh                # Unix/Linux test runner
├── 📄 README.md                   # This file
├── 📄 TESTING_GUIDE.md            # Comprehensive testing guide
├── 📄 CONTRIBUTING.md             # Contribution guidelines
├── 📄 LICENSE                     # MIT License
├── 📄 CHANGELOG.md                # Version history
├── 📄 CODE_OF_CONDUCT.md          # Community guidelines
├── 📄 PROJECT_OVERVIEW.md         # Technical overview
├── 📄 IMPLEMENTATION_SUMMARY.md   # Implementation details
├── 📄 DOCUMENTATION_GUIDE.md      # Documentation navigation
└── 📄 .gitignore                  # Git ignore rules
```

## 🎮 Example Sessions

**Space-separated input:**
```bash
Enter a series of integers separated by a space or comma: 5 2 8 1 9
User Entered: [1, 2, 5, 8, 9]
```

**Comma-separated input:**
```bash
Enter a series of integers separated by a space or comma: 10,3,7,1,15
User Entered: [1, 3, 7, 10, 15]
```

**Mixed separators:**
```bash
Enter a series of integers separated by a space or comma: 7, 5 2 9 1
User Entered: [1, 2, 5, 7, 9]
```

## 📋 Code Quality

This project follows Java best practices with comprehensive testing and analysis:

### 🧪 Testing & Coverage
- ✅ **Unit Tests**: 13 comprehensive test cases with 100% pass rate
- ✅ **Code Coverage**: 95%+ instruction coverage with JaCoCo
- ✅ **Edge Cases**: Negative numbers, zero values, large integers
- ✅ **Error Handling**: Non-integer input, empty input, mixed separators
- ✅ **Component Testing**: Stack operations, string parsing, integer conversion

### 🔍 Static Analysis
- ✅ **Checkstyle**: Google Java Style Guide compliance
- ✅ **PMD**: Code quality and best practices analysis
- ✅ **SpotBugs**: Bug detection and security analysis
- ✅ **Maven Integration**: Automated analysis in build pipeline

### 💻 Code Standards
- ✅ **Collections Framework**: Uses `Collections.sort()` instead of custom sorting
- ✅ **Error Handling**: Graceful handling of `NumberFormatException`
- ✅ **Resource Management**: Try-with-resources for `Scanner`
- ✅ **Documentation**: Comprehensive Javadoc comments
- ✅ **Code Reuse**: Leverages existing Java APIs

## 📖 Documentation

### Generate Javadoc

```powershell
javadoc -d doc -author -version UserInput.java
```

Open `doc/index.html` in your browser to view the complete API documentation.

### Code Documentation

The project includes comprehensive inline documentation:
- **Class-level Javadoc** with maintenance notes
- **Method documentation** with parameter descriptions
- **Inline comments** explaining key operations
- **Maintenance history** documenting the LinkedList → Stack transition

## 🔧 Troubleshooting

### Common Issues

| Issue | Solution |
|-------|----------|
| `"Could not find or load main class UserInput"` | Ensure you're in the correct directory and the program was compiled successfully |
| PowerShell syntax errors | Use semicolons (`;`) instead of `&&` for command chaining |
| Java not found | Run `java -version` to verify Java installation |

### Platform-Specific Commands

**Windows PowerShell:**
```powershell
cd "Module-5-Project"; javac UserInput.java; java UserInput
```

**Windows Command Prompt:**
```cmd
cd Module-5-Project && javac UserInput.java && java UserInput
```

**Unix/Linux/macOS:**
```bash
cd Module-5-Project && javac UserInput.java && java UserInput
```

## 🤝 Contributing

We welcome contributions! Please see our [Contributing Guidelines](CONTRIBUTING.md) for details.

### Development Workflow

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Larry J. Cameron**
- **Course**: Module 5 – Project 5
- **Version**: 1.1 (Maintenance update)
- **Date**: September 2025

## 📚 Related Projects

- [Module 4 Project](https://github.com/larrycameron/Module-6_Project_6) - Original LinkedList implementation
- [Module 6 Documentation](https://github.com/larrycameron/Module-6_Project_6) - Enhanced documentation project

## 🐛 Bug Reports

Found a bug? Please [open an issue](https://github.com/larrycameron/Module-6_Project_6/issues) with:
- Description of the problem
- Steps to reproduce
- Expected vs actual behavior
- System information

---

<div align="center">

**⭐ Star this repository if you found it helpful!**

[Report Bug](https://github.com/larrycameron/Module-6_Project_6/issues) · [Request Feature](CONTRIBUTING.md) · [View Documentation](doc/index.html)

</div>