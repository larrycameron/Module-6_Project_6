# 🤝 Contributing to Stack Integer Sorter

Thank you for your interest in contributing to this project! This document provides guidelines and information for contributors.

## 📋 Table of Contents

- [Code of Conduct](#code-of-conduct)
- [Getting Started](#getting-started)
- [Development Process](#development-process)
- [Pull Request Process](#pull-request-process)
- [Coding Standards](#coding-standards)
- [Testing](#testing)
- [Documentation](#documentation)

## 📜 Code of Conduct

This project adheres to our [Code of Conduct](CODE_OF_CONDUCT.md). By participating, you agree to uphold this code.

## 🚀 Getting Started

### Prerequisites

- **Java Development Kit (JDK) 8 or higher**
- **Git** for version control
- **Command Line Interface** (PowerShell, Command Prompt, or Terminal)
- **Text Editor** or **IDE** (VS Code, IntelliJ IDEA, Eclipse, etc.)

### Setting Up Development Environment

1. **Fork the repository** on GitHub
2. **Clone your fork** locally:
   ```bash
   git clone https://github.com/yourusername/Module-5-Project-5.git
   cd Module-5-Project-5
   ```

3. **Add upstream remote**:
   ```bash
   git remote add upstream https://github.com/originalowner/Module-5-Project-5.git
   ```

4. **Verify setup**:
   ```bash
   javac UserInput.java
   java UserInput
   ```

## 🔄 Development Process

### Branch Strategy

- **`main`**: Production-ready code
- **`develop`**: Integration branch for features
- **`feature/*`**: New features or enhancements
- **`bugfix/*`**: Bug fixes
- **`hotfix/*`**: Critical production fixes

### Creating a Feature Branch

```bash
# Update main branch
git checkout main
git pull upstream main

# Create feature branch
git checkout -b feature/your-feature-name

# Example: feature/add-validation
# Example: feature/improve-error-handling
# Example: feature/add-unit-tests
```

## 📝 Pull Request Process

### Before Submitting

1. **Test your changes**:
   ```bash
   javac UserInput.java
   java UserInput
   # Test with various inputs
   ```

2. **Generate documentation**:
   ```bash
   javadoc -d doc -author -version UserInput.java
   ```

3. **Update CHANGELOG.md** if applicable

4. **Ensure code follows** our [Coding Standards](#coding-standards)

### Submitting a Pull Request

1. **Push your branch**:
   ```bash
   git push origin feature/your-feature-name
   ```

2. **Create Pull Request** on GitHub with:
   - **Clear title**: Brief description of changes
   - **Detailed description**: What, why, and how
   - **Reference issues**: Link to related issues
   - **Screenshots**: If UI changes are involved

3. **Template for PR description**:
   ```markdown
   ## Description
   Brief description of changes made.

   ## Type of Change
   - [ ] Bug fix
   - [ ] New feature
   - [ ] Documentation update
   - [ ] Code refactoring
   - [ ] Performance improvement

   ## Testing
   - [ ] Tested with various input formats
   - [ ] Verified error handling
   - [ ] Generated and reviewed Javadoc

   ## Checklist
   - [ ] Code follows project coding standards
   - [ ] Self-review completed
   - [ ] Documentation updated
   - [ ] No new warnings introduced
   ```

## 📏 Coding Standards

### Java Style Guidelines

1. **Naming Conventions**:
   - Classes: `PascalCase` (e.g., `UserInput`)
   - Methods: `camelCase` (e.g., `processInput`)
   - Variables: `camelCase` (e.g., `userInput`)
   - Constants: `UPPER_SNAKE_CASE` (e.g., `MAX_INPUT_SIZE`)

2. **Code Formatting**:
   - Use 4 spaces for indentation
   - Maximum line length: 120 characters
   - Braces on same line for control structures
   - Blank lines between methods

3. **Documentation**:
   - All public methods must have Javadoc
   - Include `@param`, `@return`, `@throws` where applicable
   - Use `@author` and `@version` tags
   - Inline comments for complex logic

4. **Error Handling**:
   - Use try-catch blocks appropriately
   - Provide meaningful error messages
   - Log errors when necessary

### Example Code Style

```java
/**
 * Processes user input and returns sorted integers.
 * 
 * @param input the raw input string from user
 * @return sorted list of integers
 * @throws IllegalArgumentException if input is null or empty
 */
public List<Integer> processInput(String input) {
    if (input == null || input.trim().isEmpty()) {
        throw new IllegalArgumentException("Input cannot be null or empty");
    }
    
    // Process input logic here
    return sortedIntegers;
}
```

## 🧪 Testing

### Manual Testing

Test your changes with various inputs:

```bash
# Test space-separated input
echo "5 2 8 1 9" | java UserInput

# Test comma-separated input
echo "10,3,7,1,15" | java UserInput

# Test mixed separators
echo "7, 5 2 9 1" | java UserInput

# Test with non-integer input
echo "5 abc 3 def 7" | java UserInput

# Test empty input
echo "" | java UserInput
```

### Expected Behavior

- ✅ Valid integers are sorted in ascending order
- ✅ Non-integer tokens are skipped with error message
- ✅ Empty input is handled gracefully
- ✅ Mixed separators work correctly
- ✅ Program exits cleanly

## 📚 Documentation

### Javadoc Requirements

- **Class-level**: Description, author, version, since
- **Method-level**: Description, parameters, return value, exceptions
- **Field-level**: Description for public fields
- **Package-level**: Overview for package documentation

### Documentation Updates

When making changes that affect functionality:

1. **Update method Javadoc** if method signature changes
2. **Update class Javadoc** if class behavior changes
3. **Update README.md** if usage instructions change
4. **Update CHANGELOG.md** for version changes

## 🐛 Bug Reports

When reporting bugs, please include:

1. **Description**: Clear description of the issue
2. **Steps to Reproduce**: Detailed steps to reproduce
3. **Expected Behavior**: What should happen
4. **Actual Behavior**: What actually happens
5. **Environment**: Java version, OS, etc.
6. **Screenshots**: If applicable

## 💡 Feature Requests

When requesting features, please include:

1. **Use Case**: Why is this feature needed?
2. **Proposed Solution**: How should it work?
3. **Alternatives**: Other solutions considered
4. **Additional Context**: Any other relevant information

## 📞 Getting Help

- **Issues**: Use GitHub Issues for bug reports and feature requests
- **Discussions**: Use GitHub Discussions for questions and general discussion
- **Email**: Contact the maintainer directly for sensitive issues

## 🎉 Recognition

Contributors will be recognized in:
- **CONTRIBUTORS.md** file
- **Release notes** for significant contributions
- **GitHub contributors** page

## 📄 License

By contributing, you agree that your contributions will be licensed under the same MIT License that covers the project.

---

Thank you for contributing to Stack Integer Sorter! 🎉
