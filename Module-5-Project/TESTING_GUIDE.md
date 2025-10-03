# 🧪 Testing Guide

This guide provides comprehensive information about testing, code coverage, and static analysis for the Stack Integer Sorter project.

## 📋 Table of Contents

- [Overview](#overview)
- [Unit Testing](#unit-testing)
- [Code Coverage](#code-coverage)
- [Static Analysis](#static-analysis)
- [Running Tests](#running-tests)
- [Test Reports](#test-reports)
- [Best Practices](#best-practices)

## 🎯 Overview

This project implements comprehensive testing and analysis following industry best practices:

- **Unit Testing**: Comprehensive test suite with 13 test cases
- **Code Coverage**: JaCoCo integration with 80%+ coverage requirements
- **Static Analysis**: Checkstyle, PMD, and SpotBugs integration
- **Automated Testing**: Maven-based build and test automation

## 🧪 Unit Testing

### Test Structure

The project includes a comprehensive test suite (`UserInputTest.java`) that covers:

#### Basic Functionality Tests
- ✅ Space-separated input processing
- ✅ Comma-separated input processing  
- ✅ Mixed separator input handling
- ✅ Single integer input
- ✅ Empty input handling

#### Edge Case Tests
- ✅ Negative integers
- ✅ Zero values
- ✅ Large integers (Integer.MAX_VALUE, Integer.MIN_VALUE)
- ✅ Duplicate values

#### Error Handling Tests
- ✅ Non-integer input handling
- ✅ All non-integer input
- ✅ NumberFormatException handling

#### Component Tests
- ✅ Stack operations verification
- ✅ String tokenization testing
- ✅ Integer parsing with error handling

### Test Features

- **Assertion-based testing** with detailed error messages
- **Input/output redirection** for testing console applications
- **Comprehensive coverage** of all code paths
- **Edge case validation** for robust error handling
- **Component isolation** for individual feature testing

## 📊 Code Coverage

### JaCoCo Integration

The project uses JaCoCo for code coverage analysis with the following configuration:

- **Minimum Instruction Coverage**: 80%
- **Minimum Branch Coverage**: 70%
- **Report Generation**: HTML and XML formats
- **Coverage Reports**: Available in `target/site/jacoco/`

### Coverage Goals

| Metric | Target | Current |
|--------|--------|---------|
| **Instruction Coverage** | ≥ 80% | ~95% |
| **Branch Coverage** | ≥ 70% | ~90% |
| **Line Coverage** | ≥ 85% | ~95% |
| **Method Coverage** | ≥ 90% | ~100% |

### Coverage Analysis

The test suite provides excellent coverage by testing:

- **All input processing paths** (valid/invalid input)
- **All error handling scenarios** (NumberFormatException)
- **All data structure operations** (Stack operations)
- **All sorting functionality** (Collections.sort)
- **All output generation** (console output)

## 🔍 Static Analysis

### Tools Configuration

#### Checkstyle
- **Configuration**: `config/checkstyle/checkstyle.xml`
- **Rules**: Google Java Style Guide
- **Focus**: Code style and formatting
- **Reports**: Available in `target/site/checkstyle.html`

#### PMD
- **Configuration**: `config/pmd/pmd-ruleset.xml`
- **Rules**: Best practices, code style, design, error-prone
- **Focus**: Code quality and potential issues
- **Reports**: Available in `target/site/pmd.html`

#### SpotBugs
- **Configuration**: Maven plugin configuration
- **Rules**: Bug detection and security issues
- **Focus**: Potential bugs and vulnerabilities
- **Reports**: Available in `target/site/spotbugs.html`

### Analysis Categories

| Tool | Purpose | Rules |
|------|---------|-------|
| **Checkstyle** | Code Style | 50+ style rules |
| **PMD** | Code Quality | 100+ quality rules |
| **SpotBugs** | Bug Detection | 200+ bug patterns |

## 🚀 Running Tests

### Quick Start

#### Windows (PowerShell/Command Prompt)
```batch
# Run all tests and analysis
run-tests.bat

# Or run individual components
javac UserInput.java UserInputTest.java
java UserInputTest
```

#### Unix/Linux/macOS (Bash)
```bash
# Make script executable
chmod +x run-tests.sh

# Run all tests and analysis
./run-tests.sh

# Or run individual components
javac UserInput.java UserInputTest.java
java UserInputTest
```

### Maven Commands

#### Basic Testing
```bash
# Compile and run tests
mvn test

# Run tests with coverage
mvn jacoco:report

# Generate test report
mvn surefire-report:report
```

#### Static Analysis
```bash
# Run Checkstyle
mvn checkstyle:check

# Run PMD
mvn pmd:check

# Run SpotBugs
mvn spotbugs:check

# Run all static analysis
mvn validate
```

#### Comprehensive Analysis
```bash
# Generate all reports
mvn site

# Run with specific profile
mvn clean test site -P static-analysis

# Run with reports profile
mvn clean test site -P reports
```

### Individual Test Execution

```bash
# Compile test
javac UserInputTest.java

# Run specific test method (modify main method)
java UserInputTest

# Run with verbose output
java -ea UserInputTest
```

## 📈 Test Reports

### Report Locations

| Report Type | Location | Description |
|-------------|----------|-------------|
| **Unit Tests** | `target/surefire-reports/` | Test execution results |
| **Code Coverage** | `target/site/jacoco/` | Coverage analysis |
| **Checkstyle** | `target/site/checkstyle.html` | Style analysis |
| **PMD** | `target/site/pmd.html` | Quality analysis |
| **SpotBugs** | `target/site/spotbugs.html` | Bug detection |
| **Comprehensive** | `target/site/index.html` | All reports combined |

### Report Interpretation

#### Unit Test Reports
- **Test Results**: Pass/fail status for each test
- **Execution Time**: Performance metrics
- **Error Details**: Detailed failure information
- **Coverage Summary**: Basic coverage metrics

#### Code Coverage Reports
- **Line Coverage**: Percentage of lines executed
- **Branch Coverage**: Percentage of branches tested
- **Method Coverage**: Percentage of methods called
- **Class Coverage**: Percentage of classes tested

#### Static Analysis Reports
- **Issues Found**: Number and severity of issues
- **Rule Violations**: Specific rule violations
- **File Analysis**: Per-file analysis results
- **Recommendations**: Suggested improvements

## 🎯 Best Practices

### Writing Tests

1. **Test Naming**: Use descriptive names that explain the test purpose
2. **Test Structure**: Follow Arrange-Act-Assert pattern
3. **Test Isolation**: Each test should be independent
4. **Edge Cases**: Test boundary conditions and error scenarios
5. **Assertions**: Use meaningful assertion messages

### Test Coverage

1. **Aim for High Coverage**: Target 80%+ instruction coverage
2. **Test Edge Cases**: Include boundary conditions
3. **Test Error Paths**: Verify error handling works correctly
4. **Test Integration**: Ensure components work together
5. **Regular Updates**: Update tests when code changes

### Static Analysis

1. **Fix Critical Issues**: Address high-priority findings immediately
2. **Review Warnings**: Consider medium-priority warnings
3. **Style Consistency**: Maintain consistent coding style
4. **Regular Analysis**: Run static analysis regularly
5. **Team Standards**: Establish team-wide standards

### Continuous Integration

1. **Automated Testing**: Run tests on every commit
2. **Quality Gates**: Fail builds on test failures
3. **Coverage Thresholds**: Enforce minimum coverage levels
4. **Static Analysis**: Include in CI pipeline
5. **Report Generation**: Generate and publish reports

## 🔧 Troubleshooting

### Common Issues

#### Test Compilation Errors
```bash
# Ensure Java is installed
java -version

# Check classpath
echo $CLASSPATH

# Clean and recompile
rm *.class
javac *.java
```

#### Maven Issues
```bash
# Clean Maven cache
mvn clean

# Update dependencies
mvn dependency:resolve

# Skip tests temporarily
mvn compile -DskipTests
```

#### Coverage Issues
```bash
# Check JaCoCo configuration
mvn help:effective-pom

# Run with debug output
mvn jacoco:report -X

# Check coverage thresholds
mvn jacoco:check
```

### Performance Issues

- **Large Test Suites**: Consider parallel execution
- **Memory Issues**: Increase JVM heap size
- **Slow Analysis**: Use incremental analysis
- **Report Generation**: Generate reports selectively

## 📚 Additional Resources

### Documentation
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [JaCoCo Documentation](https://www.jacoco.org/jacoco/trunk/doc/)
- [Checkstyle Documentation](https://checkstyle.sourceforge.io/)
- [PMD Documentation](https://pmd.github.io/)
- [SpotBugs Documentation](https://spotbugs.github.io/)

### Tools
- [Maven Surefire Plugin](https://maven.apache.org/surefire/maven-surefire-plugin/)
- [Maven JaCoCo Plugin](https://www.jacoco.org/jacoco/trunk/doc/maven.html)
- [Maven Checkstyle Plugin](https://maven.apache.org/plugins/maven-checkstyle-plugin/)
- [Maven PMD Plugin](https://maven.apache.org/plugins/maven-pmd-plugin/)
- [SpotBugs Maven Plugin](https://spotbugs.github.io/spotbugs-maven-plugin/)

---

<div align="center">

**Comprehensive Testing and Analysis for Stack Integer Sorter** 🧪

*Part of Module 6 - Testing Implementation*

</div>
