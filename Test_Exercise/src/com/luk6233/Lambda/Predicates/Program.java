package Test_Exercise.src.com.luk_d.Lambda.Predicates;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Bill", 43));
        list.add(new Person("Bob", 6));
        list.add(new Person("John", 24));
        list.add(new Person("George", 14));
        list.add(new Person("Garry", 33));

//        for (Person p : list)
//            System.out.println(p);
//
//        list.stream().forEach(p -> System.out.println(p));
//        list.stream().forEach( System.out::println );
        list.stream().
                filter( p -> p.getAge() >= 18).
                sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).
                map (p -> p.getName()).
                forEach(System.out::println);  // ( (String name) -> System.out.println(name));


        int sum = 0;
        int count = 0;
        for(Person x : list) {
            if (x.getAge() >= 18) {
                sum += x.getAge();
                count++;
            }
        }

        double averageAge = (double) sum / count;
        System.out.println(averageAge);

        double av = list.stream().filter(p -> p.getAge() >= 18).mapToInt(p -> p.getAge()).average().getAsDouble();
        System.out.println(av);

    }
}
