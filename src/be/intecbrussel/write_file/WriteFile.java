package be.intecbrussel.write_file;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class WriteFile {
    public static void main(String[] args) {


        try(FileWriter fileWriter =
                    new FileWriter("file_copy.txt");
        FileWriter fileWriter2 = new FileWriter("File2.txt")){

            fileWriter.write("Hello");
            fileWriter.write("Java okt");
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
//        try {
//            file = new FileWriter("file_copy.txt");
//            file.write("Dank ");
//            file.write("u ");
//            file.write("voor ");
//            file.write("de ");
//            file.write("hulp ");
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                file.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }
}
