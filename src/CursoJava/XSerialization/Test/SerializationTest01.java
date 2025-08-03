package CursoJava.XSerialization.Test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import CursoJava.XSerialization.Domain.Aluno;
import CursoJava.XSerialization.Domain.Turma;




public class SerializationTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Samuel", "PaiMae12");
        Turma turma = new Turma("Turma viradao no java ");
                
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();

    }

    private static void serializar(Aluno aluno) {

        Path al = Paths.get("Pasta/Aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(al))) { // ---> para onde eu quero
                                                                                           // mandar esse arquivo.
            oos.writeObject(aluno);
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }

    private static void deserializar() {

        Path al = Paths.get("Pasta/Aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(al))) {

            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
