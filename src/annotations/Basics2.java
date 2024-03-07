package annotations;

import java.lang.reflect.Method;

public class Basics2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog2 dog2 = new Dog2();
        dog.bark();
        if(dog.getClass().isAnnotationPresent(Important.class)) {
            System.out.println("The Dog class is marked as important");
        } else {
            System.out.println("The Dog class is not marked as important");
        }

        dog2.bark();
        if(dog2.getClass().isAnnotationPresent(Important.class)) {
            System.out.println("The Dog2 class is marked as important");
        } else {
            System.out.println("The Dog2 class is not marked as important");
        }

        for (Method method : dog.getClass().getMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                try {
                    for (int i = 0; i < annotation.times(); i++) {
                        method.invoke(dog);
                    }
                } catch (Exception e) {
                    System.out.println("Exception occurred: " + e.getMessage());
                }
            }
        }
    }
}

class Dog2 {
    public void bark() {
        System.out.println("Woof");
    }
}