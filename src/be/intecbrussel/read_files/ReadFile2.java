package be.intecbrussel.read_files;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile2 {
    public static void main(String[] args) {

        try (FileReader file = new FileReader("file_copy.txt");
             BufferedReader bufferedReader = new BufferedReader(file)) {
            String line = null;

            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println(ioe.getMessage());
        }

    }
}
