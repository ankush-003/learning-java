package OOPS.abstraction;

public abstract class Parent {
    int age;
    final int VALUE  = 10;

    abstract void career();
    abstract void partner();


    static void family() {
        System.out.println("I love my family.");
    }

    Parent() { // no use of abstract constructor
        System.out.println("I am a parent.");
    }

    void normal() {
        System.out.println("I am a normal person.");
    }
}
