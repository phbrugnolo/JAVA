import java.util.List;

public class Escola {
    private List<Pessoa> pessoas;

    public Escola(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Pessoa buscarPessoa(String nome){
        return pessoas.stream().filter(p -> p.getNome().equals(nome)).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return "Escola [pessoas=" + pessoas + "]";
    }

    
}
