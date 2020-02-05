package Test_Exercise.src.com.luk_d.Graph;

import java.util.HashMap;

public class Dijkstra {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, Integer>> graph = new HashMap<>();
        HashMap<String, Integer> s = new HashMap<>();
        s.put("A", 6);
        s.put("B", 2);
        HashMap<String, Integer> a = new HashMap<>();
        s.put("F", 1);
        s.put("B", 2);
        HashMap<String, Integer> b = new HashMap<>();
        s.put("A", 3);
        s.put("F", 5);
        HashMap<String, Integer> f = new HashMap<>();

        graph.put("S", s);
        graph.put("A", a);
        graph.put("B", b);
        graph.put("F", f);

        HashMap<String, Integer> weight = new HashMap<>();
        weight.put("A", 6);
        weight.put("B", 2);
        weight.put("F", Integer.MAX_VALUE);
    }

}
