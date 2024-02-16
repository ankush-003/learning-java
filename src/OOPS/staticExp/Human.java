package OOPS.staticExp;

public class Human {
    String name;
    int age;
    static int population = 0;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        // population is not instance variable, so it can be accessed directly
        Human.population += 1;
    }

    public void display() {
        System.out.println("Name: " + name + " Age: " + age + " Population: " + population);
    }

    public static void main(String[] args) {
        Human h1 = new Human("Raj", 25);
        Human h2 = new Human("Rahul", 30);
        h1.display();
        h2.display();
    }
}
