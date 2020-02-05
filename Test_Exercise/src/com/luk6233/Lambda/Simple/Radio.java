package Test_Exercise.src.com.luk_d.Lambda.Simple;

public class Radio implements EletricityConsumer {

    public void playMusic() {
        System.out.println("Radio plays");
    }

    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }
}
