import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

/**
 *  PROGRAM DESIGN DOCUMENTATION
 *  ============================
 *  
 *  ARCHITECTURE: Pipeline Architecture Pattern
 *  The program follows a sequential data processing pipeline where data flows through
 *  distinct processing stages: Input → Parsing → Storage → Processing → Output
 *  
 *  DESIGN PATTERNS IMPLEMENTED:
 *  1. Pipeline Pattern - Sequential data processing stages
 *  2. Facade Pattern - Scanner class as input interface
 *  3. Strategy Pattern - Regex-based parsing strategy
 *  4. Collection Pattern - LinkedList for dynamic storage
 *  5. Template Method Pattern - Collections.sort() algorithm
 *  
 *  COMPONENT ARCHITECTURE:
 *  ┌─────────────┐    ┌──────────────┐    ┌─────────────┐    ┌─────────────┐
 *  │   INPUT     │    │   PARSING    │    │  STORAGE    │    │ PROCESSING  │
 *  │   LAYER     │───▶│    LAYER     │───▶│   LAYER     │───▶│    LAYER    │
 *  │  Scanner    │    │ String.split │    │ LinkedList  │    │Collections  │
 *  └─────────────┘    └──────────────┘    └─────────────┘    └─────────────┘
 *  
 *  DATA FLOW DESIGN:
 *  Raw Input → String Line → String[] Tokens → LinkedList<Integer> → Sorted List → Output
 *  
 *  COMPLEXITY ANALYSIS:
 *  Time Complexity: O(k log k) where k = number of integers (dominated by sorting)
 *  Space Complexity: O(k) where k = number of integers
 *  
 *  DESIGN DECISIONS:
 *  - Monolithic single-class design for simplicity
 *  - Static main method (no state management required)
 *  - LinkedList chosen for efficient insertion operations
 *  - Built-in Collections.sort() for optimized sorting
 *  - Implicit error handling through Java's exception system
 *  
 *  CODE REUSE DOCUMENTATION:
 *  This program demonstrates extensive code reuse by leveraging existing Java API classes
 *  and methods rather than implementing functionality from scratch:
 *  
 *  1. Scanner Class (java.util.Scanner) - REUSED for input handling
 *     - Reusing existing input parsing functionality instead of writing custom input reader
 *     - Leveraging nextLine() method for complete line input processing
 *     - Utilizing close() method for proper resource management
 *  
 *  2. LinkedList Collection (java.util.LinkedList) - REUSED for data storage
 *     - Reusing existing dynamic list implementation instead of creating custom array management
 *     - Leveraging add() method for element insertion
 *     - Utilizing built-in memory management and resizing capabilities
 *  
 *  3. Collections Utility Class (java.util.Collections) - REUSED for sorting
 *     - Reusing existing sorting algorithm implementation instead of writing custom sort
 *     - Leveraging sort() method with optimized sorting algorithms
 *     - Utilizing built-in comparison and ordering logic
 *  
 *  4. String.split() Method - REUSED for input parsing
 *     - Reusing existing regex-based string splitting functionality
 *     - Leveraging "[ ,]+" pattern for flexible delimiter handling
 *     - Utilizing built-in tokenization instead of manual parsing
 *  
 *  5. Integer.parseInt() Method - REUSED for type conversion
 *     - Reusing existing string-to-integer conversion functionality
 *     - Leveraging built-in number parsing and validation
 *     - Utilizing exception handling for invalid input
 *  
 *  TOTAL CODE REUSE: 5 major Java API components reused, eliminating need to implement
 *  custom input handling, data structures, sorting algorithms, string parsing, and type conversion.
 */
public class UserInput {

    /**
     * Main method that demonstrates the pipeline architecture and code reuse.
     * @param args command-line arguments (not used in development of this program)
     */
    public static void main(String[] args) {
        // CODE REUSE EXAMPLE 1: Scanner Class - Reusing existing input handling
        // Instead of writing custom input reader, we reuse the proven Scanner class
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Enter a series of integers seperated by a space or comma: ");

        // CODE REUSE EXAMPLE 2: Scanner.nextLine() - Reusing existing line reading method
        // Leveraging built-in method instead of implementing custom line input processing
        String line = scanner.nextLine();

        // Process the input and get sorted result
        List<Integer> sortedNumbers = processInput(line);
        
        // Prints the final sorted list of integers.
        System.out.println("User Entered: " + sortedNumbers);
    
        // CODE REUSE EXAMPLE 7: Scanner.close() - Reusing existing resource management
        // Leveraging built-in cleanup method instead of manual resource handling
        scanner.close();
    }

    /**
     * Processes input string and returns sorted list of integers.
     * This method is extracted for testability while maintaining the same functionality.
     * 
     * @param input the input string containing integers separated by spaces or commas
     * @return sorted list of integers
     * @throws NumberFormatException if input contains non-numeric values
     */
    public static List<Integer> processInput(String input) {
        // CODE REUSE EXAMPLE 3: String.split() - Reusing existing string parsing functionality
        // Using built-in regex-based splitting instead of writing custom tokenizer
        String[] tokens = input.split("[ ,]+");
        
        // CODE REUSE EXAMPLE 4: LinkedList - Reusing existing dynamic list implementation
        // Utilizing proven data structure instead of creating custom array management
        LinkedList<Integer> list = new LinkedList<>();
       
        // CODE REUSE EXAMPLE 5: Integer.parseInt() and LinkedList.add() - Reusing existing methods
        // Leveraging built-in type conversion and list insertion instead of custom implementations
        for (String token : tokens) {
            if (!token.trim().isEmpty()) { // Skip empty tokens
                int num = Integer.parseInt(token);  // REUSED: Built-in string-to-int conversion
                list.add(num);                      // REUSED: Built-in list insertion method
            }
        }

        // CODE REUSE EXAMPLE 6: Collections.sort() - Reusing existing sorting algorithm
        // Using optimized sorting implementation instead of writing custom sort (bubble, quick, etc.)
        Collections.sort(list);
        
        return list;
    }

    /**
     * Validates if the input string contains only valid integer tokens.
     * 
     * @param input the input string to validate
     * @return true if all tokens are valid integers, false otherwise
     */
    public static boolean isValidInput(String input) {
        if (input == null || input.trim().isEmpty()) {
            return false;
        }
        
        String[] tokens = input.split("[ ,]+");
        for (String token : tokens) {
            if (!token.trim().isEmpty()) {
                try {
                    Integer.parseInt(token.trim());
                } catch (NumberFormatException e) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Counts the number of integers in the input string.
     * 
     * @param input the input string to count integers in
     * @return number of valid integers found
     */
    public static int countIntegers(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        
        String[] tokens = input.split("[ ,]+");
        int count = 0;
        for (String token : tokens) {
            if (!token.trim().isEmpty()) {
                try {
                    Integer.parseInt(token.trim());
                    count++;
                } catch (NumberFormatException e) {
                    // Skip invalid tokens
                }
            }
        }
        return count;
    }
}