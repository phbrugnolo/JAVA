public class Personagem {

    private String nome;
    private int pontuacao;
    private int numBatalhas;
    private int nivel;
    
    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNumBatalhas() {
        return numBatalhas;
    }

    public void setNumBatalhas(int numBatalhas) {
        this.numBatalhas = numBatalhas;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    
    public void atualizaPont(){
        pontuacao += 1;  
    }

    public void atualizaBatalha(){
        pontuacao += 1;  
    }


    public int subirNivel(){
       return nivel + 1;
    }

    public String info() {
        return "Nome: " + nome + ", \nPontuacao: " + pontuacao + "\nNumero de Batalhas: " + numBatalhas + ", Nivel: " + nivel;
    }

    
    
}
