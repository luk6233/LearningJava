package Test_Exercise.src.com.luk_d.Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyTestClass {
    public static final Logger LOGGER = LoggerFactory.getLogger(MyTestClass.class);

    public static void main(String[] args) {
        LOGGER.info("Start programm");

        try {
            LOGGER.warn("Attention! Divine by zero");
            System.out.println(12/0);
        } catch (ArithmeticException x) {

            LOGGER.error("Error");
        }
    }
}
