package OOPS.abstraction;

public class Daughter extends Parent{
    @Override
    void career() {
        System.out.println("I want to be a doctor.");
    }

    @Override
    void partner() {
        System.out.println("I love my partner John.");
    }
    public static void main(String[] args) {
        Parent p = new Daughter();
        p.career();
        p.partner();
    }
}
