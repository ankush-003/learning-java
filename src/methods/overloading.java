package methods;

public class overloading {
    static void foo() {
        System.out.println("Good Morning!");
    }
    static void foo(int a) {
        System.out.println("Good Morning " + a);
    }
    static void foo(int a, int b) {
        System.out.println("Good Morning " + a + " and " + b);
    }
    static void foo(int a, int b, int c) {
        System.out.println("Good Morning " + a + ", " + b + " and " + c);
    }
    public static void main(String[] args) {
        foo();
        foo(300);
        foo(300, 400);
        foo(300, 400, 500);
    }
}
