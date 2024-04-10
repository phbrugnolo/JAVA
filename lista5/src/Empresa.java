import java.util.List;

public class Empresa {
    private List<Departamento> departamentos;

    public Empresa(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public List<Departamento> getdepartamentos() {
        return departamentos;
    }

    public void setdepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void adicionarDerpatamento(Departamento dep){
        if(buscarDepertamento(dep.getNome()) == null) departamentos.add(dep);
    }
    
    public void removerDerpatamento(Departamento dep){
        if(buscarDepertamento(dep.getNome()) != null) departamentos.remove(dep);
    }

    public Departamento buscarDepertamento(String nome){
        return departamentos
                .stream()
                .filter(d -> d.getNome().toLowerCase().equals(nome.toLowerCase()))
                .findFirst()
                .orElse(null);
    }

    public Funcionario buscarFuncionarioE(String nome){

        for (Departamento d : departamentos) {
            return d.buscarFuncionario(nome);
        }
        return null;
    }


    
    public void addFuncionario(Funcionario func, Departamento dep){
        if(buscarDepertamento(dep.getNome()) != null){
            if(buscarFuncionarioE(func.getNome()) != null){
                
            }
        }
    }


}
