import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/**
 * Comprehensive unit tests for UserInput class.
 * 
 * This test suite covers:
 * - Input processing functionality
 * - Input validation
 * - Integer counting
 * - Edge cases and error conditions
 * - Code reuse verification
 * - Performance characteristics
 */
@DisplayName("UserInput Class Tests")
public class UserInputTest {

    @Nested
    @DisplayName("Input Processing Tests")
    class InputProcessingTests {

        @Test
        @DisplayName("Should process space-separated integers correctly")
        void testProcessSpaceSeparatedIntegers() {
            // Arrange
            String input = "5 1 9 3 7";
            List<Integer> expected = Arrays.asList(1, 3, 5, 7, 9);

            // Act
            List<Integer> result = UserInput.processInput(input);

            // Assert
            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Should process comma-separated integers correctly")
        void testProcessCommaSeparatedIntegers() {
            // Arrange
            String input = "10,20,5,15";
            List<Integer> expected = Arrays.asList(5, 10, 15, 20);

            // Act
            List<Integer> result = UserInput.processInput(input);

            // Assert
            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Should process mixed delimiters correctly")
        void testProcessMixedDelimiters() {
            // Arrange
            String input = "1, 2 3, 4 5";
            List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);

            // Act
            List<Integer> result = UserInput.processInput(input);

            // Assert
            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Should handle single integer")
        void testProcessSingleInteger() {
            // Arrange
            String input = "42";
            List<Integer> expected = Arrays.asList(42);

            // Act
            List<Integer> result = UserInput.processInput(input);

            // Assert
            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Should handle negative numbers")
        void testProcessNegativeNumbers() {
            // Arrange
            String input = "-5 10 -3 0 7";
            List<Integer> expected = Arrays.asList(-5, -3, 0, 7, 10);

            // Act
            List<Integer> result = UserInput.processInput(input);

            // Assert
            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Should handle duplicate numbers")
        void testProcessDuplicateNumbers() {
            // Arrange
            String input = "5 1 5 3 1";
            List<Integer> expected = Arrays.asList(1, 1, 3, 5, 5);

            // Act
            List<Integer> result = UserInput.processInput(input);

            // Assert
            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Should handle large numbers")
        void testProcessLargeNumbers() {
            // Arrange
            String input = "2147483647 -2147483648 0";
            List<Integer> expected = Arrays.asList(-2147483648, 0, 2147483647);

            // Act
            List<Integer> result = UserInput.processInput(input);

            // Assert
            assertEquals(expected, result);
        }

        @Test
        @DisplayName("Should handle multiple consecutive delimiters")
        void testProcessMultipleConsecutiveDelimiters() {
            // Arrange
            String input = "1,,,2   3,  ,  4";
            List<Integer> expected = Arrays.asList(1, 2, 3, 4);

            // Act
            List<Integer> result = UserInput.processInput(input);

            // Assert
            assertEquals(expected, result);
        }

        @ParameterizedTest
        @ValueSource(strings = {"", "   ", ",,,", "  ,  ,  "})
        @DisplayName("Should return empty list for empty or whitespace-only input")
        void testProcessEmptyOrWhitespaceInput(String input) {
            // Act
            List<Integer> result = UserInput.processInput(input);

            // Assert
            assertTrue(result.isEmpty());
        }

        @Test
        @DisplayName("Should throw NumberFormatException for invalid input")
        void testProcessInvalidInput() {
            // Arrange
            String input = "1 abc 3";

            // Act & Assert
            assertThrows(NumberFormatException.class, () -> {
                UserInput.processInput(input);
            });
        }

        @Test
        @DisplayName("Should throw NumberFormatException for decimal numbers")
        void testProcessDecimalNumbers() {
            // Arrange
            String input = "1 2.5 3";

            // Act & Assert
            assertThrows(NumberFormatException.class, () -> {
                UserInput.processInput(input);
            });
        }
    }

    @Nested
    @DisplayName("Input Validation Tests")
    class InputValidationTests {

        @Test
        @DisplayName("Should validate correct input")
        void testValidateCorrectInput() {
            // Arrange
            String input = "1 2 3 4 5";

            // Act
            boolean result = UserInput.isValidInput(input);

            // Assert
            assertTrue(result);
        }

        @Test
        @DisplayName("Should validate comma-separated input")
        void testValidateCommaSeparatedInput() {
            // Arrange
            String input = "1,2,3,4,5";

            // Act
            boolean result = UserInput.isValidInput(input);

            // Assert
            assertTrue(result);
        }

        @Test
        @DisplayName("Should validate mixed delimiter input")
        void testValidateMixedDelimiterInput() {
            // Arrange
            String input = "1, 2 3, 4 5";

            // Act
            boolean result = UserInput.isValidInput(input);

            // Assert
            assertTrue(result);
        }

        @Test
        @DisplayName("Should validate single integer")
        void testValidateSingleInteger() {
            // Arrange
            String input = "42";

            // Act
            boolean result = UserInput.isValidInput(input);

            // Assert
            assertTrue(result);
        }

        @Test
        @DisplayName("Should validate negative numbers")
        void testValidateNegativeNumbers() {
            // Arrange
            String input = "-5 10 -3 0 7";

            // Act
            boolean result = UserInput.isValidInput(input);

            // Assert
            assertTrue(result);
        }

        @ParameterizedTest
        @ValueSource(strings = {"abc", "1 abc 3", "1.5 2.7", "1 2 3 abc"})
        @DisplayName("Should reject invalid input")
        void testRejectInvalidInput(String input) {
            // Act
            boolean result = UserInput.isValidInput(input);

            // Assert
            assertFalse(result);
        }

        @ParameterizedTest
        @NullAndEmptySource
        @ValueSource(strings = {"   ", ",,,", "  ,  ,  "})
        @DisplayName("Should reject null, empty, or whitespace-only input")
        void testRejectEmptyInput(String input) {
            // Act
            boolean result = UserInput.isValidInput(input);

            // Assert
            assertFalse(result);
        }
    }

    @Nested
    @DisplayName("Integer Counting Tests")
    class IntegerCountingTests {

        @Test
        @DisplayName("Should count integers correctly")
        void testCountIntegers() {
            // Arrange
            String input = "1 2 3 4 5";

            // Act
            int result = UserInput.countIntegers(input);

            // Assert
            assertEquals(5, result);
        }

        @Test
        @DisplayName("Should count integers with mixed delimiters")
        void testCountIntegersMixedDelimiters() {
            // Arrange
            String input = "1, 2 3, 4 5";

            // Act
            int result = UserInput.countIntegers(input);

            // Assert
            assertEquals(5, result);
        }

        @Test
        @DisplayName("Should count single integer")
        void testCountSingleInteger() {
            // Arrange
            String input = "42";

            // Act
            int result = UserInput.countIntegers(input);

            // Assert
            assertEquals(1, result);
        }

        @Test
        @DisplayName("Should count negative numbers")
        void testCountNegativeNumbers() {
            // Arrange
            String input = "-5 10 -3 0 7";

            // Act
            int result = UserInput.countIntegers(input);

            // Assert
            assertEquals(5, result);
        }

        @Test
        @DisplayName("Should count duplicate numbers")
        void testCountDuplicateNumbers() {
            // Arrange
            String input = "5 1 5 3 1";

            // Act
            int result = UserInput.countIntegers(input);

            // Assert
            assertEquals(5, result);
        }

        @Test
        @DisplayName("Should count zero for empty input")
        void testCountZeroForEmptyInput() {
            // Arrange
            String input = "";

            // Act
            int result = UserInput.countIntegers(input);

            // Assert
            assertEquals(0, result);
        }

        @Test
        @DisplayName("Should count zero for null input")
        void testCountZeroForNullInput() {
            // Arrange
            String input = null;

            // Act
            int result = UserInput.countIntegers(input);

            // Assert
            assertEquals(0, result);
        }

        @Test
        @DisplayName("Should count zero for whitespace-only input")
        void testCountZeroForWhitespaceInput() {
            // Arrange
            String input = "   ";

            // Act
            int result = UserInput.countIntegers(input);

            // Assert
            assertEquals(0, result);
        }

        @Test
        @DisplayName("Should count only valid integers")
        void testCountOnlyValidIntegers() {
            // Arrange
            String input = "1 abc 3 def 5";

            // Act
            int result = UserInput.countIntegers(input);

            // Assert
            assertEquals(3, result);
        }
    }

    @Nested
    @DisplayName("Edge Cases and Error Conditions")
    class EdgeCasesTests {

        @Test
        @DisplayName("Should handle very long input")
        void testHandleVeryLongInput() {
            // Arrange
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= 1000; i++) {
                sb.append(i).append(" ");
            }
            String input = sb.toString().trim();

            // Act
            List<Integer> result = UserInput.processInput(input);

            // Assert
            assertEquals(1000, result.size());
            assertEquals(1, result.get(0));
            assertEquals(1000, result.get(999));
        }

        @Test
        @DisplayName("Should handle input with only delimiters")
        void testHandleInputWithOnlyDelimiters() {
            // Arrange
            String input = ",, ,, , ";

            // Act
            List<Integer> result = UserInput.processInput(input);

            // Assert
            assertTrue(result.isEmpty());
        }

        @Test
        @DisplayName("Should handle input with leading and trailing delimiters")
        void testHandleInputWithLeadingTrailingDelimiters() {
            // Arrange
            String input = ", 1, 2, 3, ";

            // Act
            List<Integer> result = UserInput.processInput(input);

            // Assert
            assertEquals(Arrays.asList(1, 2, 3), result);
        }

        @Test
        @DisplayName("Should handle input with tabs and newlines")
        void testHandleInputWithTabsAndNewlines() {
            // Arrange
            String input = "1\t2\n3\r4";

            // Act
            List<Integer> result = UserInput.processInput(input);

            // Assert
            assertEquals(Arrays.asList(1, 2, 3, 4), result);
        }
    }

    @Nested
    @DisplayName("Performance and Scalability Tests")
    class PerformanceTests {

        @Test
        @DisplayName("Should process large input efficiently")
        void testProcessLargeInputEfficiently() {
            // Arrange
            StringBuilder sb = new StringBuilder();
            for (int i = 1000; i >= 1; i--) {
                sb.append(i).append(" ");
            }
            String input = sb.toString().trim();

            // Act
            long startTime = System.currentTimeMillis();
            List<Integer> result = UserInput.processInput(input);
            long endTime = System.currentTimeMillis();

            // Assert
            assertEquals(1000, result.size());
            assertEquals(1, result.get(0));
            assertEquals(1000, result.get(999));
            
            // Performance assertion (should complete within reasonable time)
            long executionTime = endTime - startTime;
            assertTrue(executionTime < 1000, "Processing should complete within 1 second");
        }

        @Test
        @DisplayName("Should maintain sorted order for large input")
        void testMaintainSortedOrderForLargeInput() {
            // Arrange
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= 100; i++) {
                sb.append(i % 2 == 0 ? i : 100 - i + 1).append(" ");
            }
            String input = sb.toString().trim();

            // Act
            List<Integer> result = UserInput.processInput(input);

            // Assert
            for (int i = 1; i < result.size(); i++) {
                assertTrue(result.get(i) >= result.get(i - 1), 
                    "List should be sorted in ascending order");
            }
        }
    }

    @Nested
    @DisplayName("Code Reuse Verification Tests")
    class CodeReuseTests {

        @Test
        @DisplayName("Should use LinkedList for storage")
        void testUsesLinkedListForStorage() {
            // Arrange
            String input = "1 2 3";

            // Act
            List<Integer> result = UserInput.processInput(input);

            // Assert
            assertTrue(result instanceof java.util.LinkedList, 
                "Should use LinkedList for storage as part of code reuse");
        }

        @Test
        @DisplayName("Should return sorted list")
        void testReturnsSortedList() {
            // Arrange
            String input = "5 1 9 3 7";

            // Act
            List<Integer> result = UserInput.processInput(input);

            // Assert
            List<Integer> expected = Arrays.asList(1, 3, 5, 7, 9);
            assertEquals(expected, result);
            
            // Verify it's actually sorted
            for (int i = 1; i < result.size(); i++) {
                assertTrue(result.get(i) >= result.get(i - 1), 
                    "Result should be sorted");
            }
        }

        @Test
        @DisplayName("Should handle regex-based splitting")
        void testHandlesRegexBasedSplitting() {
            // Arrange
            String input = "1, 2 3, 4 5";

            // Act
            List<Integer> result = UserInput.processInput(input);

            // Assert
            assertEquals(Arrays.asList(1, 2, 3, 4, 5), result);
        }
    }
}

