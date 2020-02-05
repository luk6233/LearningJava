package Test_Exercise.src.com.luk_d.factorymethod;

public class LuxuryCarFactory extends CarFactory { //concrete creator
    @Override
    public Car createCar() {
        return new LuxuryCar();
    }
}
