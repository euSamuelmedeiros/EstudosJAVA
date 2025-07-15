package CursoJava.VioTest;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTEst01 {
      public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter br = new BufferedWriter(fw)) {

            br.write("o Java ainda vai me abrir muitas portas. \nContinuar...");
            br.flush();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
