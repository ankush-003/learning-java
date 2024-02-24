package OOPS.abstraction;

public class Main {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.career();
        d.partner();
        Son s = new Son(25);
        s.career();
        System.out.println("My age is " + s.age + " years.");
        s.partner();
        s.normal();

        Parent.family();
        Parent p = new Daughter(); // runtime polymorphism
        p.career();
    }
}
