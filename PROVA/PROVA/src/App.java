public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ex001\n");
        System.out.println("**************************************\n");
        
        Produto p1 = new Produto("Produto1", 10.5f, 2);
        Produto p2 = new Produto("Produto2", 20, 0);
        
        p1.venderProduto();
        p2.venderProduto();
        
        System.out.println(p1.exibirProduto());
        System.out.println(p2.exibirProduto());


        System.out.println("ex002\n");
        System.out.println("**************************************\n");
        
        Funcionario f1 = new Funcionario("Funcionario1", "Gerente", 100);
        Disciplina d1 = new Disciplina("Joao", "Java");
        
        f1.calcularImposto();
        System.out.println(f1.exibirFuncionario() + "\n");
        f1.setSalario(10000);
        f1.calcularImposto();
        System.out.println(f1.exibirFuncionario());
        
        System.out.println("ex003\n");
        System.out.println("**************************************\n");

        Aluno a1 = new Aluno("Aluno 1", 99, 0, 0);
        System.out.println(a1.exibirAluno(d1));

        a1.setNotas1(4f);
        a1.setNotas2(4f);
 
        System.out.println("\n" + a1.exibirAluno(d1));
        
        a1.setMedia(6);
        
        
        a1.setNotas1(8f);
        a1.setNotas2(8f);



        
        System.out.println("\n" + a1.exibirAluno(d1));
        
        
    }
}
