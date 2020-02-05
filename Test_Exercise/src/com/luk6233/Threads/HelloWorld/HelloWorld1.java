package Threads.HelloWorld;

public class HelloWorld1 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        // task woit for notify by lock
        Runnable task = () -> {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                }
            }
            // After notify waiting to take lock
            System.out.println("thread");
        };
        Thread taskThread = new Thread(task);
        taskThread.start();
        Thread.currentThread().sleep(3000);
        System.out.println("main");
        synchronized (lock) {
            lock.notify();
        }
    }
}
