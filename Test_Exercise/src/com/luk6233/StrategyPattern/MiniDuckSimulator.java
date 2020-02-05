package Test_Exercise.src.com.luk_d.StrategyPattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.preformFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.preformFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.preformFly();
    }
}
