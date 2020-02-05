package Test_Exercise.src.com.luk_d.Concurrency.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Race {
    //Create CountDownLatch
    private static final CountDownLatch START = new CountDownLatch(8);
    private static final int trackLength = 500000;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            new Thread(new Car(i, (int) (Math.random() * 100 + 50))).start();
            Thread.sleep(1000);
        }

        while (START.getCount() > 3) //Check all car on start
            Thread.sleep(100);              //else sleep 100 ms

        Thread.sleep(1000);
        System.out.println("На старт!");
        START.countDown();
        Thread.sleep(1000);
        System.out.println("Внимание!");
        START.countDown();
        Thread.sleep(1000);
        System.out.println("Марш!");
        START.countDown();//command given, decrease counter by  1
        //counter is zero, and all awaiting thread are unlocked
    }

    public static class Car implements Runnable {
        private int carNumber;
        private int carSpeed;//car speed is permanent

        public Car(int carNumber, int carSpeed) {
            this.carNumber = carNumber;
            this.carSpeed = carSpeed;
        }

        @Override
        public void run() {
            try {
                System.out.printf("Автомобиль №%d подъехал к стартовой прямой.\n", carNumber);
                //Car on start
                //decrease counter
                START.countDown();
                //Causes the current thread to wait until the latch has counted down to zero
                START.await();
                Thread.sleep(trackLength / carSpeed);//wait finish
                System.out.printf("Автомобиль №%d финишировал!\n", carNumber);
            } catch (InterruptedException e) {
            }
        }
    }
}