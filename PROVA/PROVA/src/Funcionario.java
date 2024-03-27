public class Funcionario {
    private String nome,cargo;
    private float salario,imposto;
    
    public Funcionario(String nome, String cargo, float salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void calcularImposto(){
        if(salario <= 1500){
            imposto = salario * 0.05f;
        }else{
            imposto = salario * 0.10f;
        }
    }

    public String exibirFuncionario() {
        return "Nome: " + nome + "\nCargo: " + cargo + "\nSalario: " + salario + "\nImposto: " + imposto;
    }

    

}
