package Lambda.Simple;

public class Program {

    public static void fire(Object sender) {
        System.out.println("Fire!!!");
    }

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        //event subscribe
        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);

        String message = "Alert";
//        message = "Fuck" //error

//        switcher.addElectricityListener(new EletricityConsumer() {
//             @Override
//             public void electricityOn(Object sender) {
//                 System.out.println("Fire");
//             }
//         });
//        switcher.addElectricityListener( sender -> {
//            System.out.print(message);
//            System.out.println("!!!");
//        } );
//        switcher.addElectricityListener( sender -> System.out.print(message) );

//        switcher.addElectricityListener( sender -> Program.fire(sender));
        switcher.addElectricityListener(Program::fire);


        switcher.switchOn();


    }
}
