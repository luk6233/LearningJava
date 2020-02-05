package Recursion;

import java.util.Arrays;

public class Countdown {
    public static void main(String[] args) {
//        countdown(5);
//        System.out.println(fact(5));
//        System.out.println(sum(2, 4, 6));
        System.out.println(count(2, 4, 6));
    }

    public static void countdown(int i) {
        System.out.println(i);
        if (i > 0) {
            countdown(i - 1);
        } else return;
    }

    public static int fact(int x) {
        if (x == 1) return 1;
        return x * fact(x - 1);
    }

//    public static int sum(int... x) {
//        int sum = 0;
//        for (int i : x) sum += i;
//        return sum;
//    }

    public static int sum(int... x) {
        if (x.length == 0) return 0;
        if (x.length == 1) return x[0];
        return x[0] + sum(Arrays.copyOfRange(x, 1, x.length));
    }

    public static int count(int... x) {
        if (x.length == 0) return 0;
        return 1 + count(Arrays.copyOfRange(x, 1, x.length));
    }

    public static int max(int... x) {
        if (x.length == 2) return x[0] > x[1] ? x[0] : x[1];
        int submax = max(Arrays.copyOfRange(x, 1, x.length));
        return x[0] > submax ? x[0] : submax;

    }
}
