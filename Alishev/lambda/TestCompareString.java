package lambda;

import java.util.ArrayList;
import java.util.List;

public class TestCompareString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Aba");
        list.add("Hello");
        list.add("quarkarer");
        list.add("a");

//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });

        list.sort((s1, s2) -> {
            return s1.length() - s2.length();
        });

        System.out.println(list);
    }
}
