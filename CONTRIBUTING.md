# Contributing to Module 4 Project 4

Thank you for your interest in contributing to this project! This document provides guidelines and information for contributors.

## 📋 Table of Contents

- [Code of Conduct](#code-of-conduct)
- [Getting Started](#getting-started)
- [Development Process](#development-process)
- [Coding Standards](#coding-standards)
- [Pull Request Process](#pull-request-process)
- [Issue Reporting](#issue-reporting)

## 🤝 Code of Conduct

This project follows a code of conduct that we expect all contributors to adhere to:

- Be respectful and inclusive
- Use welcoming and inclusive language
- Be respectful of differing viewpoints and experiences
- Accept constructive criticism gracefully
- Focus on what is best for the community
- Show empathy towards other community members

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Git
- A text editor or IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Setting Up the Development Environment

1. **Fork the repository**
   ```bash
   # Click the "Fork" button on GitHub
   ```

2. **Clone your fork**
   ```bash
   git clone https://github.com/YOUR_USERNAME/module-4-project-4.git
   cd module-4-project-4
   ```

3. **Add the original repository as upstream**
   ```bash
   git remote add upstream https://github.com/ORIGINAL_OWNER/module-4-project-4.git
   ```

4. **Compile and test the project**
   ```bash
   javac src/UserInput.java
   java -cp src UserInput
   ```

## 🔄 Development Process

### Branch Naming Convention

Use descriptive branch names that indicate the type of change:

- `feature/description` - New features
- `bugfix/description` - Bug fixes
- `docs/description` - Documentation updates
- `refactor/description` - Code refactoring
- `test/description` - Test additions or improvements

### Commit Message Format

Follow this format for commit messages:

```
type(scope): brief description

Detailed description of the change (optional)

Closes #issue_number (if applicable)
```

**Types:**
- `feat`: New feature
- `fix`: Bug fix
- `docs`: Documentation changes
- `style`: Code style changes (formatting, etc.)
- `refactor`: Code refactoring
- `test`: Adding or updating tests
- `chore`: Maintenance tasks

**Examples:**
```
feat(input): add support for semicolon delimiters

Add parsing support for semicolon-separated integers in addition to spaces and commas.

Closes #12
```

```
fix(sorting): correct integer comparison logic

Fix edge case where negative numbers were not sorted correctly.

Closes #8
```

## 📝 Coding Standards

### Java Code Style

- Follow Java naming conventions (camelCase for methods/variables, PascalCase for classes)
- Use meaningful variable and method names
- Add comments for complex logic
- Keep methods focused and single-purpose
- Use proper indentation (4 spaces)

### Documentation Standards

- Update README.md for user-facing changes
- Update design documentation for architectural changes
- Update code reuse documentation for new API usage
- Add JavaDoc comments for public methods

### Code Reuse Principles

This project emphasizes code reuse. When contributing:

- **Prefer existing Java API methods** over custom implementations
- **Document code reuse** in comments and documentation
- **Justify custom implementations** when they're necessary
- **Update code reuse documentation** when adding new API usage

## 🔀 Pull Request Process

### Before Submitting

1. **Ensure your code compiles and runs**
   ```bash
   javac src/UserInput.java
   java -cp src UserInput
   ```

2. **Test your changes thoroughly**
   - Test with various input formats
   - Test edge cases (empty input, single number, etc.)
   - Test error conditions

3. **Update documentation** if needed
   - README.md for user-facing changes
   - Design documentation for architectural changes
   - Code reuse documentation for new API usage

4. **Check your commit history**
   ```bash
   git log --oneline
   ```

### Creating a Pull Request

1. **Push your changes to your fork**
   ```bash
   git push origin your-branch-name
   ```

2. **Create a Pull Request on GitHub**
   - Use a descriptive title
   - Provide a detailed description
   - Link to any related issues
   - Include screenshots if applicable

3. **Fill out the Pull Request template**
   - Describe what changes were made
   - Explain why the changes were necessary
   - List any testing performed
   - Note any documentation updates

### Pull Request Review Process

- All pull requests require review
- Address feedback promptly
- Keep the discussion focused and constructive
- Be open to suggestions and improvements

## 🐛 Issue Reporting

### Before Creating an Issue

1. **Search existing issues** to avoid duplicates
2. **Check if it's already fixed** in the latest version
3. **Gather information** about the problem

### Creating a Good Issue Report

Use the issue template and include:

- **Clear, descriptive title**
- **Steps to reproduce** the issue
- **Expected behavior** vs actual behavior
- **Environment details** (Java version, OS, etc.)
- **Screenshots or error messages** if applicable

### Issue Labels

- `bug`: Something isn't working
- `enhancement`: New feature or request
- `documentation`: Improvements or additions to documentation
- `question`: Further information is requested
- `good first issue`: Good for newcomers
- `help wanted`: Extra attention is needed

## 🧪 Testing Guidelines

### Manual Testing

Test the program with various inputs:

```bash
# Test with spaces
echo "1 5 3 9 2" | java -cp src UserInput

# Test with commas
echo "10,20,5,15" | java -cp src UserInput

# Test with mixed delimiters
echo "1, 2 3, 4 5" | java -cp src UserInput

# Test edge cases
echo "" | java -cp src UserInput
echo "42" | java -cp src UserInput
```

### Test Cases to Consider

- **Valid inputs**: Various delimiter combinations
- **Edge cases**: Empty input, single number, duplicates
- **Error cases**: Invalid characters, non-numeric input
- **Performance**: Large input sets

## 📚 Documentation Guidelines

### When to Update Documentation

- **README.md**: User-facing changes, new features, installation changes
- **Design Documentation**: Architectural changes, new design patterns
- **Code Reuse Documentation**: New API usage, changes to existing reuse
- **JavaDoc**: New public methods or significant changes

### Documentation Standards

- Use clear, concise language
- Include code examples where helpful
- Keep documentation up-to-date with code changes
- Use proper markdown formatting

## 🎯 Project Goals

This project demonstrates:

- **Software Architecture**: Pipeline pattern implementation
- **Design Patterns**: Multiple pattern integration
- **Code Reuse**: Leveraging existing APIs effectively
- **Java Programming**: Collections, I/O, and algorithms
- **Documentation**: Comprehensive project documentation
- **Best Practices**: Clean code and proper resource management

## 📞 Getting Help

If you need help:

1. **Check the documentation** in the `docs/` folder
2. **Search existing issues** for similar problems
3. **Create a new issue** with detailed information
4. **Ask questions** in issue comments

## 🙏 Recognition

Contributors will be recognized in:

- README.md contributors section
- Release notes
- Project documentation

Thank you for contributing to this project! Your efforts help make it better for everyone.

