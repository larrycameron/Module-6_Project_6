# Code Reuse Documentation - Module 4 Project 4

## Overview
This document provides explicit documentation of code reuse examples in the UserInput.java program, demonstrating how existing Java API components were leveraged instead of implementing functionality from scratch.

## Code Reuse Examples

### 1. Scanner Class (java.util.Scanner)
**Location:** Line 50 in UserInput.java
**Reused Functionality:**
- Input stream handling from System.in
- Line-by-line input reading capabilities
- Resource management and cleanup

**Why This is Code Reuse:**
- Instead of writing custom input reader that handles different input streams
- Instead of implementing buffered reading and character parsing
- Instead of creating custom resource management for input streams

**Alternative (What We Avoided):**
```java
// Custom input reader (NOT implemented - we reused Scanner instead)
public class CustomInputReader {
    private BufferedReader reader;
    // Custom implementation of input handling...
}
```

### 2. Scanner.nextLine() Method
**Location:** Line 55 in UserInput.java
**Reused Functionality:**
- Complete line reading from input stream
- Automatic handling of line terminators
- String conversion and buffering

**Why This is Code Reuse:**
- Instead of implementing custom line reading logic
- Instead of handling different line ending characters (\n, \r\n)
- Instead of managing input buffering manually

### 3. String.split() Method
**Location:** Line 59 in UserInput.java
**Reused Functionality:**
- Regular expression-based string splitting
- Flexible delimiter handling
- Array creation and tokenization

**Why This is Code Reuse:**
- Instead of writing custom string parser for delimiters
- Instead of implementing regex matching logic
- Instead of creating custom tokenization algorithm

**Alternative (What We Avoided):**
```java
// Custom string splitting (NOT implemented - we reused String.split())
public String[] customSplit(String input, String delimiter) {
    // Custom implementation of string splitting...
}
```

### 4. LinkedList Collection (java.util.LinkedList)
**Location:** Line 63 in UserInput.java
**Reused Functionality:**
- Dynamic list implementation
- Automatic memory management
- Element insertion and retrieval methods

**Why This is Code Reuse:**
- Instead of implementing custom dynamic array
- Instead of writing memory management for list growth
- Instead of creating custom insertion/deletion algorithms

**Alternative (What We Avoided):**
```java
// Custom dynamic list (NOT implemented - we reused LinkedList)
public class CustomList<T> {
    private T[] array;
    private int size;
    // Custom implementation of dynamic list...
}
```

### 5. Integer.parseInt() Method
**Location:** Line 68 in UserInput.java
**Reused Functionality:**
- String-to-integer conversion
- Number format validation
- Exception handling for invalid input

**Why This is Code Reuse:**
- Instead of implementing custom string-to-number conversion
- Instead of writing number validation logic
- Instead of creating custom exception handling

**Alternative (What We Avoided):**
```java
// Custom string to int conversion (NOT implemented - we reused parseInt())
public int customParseInt(String str) {
    // Custom implementation of string to integer conversion...
}
```

### 6. LinkedList.add() Method
**Location:** Line 69 in UserInput.java
**Reused Functionality:**
- Element insertion into list
- Automatic list resizing
- Memory allocation management

**Why This is Code Reuse:**
- Instead of implementing custom element insertion
- Instead of writing list resizing logic
- Instead of managing memory allocation manually

### 7. Collections.sort() Method
**Location:** Line 74 in UserInput.java
**Reused Functionality:**
- Optimized sorting algorithm (typically TimSort)
- Generic comparison handling
- In-place sorting with efficient memory usage

**Why This is Code Reuse:**
- Instead of implementing custom sorting algorithms (bubble sort, quick sort, etc.)
- Instead of writing comparison logic for different data types
- Instead of optimizing sorting performance manually

**Alternative (What We Avoided):**
```java
// Custom sorting implementation (NOT implemented - we reused Collections.sort())
public void customSort(List<Integer> list) {
    // Custom implementation of sorting algorithm...
    // Could be bubble sort, quick sort, merge sort, etc.
}
```

### 8. Scanner.close() Method
**Location:** Line 81 in UserInput.java
**Reused Functionality:**
- Resource cleanup and deallocation
- Stream closing and memory release
- Proper resource management

**Why This is Code Reuse:**
- Instead of implementing custom resource cleanup
- Instead of writing manual memory management
- Instead of creating custom stream closing logic

## Summary of Code Reuse Impact

### Total Reused Components: 8 Major Java API Elements
1. Scanner Class
2. Scanner.nextLine() Method
3. String.split() Method
4. LinkedList Collection
5. Integer.parseInt() Method
6. LinkedList.add() Method
7. Collections.sort() Method
8. Scanner.close() Method

### Lines of Code Saved Through Reuse
- **Estimated custom implementation:** ~200-300 lines of code
- **Actual implementation:** ~40 lines of code
- **Code reduction:** ~85% fewer lines due to reuse

### Functionality Avoided (Reused Instead)
- Custom input stream handling
- Custom string parsing and tokenization
- Custom dynamic data structure implementation
- Custom sorting algorithm implementation
- Custom type conversion logic
- Custom resource management
- Custom memory allocation and cleanup

### Benefits of Code Reuse
1. **Reliability:** Using tested, proven implementations
2. **Performance:** Leveraging optimized algorithms
3. **Maintainability:** Reducing custom code to maintain
4. **Standards Compliance:** Following Java API conventions
5. **Development Speed:** Faster implementation time
6. **Error Reduction:** Fewer bugs due to custom implementation

## Conclusion
This program demonstrates excellent code reuse practices by leveraging 8 different Java API components instead of implementing functionality from scratch. The explicit documentation above clearly identifies each instance of code reuse, explaining what was reused and what custom implementation was avoided.
