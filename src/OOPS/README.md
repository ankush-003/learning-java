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
- A reference variable of a parent class can refer to an object of a child class, but the reverse is not possible.
- Attributes that can be accessed depends on the reference type and not on the object type.
- The `instanceof` operator is used to test if an object is of a class type.
