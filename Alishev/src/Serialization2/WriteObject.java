package Serialization2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Person[] people = {new Person(3, "John"), new Person(4, "Bill"), new Person(5, "Jack")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

    /*        oos.writeInt(people.length);

            for(Person person : people) {
                oos.writeObject(person);
            }*/

            oos.writeObject(people);

            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
