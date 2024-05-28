public final class Funcionario extends Pessoa {
    private String cargo, setor;
    private float salario;
   
    public Funcionario(String nome, String endereco, int idade, String cargo, String setor, float salario) {
        super(nome, endereco, idade);
        this.cargo = cargo;
        this.setor = setor;
        this.salario = salario;
    }

    public void Promacao(String cargo, float salario, Funcionario func){
        func.setCargo(cargo);
        func.setSalario(salario);
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Funcionario [cargo=" + cargo + ", setor=" + setor + ", salario=" + salario + ", getNome()=" + getNome()
                + ", getEndereco()=" + getEndereco() + ", getIdade()=" + getIdade() + "]";
    }

    
}
