package Object.SingleTon;

// Singleton class in Java
public class Singleton {

    // Static variable to hold the single instance of the class
    private static Singleton singleInstance;
//    the constructor is used  so no one can instance

    // Private constructor to restrict instantiation from other classes
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    // Public static method to provide access to the instance
    public static Singleton getInstance() {
        if (singleInstance == null) {
            // Create the instance if it doesn't exist
            singleInstance = new Singleton();
        }
        return singleInstance;
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

