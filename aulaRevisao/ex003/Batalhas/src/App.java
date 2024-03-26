public class App {
    public static void main(String[] args) throws Exception {
        Personagem personagem1 = new Personagem("Popo", 9);
        Personagem personagem2 = new Personagem("Myke Tyson", 10);
        Personagem personagem3 = new Personagem("John Cenna", 8);
        Personagem personagem4 = new Personagem("BamBam", 1);
        Personagem personagem5 = new Personagem("Whinderson Nunes", 5);
        Personagem personagem6 = new Personagem("The Rock", 300);

        System.out.println(personagem1.info());
        System.out.println(personagem2.info());
        System.out.println(personagem3.info());
        System.out.println(personagem4.info());
        System.out.println(personagem5.info());
        System.out.println(personagem6.info());
        System.out.println("\n");
        
        Batalha mma = new Batalha(0);
        mma.batalhar(personagem1, personagem2);
        mma.batalhar(personagem2, personagem3);
        mma.batalhar(personagem2, personagem4);
        mma.batalhar(personagem4, personagem5);
        mma.batalhar(personagem5, personagem6);
        
        System.out.println("\n");
        System.out.println(personagem1.info());
        System.out.println(personagem2.info());
        System.out.println(personagem3.info());
        System.out.println(personagem4.info());
        System.out.println(personagem5.info());
        System.out.println(personagem6.info());
        
    }
}
