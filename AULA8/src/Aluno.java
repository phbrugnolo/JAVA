import java.util.List;

public class Aluno {
    private String nome;
    private List<Materia> materia;

    public Aluno(String nome, List<Materia> materia) {
        this.nome = nome;
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Materia> getMateria() {
        return materia;
    }

    public void setMateria(List<Materia> materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", materia=" + materia + "]";
    }



    
    
}
