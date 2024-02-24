package OOPS.interfaces;

public interface Engine {
    static final int price = 10000; // all the variables in interface are public static final by default
    void start(); // all the methods in interface are public abstract by default and cannot have body
    void stop();
    void accelerate();

    static void info() { // static methods can be called using the interface name
        System.out.println("This is an engine.");
    }
}
