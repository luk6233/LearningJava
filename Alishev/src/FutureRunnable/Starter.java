package Alishev.src.FutureRunnable;

import org.jsoup.select.Evaluator;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.util.concurrent.*;

public class Starter {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

//        executorService.execute(new MyRunnable());
//        Future<?> task = executorService.submit(new MyRunnable());

//        while(!task.isDone()) {
//            System.out.println("Is not done");
//            Thread.sleep(1000);
//        }

//        task.get();

        Future<Integer> task = executorService.submit(new MyCallable());

        Thread.sleep(1000);
        task.cancel(true);

//        Integer id = task.get();
//        System.out.println(id);
        System.out.println("Is cancelled");

        System.out.println("Shutdown");
        executorService.shutdown();
    }
}

class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        try {
            System.out.println("Started:" + Thread.currentThread().getId());
            Thread.sleep(1);
            long d1 = System.currentTimeMillis();
            long d2 = System.currentTimeMillis();

            while (d2 < d1 + 5000) {
                d2 = System.currentTimeMillis();
            }
            System.out.println("Finished:" + Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }

        return 99;
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Started:" + Thread.currentThread().getId());
            Thread.sleep(5000);
            System.out.println("Finished:" + Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }
}