# OOPS in Java
- Primitive Data Types are stored in the stack memory.
- Reference Data Types are stored in the heap memory.
- Different types of constructors are:
- Default Constructor
  ```java
    public class ClassName {
        ClassName() {
        // code
        }
    }
  ```
- Parameterized Constructor
  ```java
      public class ClassName {
          ClassName(int a, int b) {
          // code
          }
      }
  ```
- Copy Constructor
  ```java
      public class ClassName {
          ClassName(ClassName c) {
          // code
          }
      }
  ```
- We can call constructor from another constructor using `this()` keyword.
  ```java
      public class ClassName {
          ClassName() {
              this(10);
          }
          ClassName(int a) {
              // code
          }
      }
  ```
## Wrapper Classes
- Wrapper classes are used to convert primitive data types into objects.
- The objects are stored in the heap memory.
- we still cannot modify the value of the object because the object is immutable (final).

## Final Keyword
- Final variable: The value of the variable cannot be changed.
- Final method: The method cannot be overridden.
- Final class: The class cannot be inherited.
- Final parameter: The value of the parameter cannot be changed.

## Destructors in Java
- Java does not support destructors.
- Java has a garbage collector that automatically deletes the objects.
- The garbage collector is called by the `System.gc()` method.
- The `finalize()` method is called by the garbage collector before deleting the object.
- The `finalize()` method is used to clean up the resources before deleting the object.

## Packages
- A package is a namespace that organizes a set of related classes and interfaces.
- a program can use public classes from same package without importing them.
- in-built packages (inside `java`)
  - `java.lang` package is imported by default.
  - `java.util` package contains the collection framework.
  - `java.io` package contains the input-output classes.
  - `java.net` package contains the networking classes.
  - `java.awt` package contains the classes for creating GUI.
  - `java.applet` package contains the classes for creating applets.
  - `java.sql` package contains the classes for database connectivity.

## Static
- Static variables are shared among all the objects of the class.
- Static methods can be called without creating an object of the class.
- `this` and `super` cannot be used in static context.
- Static block is used to initialize the static variables.
  ```java
      static {
          // code
      }
  ```
- Static block is executed before the main method at the time of class loading.
- Static block is executed only once for a class.
- Static variables are resolved at compile time. (resolved at compile time means the value of the variable is known at compile time.)

## Innner Classes
- A class created inside another class is called an inner class.
- Inner classes can be static because they are associated with the class, not with the object.

# OOPS Principles

## Inheritance
- Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object.
- The `extends` keyword is used to inherit the properties of a class.
  ```java
      class Superclass {
          // code
      }
      class Subclass extends Superclass {
          // code
      }
  ```
- to initialize the parent class constructor from the child class constructor, we use `super()` keyword.
- The `super()` keyword should be the first statement in the child class constructor
> The type of reference variable determines what methods can be called on the object. A reference variable of a parent class can refer to an object of a child class, but the reverse is not possible.

- The `instanceof` operator is used to test if an object is of a class type.
### Super Keyword
- The `super` keyword refers to the superclass (parent) of an object.
- It can also be used inplace of `this` keyword to refer to the parent class attributes, if parent and child class have same attribute name, then we can use `super` keyword to refer to the parent class attribute.
  ```java
      class Superclass {
          int num = 100;
      }
      class Subclass extends Superclass {
          int num = 110;
          void display() {
              System.out.println(num); // prints 110
              System.out.println(super.num); // prints 100
          }
      }
  ```
## Types of Inheritance
### Single Inheritance
- A class inherits from only one class.
- A class can inherit from only one class in Java.
### Multiple Inheritance
- A class inherits from more than one class.
- Java does not support multiple inheritance (as if two super classes have same method, then which method will be called by the child class object is ambiguous).
- Java supports multiple inheritance through interfaces.
### Hierarchical Inheritance
- More than one sub class inherits from a single parent class.
- It is a type of inheritance in which one class serves as a superclass for more than one sub class.
### Multilevel Inheritance
- A class inherits from a class, and that class inherits from another class.
- It is a type of inheritance in which a class serves as a superclass for another class, which serves as a superclass for another class.
### Hybrid Inheritance
- It is a combination of two or more types of inheritance.
- Java does not support hybrid inheritance (as its combination of multiple and hierarchical inheritance).
- Java supports hybrid inheritance through interfaces.

## Polymorphism
- Polymorphism is the ability of an object to take on many forms.

