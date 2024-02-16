package OOPS;

public class Wrappers {
    public static void main(String[] args) {
        // primitive data types
        int rollNumber = 1;
        Integer rollNumberWrapper = 45; // auto-boxing, creates an object stored in heap memory
        final int a = 10;
        // a = 20; // error
        System.out.println(rollNumberWrapper);
        final A obj = new A();
        System.out.println(obj.a);
        System.out.println(obj.name);
        obj.name = "Rahul";
        System.out.println(obj.name);
        // obj = new A(); // error
        A obj2 = new A();
        for(int i = 0; i < 1000000; i++) {
            obj2 = new A();
        }
    }
}

class A {
    final int a;
    String name = "Ankush";
    A() {
        a = 10;
    }

    public void change() {
        // a = 20; // error
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is garbage collected");
    }
}

