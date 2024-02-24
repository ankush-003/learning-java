package OOPS.principles.encapsulation;

import OOPS.access.A;

public class SubclassA extends A {
    public void hello() {
        System.out.println("Hello from SubclassA");
        System.out.println("Accessing protected member: " + num2);
    }

    public static void main(String[] args) {
        A obj = new A(10, "John");
        // System.out.println(obj.num); // default access allowed only within the package -> parent doesnt know about the child
        // protected
        SubclassA obj2 = new SubclassA();
        obj2.hello();
    }
}
