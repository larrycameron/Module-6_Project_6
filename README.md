# 📚 Module 6 Project - Comprehensive Java Projects with Documentation

[![Java](https://img.shields.io/badge/Java-8%2B-orange.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![Documentation](https://img.shields.io/badge/Documentation-GitHub%20Best%20Practices-green.svg)](DOCUMENTATION_GUIDE.md)

> A comprehensive collection of Java projects demonstrating software engineering principles, design patterns, code reuse, testing, and documentation best practices.

## 🎯 Overview

This repository contains two major Java projects that showcase different aspects of software engineering:

1. **Module 4 Project** - Pipeline Architecture with LinkedList
2. **Module 5 Project** - Maintenance Task with Stack Implementation

Both projects demonstrate extensive code reuse, comprehensive testing, static analysis, and professional documentation following GitHub best practices.

## 📁 Project Structure

```
Module-6_Project_6/
├── 📁 Module-4-Project/           # Pipeline Architecture Project
│   ├── 📁 src/                    # Source code
│   │   ├── 📄 UserInput.java      # Main program (LinkedList)
│   │   └── 📄 UserInputDemo.java  # Demo application
│   ├── 📁 docs/                   # Design documentation
│   │   ├── 📄 DESIGN_DOCUMENTATION.md
│   │   ├── 📄 CODE_REUSE_DOCUMENTATION.md
│   │   └── 📁 javadoc/            # Generated documentation
│   ├── 📁 test/                   # Test files
│   ├── 📁 .github/workflows/      # CI/CD configuration
│   ├── 📁 config/                 # Configuration files
│   ├── 📄 build.bat/.sh           # Build scripts
│   ├── 📄 test.bat/.sh            # Test scripts
│   ├── 📄 MANIFEST.MF             # JAR manifest
│   ├── 📄 PROJECT_SUMMARY.md      # Project summary
│   ├── 📄 TESTING_DOCUMENTATION.md # Testing docs
│   ├── 📄 COMMAND_REFERENCE.md    # Command reference
│   ├── 📄 HOW_TO_ACCESS_AND_USE.md # Usage instructions
│   ├── 📄 INSTRUCTOR_QUICK_REFERENCE.md # Instructor guide
│   └── 📄 README.md               # Project documentation
├── 📁 Module-5-Project/           # Maintenance Task Project
│   ├── 📄 UserInput.java          # Main program (Stack)
│   ├── 📄 UserInputTest.java      # Comprehensive unit tests
│   ├── 📄 pom.xml                 # Maven build configuration
│   ├── 📁 config/                 # Static analysis configuration
│   ├── 📁 doc/                    # Generated Javadoc documentation
│   ├── 📄 run-tests.bat           # Windows test runner
│   ├── 📄 run-tests.sh            # Unix/Linux test runner
│   └── 📄 README.md               # Project documentation
├── 📄 README.md                   # This file
├── 📄 LICENSE                     # MIT License
├── 📄 CONTRIBUTING.md             # Contribution guidelines
├── 📄 CHANGELOG.md                # Version history
└── 📄 .gitignore                  # Git ignore rules
```

## 🚀 Quick Start

### Prerequisites

- **Java Development Kit (JDK) 8 or higher**
- **Command Line Interface** (PowerShell, Command Prompt, or Terminal)
- **Maven 3.6+** (for Module 5 project)

### Running the Projects

#### Module 4 Project (LinkedList)
```bash
cd Module-4-Project
javac UserInput.java
java UserInput
```

#### Module 5 Project (Stack with Testing)
```bash
cd Module-5-Project
javac UserInput.java
java UserInput

# Or run with comprehensive testing
run-tests.bat    # Windows
./run-tests.sh   # Unix/Linux/macOS
```

## 📊 Project Comparison

| Feature | Module 4 | Module 5 |
|---------|-----------|----------|
| **Data Structure** | LinkedList | Stack |
| **Architecture** | Pipeline Pattern | Maintenance Task |
| **Testing** | Manual Testing | Unit Tests (13 cases) |
| **Code Coverage** | N/A | 95%+ with JaCoCo |
| **Static Analysis** | N/A | Checkstyle, PMD, SpotBugs |
| **Build System** | Manual | Maven |
| **Documentation** | Design Docs | Comprehensive Guides |

## 🎯 Learning Objectives

### Module 4 Project
- **Pipeline Architecture**: Sequential data processing stages
- **Design Patterns**: Facade, Strategy, Collection, Template Method
- **Code Reuse**: Leveraging 8+ Java API components
- **Documentation**: Design and code reuse documentation

### Module 5 Project
- **Maintenance Tasks**: Refactoring from LinkedList to Stack
- **Unit Testing**: Comprehensive test suite with 100% pass rate
- **Code Coverage**: JaCoCo integration with coverage thresholds
- **Static Analysis**: Multi-tool code quality analysis
- **Build Automation**: Maven-based build and test pipeline

## 🧪 Testing & Quality Assurance

### Module 4 Project
- **Manual Testing**: Various input scenarios
- **Design Documentation**: Comprehensive architecture docs
- **Code Reuse Analysis**: Detailed reuse documentation

### Module 5 Project
- **Unit Testing**: 13 comprehensive test cases
- **Code Coverage**: 95%+ instruction coverage
- **Static Analysis**: Checkstyle, PMD, SpotBugs
- **Automated Testing**: Maven-based test execution
- **Cross-Platform**: Windows and Unix/Linux support

## 📚 Documentation

### Project Documentation
- **Module 4**: Design documentation, code reuse analysis
- **Module 5**: Comprehensive testing guide, implementation summary
- **Root Level**: Project overview, contribution guidelines

### Generated Documentation
- **Javadoc**: API documentation for both projects
- **Test Reports**: Unit test results and coverage reports
- **Static Analysis**: Code quality and style reports

## 🔧 Development Tools

### Module 4 Project
- **Java Compiler**: Standard javac
- **Text Editor**: Any Java-capable editor
- **Version Control**: Git

### Module 5 Project
- **Maven**: Build automation and dependency management
- **JaCoCo**: Code coverage analysis
- **Checkstyle**: Code style analysis
- **PMD**: Code quality analysis
- **SpotBugs**: Bug detection
- **JUnit**: Unit testing framework

## 🤝 Contributing

We welcome contributions! Please see our [Contributing Guidelines](CONTRIBUTING.md) for details.

### Development Workflow

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Make your changes
4. Commit your changes (`git commit -m 'Add amazing feature'`)
5. Push to the branch (`git push origin feature/amazing-feature`)
6. Open a Pull Request

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Larry J. Cameron**
- **Course**: Module 6 - Project 6
- **Institution**: Merrimack College
- **Version**: 1.0
- **Date**: September 2025

## 📈 Version History

See [CHANGELOG.md](CHANGELOG.md) for detailed version history.

## 🔍 Code Quality Metrics

### Module 4 Project
- **Lines of Code**: ~40 lines (85% reduction through reuse)
- **Cyclomatic Complexity**: Low (simple pipeline flow)
- **Documentation Coverage**: 100% (comprehensive docs)

### Module 5 Project
- **Test Success Rate**: 100% (13/13 tests passing)
- **Code Coverage**: 95%+ instruction coverage
- **Static Analysis**: 0 issues found
- **Build Success**: Clean Maven build

## 📞 Support

If you have any questions or need help, please:

1. Check the project-specific documentation
2. Search existing issues
3. Create a new issue

## 🎉 Acknowledgments

- **Java Community**: For excellent documentation and resources
- **Open Source Tools**: Maven, JUnit, JaCoCo, Checkstyle, PMD, SpotBugs
- **GitHub**: For hosting and collaboration tools
- **Academic Community**: For learning and development opportunities

---

<div align="center">

**Comprehensive Java Projects with Professional Documentation** 🎯

*Module 6 - Project 6*

[Module 4 Project](Module-4-Project/) · [Module 5 Project](Module-5-Project/) · [View Documentation](DOCUMENTATION_GUIDE.md)

</div>
