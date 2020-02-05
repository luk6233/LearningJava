package factorymethod;

public class LuxuryCar extends Car { //concrete product
    public LuxuryCar() {
        name = "Luxury Car";
        accessories.add("Leather salon");
        accessories.add("Air condition");
        accessories.add("GPS");
        accessories.add("Heated steering wheel");
    }
}
