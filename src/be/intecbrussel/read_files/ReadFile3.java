package be.intecbrussel.read_files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile3 {
    public static void main(String[] args) {

        Path path = Paths.get("file_copy.txt");

        try(BufferedReader reader = Files.newBufferedReader(path)){

            String line = null;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
