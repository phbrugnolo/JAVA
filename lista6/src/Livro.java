public class Livro {
    private String nome, autor, genero;
    private Integer quantidade;

    public Livro(String nome, String autor, String genero, Integer quantidade) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", autor=" + autor + ", genero=" + genero + ", quantidade=" + quantidade + "]";
    }

    
    public int verEstoque(){
        return 0;
    }
    
}
