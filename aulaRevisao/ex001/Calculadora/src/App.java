public class App {
    public static void main(String[] args) throws Exception {

        Calculadora conta1 = new Calculadora(5, 2);

        System.out.println(conta1.adicao());
        System.out.println(conta1.subtracao());
        System.out.println(conta1.multiplicacao());
        System.out.println(conta1.divisao());
        System.out.println(conta1.potenciacao());
        System.out.println(conta1.fatoracao());
    
    }
}
