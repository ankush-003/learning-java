package basics;

import java.util.Scanner;

public class Inputs {
    private static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your roll number: ");
        int rollNumber = input.nextInt();
        System.out.println("Your roll number is " + rollNumber);

        int a = 10_000; // literal value
        int b = 0b1010; // binary value
        int c = 0x2f; // hexadecimal value
        System.out.println("Get the value of fibonacci series at index: ");
        System.out.println(fib(input.nextInt()));
    }
}
