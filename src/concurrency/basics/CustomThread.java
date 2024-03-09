package concurrency.basics;

public class CustomThread extends Thread {
    @Override
    public void run() {
//        System.out.println("Thread name: " + Thread.currentThread().getName());

        for (int i = 0; i <= 5; i++) {
            System.out.println(" 1 " + Thread.currentThread().getName());
            try {
                 Thread.sleep(1000);
                // TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
