package arrays;

public class intro {
    public static void main(String[] args) {
        int a = 19;
        int rno1 = 10;
        int rno2 = 20;
        int rno3 = 30;

        // syntax for array declaration:
        // datatype[] arrayName = new datatype[size];
        // int[] marks = new int[5];
        int[] marks2 = {10, 20, 30, 40, 50};
        int[] marks3 = new int[]{10, 20, 30, 40, 50};
        int[] marks; // marks is declared in the stack
        marks = new int[5]; // marks is initialized in the heap, dynamic memory allocation

        String[] arr = new String[3];
        System.out.println(arr[0]); // null
        String str = null;
        // int num = null // error as null is not a primitive data type
    }
}
