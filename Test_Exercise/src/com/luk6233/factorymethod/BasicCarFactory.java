package factorymethod;

public class BasicCarFactory extends CarFactory { //concrete creator
    @Override
    public Car createCar() {
        return new BasicCar();
    }
}
