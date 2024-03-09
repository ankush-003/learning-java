package concurrency.runningThreads;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                String tname = Thread.currentThread().getName();
                System.out.println(tname + " should take 10 dots to complete");

                for (int i = 0; i < 10; i++) {
                    System.out.print(".");
                    try {
                        Thread.sleep(1000);
//                        System.out.println("A state " + Thread.currentThread().getState());
                    } catch (InterruptedException e) {
                        System.out.println("Thread " + tname + " interrupted");
                        System.out.println("A1 state " + Thread.currentThread().getState());
//                        e.printStackTrace();
                        return;
                    }
                }
            }
        });
        System.out.println("Starting thread");
        thread.start();
        System.out.println("Main thread would continue here");

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        System.out.println("Interrupting thread");
//        thread.interrupt();
        // interrupting thread after

        long now = System.currentTimeMillis();

        // this can be implented using thread.join()
        while(thread.isAlive()) {
            System.out.println("Waiting for thread to complete!");
            try {
                Thread.sleep(1000);
                System.out.println("B state " + thread.getState());
                if(System.currentTimeMillis() - now > 5000) {
                    System.out.println("Main thread is tired of waiting!");
                    thread.interrupt();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Main thread is done waiting!");
        System.out.println("C state " + thread.getState());
    }
}
