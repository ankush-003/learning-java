package OOPS.interfaces.nested;

public class A {
    public interface NestedInterface {
        boolean isOdd(int number);
    }
}

class B implements A.NestedInterface {
    public boolean isOdd(int number) {
        // return (number & 1) != 0;
        return number % 2 != 0;
    }
}
