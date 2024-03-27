import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        LocalDate data = LocalDate.parse("2004-12-05");

        Materia materia = new Materia("Desenvolvimento de Software");
        Materia materia2 = new Materia("Desenvolvimento de Web Básico");

        Aluno aluno = new Aluno("Pedro", "Rua XV", "de Novembro", "8000-000", data, materia);

        List<Materia> materias = new ArrayList<>();
        materias.add(materia);
        materias.add(materia2);

        System.out.println(aluno);
        
    }
}
