package OOPS.staticExp;

public class staticBlock {
    static int a = 4;
    static int b;
    static {
        System.out.println("Static block initialized");
        b = a * 4;
    }
    public static void main(String[] args) {
        System.out.println("from main");
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        staticBlock obj = new staticBlock();
        System.out.println("Value of a: " + staticBlock.a); // remains same because static block is called only once
        System.out.println("Value of b: " + staticBlock.b);
    }

}
