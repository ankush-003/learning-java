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
