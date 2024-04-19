import java.util.List;

public class Empresa {
    private List<Departamento> departamentos;

    public Empresa(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void adicionarDerpatamento(Departamento dep) {
        if (buscarDepertamento(dep.getNome()) == null)
            departamentos.add(dep);
    }

    public void removerDerpatamento(Departamento dep) {
        if (buscarDepertamento(dep.getNome()) != null)
            departamentos.remove(dep);
    }

    public Departamento buscarDepertamento(String nome) {
        return departamentos
                .stream()
                .filter(d -> d.getNome().toLowerCase().equals(nome.toLowerCase()))
                .findFirst()
                .orElse(null);
    }

    public Funcionario buscarFuncionarioCPF(int cpf) {

        Funcionario func = null;
        for (Departamento d : departamentos) {
            func = d.buscaCPF(cpf);
        }
        System.out.println("\n" + func + "\n");
        return func;
    }

    public void addFuncionario(Funcionario func, String nomeDep) {

        Departamento dep = buscarDepertamento(nomeDep);

        if (buscarFuncionarioCPF(func.getCpf()) == null && dep != null) {
            dep.addFuncionario(func);
        }

    }

    public void removerFuncionario(int cpf) {
        for (Departamento d : departamentos) {
           d.getFuncionarios().remove(buscarFuncionarioCPF(cpf));
        }
    }

    @Override
    public String toString() {
        return "Empresa [departamentos=" + departamentos + "]";
    }

}
