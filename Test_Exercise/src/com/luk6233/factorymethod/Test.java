package Test_Exercise.src.com.luk_d.factorymethod;

public class Test {
    public static void main(String[] args) {
        CarFactory myLuxuryFactory = new LuxuryCarFactory();
        CarFactory myBasicFactory = new BasicCarFactory();

        Car myLuxuryCar = myLuxuryFactory.createCar();
        Car myBasicCar = myBasicFactory.createCar();

        System.out.println(myLuxuryCar);
        System.out.println(myBasicCar);

    }
}
