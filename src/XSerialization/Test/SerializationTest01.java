package XSerialization.Test;

import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import XSerialization.Domain.Aluno;

public class SerializationTest01 {
     public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Samuel", "PaiMae12");
        

    }

    private static void serializar(Aluno aluno) {

        Path al = Paths.get("Pasta/Aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(al))) { // ---> para onde eu quero mandar esse arquivo.
                                                                                           
            oos.writeObject(aluno);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
