package Test_Exercise.src.com.luk_d.factorymethod;

public class BasicCarFactory extends CarFactory { //concrete creator
    @Override
    public Car createCar() {
        return new BasicCar();
    }
}
