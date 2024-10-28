package dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class DataBase {
    public static List<Aluno> alunos;

    static {
        alunos = new ArrayList<>();

        alunos.add(new Aluno("Hugo","Engenharia",25,"m",true));
        alunos.add(new Aluno("Maria","Medicina",27,"f",true));
        alunos.add(new Aluno("Jonas","Computação",22,"m",false));
        alunos.add(new Aluno("Marcos","Engenharia",18,"m",false));
        alunos.add(new Aluno("Sara","Medicina",20,"f",true));
        alunos.add(new Aluno("Hugo","Engenharia",25,"m",true));
        alunos.add(new Aluno("Igor","Medicina",27,"m",false));
        alunos.add(new Aluno("Tiago","Computação",19,"m",false));
        alunos.add(new Aluno("Bruno","Engenharia",35,"m",false));
        alunos.add(new Aluno("Sara","Medicina",31,"f",true));
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
//        alunos.sort(new IdadeComparator());
//        Collections.sort(alunos,new IdadeComparator());
//        for(Aluno a : alunos){
//            System.out.println(a);
//        }
        alunos.stream()
                .sorted(new IdadeComparator())
                .forEach(aluno -> System.out.println(aluno));

    }
}
