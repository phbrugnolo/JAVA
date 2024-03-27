public class Conta {
    public String titular;
    public int numConta;
    public float saldo;


    public Conta(String titular, int numConta){
    
        this.titular = titular;
        this.numConta = numConta;
        this.saldo = 0f;
    }

    public void depositar(float valor){
        if(valor > 0) this.saldo += valor;
    }

    public String imprimir(){
        return "O saldo atual é de R$ " + this.saldo;
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