> What can be accessed is defined by the reference variable type, and what is executed is defined by the object type.
## Types of Polymorphism
### Compile Time / Static Polymorphism
- this type of polymorphism is achieved by function overloading or operator overloading (not in java).
- It is also known as static binding.
- It is resolved at compile time.
### Runtime / Dynamic Polymorphism
- This type of polymorphism is achieved by method overriding.
- It is also known as dynamic binding.
```java
    class Animal {
        void sound() {
            System.out.println("Animal makes sound");
        }
    }
    class Dog extends Animal {
        @override
        void sound() {
            System.out.println("Dog barks");
        }
    }
    class Cat extends Animal {
        void sound() {
            System.out.println("Cat meows");
        }
    }
    class Main {
        public static void main(String[] args) {
            Animal a;
            a = new Dog();
            a.sound();
            a = new Cat();
            a.sound();
        }
    }
```
- here the `sound()` method of the `Animal` class is overridden in the `Dog` and `Cat` class, this is due to upcasting, the `sound()` method of the `Dog` and `Cat` class is called at runtime.
- Java uses dynamic method dispatch to call the overridden method, this is done at runtime.
> `final` and `static` methods cannot be overridden as they are resolved at compile time (early binding).
> `final` can be used to prevent inheritance, method overriding, and variable reassignment.
> `final` class declares all of its methods as `final`.
- late binding is used in dynamic polymorphism.
> `static` methods just depend on the class, not on the object, so they cannot be overridden. `static` methods are resolved at compile time.
> `static` methods can be inherited, but they cannot be overridden.

- overloading and overriding doesn't apply on instance variables, as they are resolved at runtime.

## Encapsulation
- Encapsulation is the mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
- It focuses on implementation and not on the interface.

## Abstraction
- Abstraction is a process of hiding the implementation details and showing only functionality to the user.
- It focuses on the interface and not on the implementation.

## Access Modifiers
- Access modifiers are used to set the accessibility (visibility) of classes, interfaces, methods, and fields.
- There are four types of access modifiers in Java:
  - `default` access modifier is accessible only within the package.
  - `public` access modifier is accessible from anywhere.
  - `protected` access modifier is accessible within the package and outside the package through inheritance.
  - `private` access modifier is accessible only within the class.
  
|  Access Modifier  | Within class |  Within package   |  Subclass (same package)  |  Subclass (outside package)  |  World (outside package & not subclass)  |
|:-----------------:|:------------:|:-----------------:|:-------------------------:|:----------------------------:|:----------------------------------------:|
|     `public`      |     Yes      |        Yes        |            Yes            |             Yes              |                   Yes                    |
|    `protected`    |     Yes      |        Yes        |            Yes            |             Yes              |                    No                    |
|     `default`     |     Yes      |        Yes        |            Yes            |              No              |                    No                    |
|     `private`     |     Yes      |        No         |            No             |              No              |                    No                    |

## Object Class
- The `Object` class is the root class of Java.
- Its defined in `java.lang` package.
- Overriding methods:
  - `toString()` method: returns the string representation of the object.
  - `equals()` method: compares the two objects. ( `==` operator compares the reference of the objects, not the content of the objects)
  - `hashCode()` method: returns the hash code of the object.
  - `finalize()` method: called by the garbage collector before deleting the object.
  - `clone()` method: creates a copy of the object.
  - `getClass()` method: returns the class of the object.
- `instanceof` operator is used to test if an object is of a class type.
- `getClass()` method is used to get the class of the object. (returns the class of the object in the form of a `Class` object stored in heap memory.) It has methods like `getName()`, `getSuperclass()`, `getInterfaces()`, etc. It cannot be Overridden (final method).

## Abstract Classes
- An abstract class is a class that is declared with the `abstract` keyword.
- if a class has an abstract method, then the class must be declared as `abstract`.
- the subclass of an abstract class must implement all the abstract methods of the parent class.
- `abstract` classes cannot be instantiated (constructor of abstract class is called when an object of its subclass is created).
- `final` and `abstract` keywords cannot be used together (as `final` class cannot be inherited and `abstract` class must be inherited).
- `abstract` classes still can have non abstract methods.
- `abstract` classes still don't solve multiple inheritance problem.

## Interfaces
- An interface is a reference type in Java.
- All methods in an interface are `abstract` by default.
- All variables in an interface are `public`, `static`, and `final` by default (as interfaces cannot have instance variables).
- All methods in an interface are `public`, `abstract` by default.
- The dynamic method dispatch is used to call the methods of the interface, due to which the interface is used to achieve multiple inheritance.
- Interfaces should not be used in performance-critical applications as they slow down the application because they require extra indirection to find the corresponding method in the actual class.
- Interfaces can be extended by other interfaces.
- Annotations are also implemented using interfaces.
- We can provide default implementation of methods in interfaces using `default` keyword. (since Java 8)
- `static` methods in interfaces must have a body as they cannot be overridden, they must be called using the interface name.
- Interfaces can also be nested inside a class or another interface, but the top level interfaces have to be `public` or `default`.
> Overridden methods should have same or better accessibility than the overridden method.