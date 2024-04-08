public class Contato {

    private String nome;
    private int tel;

    

    public Contato(String nome, int tel) {
        this.nome = nome;
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", tel=" + tel + "]";
    }

    
    

    
}
