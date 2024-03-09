package concurrency.basics;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        var currentThread = Thread.currentThread();
        System.out.println("Current thread: " + currentThread.getClass().getName());
        System.out.println(currentThread); // prints the thread name and thread group name and thread priority
        printThreadState(currentThread);

        currentThread.setName("Main Thread");
        currentThread.setPriority(Thread.MAX_PRIORITY); // MAX_PRIORITY = 10, MIN_PRIORITY = 1, NORM_PRIORITY = 5
        printThreadState(currentThread);

        CustomThread customThread = new CustomThread();
        customThread.setName("Custom Thread");
        customThread.start(); // start the thread, calling start() method will create a new thread
        // customThread.run(); // run the thread, calling run() method directly will not create a new thread

        Runnable myRunnable = () -> {
            System.out.println("Thread name: " + Thread.currentThread().getName());
            for (int i = 0; i <= 5; i++) {
                System.out.println(" 3 " + Thread.currentThread().getName());
                try {
                    // Thread.sleep(1000);
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread myThread = new Thread(myRunnable);
        myThread.setName("My Thread");
        myThread.start();


        // checking if thread is running concurrently
        for (int i = 0; i <= 5; i++) {
            System.out.println(" 2 " + Thread.currentThread().getName());
            try {
                // Thread.sleep(1000);
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printThreadState(Thread thread) {
        System.out.println("-----------------");
        System.out.println("Thread ID: " + thread.getId());
        System.out.println("Thread name: " + thread.getName());
        System.out.println("Thread state: " + thread.getState());
        System.out.println("Thread priority: " + thread.getPriority());
        System.out.println("Thread group: " + thread.getThreadGroup());
        System.out.println("Thread is alive: " + thread.isAlive());
        System.out.println("Thread is daemon: " + thread.isDaemon());
        System.out.println("Thread is interrupted: " + thread.isInterrupted());
        System.out.println("-----------------");
    }
}
