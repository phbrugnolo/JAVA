package model;

import java.time.LocalTime;

import controller.Veiculo;

public class Aviao extends Veiculo{
    private int pesoBagagem;

    public Aviao(int num, int valor, LocalTime partida, LocalTime retorno, int pesoBagagem) {
        super(num, valor, partida, retorno);
        this.pesoBagagem = pesoBagagem;
    }

    public int getPesoBagagem() {
        return pesoBagagem;
    }

    public void setPesoBagagem(int pesoBagagem) {
        this.pesoBagagem = pesoBagagem;
    }

    @Override
    public String toString() {
        return "Aviao [pesoBagagem=" + pesoBagagem + ", getNum()=" + super.getNum() + ", getValor()=" + super.getValor()
                + ", getPartida()=" + super.getPartida() + ", getRetorno()=" + super.getRetorno() + "]";
    }

    
    
}
