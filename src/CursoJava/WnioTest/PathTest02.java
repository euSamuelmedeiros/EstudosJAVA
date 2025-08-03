package CursoJava.WnioTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path PastaPath = Paths.get("Pastaa"); // = new FIle(Pasta)
        if (Files.notExists(PastaPath)) {
            Path pastadirectory = Files.createDirectory(PastaPath);
        }

    }
}
