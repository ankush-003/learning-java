package OOPS.Singleton;

public class Singleton {
    // avoid usage of constructor
    private Singleton() {

    }

    // static because we want to access it without creating an object
    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
