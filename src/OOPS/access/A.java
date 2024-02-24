package OOPS.access;

public class A {
    int num;
    protected int num2;
    String name;
    int[] arr;
    public A() {
        this.num = 10;
        this.num2 = 10;
        this.name = "John";
        this.arr = new int[10];
    }

    public A(int num, String name) {
        this.num = num;
        this.num2 = num;
        this.name = name;
        this.arr = new int[num];
    }
    // getter
    public int getNum() {
        return num;
    }


}
