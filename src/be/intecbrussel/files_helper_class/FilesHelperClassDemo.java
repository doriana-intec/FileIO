package be.intecbrussel.files_helper_class;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FilesHelperClassDemo {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\Intec.PC221-02\\Documents\\File_IO\\file.txt");

        try {
            Files.createDirectories(path.getParent());

            if (Files.notExists(path)){
                Files.createFile(path);
                System.out.println("File created");
            }else {
                System.out.println("File already exists");
            }

            List<String> words = new ArrayList<>();
            words.add("Appel");
            words.add("Aardbei");
            words.add("Avocado");
            words.add("Ananas");
            words.add("Golden kiwi is yummy");

            Files.write(path,words,
                    Charset.forName("UTF-8"), StandardOpenOption.APPEND);

            DosFileAttributes attributes = Files.readAttributes(path,
                    DosFileAttributes.class);


            System.out.println("Size of file in bytes: " + attributes.size());
            System.out.println("File was created at : " + attributes.creationTime());
            System.out.println("The file was last accessed around : " + attributes.lastAccessTime());
            System.out.println("The last time the file was modified: " + attributes.lastModifiedTime());
            System.out.println("Archive: " + attributes.isArchive());
            System.out.println("Hidden or not ? :" + attributes.isHidden());
            System.out.println("Is it read only or not ? : " + attributes.isReadOnly());

            System.out.println("*".repeat(20));
            Files.lines(path).forEach(System.out::println);

            System.out.println("Making a copy");
            Path path1 = Paths.get("C:\\Users\\Intec.PC221-02\\Documents\\File_IO\\file_copy.txt");
            Files.copy(path, path1, StandardCopyOption.REPLACE_EXISTING);

            Files.lines(path1).forEach(System.out::println);
            Files.deleteIfExists(path);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
