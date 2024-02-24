package OOPS.access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "John");
        System.out.println(obj.num); // default access allowed only within the package
        System.out.println(obj.num2); // protected access allowed only within the package
        // private access
        ArrayList<Integer> array = new ArrayList<>(20);
//        System.out.println(array.DEFAULT_CAPACITY);
        System.out.println(array.size());

    }
}
