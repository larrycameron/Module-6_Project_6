# 📝 Changelog

All notable changes to the Stack Integer Sorter project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- Enhanced documentation following GitHub best practices
- Comprehensive CONTRIBUTING.md guidelines
- CODE_OF_CONDUCT.md for community standards
- ISSUE_TEMPLATE.md for bug reports
- MIT License file
- .gitignore for proper version control

### Changed
- Updated README.md with modern GitHub documentation standards
- Improved project structure documentation
- Enhanced troubleshooting section with platform-specific commands

## [1.1.0] - 2025-09-XX

### Added
- **Maintenance Task**: Converted from LinkedList to Stack implementation
- Comprehensive Javadoc documentation
- Error handling for non-integer inputs
- Support for both space and comma-separated input
- Collections Framework integration

### Changed
- **BREAKING**: Replaced `LinkedList<Integer>` with `Stack<Integer>`
- Updated class documentation to reflect maintenance changes
- Improved input parsing to handle mixed separators
- Enhanced error messages for invalid input

### Technical Details
- Uses `Collections.sort()` for efficient sorting
- Implements try-with-resources for proper resource management
- Maintains ascending order: smallest at bottom, largest at top
- Preserves all original functionality from Project #4

### Migration Notes
- **From Project #4**: This is a maintenance update, not a rewrite
- **Data Structure**: LinkedList → Stack (minimal code changes)
- **API Compatibility**: Input/output format remains unchanged
- **Performance**: No significant performance impact

## [1.0.0] - 2025-09-XX (Project #4)

### Added
- Initial implementation with LinkedList<Integer>
- Basic integer input parsing
- Ascending order sorting
- Command-line interface
- Basic error handling

### Features
- Accepts space or comma-separated integers
- Stores integers in LinkedList
- Sorts using Collections.sort()
- Displays sorted results

---

## 📋 Version Legend

- **Added** for new features
- **Changed** for changes in existing functionality
- **Deprecated** for soon-to-be removed features
- **Removed** for now removed features
- **Fixed** for any bug fixes
- **Security** for vulnerability fixes

## 🔗 Links

- [Project #4 (LinkedList Implementation)](https://github.com/yourusername/project-4)
- [Module 6 Documentation](https://github.com/yourusername/module-6-docs)
- [Contributing Guidelines](CONTRIBUTING.md)
- [Code of Conduct](CODE_OF_CONDUCT.md)

---

**Note**: Dates are in YYYY-MM-DD format. Unreleased changes are listed under the [Unreleased] section.
