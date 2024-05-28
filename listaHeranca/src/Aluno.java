public final class Aluno extends Pessoa {
    private float nota;
    private String curso, matricula;

    public Aluno(String nome, String endereco, int idade, float nota, String curso, String matricula) {
        super(nome, endereco, idade);
        this.nota = nota;
        this.curso = curso;
        this.matricula = matricula;
    }

    public String Situacao(float nota){
        if(nota > 6){
            return "Aprovado";
        }else {
            return "Reprovado";
        }
    }

    public float getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno [nota=" + nota + ", curso=" + curso + ", matricula=" + matricula + ", getNome()=" + getNome()
                + ", getEndereco()=" + getEndereco() + ", getIdade()=" + getIdade() + "]";
    }

    
    
}
