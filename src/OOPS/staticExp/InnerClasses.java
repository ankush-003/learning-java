package OOPS.staticExp;

class Outer {
    static String name;
    static class Inner {
        void display() {
            System.out.println("Inside class Inner");
        }
    }
}

public class InnerClasses {
    class A {
        static void display() {
            System.out.println("Inside class A");
        }
    }

    static class B {
        // static String name;
        String name;
        static void display() {
            System.out.println("Inside class B");
        }
    }
    public static void main(String[] args) {
        // A a = new A(); // error because A is not static
        Outer o = new Outer();
        Outer o2 = new Outer();
        o.name = "Raj";
        o2.name = "Rahul";
        System.out.println(o.name);
        System.out.println(o2.name);

        B b = new B(); // static class can be instantiated
        B b2 = new B();

        b.name = "Raj";
        b2.name = "Rahul";

        System.out.println(b.name);
        System.out.println(b2.name);
        System.out.println(b.toString()); // since b does not have toString method, it will call Object class's toString method
    }

}
