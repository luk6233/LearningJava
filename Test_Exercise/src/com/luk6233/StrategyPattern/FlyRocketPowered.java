package Test_Exercise.src.com.luk_d.StrategyPattern;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i'm flying with a rocket");
    }
}
