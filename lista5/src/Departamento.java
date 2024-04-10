import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;




    public Departamento(String nome, List<Funcionario> funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Departamento [nome=" + nome + ", funcionarios=" + funcionarios + "]";
    }

    public Funcionario buscarFuncionario(String nome){
        return funcionarios                
            .stream()
            .filter(d -> d.getNome().toLowerCase().equals(nome.toLowerCase()))
            .findFirst()
            .orElse(null);
    }
    

    
}
