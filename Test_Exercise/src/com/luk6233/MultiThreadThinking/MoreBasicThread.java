package Test_Exercise.src.com.luk_d.MultiThreadThinking;

public class MoreBasicThread {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            new Thread(new LiftOff()).start();
        System.out.println("Waiting for LiftOff");
    }
}
