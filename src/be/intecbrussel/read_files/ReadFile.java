package be.intecbrussel.read_files;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        try(FileReader file = new FileReader("file_copy.txt")){
            int character;
            while ((character= file.read()) != -1){
                System.out.println((char) character);
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
