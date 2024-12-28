package Object.SingleTon;

// Testing the Singleton class
public class Main {
    public static void main(String[] args) {
        // Attempting to create multiple instances of Singleton
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Verifying if both instances are the same
        System.out.println("Are both instances the same? " + (instance1 == instance2));

        // Calling a method on the Singleton instance
        instance1.showMessage();
    }
}
