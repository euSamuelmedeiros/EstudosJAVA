package CursoJava.WnioTest;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileattributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("Pasta/novo.txt");                       // ---> tudo isso para mudar a data de modificação de um arquivo
        boolean isCreated = file.createNewFile();

       boolean modific = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

    }
}
