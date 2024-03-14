import pacote.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Encapsulamento");

        Pessoa pessoa1 = new Pessoa("Pedro", "Silva", 41, 987987758);

        pessoa1.sobrenome = "França";
        pessoa1.setNome("Tiago");
        //pessoa1.ddd = 42;

        System.out.println(pessoa1.telefone);

        System.out.println(pessoa1);

    }
}
