package CursoJava.WnioTest;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "Home\\Samuel\\Dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path01 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path01);
        System.out.println(path01.normalize());
    }
}
