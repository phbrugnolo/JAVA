import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        
        Livro livro1 = new Livro("Livro legal", "Autor legal", LocalDate.parse("2020-04-21"));

        Livro livro2 = new Livro("Livro chato", "Autor chato", LocalDate.parse("2020-01-30"));

        System.out.println(livro1.exibirInfos());
        System.out.println(livro2.exibirInfos());
    }
}
