package CursoJava.testSerialiaçao.domain;

import java.io.Serializable;

public class Al implements Serializable{
    private String name;
    private long id;
    private transient String senha;



    @Override
    public String toString() {
        return "al [name=" + name + ", id=" + id + ", senha=" + senha + "]";
    }

    public Al(String name, long id, String senha) {
        this.name = name;
        this.id = id;
        this.senha = senha;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        long Id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
