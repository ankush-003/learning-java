# Arrays in Java

- array objects are created on the heap
```java
int[] arr = new int[5];
```
- heap memory is allocated at runtime
- heap memory is not contiguous
- null is a special literal that can be used as a value for any reference type

## stack and heap
- primitive types are stored in stack memory
- stack memory is contiguous
- stack memory is allocated at compile time
- stack memory is faster than heap memory
- in python, everything is an object and stored in heap memory 

## Passing arrays to methods
- arrays are objects, so when you pass an array to a method, you are passing the reference to the array
- the method can change the elements of the array