public class Pessoa {   
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String apresetar(){
        return "Meu nome é " + this.nome +
        " e a minha idade é " + this.idade + " anos";
    }
}
