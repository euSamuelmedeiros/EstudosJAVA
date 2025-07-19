package CursoJava.WnioTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Pasta/Test.txt");
        Files.createFile(path);

        Files.setAttribute(path, "dos:hidden", true);  // isso cria um arquivo oculto
        Files.setAttribute(path, "dos:readonly", true);

    }
}
