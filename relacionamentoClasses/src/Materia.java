public class Materia {
    private String nome;

    public Materia(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Materia [nome=" + nome + "]";
    } 

    
}
