package lambda;

import java.util.*;
import java.util.stream.Collectors;

public class TestCollection {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillArray(array1);
        fillList(list1);

//        for (int i = 0; i < 10; i++) {
//            array[i] *= 2;
//            list.set(i, list.get(i) * 2);
//        }
        //map method
        array1 = Arrays.stream(array1).map(a -> a * 2).toArray();
        list1 = list1.stream().map(x -> x * 2).collect(Collectors.toList());

        array1 = Arrays.stream(array1).map(a -> 3).toArray();
        array1 = Arrays.stream(array1).map(a -> a + 1).toArray();

        System.out.println(Arrays.toString(array1));
        System.out.println(list1);

        //filter method
        int[] array2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArray(array2);
        fillList(list2);

        array2 = Arrays.stream(array2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println(Arrays.toString(array2));
        System.out.println(list2);

        //forEach method
        Arrays.stream(array2).forEach(a -> System.out.println(a));
        Arrays.stream(array2).forEach(System.out::println);
        list2.stream().forEach(a -> System.out.println(a));

        //reduce method
        int[] array3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArray(array3);
        fillList(list3);

        int sum1 = Arrays.stream(array3).reduce((acc, b) -> acc + b).getAsInt(); //acc - по замовчуванную рівний першому єлементу массива
        // ітерація з другого єлемента. після кожної ітерації асс змінюється
        int sum2 = list3.stream().reduce((acc, b) -> acc * b).get();

        System.out.println(sum1 + " " + sum2);

        int[] array4 = new int[10];
        fillArray(array4);

        System.out.println("array4");

        Arrays.stream(array4).filter(a -> a % 2 != 0).map(a -> a * 2).forEach(System.out::println);

        System.out.println(Arrays.toString(array4) + "\n\n" + "set");


        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(5);
        System.out.println(set);

        set = set.stream().map(a -> a * 3).collect(Collectors.toSet());
        System.out.println(set);


    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
    }

    public static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }
}
