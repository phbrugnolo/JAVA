public class Professor extends Pessoa {
    private String disciplina;
    private float salario;

    public void AumentarSalario(float porcentagem, Professor prof){

        float aumento = prof.getSalario() * (porcentagem/100);
        prof.setSalario(prof.getSalario() + aumento);
    }

    public Professor(String nome, String endereco, int idade, String disciplina, float salario) {
        super(nome, endereco, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor [disciplina=" + disciplina + ", salario=" + salario + ", getNome()=" + getNome()
                + ", getEndereco()=" + getEndereco() + ", getIdade()=" + getIdade() + "]";
    }

    
}
