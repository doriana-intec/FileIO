package be.intecbrussel.serialization_read_write;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReadObjectApp {
    public static void main(String[] args) {

        try(FileInputStream file = new FileInputStream("MyFile.txt");ObjectInputStream in =
                    new ObjectInputStream(file)){

            String text = (String) in.readObject();
            LocalDateTime dateTime = (LocalDateTime) in.readObject();

            DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/mm/yyyy");
            String formatterDate = dateTime.format(dt);
            System.out.println(text);
            System.out.println(formatterDate);

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
