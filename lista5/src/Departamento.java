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

    public Funcionario buscarFuncionario(String nome) {
        return funcionarios
                .stream()
                .filter(d -> d.getNome().toLowerCase().equals(nome.toLowerCase()))
                .findFirst()
                .orElse(null);
    }

    public Funcionario buscaCPF(int cpf) {
        System.out.println("\n" + cpf + "\n" + funcionarios + "\n");
        return funcionarios
                .stream()
                .filter(d -> d.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }

    public void addFuncionario(Funcionario func) {
        if (buscarFuncionario(func.getNome()) == null && buscaCPF(func.getCpf()) == null)
            funcionarios.add(func);
    }

    public void removeFuncionario(Funcionario func) {
        if (buscarFuncionario(func.getNome()) != null)
            funcionarios.remove(func);
    }

    @Override
    public String toString() {
        return "\nDepartamento [nome=" + nome + ", \nfuncionarios=" + funcionarios + "]";
    }
}
