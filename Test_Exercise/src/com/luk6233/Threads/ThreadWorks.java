package Threads;

public class ThreadWorks {
    public static void main(String[] args) throws InterruptedException {
//        Thread currentThread = Thread.currentThread();
//        ThreadGroup threadGroup = currentThread.getThreadGroup();
//        System.out.println("Thread: " + currentThread.getName());
//        System.out.println("Thread Group: " + threadGroup.getName());
//        System.out.println("Parent Group: " + threadGroup.getParent().getName());

//        Thread th = Thread.currentThread();
//        th.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread t, Throwable e) {
//                System.out.println("Возникла ошибка: " + e.getMessage());
//            }
//        });
//        System.out.println(2/0);

//        Runnable task = () -> {
//            try {
//                int secToWait = 1000 * 60;
//                Thread.currentThread().sleep(secToWait);
//                System.out.println("Waked up");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        };
//        Thread thread = new Thread(task);
//        thread.start();
//        thread.interrupt();


//        Object lock = new Object();
//
//        Runnable task = () -> {
//            synchronized (lock) {
//                System.out.println("thread");
//            }
//        };
//
//        Thread th1 = new Thread(task);
//        th1.start();
//        synchronized (lock) {
//            for (int i = 0; i < 8; i++) {
//                Thread.currentThread().sleep(500);
//                System.out.print("  " + i);
//            }
//
//        }
//        System.out.println(" ...");


        Object lock = new Object();
        // task будет ждать, пока его не оповестят через lock
        Runnable task = () -> {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                }
            }
            // После оповещения нас мы будем ждать, пока сможем взять лок
            System.out.println("thread");
        };
        Thread taskThread = new Thread(task);
        taskThread.start();
        // Ждём и после этого забираем себе лок, оповещаем и отдаём лок
        Thread.currentThread().sleep(3000);
        System.out.println("main");
        synchronized (lock) {
            lock.notify();
        }
    }

}
