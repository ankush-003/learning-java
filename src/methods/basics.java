package methods;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        System.out.println("The sum of two numbers is: " + getSum("Welcome to Calculator"));
    }

    static int getSum(String msg) {
        System.out.println(msg);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = in.nextInt();
        System.out.print("Enter a number to be added: ");
        int num2 = in.nextInt();
        return num1 + num2;
    }
}
