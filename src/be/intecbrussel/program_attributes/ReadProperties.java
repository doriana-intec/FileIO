package be.intecbrussel.program_attributes;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) {

        try (FileInputStream in =
                     new FileInputStream("Application1 .xml")) {
            Properties properties = new Properties();
//            properties.load(in);
//            properties.list(System.out);
            properties.loadFromXML(in);
            properties.list(System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
