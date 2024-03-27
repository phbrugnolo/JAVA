public class Disciplina {
    private String nome, materia;

    public Disciplina(String nomeMateria, String materia) {
        nome = nomeMateria;
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    
}
