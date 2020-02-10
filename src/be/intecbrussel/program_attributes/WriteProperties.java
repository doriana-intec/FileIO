package be.intecbrussel.program_attributes;

import java.io.FileOutputStream;
import java.util.Properties;

public class WriteProperties {
    public static void main(String[] args) {

        try (FileOutputStream fileOutputStream =
                     new FileOutputStream("Application1.xml")) {

            Properties properties = new Properties();
            properties.setProperty("Attribute1", "value1");
            properties.setProperty("Attribute2", "value2");
            properties.setProperty("Attribute3", "value3");
            properties.setProperty("Attribute4", "value4");
//            properties.store(fileOutputStream,"Application properties");
            properties.storeToXML(fileOutputStream, "XML properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
