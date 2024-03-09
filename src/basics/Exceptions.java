package basics;

public class Exceptions {
    public static void main(String[] args) {
        int i = 0;
//        int j = 69 / i; // ArithmeticException
        int j = 0;

        try {
            j = 69 / i;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace(); // prints the stack trace, gives the line number and the method name
        }
        System.out.println(j);
    }
}
