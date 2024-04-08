public class Materia implements Comparable<Materia> {
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

    @Override
    public int compareTo(Materia m) {
        return nome.compareTo(m.getNome());
    }

    
    
}
