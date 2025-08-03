package CursoJava.XSerialization.Domain;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

public class Aluno implements Serializable {
    @Serial
    private long id;
    private String name;
    private transient String senha;
    private transient Turma turma;

    public Aluno(long id, String name, String senha) {
        this.id = id;
        this.name = name;
        this.senha = senha;
    }

    @Serial
    private void writeObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nameClass = ois.readUTF();
            Turma turma = new Turma(nameClass);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject(ObjectOutputStream oss) {
        try {
            oss.defaultWriteObject();
            oss.writeUTF(turma.getName());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aluno [id=" + id + ", name=" + name + ", senha=" + senha + " Turma=" + turma + "]";
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
