import java.time.LocalDate;

public class Reserva {

    private String nome;
    private int numPessoa;
    private LocalDate data;
    private float valor;


    public Reserva(String nome, int numPessoa, LocalDate data, float valor){

        this.nome = nome;
        this.numPessoa = numPessoa;
        this.data = data;
        this.valor = valor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNumPessoa(int numPessoa){
        this.numPessoa = numPessoa;
    }
    public void setData(LocalDate data){
        this.data = data;
    }
    public void setValor(float valor){
        this.valor = valor;
    }

    public int getNumPessoa(){
        return this.numPessoa;
    }
    public String getNome(){
        return this.nome;
    }
    public LocalDate getData(){
        return this.data;
    }
    public float getValor(){
        return this.valor;
    }

    public float calculaValor(){
        return this.getValor() * this.getNumPessoa();
    }

    public String exibir(){
        return 
        "O nome do titular da reserva é " + this.nome +
        "\nA qunatidade de pessoas é " + this.numPessoa +
        "\nA data da reserva foi " + this.data +
        "\nE o valor da reserva foi de " + this.valor +
        "\nE o total foi de " + this.calculaValor();
    }


}
