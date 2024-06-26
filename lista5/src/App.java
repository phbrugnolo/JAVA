import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        // System.out.println("\n\n\n\n");

        // Agenda agenda = new Agenda(new LinkedList<>());

        // agenda.adicionar(new Contato("Explosivo d5", 0123123));
        // agenda.adicionar(new Contato("FELIPE FETO", 213213));
        // agenda.adicionar(new Contato("FELIPE FETO", 213213));

        // System.out.println(agenda);

        // agenda.remover("Explosivo d5");

        // System.out.println(agenda);

        // System.out.println("\n*********Produtos**********\n");

        // CadastroProduto kabum = new CadastroProduto(new ArrayList<Produto>());

        // kabum.addProduto(new Produto(2000, "Galaxy a55 5g"));
        // kabum.addProduto(new Produto(1800, "Galaxy a54 5g"));
        // kabum.addProduto(new Produto(1600, "Galaxy a53"));
        // kabum.addProduto(new Produto(1600, "Galaxy a53"));
        // kabum.addProduto(new Produto(1400, "Galaxy a52"));

        // System.out.println(kabum);

        // kabum.removeProduto(4);

        // System.out.println(kabum);

        System.out.println("\n*********Empresas**********\n");

        Empresa emp = new Empresa(new ArrayList<Departamento>());
        
        emp.adicionarDerpatamento(new Departamento("Comercial", new LinkedList<Funcionario>()));
        emp.adicionarDerpatamento(new Departamento("Marketing", new LinkedList<Funcionario>()));


        emp.addFuncionario(new Funcionario("func1", 123445, 23, "Estagiario"), "Marketing");
        emp.addFuncionario(new Funcionario("func2", 21423, 23, "Pleno"), "Marketing");
        emp.addFuncionario(new Funcionario("func1", 902138, 23, "Junior"), "Comercial");
        emp.addFuncionario(new Funcionario("func2", 123214, 23, "Senior"), "Comercial");
        
        emp.removerFuncionario(123214);

        System.out.println(emp);

    }

}
