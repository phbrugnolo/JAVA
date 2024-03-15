import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Trabalhando com Datas e Strings em JAVA");

        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual " + dataAtual);
        LocalDate dataEspicifica = LocalDate.of(2024, 3, 16);
        System.out.println("A data escolhida foi " + dataEspicifica);
        int dia = dataAtual.getDayOfMonth();
        int mes = dataAtual.getMonthValue();
        int ano = dataAtual.getYear();

        System.out.println("Dia: " + dia + " mes: " + mes + " ano " + ano);

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma data no fomato dd/mm/aaaa");
        // String dataString = scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // LocalDate dataParse = LocalDate.parse(dataString, formatter);

        // System.out.println("A data formatada é " + dataParse.format(formatter));
        System.out.println("A data atual formatada é " + dataAtual.format(formatter));

        // Manipulando Strings

        String text = "    Hello, World!    ";
        System.out.println("Texto original: " + text);
        System.out.println("Tamanho: " + text.length());
        System.out.println("Todas as letras maiusculas: " + text.toUpperCase());
        System.out.println("Todas as letras minusculas: " + text.toLowerCase());

        // Remove os espaços antes e depois da String
        System.out.println("Removendo espaços " + text.trim());
        System.out.println("Substituindo parte da String " + text.replace("Hello", "Hi"));
        System.out.println("Dividindo String " + text.substring(11));
        System.out.println("Dividindo em duas partes " + text.substring(4, 9));
        System.out.println("Início do arquivo " + text.startsWith("    Hello"));
        System.out.println("Final do texto " + text.endsWith("World!    "));

        // Retorna a primeira ocorrencia do caracter ou texto selecionado, se não encontrar retorna -1
        System.out.println("Localizando primeira ocorrência " + text.indexOf("e"));

        // Retorna a ultima ocorrencia do caracter ou texto selecionado, se não encontrar retorna -1
        System.out.println("Localizando a utima ocorrência " + text.lastIndexOf("!"));

        System.out.println("Substituindo parte do texto " + text.replaceAll(" ", ""));

        // Dividindo String 
        String strings[] = text.split(",");

        for (String string : strings) {
            System.out.println("valor: " + string.trim());
        }

        // Formatando Cpf no modelo xxx.xxx.xxx-xx
        String cpf = "12345678910";
        String cpfFormatted = cpf.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");

        System.out.println("Cpf sem formatação " + cpf);
        System.out.println("Cpf formatado "+ cpfFormatted);

        System.out.println("Digite uma data");
        String newDate = scan.nextLine();

        String simbolos[] = {"\\\\", "/" , "\\*","\\.", "\\-"};

        for (String s : simbolos) {
            newDate = newDate.replaceAll(s, "");
            System.out.println(" Laço " + newDate);
        }

    }
}
