package OOPS.abstraction;

public class Son extends Parent {
    Son(int age) {
        this.age = age;
    }
    @Override
    void career() {
        System.out.println("I want to be a coder.");
    }

    @Override
    void partner() {
        System.out.println("I love my partner Jane.");
    }

    @Override
    void normal() {
        super.normal();
    }
    public static void main(String[] args) {
        Parent p = new Son(25);
        p.career();
        p.partner();
    }

}
