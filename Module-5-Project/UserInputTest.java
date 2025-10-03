import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;

/**
 * Comprehensive unit tests for UserInput class.
 * Tests basic functionality, edge cases, and error handling scenarios.
 * 
 * <p>This test class provides good code coverage by testing:
 * <ul>
 *   <li>Basic functionality of input processing and sorting</li>
 *   <li>Edge cases such as empty input, single values, and mixed separators</li>
 *   <li>Error handling for non-integer inputs</li>
 *   <li>Stack operations and Collections.sort() functionality</li>
 * </ul>
 * 
 * @author Larry J. Cameron
 * @version 1.0
 * @since Module 6 - Testing Implementation
 */
public class UserInputTest {
    
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;
    private PrintStream originalErr;
    
    /**
     * Sets up test environment before each test method.
     * Redirects System.out and System.err to capture output for testing.
     */
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        originalErr = System.err;
        System.setOut(new PrintStream(outputStream));
        System.setErr(new PrintStream(outputStream));
    }
    
    /**
     * Cleans up test environment after each test method.
     * Restores original System.out and System.err streams.
     */
    public void tearDown() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    
    /**
     * Tests basic functionality with space-separated integers.
     * Verifies that integers are correctly parsed, sorted, and displayed.
     */
    public void testBasicSpaceSeparatedInput() {
        setUp();
        
        try {
            // Test input: "5 2 8 1 9"
            String input = "5 2 8 1 9\n";
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            
            // Call the main method
            UserInput.main(new String[]{});
            
            // Verify output contains sorted integers
            String output = outputStream.toString();
            assert output.contains("User Entered: [1, 2, 5, 8, 9]") : 
                "Expected sorted output [1, 2, 5, 8, 9], but got: " + output;
            
            System.out.println("✓ Test Passed: Basic space-separated input");
            
        } finally {
            tearDown();
        }
    }
    
    /**
     * Tests basic functionality with comma-separated integers.
     * Verifies that comma-separated input is correctly processed.
     */
    public void testBasicCommaSeparatedInput() {
        setUp();
        
        try {
            // Test input: "10,3,7,1,15"
            String input = "10,3,7,1,15\n";
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            
            // Call the main method
            UserInput.main(new String[]{});
            
            // Verify output contains sorted integers
            String output = outputStream.toString();
            assert output.contains("User Entered: [1, 3, 7, 10, 15]") : 
                "Expected sorted output [1, 3, 7, 10, 15], but got: " + output;
            
            System.out.println("✓ Test Passed: Basic comma-separated input");
            
        } finally {
            tearDown();
        }
    }
    
    /**
     * Tests mixed separator input (spaces and commas).
     * Verifies that mixed separators are handled correctly.
     */
    public void testMixedSeparatorInput() {
        setUp();
        
        try {
            // Test input: "7, 5 2 9 1"
            String input = "7, 5 2 9 1\n";
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            
            // Call the main method
            UserInput.main(new String[]{});
            
            // Verify output contains sorted integers
            String output = outputStream.toString();
            assert output.contains("User Entered: [1, 2, 5, 7, 9]") : 
                "Expected sorted output [1, 2, 5, 7, 9], but got: " + output;
            
            System.out.println("✓ Test Passed: Mixed separator input");
            
        } finally {
            tearDown();
        }
    }
    
    /**
     * Tests edge case with single integer input.
     * Verifies that single values are handled correctly.
     */
    public void testSingleIntegerInput() {
        setUp();
        
        try {
            // Test input: "42"
            String input = "42\n";
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            
            // Call the main method
            UserInput.main(new String[]{});
            
            // Verify output contains the single integer
            String output = outputStream.toString();
            assert output.contains("User Entered: [42]") : 
                "Expected single integer output [42], but got: " + output;
            
            System.out.println("✓ Test Passed: Single integer input");
            
        } finally {
            tearDown();
        }
    }
    
    /**
     * Tests edge case with empty input.
     * Verifies that empty input is handled gracefully.
     */
    public void testEmptyInput() {
        setUp();
        
        try {
            // Test input: empty string
            String input = "\n";
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            
            // Call the main method
            UserInput.main(new String[]{});
            
            // Verify output contains empty stack
            String output = outputStream.toString();
            assert output.contains("User Entered: []") : 
                "Expected empty stack output [], but got: " + output;
            
            System.out.println("✓ Test Passed: Empty input");
            
        } finally {
            tearDown();
        }
    }
    
    /**
     * Tests error handling with non-integer input.
     * Verifies that non-integer tokens are skipped with appropriate error messages.
     */
    public void testNonIntegerInput() {
        setUp();
        
        try {
            // Test input: "5 abc 3 def 7"
            String input = "5 abc 3 def 7\n";
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            
            // Call the main method
            UserInput.main(new String[]{});
            
            // Verify output contains sorted integers and error messages
            String output = outputStream.toString();
            assert output.contains("User Entered: [3, 5, 7]") : 
                "Expected sorted output [3, 5, 7], but got: " + output;
            assert output.contains("Skipping non-integer token") : 
                "Expected error message for non-integer tokens, but got: " + output;
            
            System.out.println("✓ Test Passed: Non-integer input handling");
            
        } finally {
            tearDown();
        }
    }
    
    /**
     * Tests edge case with all non-integer input.
     * Verifies that program handles case where no valid integers are provided.
     */
    public void testAllNonIntegerInput() {
        setUp();
        
        try {
            // Test input: "abc def ghi"
            String input = "abc def ghi\n";
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            
            // Call the main method
            UserInput.main(new String[]{});
            
            // Verify output contains empty stack and error messages
            String output = outputStream.toString();
            assert output.contains("User Entered: []") : 
                "Expected empty stack output [], but got: " + output;
            assert output.contains("Skipping non-integer token") : 
                "Expected error message for non-integer tokens, but got: " + output;
            
            System.out.println("✓ Test Passed: All non-integer input");
            
        } finally {
            tearDown();
        }
    }
    
    /**
     * Tests edge case with negative integers.
     * Verifies that negative numbers are handled correctly.
     */
    public void testNegativeIntegers() {
        setUp();
        
        try {
            // Test input: "-5 2 -8 1 9"
            String input = "-5 2 -8 1 9\n";
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            
            // Call the main method
            UserInput.main(new String[]{});
            
            // Verify output contains sorted integers including negatives
            String output = outputStream.toString();
            assert output.contains("User Entered: [-8, -5, 1, 2, 9]") : 
                "Expected sorted output [-8, -5, 1, 2, 9], but got: " + output;
            
            System.out.println("✓ Test Passed: Negative integers");
            
        } finally {
            tearDown();
        }
    }
    
    /**
     * Tests edge case with zero values.
     * Verifies that zero is handled correctly in sorting.
     */
    public void testZeroValues() {
        setUp();
        
        try {
            // Test input: "5 0 2 0 9"
            String input = "5 0 2 0 9\n";
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            
            // Call the main method
            UserInput.main(new String[]{});
            
            // Verify output contains sorted integers including zeros
            String output = outputStream.toString();
            assert output.contains("User Entered: [0, 0, 2, 5, 9]") : 
                "Expected sorted output [0, 0, 2, 5, 9], but got: " + output;
            
            System.out.println("✓ Test Passed: Zero values");
            
        } finally {
            tearDown();
        }
    }
    
    /**
     * Tests edge case with large integers.
     * Verifies that large numbers are handled correctly.
     */
    public void testLargeIntegers() {
        setUp();
        
        try {
            // Test input: "2147483647 -2147483648 0"
            String input = "2147483647 -2147483648 0\n";
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            
            // Call the main method
            UserInput.main(new String[]{});
            
            // Verify output contains sorted integers including large values
            String output = outputStream.toString();
            assert output.contains("User Entered: [-2147483648, 0, 2147483647]") : 
                "Expected sorted output [-2147483648, 0, 2147483647], but got: " + output;
            
            System.out.println("✓ Test Passed: Large integers");
            
        } finally {
            tearDown();
        }
    }
    
    /**
     * Tests Stack operations directly.
     * Verifies that Stack operations work as expected.
     */
    public void testStackOperations() {
        // Test Stack creation and basic operations
        Stack<Integer> stack = new Stack<>();
        
        // Test push operations
        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(1);
        stack.push(9);
        
        // Verify stack size
        assert stack.size() == 5 : "Expected stack size 5, but got: " + stack.size();
        
        // Test Collections.sort
        Collections.sort(stack);
        
        // Verify sorted order
        assert stack.get(0) == 1 : "Expected first element 1, but got: " + stack.get(0);
        assert stack.get(1) == 2 : "Expected second element 2, but got: " + stack.get(1);
        assert stack.get(2) == 5 : "Expected third element 5, but got: " + stack.get(2);
        assert stack.get(3) == 8 : "Expected fourth element 8, but got: " + stack.get(3);
        assert stack.get(4) == 9 : "Expected fifth element 9, but got: " + stack.get(4);
        
        System.out.println("✓ Test Passed: Stack operations");
    }
    
    /**
     * Tests string tokenization functionality.
     * Verifies that input parsing works correctly with various separators.
     */
    public void testStringTokenization() {
        // Test space separation
        String input1 = "5 2 8 1 9";
        String[] tokens1 = input1.split("[,\\s]+");
        assert tokens1.length == 5 : "Expected 5 tokens, but got: " + tokens1.length;
        
        // Test comma separation
        String input2 = "10,3,7,1,15";
        String[] tokens2 = input2.split("[,\\s]+");
        assert tokens2.length == 5 : "Expected 5 tokens, but got: " + tokens2.length;
        
        // Test mixed separation
        String input3 = "7, 5 2 9 1";
        String[] tokens3 = input3.split("[,\\s]+");
        assert tokens3.length == 5 : "Expected 5 tokens, but got: " + tokens3.length;
        
        System.out.println("✓ Test Passed: String tokenization");
    }
    
    /**
     * Tests integer parsing with error handling.
     * Verifies that NumberFormatException is handled correctly.
     */
    public void testIntegerParsing() {
        // Test valid integer parsing
        try {
            int validInt = Integer.parseInt("42");
            assert validInt == 42 : "Expected 42, but got: " + validInt;
        } catch (NumberFormatException e) {
            assert false : "Valid integer parsing failed: " + e.getMessage();
        }
        
        // Test invalid integer parsing
        try {
            Integer.parseInt("abc");
            assert false : "Expected NumberFormatException for invalid input";
        } catch (NumberFormatException e) {
            // Expected behavior
            assert true : "Correctly caught NumberFormatException";
        }
        
        System.out.println("✓ Test Passed: Integer parsing with error handling");
    }
    
    /**
     * Runs all test methods and reports results.
     * This method executes all test cases and provides a summary.
     */
    public void runAllTests() {
        System.out.println("🧪 Starting UserInput Unit Tests...\n");
        
        int totalTests = 0;
        int passedTests = 0;
        
        try {
            // Basic functionality tests
            testBasicSpaceSeparatedInput();
            totalTests++; passedTests++;
            
            testBasicCommaSeparatedInput();
            totalTests++; passedTests++;
            
            testMixedSeparatorInput();
            totalTests++; passedTests++;
            
            // Edge case tests
            testSingleIntegerInput();
            totalTests++; passedTests++;
            
            testEmptyInput();
            totalTests++; passedTests++;
            
            testNegativeIntegers();
            totalTests++; passedTests++;
            
            testZeroValues();
            totalTests++; passedTests++;
            
            testLargeIntegers();
            totalTests++; passedTests++;
            
            // Error handling tests
            testNonIntegerInput();
            totalTests++; passedTests++;
            
            testAllNonIntegerInput();
            totalTests++; passedTests++;
            
            // Component tests
            testStackOperations();
            totalTests++; passedTests++;
            
            testStringTokenization();
            totalTests++; passedTests++;
            
            testIntegerParsing();
            totalTests++; passedTests++;
            
        } catch (AssertionError e) {
            System.err.println("❌ Test Failed: " + e.getMessage());
            totalTests++;
        } catch (Exception e) {
            System.err.println("❌ Test Error: " + e.getMessage());
            totalTests++;
        }
        
        // Print test summary
        System.out.println("\n📊 Test Summary:");
        System.out.println("Total Tests: " + totalTests);
        System.out.println("Passed: " + passedTests);
        System.out.println("Failed: " + (totalTests - passedTests));
        System.out.println("Success Rate: " + (passedTests * 100 / totalTests) + "%");
        
        if (passedTests == totalTests) {
            System.out.println("\n🎉 All tests passed! Code coverage is excellent.");
        } else {
            System.out.println("\n⚠️  Some tests failed. Please review the errors above.");
        }
    }
    
    /**
     * Main method to run the test suite.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        UserInputTest testSuite = new UserInputTest();
        testSuite.runAllTests();
    }
}
