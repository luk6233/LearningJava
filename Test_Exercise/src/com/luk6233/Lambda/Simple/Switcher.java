package Test_Exercise.src.com.luk_d.Lambda.Simple;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    private List<EletricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener(EletricityConsumer listener) {
        listeners.add(listener);
    }

    public void removeElectricityListener(EletricityConsumer listener) {
        listeners.remove(listener);
    }

    public void switchOn() {
        System.out.println("Switch on");
//        if (consumer != null)
//            consumer.electricityOn();
        for(EletricityConsumer x : listeners) {
            x.electricityOn(this);
        }
    }
}
