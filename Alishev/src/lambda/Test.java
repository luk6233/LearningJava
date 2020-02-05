package Alishev.src.lambda;

interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable executable) {
        int a = executable.execute(10, 15);
        System.out.println(a);
    }

}

public class Test {
    public static void main(String[] args) {
//        Thread thread = new Thread(() -> System.out.println("Hello"));

        Runner runner = new Runner();

        int a = 2;
        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                System.out.println("Hi");
                System.out.println("Call");
                int a = 4;

                return x + y;
            }
        });

        int z = 5;
//        z = 4;
        runner.run((x, y) -> {
//            int z = 2;
            int b =4;
            return x + y + z;
        });

    }
}
