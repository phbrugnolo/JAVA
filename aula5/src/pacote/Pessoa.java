package pacote;

public class Pessoa {
    String nome;
    public String sobrenome;
    private int ddd;
    protected int telefone;

    public Pessoa(String nome, String sobrenome, int ddd, int telefone){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ddd = ddd;
        this.telefone = telefone;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void setDdd(int ddd){
        this.ddd = ddd;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public int getDdd(){
        return this.ddd;
    }

    public int getTelefone(){
        return this.telefone;
    }

    @Override
    public String toString(){
        return "Pessoa \n Nome: " + this.nome + "\n Sobrenome: " + this.sobrenome + "\n DDD: " + this.ddd + "\n Telefone: " + this.telefone;
    }
    
    
}
