package factorymethod;

public class BasicCar extends Car { //concrete product
    public BasicCar() {
        name = "Basic Car";
        accessories.add("Basic salon");
        accessories.add("Air condition");
    }
}
