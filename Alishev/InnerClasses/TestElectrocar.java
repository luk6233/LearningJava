package Alishev.src.InnerClasses;

public class TestElectrocar {
    public static void main(String[] args) {
        Electrocar car = new Electrocar(34);
        car.start();

        Electrocar.Battery battery = new Electrocar.Battery();
    }
}
