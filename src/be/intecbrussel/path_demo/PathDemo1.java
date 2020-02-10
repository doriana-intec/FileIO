package be.intecbrussel.path_demo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo1 {
    public static void main(String[] args) {

        Path filePath =
                Paths.get("C:\\Users\\Sandrineu\\Documenten\\tekstje.txt");
        System.out.println(filePath);

        System.out.println("File name is: " + filePath.getFileName());

        Path path1 = Paths.get("C:\\Users");
        Path path2 = path1.resolve("Sandrineu");
        Path path3 = path2.resolve("Documents");
        Path path4 = path3.resolve("tekstje.txt");
        System.out.println(path4);

        Path path5 = Paths.get("tekstje.txt");
        System.out.println("Absolute path of txt file: " + path5.toAbsolutePath());

        Path path6 = Paths.get("C:\\Users\\Intec.PC221-02\\Documents\\File_IO\\tekstje.txt");
        Path path7 = Paths.get("C:\\Users\\Intec.PC221-02\\Documents\\Generics\\tekstje.txt");
        System.out.println("Relativize method : " + path6.relativize(path7));

        System.out.println("Root of file: " + path7.getRoot());
        System.out.println("Parent: " + path7.getParent());

    }
}
