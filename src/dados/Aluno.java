package dados;

import java.util.Comparator;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", aprovado=" + aprovado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade && aprovado == aluno.aprovado && Objects.equals(nome, aluno.nome) && Objects.equals(curso, aluno.curso) && Objects.equals(sexo, aluno.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, curso, idade, sexo, aprovado);
    }
}
class IdadeComparator implements Comparator<Aluno>{

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}
