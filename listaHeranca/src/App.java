import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        List<Aluno> alunos = new ArrayList<Aluno>();
        List<Professor> professores = new ArrayList<Professor>();


        funcionarios.add(new Funcionario("Func1", "funcen1", 18, "Estagio", "ADM", 20000));
        funcionarios.add(new Funcionario("Func2", "funcen2", 19, "CLT", "ADM", 2000));

        alunos.add(new Aluno("Aluno1", "alunen1", 20, 7, "JS", "mat1"));
        alunos.add(new Aluno("Aluno2", "alunen2", 21, 5, "java", "mat2"));

        professores.add(new Professor("prof1", "profen1", 22, "JS", 10000));
        professores.add(new Professor("prof2", "profen2", 23, "JAVA", 1000));

        Escola esc = new Escola(new ArrayList<>());

        esc.getPessoas().addAll(funcionarios);
        esc.getPessoas().addAll(alunos);
        esc.getPessoas().addAll(professores);
  
        

        System.out.println(esc);
    }
}
