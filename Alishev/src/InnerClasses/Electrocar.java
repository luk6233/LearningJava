package Alishev.src.InnerClasses;

public class Electrocar {
    private int id;
    private static int number;

  // вкладений нестатичний клас
    private class Engine {
        public void engineStart() {
            System.out.println("Engine + " + id + " starting");
        }
    }

  // статичний вкладений клас для використання ззовні
  public static class Battery {
        public void charge() {
            System.out.println("Battery is charging" + number);
        }
  }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Engine engine = new Engine();
        engine.engineStart();

        int x = 1;

        // Клас вкладений в метод доступ тільки до фінальних полів методу і до полів класу
        class SomeClass {
            public void someMethod() {
                System.out.println(id);
                System.out.println(x);
            }
        }

        SomeClass sc = new SomeClass();
        test(sc);

        System.out.println("Electrocar + " + id + " is starting...");
    }

    private void test(Object o) {

    }
}
