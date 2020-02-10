package be.intecbrussel.serialization_read_write.person_serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class Maternity {
    public static void main(String[] args) {

        Person person = new Person("john", "doe",
                LocalDate.of(1990, 5, 24));

        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("Person.txt")
        )) {

            out.writeObject(person);
            System.in.read();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
