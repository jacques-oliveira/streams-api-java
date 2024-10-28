import dados.Aluno;
import dados.DataBase;

import java.util.List;

public class Main {
    
    public static void main(String[] args){

        System.out.println("Java Streams! Api\n");
        List<Aluno> alunos = DataBase.alunos;
        DataBase.imprimirAlunos();
        System.out.println("Alunos por curso\n");
        DataBase.imprimirPorCurso("Engenharia");
        System.out.println("Ordenar por idade\n");
        DataBase.ordemPorIdade();
    }
}
