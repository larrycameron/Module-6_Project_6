import org.junit.platform.console.ConsoleLauncher;
import org.junit.platform.console.ConsoleLauncherWrapper;

/**
 * Test runner for executing all unit tests.
 * 
 * This class provides a simple way to run all tests from the command line
 * without requiring external build tools like Maven or Gradle.
 */
public class TestRunner {
    
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("Running UserInput Unit Tests");
        System.out.println("==========================================");
        
        // Run tests using JUnit Platform Console Launcher
        String[] testArgs = {
            "--scan-classpath",
            "--details=verbose",
            "--reports-dir=test-results"
        };
        
        try {
            ConsoleLauncherWrapper.main(testArgs);
        } catch (Exception e) {
            System.err.println("Error running tests: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
        
        System.out.println("==========================================");
        System.out.println("Test execution completed");
        System.out.println("==========================================");
    }
}

