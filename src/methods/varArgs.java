package methods;

public class varArgs {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
    static void fun(int ...v) {
        // var args always at the end
        for (int i : v) {
            System.out.println(i);
        }
        // System.out.println(Arrays.toString(v));
    }
}
