public class App {
    public static void main(String[] args) throws Exception {

        Calculadora calc1 = new Calculadora(3, 2);
        calc1.verificaNum();


        System.out.println(calc1.adicao());
        System.out.println(calc1.subtracao());
        System.out.println(calc1.multiplicacao());
        System.out.println(calc1.divisao());
        System.out.println(calc1.potenciacao());
        System.out.println(calc1.fatoracao());
    
    }
}
