package CursoJava.WnioTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileattributesTest02 {
    public static void main(String[] args) throws IOException  {
       Path path = Paths.get("pasta2/novo_path.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
    }
}
