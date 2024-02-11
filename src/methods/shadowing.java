package methods;

public class shadowing {
    // int x = 10; // we must use static int x = 10 to use x in main method (as it is a static method)
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(x);
        int x; // local variable (to use x from the class, use static int x = 10)
        // System.out.println(x); // this will give an error as x is not initialized
        x = 20;
        System.out.println(x);
        fun();
    }
    static void fun() {
        System.out.println(x); // this will print 10
    }
}
