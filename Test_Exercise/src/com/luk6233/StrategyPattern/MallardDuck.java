package Test_Exercise.src.com.luk_d.StrategyPattern;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a real MallardDuck");
    }

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();


    }
}
