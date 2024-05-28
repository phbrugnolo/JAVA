package controller;

import java.time.LocalTime;

public abstract class Veiculo {

    private int num;
    private float valor;
    private LocalTime partida, retorno;
    public Veiculo(int num, float valor, LocalTime partida, LocalTime retorno) {
        this.num = num;
        this.valor = valor;
        this.partida = partida;
        this.retorno = retorno;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public LocalTime getPartida() {
        return partida;
    }
    public void setPartida(LocalTime partida) {
        this.partida = partida;
    }
    public LocalTime getRetorno() {
        return retorno;
    }
    public void setRetorno(LocalTime retorno) {
        this.retorno = retorno;
    }

    
    
}
