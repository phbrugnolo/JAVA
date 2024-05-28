package controller;

import java.time.LocalDate;

public class Reserva implements Comparable<Reserva> {

    private int id;
    private static int nextId = 1;
    private String origem, destino;
    private LocalDate inicio, fim;
    private float valor;
    private Hospedagem hospedagem;
    private Veiculo veiculo;
    public Reserva(String origem, String destino, LocalDate inicio, LocalDate fim, float valor, Hospedagem hospedagem, Veiculo veiculo) {
        this.id = nextId++;
        this.origem = origem;
        this.destino = destino;
        this.inicio = inicio;
        this.fim = fim;
        this.valor = valor;
        this.hospedagem = hospedagem;
        this.veiculo = veiculo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public LocalDate getInicio() {
        return inicio;
    }
    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }
    public LocalDate getFim() {
        return fim;
    }
    public void setFim(LocalDate fim) {
        this.fim = fim;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public Hospedagem getHospedagem() {
        return hospedagem;
    }
    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Reserva [id=" + id + ", origem=" + origem + ", destino=" + destino + ", inicio="
                + inicio + ", fim=" + fim + ", valor=" + valor + ", hospedagem=" + hospedagem + ", veiculo=" + veiculo
                + "]";
    }
    @Override
    public int compareTo(Reserva o) {
        return Float.compare(this.valor, o.valor);
    }

    
}
