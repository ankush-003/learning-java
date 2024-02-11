package methods;

import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = in.nextInt();
        System.out.println("Enter the second number: ");
        int b = in.nextInt();
        System.out.println("a: " + a + " b: " + b);
        // Java has no pass by reference, only pass by value
//        String res = swapNums(a, b);
//        System.out.println(res);
//        System.out.println("a: " + a + " b: " + b);
        int[] arr = {1, 2, 3};
        changeArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changeArr(int[] arr) {
        // this will change the original array as the reference is passed by value, so the reference is copied, but the original array is still the same
        // arr is a reference to the original array, so the original array is changed
        arr[0] = 99;
    }
    static String swapNums(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return "a: " + a + " b: " + b;
//        String res = new String("a: " + a + " b: " + b);// this is a new object, it is not deleted after the function ends as it is stored in the heap, not the stack like the function, so it is not deleted after the function ends
//        return res;
    }

}
