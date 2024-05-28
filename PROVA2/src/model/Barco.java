package model;

import java.time.LocalTime;

import controller.Veiculo;

public class Barco extends Veiculo{

    private int numCabine;

    public Barco(int num, int valor, LocalTime partida, LocalTime retorno, int numCabine) {
        super(num, valor, partida, retorno);
        this.numCabine = numCabine;
    }

    public int getNumCabine() {
        return numCabine;
    }

    public void setNumCabine(int numCabine) {
        this.numCabine = numCabine;
    }

    @Override
    public String toString() {
        return "Barco [numCabine=" + numCabine + ", getNum()=" + super.getNum() + ", getValor()=" + super.getValor()
                + ", getPartida()=" + super.getPartida() + ", getRetorno()=" + super.getRetorno() + "]";
    }


    
}
