package Test_Exercise.src.com.luk_d.factorymethod;

public class BasicCar extends Car { //concrete product
    public BasicCar() {
        name = "Basic Car";
        accessories.add("Basic salon");
        accessories.add("Air condition");
    }
}
