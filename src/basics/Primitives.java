package basics;

public class Primitives {
    public static void main(String[] args) {
        int srn = 91; // 4 bytes
        char grade = 'A'; // 2 bytes
        float percentage = 90.5f; // f is required, 4 bytes
        double percentage2 = 90.5; // 8 bytes
        long largeNumber = 1234567890L; // L is required, 8 bytes
        boolean isPassed = true; // 1 byte
        // string is not a primitive type
        String name = "Sai"; // can be break into char array

        // wrapper classes -> Integer, Character, Float, Double, Long, Boolean : used to convert primitive to object
        Integer srn2 = 91; // 4 bytes
    }
}
