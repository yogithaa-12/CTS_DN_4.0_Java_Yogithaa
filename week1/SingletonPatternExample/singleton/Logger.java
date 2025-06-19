package singleton;

public class Logger {

    // Step 1: Create a private static instance of the class
    private static Logger instance;

    // Step 2: Private constructor to restrict instantiation
    private Logger() {
        System.out.println("Logger Initialized");
    }

    // Step 3: Public static method to provide global access
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Lazy initialization
        }
        return instance;
    }

    // Utility method for logging
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
