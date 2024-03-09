# Concurrency & Threads in Java
- Thread is a lightweight process, the smallest unit of processing. It is a separate path of execution.
- Every thread created by a process, shares the same memory space, the heap memory.
- Each thread has its own stack memory, which is used to store method calls and local variables.

## Thread class
- The `java.util.Thread` class is the main class in Java that allows you to create and manage threads, it implements the `Runnable` interface.
- `Thread.currentThread()` returns a reference to the currently executing thread object.
- `Thread.sleep()` method is used to pause the execution of the current thread for a specified time.
- `Thread.yield()` method causes the currently executing thread object to temporarily pause and allow other threads to execute.
- `Thread.join()` method is used to wait for a thread to die.
- `Thread.setPriority()` method is used to set the priority of a thread.
- Thread class has three predefined priority constants: `MIN_PRIORITY` (1, lowest priority), `NORM_PRIORITY` (5, default priority), and `MAX_PRIORITY` (10, highest priority).
- Higher priority threads are scheduled to run before lower priority threads.
> Method 1: Create a thread by extending the `Thread` class and overriding its `run()` method.
- `TimeUnit` class provides a set of useful methods for working with time.
  - `TimeUnit.SECONDS.sleep(1)` pauses the execution of the current thread for 1 second.
  - `TimeUnit.MILLISECONDS.sleep(100)` pauses the execution of the current thread for 100 milliseconds.
- Directly calling `run()` method does not create a new thread, it just executes the code in the current thread synchronously. To create a new thread, use `start()` method to run the `run()` method in a new thread asynchronously.
- `native` keyword is used to declare a method that is implemented in platform-dependent code, such as C or C++. It is used to access platform-dependent code such as system calls and hardware operations.
### Advantages of extending the `Thread` class
- More control over the thread.
- Direct access to the methods of the `Thread` class.
- We can create a new thread for each task.
### Disadvantages of extending the `Thread` class
- Java does not support multiple inheritance, so we can't extend any other class.
- Tightly coupled to the `Thread` class, so it is not a good object-oriented design.

> Method 2: Create a thread by implementing the `Runnable` interface and overriding its `run()` method.

### Functional Interface
- A functional interface is an interface that contains only one abstract method.
- The `@FunctionalInterface` annotation is used to ensure that the functional interface can't have more than one abstract method.
- The `Runnable` interface is a functional interface, it has only one abstract method `run()`.
- We can use lambda expressions to create an object of a functional interface.

```java
// using lambda expression
Runnable r = () -> {
  for (int i = 0; i < 5; i++) {
    System.out.println("Child Thread");
  }
};
// or using anonymous class
Runnable r2 = new Runnable() {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Child Thread");
    }
  }
};

```
### Advantages of implementing the `Runnable` interface
- Better object-oriented design.
- We can extend any other class because we are creating a separate thread.
- Loose coupling between the `Thread` class and the `Runnable` interface.
- We can use lambda expression, anonymous class, and method reference to create a thread.

### Disadvantages of implementing the `Runnable` interface
- No direct access to the methods of the `Thread` class.
- We can't create a new thread for each task.
### Interrupting a Thread
- The `Thread.interrupt()` method is used to interrupt a thread.
- The `isInterrupted()` method is used to check if the thread is interrupted.
- to check in main thread if the child thread is interrupted, use `thread.isInterrupted()` method, also in child thread use `Thread.currentThread().interrupted()` method to make sure the interrupted flag is set in the child thread.

### States of a Thread
- New: The thread is in the new state before the start() method is called.
- Runnable: The thread is in the runnable state after the start() method is called.
- Running: The thread is in the running state if the CPU is executing the thread's task.
- Blocked: The thread is in the blocked state if it is waiting for a monitor lock to enter a synchronized block/method.
- Waiting: The thread is in the waiting state if it is waiting for another thread to perform a particular action.
- Timed Waiting: The thread is in the timed waiting state if it is waiting for another thread to perform a particular action for a specified waiting time.
- Terminated: The thread is in the terminated state if the run() method is completed.

## Multithreading & Memory
![image](https://github.com/ankush-003/learning-java/assets/94037471/42248b21-463d-443c-b616-d711630ec09d)






























## References
- [Java Tpoint](https://www.javatpoint.com/multithreading-in-java)
- [Java Masterclass Udemy](https://www.udemy.com/course/java-the-complete-java-developer-course/)
