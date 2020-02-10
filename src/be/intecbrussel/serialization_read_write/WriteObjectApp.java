package be.intecbrussel.serialization_read_write;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

public class WriteObjectApp {
    public static void main(String[] args) {

        String text = "This is some text";
        LocalDateTime dateTime = LocalDateTime.now();

        try (FileOutputStream file =
                     new FileOutputStream("MyFile1.txt");
                ObjectOutputStream out
                        = new ObjectOutputStream(file)){

            out.writeObject(dateTime);
            out.writeObject(text);

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

}
