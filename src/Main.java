import dados.Aluno;
import dados.DataBase;

import java.util.List;

public class Main {
    
    public static void main(String[] args){

        System.out.println("Java Streams! Api");
        List<Aluno> alunos = DataBase.alunos;
        DataBase.imprimirAlunos();

        
    }
}
