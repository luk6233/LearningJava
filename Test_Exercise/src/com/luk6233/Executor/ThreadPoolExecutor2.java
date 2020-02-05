package Executor;

import java.util.concurrent.*;

public class ThreadPoolExecutor2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int threadBound = 2;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, threadBound,
                0L, TimeUnit.SECONDS, new SynchronousQueue<>());
        Callable<String> task = () -> {
            Thread.sleep(1000);
            return Thread.currentThread().getName();
        };
        for (int i = 0; i < threadBound + 1; i++) {
            threadPoolExecutor.submit(task);
        }
        threadPoolExecutor.shutdown();
    }
}
