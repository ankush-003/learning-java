package concurrency.runningThreads;

public class InstallDemo {
    public static void main(String[] args) {
        System.out.println("Main thread: " + Thread.currentThread().getName());

        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " should take 10 dots to complete");
            for(int i = 0; i < 10; i++) {
                System.out.print(" . ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread " + Thread.currentThread().getName() + " interrupted");
                    Thread.currentThread().interrupt(); // re-interrupt the thread to set the interrupted flag
                    return;
                }
            }
        }, "DownloadThread");

        Thread threadMonitor = new Thread(() -> {
            long now = System.currentTimeMillis();
            while(thread.isAlive()) {
//                System.out.println("Waiting for thread to complete!");
                try {
                    Thread.sleep(2000);
                    if(System.currentTimeMillis() - now > 15000) {
                        System.out.println("\nMain thread is tired of waiting!");
                        System.out.println("Interrupting thread");
                        thread.interrupt();
                        break; // if this is removed the thread will be interrupted after 15 seconds
                    }
                } catch (InterruptedException e) {
                    // e.printStackTrace();
                    System.out.println("Thread " + Thread.currentThread().getName() + " interrupted");
                    Thread.currentThread().interrupt(); // re-interrupt the thread to set the interrupted flag
                    break;
                }
            }
        }, "MonitorThread");

        System.out.println("Starting thread");
        thread.start();
        threadMonitor.start();

        Thread installThread = new Thread(() -> {
            // this thread should run after the download thread
            try {
                for(int i = 0; i < 3; i++) {
                    Thread.sleep(250);
                    System.out.println("Installation Step " + (i + 1) + " completed");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "InstallThread");

        try {
            thread.join(); // wait for the download thread to complete
            if (!thread.isInterrupted())
                System.out.println("\nDownload thread completed successfully");
            else
                System.out.println("Download failed!");
            threadMonitor.interrupt();
            threadMonitor.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(!thread.isInterrupted()) {
            installThread.start();
        } else {
            System.out.println("Download thread was interrupted, installation will not proceed");
            System.out.println(installThread.getName() + " will not start");
        }

    }
}
