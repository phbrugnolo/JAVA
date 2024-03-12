public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Correção Lista 3");



        System.out.println("ex001");
        Pessoa pessoa1 = new Pessoa("Pedro", 18);

        System.out.println(pessoa1.apresetar());

        System.out.println("\nex002");

        Livro livro1 = new Livro("Mémorias Postumas de Bras Cuba", "Machado de Assis", 1961);
        System.out.println(livro1.apresentar());

        System.out.println("\nex003");

        Conta conta1 = new Conta("Pedro", 123);

        conta1.depositar(201);
        System.out.println(conta1.imprimir());

        if(conta1.Sacar(30)){
            System.out.println("Saque realizado com sucesso");
            System.out.println(conta1.imprimir());
        }else{
            System.out.println("Saldo insuficiente");
            System.out.println(conta1.imprimir());
        }

        System.out.println("\nex004");
        Triangulo triangulo1 = new Triangulo(12, 12);
        System.out.println("A área do triângulo é " + triangulo1.area());
    }
}
