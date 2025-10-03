import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * A program to read a series of integers entered by the user.
 * The program accepts input separated by spaces or commas,
 * stores the integers in a Stack, sorts them in ascending order,
 * and prints the final sorted stack.
 *
 * <p>Maintenance Note (Project #4 -&gt; Project #5 Maintenance Task):
 * <ul>
 *   <li>Replaced LinkedList&lt;Integer&gt; with Stack&lt;Integer&gt; (minimal change).</li>
 *   <li>Preserved Scanner-based input, token parsing, and Collections.sort approach.</li>
 *   <li>After sorting in ascending order, the Stack is ordered from bottom (smallest) to top (largest).</li>
 * </ul>
 *
 * @author Larry J. Cameron
 * @version 1.1
 * @since Project #5
 */
public class UserInput {

    /**
     * Main method that handles user input, processes integers, and displays sorted results.
     * Reads a series of integers from standard input, stores them in a Stack,
     * sorts them in ascending order, and prints the final sorted stack.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Show prompt once and flush so it always appears in VS Code terminal
            System.out.print("Enter a series of integers separated by a space or comma: ");
            System.out.flush();

            String line = scanner.nextLine().trim();

            // Maintenance change: use Stack instead of LinkedList
            Stack<Integer> stack = new Stack<>();

            // Split on one or more commas or whitespace
            String[] tokens = line.split("[,\\s]+");
            for (String token : tokens) {
                try {
                    int num = Integer.parseInt(token);
                    stack.push(num); // using push to emphasize stack semantics
                } catch (NumberFormatException nfe) {
                    System.err.println("Skipping non-integer token: \"" + token + "\"");
                }
            }

            // Sorts the stack of integers ascending using the Collections framework.
            Collections.sort(stack); // valid because Stack extends Vector implements List

            // Prints the final sorted stack of integers (bottom -> top = ascending).
            System.out.println("User Entered: " + stack);
        }
    }
}