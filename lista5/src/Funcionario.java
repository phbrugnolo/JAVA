public class Funcionario {

    private String nome;
    private int cpf;
    private int idade;
    private String cargo;
    
    public Funcionario(String nome, int cpf, int idade, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.cargo = cargo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", cargo=" + cargo + "]";
    }

    
}
