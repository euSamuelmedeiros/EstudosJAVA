package XSerialization.Domain;

public class Aluno {
    
    private long id;
    private String name;
    private String senha;

    public Aluno(long id, String name, String senha) {
        this.id = id;
        this.name = name;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Aluno [id=" + id + ", name=" + name + ", senha=" + senha + "]";
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
