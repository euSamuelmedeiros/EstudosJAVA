package CursoJava.WnioTest;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamtest01 {
    public static void main(String[] args) {
        Path dir = Paths.get(".");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path path : stream) {                                       //todo esse codigo é para listar todos os arquivos de um diretorio.
                System.out.println(path.getFileName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
