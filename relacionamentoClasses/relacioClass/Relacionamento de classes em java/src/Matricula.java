public class Matricula {
    private int numero;

    public Matricula(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Matricula [numero=" + numero + "]";
    }

    
}
