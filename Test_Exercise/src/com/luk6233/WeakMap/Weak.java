package WeakMap;


import java.util.Map;
import java.util.WeakHashMap;

public class Weak {
    public static void main(String[] args) {
        Map<Object, String> map = new WeakHashMap<Object, String>();
        Object data = new Object();
        map.put(data, "Information");

        data = null;
        System.gc();

        for (int i = 0; i < 10000; i++) {
            if (map.isEmpty()) {
                System.out.println("Empty!");
                System.out.println(i);
                break;
            }
        }
    }
}
