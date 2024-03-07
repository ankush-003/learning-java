package annotations;

@Important
public class Dog {
    @RunImmediately(times = 3)
    public void bark() {
        System.out.println("Woof");
    }

    public void eat() {
        System.out.println("Nom nom");
    }
}
