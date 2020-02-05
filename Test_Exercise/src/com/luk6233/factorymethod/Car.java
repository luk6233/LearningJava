package factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Car { //product
    String name;
    List<String> accessories = new ArrayList<>();

    @Override
    public String toString() {
        return "Car: " +
                "name '" + name + "\n" +
                "accessories: " + accessories;
    }
}
