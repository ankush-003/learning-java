package OOPS.staticExp;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Raj", 25);
        Human h2 = new Human("Rahul", 30);
        h1.display();
        h2.display();
        // greeting(); // Error: non-static method greeting() cannot be referenced from a static context as it is a instance method
    }
    // non-static method depend on instance of class, so it can't be called without creating instance of class
    void greeting() {
        // static method can be called without creating instance of class
        greeting2();
        System.out.println("Hello, World!");
    }
    // static method can be called without creating instance of class
    static void greeting2() {
        System.out.println("Hello, World!");
        // non static method cannot be used without reference of instance of class in a static context
        Main m = new Main();
        m.greeting();
    }
}
