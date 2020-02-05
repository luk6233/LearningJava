package Test_Exercise.src.com.luk_d.Lambda.Simple;

public class Lamp implements EletricityConsumer {

    public void lightOn() {
        System.out.println("Light on");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
