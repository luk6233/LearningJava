package Test_Exercise.src.com.luk_d.StrategyPattern;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
