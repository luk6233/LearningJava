package factorymethod;

public class LuxuryCarFactory extends CarFactory { //concrete creator
    @Override
    public Car createCar() {
        return new LuxuryCar();
    }
}
