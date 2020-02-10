package be.intecbrussel.serialization_read_write.person_serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class CivilService {
    public static void main(String[] args) {

        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("Person.txt"))) {
            Person person = (Person) in.readObject();
            System.out.println(person);
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
