public class Conta {

    private String nome;
    private int numConta;
    private float saldo;


    public Conta(int numConta, String nome, float saldo){
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = 0;
    }

    public void setNumConta(int num){
        this.numConta = num;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public int getNumConta(){
        return this.numConta;
    }
    public String getNome(){
        return this.nome;
    }
    public float getSaldo(){
        return this.saldo;
    }

    public void depositar(float valor){
        if(valor > 0) this.saldo += valor;
    }

    public String imprimir(){
        return 
        "O nome do titular da conta é " + this.getNome() +
        "\nO número do titular da conta é " + this.getNumConta() +
        "\nO saldo atual é de R$ " + this.getSaldo();
    }

    public boolean Sacar(float valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
        
    }
}
