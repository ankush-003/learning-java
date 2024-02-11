package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int[] marks = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter the marks for student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
//        for (int i = 0; i < marks.length; i++) {
//            System.out.println("The marks for student " + (i + 1) + " is " + marks[i]);
//        }

        // for each
//        for (int val : marks) {
//            System.out.println(val);
//        }

        System.out.println(Arrays.toString(marks));

        // array of objects
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
