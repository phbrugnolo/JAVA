package controller;

public class Hospedagem {
    private String nome;
    private int numQuartos, numPessoa;
    private float valor;
    public Hospedagem(String nome, int numQuartos, int numPessoa, float valor) {
        this.nome = nome;
        this.numQuartos = numQuartos;
        this.numPessoa = numPessoa;
        this.valor = valor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumQuartos() {
        return numQuartos;
    }
    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }
    public int getNumPessoa() {
        return numPessoa;
    }
    public void setNumPessoa(int numPessoa) {
        this.numPessoa = numPessoa;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Hospedagem [nome=" + nome + ", numQuartos=" + numQuartos + ", numPessoa=" + numPessoa + ", valor="
                + valor + "]";
    }

    
}
