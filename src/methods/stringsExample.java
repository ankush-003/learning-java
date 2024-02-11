package methods;

import java.util.Scanner;

public class stringsExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        greet(name);
    }
    static void greet(String name) {
        System.out.println("Hello " + name);
    }
}
