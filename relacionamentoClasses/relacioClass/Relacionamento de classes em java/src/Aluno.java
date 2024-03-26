import java.time.LocalDate;

public class Aluno {
    private String nome;
    private LocalDate dataNasc;
    private Matricula matricula; // Composição
    private Materia materia; //Associação
    private Endereco endereco; //Agregação
    
    public Aluno(String nome, String rua, String complemento, String cep, LocalDate dataNasc, Materia materia) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        matricula = new Matricula(1);
        this.materia = materia;
        endereco = new Endereco(rua, complemento, cep);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", dataNasc=" + dataNasc + ", matricula=" + matricula + ", materia=" + materia
                + ", endereco=" + endereco + "]";
    }

    
}
