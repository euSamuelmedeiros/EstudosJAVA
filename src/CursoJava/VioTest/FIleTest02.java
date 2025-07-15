package CursoJava.VioTest;

import java.io.File;
import java.io.IOException;

public class FIleTest02 {
    public static void main(String[] args) {
        File diretorio = new File("Pasta");
        boolean diretorioCreated = diretorio.mkdir(); // .mkdir --> para criar direorio/Pasta
        System.out.println(diretorioCreated);
        File fileArquivoDiret = new File(diretorio, "PastaTes");
        try {
            boolean isFileCreated = fileArquivoDiret.createNewFile();
            System.out.println(isFileCreated);
        } catch (IOException e) {

            e.printStackTrace();
        }

        // rename File
        File fileRenamd = new File(diretorio, "arquivo_renamd"); // -->o diretorio é a pasta em que o arquivo deve
                                                                 // serrenomeado, diretorio -> arquivo_renamd
        boolean renameTo = fileArquivoDiret.renameTo(fileRenamd);
        System.out.println(renameTo);

        // Rename directory
        File diretorioREnamed = new File("pasta02");
        boolean isDirectoryRenemed = diretorio.renameTo(diretorioREnamed);
        System.out.println(isDirectoryRenemed);

    }
}
