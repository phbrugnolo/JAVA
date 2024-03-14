import java.time.LocalDate;

public class Evento {

    private String nome;
    private LocalDate data;
    private float preco;
    private int quantidadeIG;
    private int quantidadeIGVendidos; 

    public Evento(String nome, LocalDate data, float preco, int quantidadeIG , int quantidadeIGVendidos){
        this.nome = nome;
        this.data = data;
        this.preco = preco;
        this.quantidadeIG = quantidadeIG;
        this.quantidadeIGVendidos = quantidadeIGVendidos;
    }


    public void setNome(String nome){
        this.nome = nome;
    }
    public void setData(LocalDate data){
        this.data = data;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public void setQuantidadeIG(int quantidade){
        this.quantidadeIG = quantidade;
    }
    public void setQuantidadeIGVendidos(int quantidadeIGVendidos){
        this.quantidadeIGVendidos = quantidadeIGVendidos;
    }

    public int getQuantidadeIG(){
        return this.quantidadeIG;
    }
    public int getQuantidadeIGVendidos(){
        return this.quantidadeIGVendidos;
    }
    public String getNome(){
        return this.nome;
    }
    public LocalDate getData(){
        return this.data;
    }
    public float getPreco(){
        return this.preco;
    }
    
    public String venderIG(){
        if(this.getQuantidadeIG() < this.getQuantidadeIGVendidos()){
            return "A quantidade de ingressos disponiveis é inferior a quantidade disponivel";
        }else {
            return "Foram vendidos " + this.getQuantidadeIGVendidos() + " ingressos" + " de " + this.getQuantidadeIG() + " disponiveis";
        }
    }

    public String infoVendas(){
        if (this.getQuantidadeIG() < this.getQuantidadeIGVendidos()) {
            return "Nao é possível calcular o lucro do evento pois a quantidade de ingressos vendidos é maior que a quantidade total de ingressos disponíveis. \n";
        } else {
            float lucro = this.getQuantidadeIGVendidos() * this.getPreco();
            return 
                "O nome do evento é " + this.getNome() +
                " do dia " + this.getData() +
                "\nA quantidade de ingressos disponíveis foi de " + this.getQuantidadeIG() +
                " no valor de " + this.getPreco() +
                "\nA quantidade de ingressos vendidos foi de " + this.getQuantidadeIGVendidos() +
                "\n" + this.venderIG() + 
                "\nE o lucro obtido no evento em R$ foi de " + lucro;
        }
    }
}
