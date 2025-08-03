package CursoJava.testSerialiaçao.test;

import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import CursoJava.testSerialiaçao.domain.Al;

public class alTest01 {
    public static void main(String[] args) {
        Al aluno = new Al("Samuca", 1L, "olaMundo");
        serializar(aluno);
        

    }
   
    private static void serializar(Al al) {
        Path all = Paths.get("pastas/al.txt");
        try (ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(all))) {
            oss.writeObject(al);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
