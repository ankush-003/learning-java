package basics;

import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextInt();
        System.out.println("The number is " + num);

        // type casting
        int num2 = (int) (69.69f);
        System.out.println("The number is " + num2);

        // automatic type promotion
        int num3 = 257;
        byte num4 = (byte) num3; // 257 % 256 = 1
        System.out.println("The number is " + num4);

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b / c;
        // c = c * 2 -> promoted to int but not assigned to c -> c is still byte
        // (a * b) / c -> (a*b) is promoted to int
        System.out.println("The number is " + d);

    }
}
