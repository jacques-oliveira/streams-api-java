package dados;

import java.util.ArrayList;
import java.util.List;

public abstract class DataBase {
    public static List<Aluno> alunos;

    static {
        alunos = new ArrayList<>();

        alunos.add(new Aluno("Hugo","Engenharia",25,"m",true));
        alunos.add(new Aluno("Maria","Medicina",27,"f",true));
        alunos.add(new Aluno("Tiago","Computação",22,"m",false));
        alunos.add(new Aluno("Marcos","Engenharia",25,"m",false));
        alunos.add(new Aluno("Sara","Medicina",20,"f",true));
    }

    public static void imprimirAlunos(){
        alunos.stream().forEach(aluno -> System.out.println(aluno));
    }

    public static void imprimirPorCurso(String curso){
        alunos.stream()
                .filter(aluno -> aluno.getCurso().equals( curso))
                .forEach(aluno -> System.out.println(aluno));
    }

    public static void ordemPorIdade(){
        alunos.sort(new IdadeComparator());
        for(Aluno a : alunos){
            System.out.println(a);
        }
    }
}
