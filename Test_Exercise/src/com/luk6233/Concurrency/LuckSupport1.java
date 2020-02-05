package Test_Exercise.src.com.luk_d.Concurrency;

import java.util.concurrent.locks.LockSupport;

public class LuckSupport1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            //parking thread
            System.err.println("Will be Parked");
            LockSupport.park();
            // after parking - go
            System.err.println("Unparked");
        };
        Thread th = new Thread(task);
        th.start();
        Thread.currentThread().sleep(2000);
        System.err.println("Thread state: " + th.getState());

        LockSupport.unpark(th);
        Thread.currentThread().sleep(2000);
    }
}
