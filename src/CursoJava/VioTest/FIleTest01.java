package CursoJava.VioTest;

import java.io.File;

public class FIleTest01 {
    public static void main(String[] args) {
        File file = new File("FIle.txt");
        try {

            boolean created = file.createNewFile(); // ===> try = tratando a exeção
            System.out.println(created);
           // boolean existis = file.exists();
            System.out.println("caminho absoluto do arquivo: " + file.getAbsolutePath()); // ---> mostra o caminho exato
                                                                                          // do meu arquivo criado
           /*  if (existis) {
                System.out.println("deletado " + file.delete());
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
