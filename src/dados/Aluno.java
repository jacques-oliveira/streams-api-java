package dados;

public class Aluno {
    private String nome;
    private String curso;
    private int idade;
    private String sexo;
    private boolean aprovado;

    public Aluno(){}
    
    public Aluno(String nome, String curso, int idade, String sexo, boolean aprovado) {
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
        this.sexo = sexo;
        this.aprovado = aprovado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
