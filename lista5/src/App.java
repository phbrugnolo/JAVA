import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n\n\n\n");

        Agenda agenda = new Agenda(new LinkedList<>());

        agenda.adicionar(new Contato("Explosivo d5", 0123123));
        agenda.adicionar(new Contato("FELIPE FETO", 213213));
        agenda.adicionar(new Contato("FELIPE FETO", 213213));

        System.out.println(agenda);

        agenda.remover("Explosivo d5");

        System.out.println(agenda);

        System.out.println("\n*********Produtos**********\n");

        CadastroProduto kabum = new CadastroProduto(new ArrayList<Produto>());

        kabum.addProduto(new Produto(2000, "Galaxy a55 5g"));
        kabum.addProduto(new Produto(1800, "Galaxy a54 5g"));
        kabum.addProduto(new Produto(1600, "Galaxy a53"));
        kabum.addProduto(new Produto(1600, "Galaxy a53"));
        kabum.addProduto(new Produto(1400, "Galaxy a52"));

        System.out.println(kabum);

        kabum.removeProduto(4);

        System.out.println(kabum);

        System.out.println("\n*********Empresas**********\n");

        Departamento dp1 = new Departamento("Comericial", new LinkedList<Funcionario>());
        Departamento dp2 = new Departamento("Marketing", new LinkedList<Funcionario>());

        dp1.addFuncionario(new Funcionario("funcionario1", 123, 18, "Estagiario"));
        dp1.addFuncionario(new Funcionario("funcionario2", 456, 19, "Gerente"));
        dp1.addFuncionario(new Funcionario("funcionario5", 123, 18, "Estagiario"));

        dp2.addFuncionario(new Funcionario("funcionario3", 789, 20, "Diretor"));
        dp2.addFuncionario(new Funcionario("funcionario4", 0101, 21, "Cordenador"));

        Empresa emp = new Empresa(new ArrayList<Departamento>());
        emp.adicionarDerpatamento(dp1);
        emp.adicionarDerpatamento(dp2);

        System.out.println(emp);

    }

}
