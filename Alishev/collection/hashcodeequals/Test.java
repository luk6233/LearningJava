package collection.hashcodeequals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");

        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        map.put(person1, "one");
        map.put(person2, "two");

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);

        Object obj = new Object();
    }
}


