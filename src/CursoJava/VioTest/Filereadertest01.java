package CursoJava.VioTest;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filereadertest01 {
    //FILEREADER.
    public static void main(String[] args) {
        File file = new File("FIle.txt");
        try (FileReader fr = new FileReader(file)) {

            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i); // com isso consigo pegar todos od dados do arquivo.

            }
            // char[] in = new char[30];
            // for (char c : in) {
            // System.out.print(c);
            // }
            // fr.read(in);
        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
