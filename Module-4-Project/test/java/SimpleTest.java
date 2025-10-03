/**
 * Simple test class that doesn't require JUnit dependencies
 * This provides basic testing functionality for the UserInput class
 */
public class SimpleTest {
    
    private static int testsPassed = 0;
    private static int testsFailed = 0;
    
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("Running Simple UserInput Tests");
        System.out.println("==========================================");
        
        // Test basic functionality
        testSpaceSeparatedInput();
        testCommaSeparatedInput();
        testMixedDelimiters();
        testSingleInteger();
        testNegativeNumbers();
        testEmptyInput();
        testInvalidInput();
        testLargeInput();
        
        // Print results
        System.out.println("==========================================");
        System.out.println("Test Results:");
        System.out.println("✅ Tests Passed: " + testsPassed);
        System.out.println("❌ Tests Failed: " + testsFailed);
        System.out.println("Total Tests: " + (testsPassed + testsFailed));
        System.out.println("==========================================");
        
        if (testsFailed == 0) {
            System.out.println("🎉 All tests passed!");
        } else {
            System.out.println("⚠️  Some tests failed!");
        }
    }
    
    private static void testSpaceSeparatedInput() {
        try {
            var result = UserInput.processInput("5 1 9 3 7");
            var expected = java.util.Arrays.asList(1, 3, 5, 7, 9);
            if (result.equals(expected)) {
                System.out.println("✅ Space-separated input test passed");
                testsPassed++;
            } else {
                System.out.println("❌ Space-separated input test failed");
                testsFailed++;
            }
        } catch (Exception e) {
            System.out.println("❌ Space-separated input test failed with exception: " + e.getMessage());
            testsFailed++;
        }
    }
    
    private static void testCommaSeparatedInput() {
        try {
            var result = UserInput.processInput("10,20,5,15");
            var expected = java.util.Arrays.asList(5, 10, 15, 20);
            if (result.equals(expected)) {
                System.out.println("✅ Comma-separated input test passed");
                testsPassed++;
            } else {
                System.out.println("❌ Comma-separated input test failed");
                testsFailed++;
            }
        } catch (Exception e) {
            System.out.println("❌ Comma-separated input test failed with exception: " + e.getMessage());
            testsFailed++;
        }
    }
    
    private static void testMixedDelimiters() {
        try {
            var result = UserInput.processInput("1, 2 3, 4 5");
            var expected = java.util.Arrays.asList(1, 2, 3, 4, 5);
            if (result.equals(expected)) {
                System.out.println("✅ Mixed delimiters test passed");
                testsPassed++;
            } else {
                System.out.println("❌ Mixed delimiters test failed");
                testsFailed++;
            }
        } catch (Exception e) {
            System.out.println("❌ Mixed delimiters test failed with exception: " + e.getMessage());
            testsFailed++;
        }
    }
    
    private static void testSingleInteger() {
        try {
            var result = UserInput.processInput("42");
            var expected = java.util.Arrays.asList(42);
            if (result.equals(expected)) {
                System.out.println("✅ Single integer test passed");
                testsPassed++;
            } else {
                System.out.println("❌ Single integer test failed");
                testsFailed++;
            }
        } catch (Exception e) {
            System.out.println("❌ Single integer test failed with exception: " + e.getMessage());
            testsFailed++;
        }
    }
    
    private static void testNegativeNumbers() {
        try {
            var result = UserInput.processInput("-5 10 -3 0 7");
            var expected = java.util.Arrays.asList(-5, -3, 0, 7, 10);
            if (result.equals(expected)) {
                System.out.println("✅ Negative numbers test passed");
                testsPassed++;
            } else {
                System.out.println("❌ Negative numbers test failed");
                testsFailed++;
            }
        } catch (Exception e) {
            System.out.println("❌ Negative numbers test failed with exception: " + e.getMessage());
            testsFailed++;
        }
    }
    
    private static void testEmptyInput() {
        try {
            var result = UserInput.processInput("");
            if (result.isEmpty()) {
                System.out.println("✅ Empty input test passed");
                testsPassed++;
            } else {
                System.out.println("❌ Empty input test failed");
                testsFailed++;
            }
        } catch (Exception e) {
            System.out.println("❌ Empty input test failed with exception: " + e.getMessage());
            testsFailed++;
        }
    }
    
    private static void testInvalidInput() {
        try {
            var result = UserInput.processInput("abc 123 def");
            // This should throw an exception or handle gracefully
            System.out.println("❌ Invalid input test failed - should have thrown exception");
            testsFailed++;
        } catch (NumberFormatException e) {
            System.out.println("✅ Invalid input test passed - correctly threw NumberFormatException");
            testsPassed++;
        } catch (Exception e) {
            System.out.println("❌ Invalid input test failed with unexpected exception: " + e.getMessage());
            testsFailed++;
        }
    }
    
    private static void testLargeInput() {
        try {
            // Create a large input string
            StringBuilder sb = new StringBuilder();
            for (int i = 100; i >= 1; i--) {
                if (sb.length() > 0) sb.append(" ");
                sb.append(i);
            }
            
            var result = UserInput.processInput(sb.toString());
            if (result.size() == 100 && result.get(0) == 1 && result.get(99) == 100) {
                System.out.println("✅ Large input test passed");
                testsPassed++;
            } else {
                System.out.println("❌ Large input test failed");
                testsFailed++;
            }
        } catch (Exception e) {
            System.out.println("❌ Large input test failed with exception: " + e.getMessage());
            testsFailed++;
        }
    }
}
