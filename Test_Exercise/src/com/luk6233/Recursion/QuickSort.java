package Test_Exercise.src.com.luk_d.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(99, 1, 5, 66, 3, 6, 8));
        for(int x : quickSort(list)) {
            System.out.println(x);
        }
    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> list) {
        if (list.size() < 2) return list;
        int pivot = list.get(0);
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            int a = list.get(i);
            if (a <= pivot) {
                less.add(a);
            }
            else greater.add(a);
        }
        ArrayList<Integer> result = new ArrayList<>(list.size());
        result.addAll(quickSort(less));
        result.add(pivot);
        result.addAll(quickSort(greater));

        return result;
    }
}
