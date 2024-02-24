package OOPS.access;

public class ObjectDemo {
    int num;
    String name;
    ObjectDemo() {
        this.name = "Unknown";
        this.num = 10;
    }
    ObjectDemo(int num, String name) {
        this.num = num;
        this.name = name;
    }
    @Override
    public String toString() {
        return "ObjectDemo{}";
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
    @Override
    public int hashCode() {
        // return a unique hash code for the object
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        // retrun this == obj; -> compare memory address
        return this.num == ((ObjectDemo)obj).num && this.name.equals(((ObjectDemo)obj).name);
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(10, "John");
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        ObjectDemo obj2 = new ObjectDemo(10, "John");
        System.out.println(obj2.hashCode()); // not memory address but a unique hash code
//        System.out.println(obj.equals(obj));
        if(obj == obj2) { // compare memory address
            System.out.println("Same object reference");
        }
        else {
            System.out.println("Different object reference");
        }

        if(obj.equals(obj2)) { // compare content
            System.out.println("Same object");
        }
        else {
            System.out.println("Different object");
        }

        System.out.println(obj instanceof ObjectDemo);
        System.out.println(obj.getClass()); // class OOPS.access.ObjectDemo
    }



}
