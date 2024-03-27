public class App {
    public static void main(String[] args) throws Exception {
        Carro carro1 = new Carro("Fiato", "Titano", 2010, 0);
        System.out.println(carro1.info());

        carro1.acelerar();
        System.out.println(carro1.info());

        carro1.frear();
        System.out.println(carro1.info());
    }
}
