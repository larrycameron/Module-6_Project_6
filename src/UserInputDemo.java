import java.util.Collections;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

/**
 * Demo version of UserInput that doesn't require interactive input
 * This version demonstrates the functionality with predefined test cases
 */
public class UserInputDemo {
    
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("UserInput Demo - Module 4 Project 4");
        System.out.println("==========================================");
        
        // Test cases to demonstrate functionality
        String[] testCases = {
            "5 1 9 3 7",           // Space-separated
            "10,20,5,15",          // Comma-separated
            "1, 2 3, 4 5",         // Mixed delimiters
            "42",                  // Single integer
            "-5 10 -3 0 7",        // Negative numbers
            "100 50 75 25",        // Large numbers
            "1 1 2 2 3 3"          // Duplicate numbers
        };
        
        for (int i = 0; i < testCases.length; i++) {
            System.out.println("\n--- Test Case " + (i + 1) + " ---");
            System.out.println("Input: " + testCases[i]);
            
            try {
                List<Integer> result = UserInput.processInput(testCases[i]);
                System.out.println("Output: " + result);
                System.out.println("✅ Successfully processed " + result.size() + " integers");
            } catch (Exception e) {
                System.out.println("❌ Error: " + e.getMessage());
            }
        }
        
        System.out.println("\n==========================================");
        System.out.println("Demo completed successfully!");
        System.out.println("==========================================");
    }
}
