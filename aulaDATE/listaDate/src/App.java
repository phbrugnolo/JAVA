import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Trabalhando com Datas e Strings em Java");

        //Pegar a data atual
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);

        LocalDate dataEspecifica = LocalDate.of(2024, 3, 14);
        System.out.println("A data escolhida foi " + dataEspecifica);
        int dia = dataAtual.getDayOfMonth();
        int mes = dataAtual.getMonthValue();
        int ano = dataAtual.getYear();

        System.out.println("Dia: " + dia + " mês: " + mes + " ano: " + ano);

        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite uma data no formato dd/mm/aaaa");
        //String dataString = scanf.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //LocalDate dataParse = LocalDate.parse(dataString, formato);

        //System.out.println("A data é : " + dataParse.format(formato));
        System.out.println("data atual " + dataAtual.format(formato));

        System.out.println("João \n010220");

        //Manipulando Strings

        String texto = "    Hello, World!   ";

        System.out.println("Texto original: " + texto);
        System.out.println("Tamanho: " + texto.length());
        System.out.println("Todas as letras Maiusculas " + texto.toUpperCase());
        System.out.println("Todas as letras minusculas " + texto.toLowerCase());
        //Remove os espaços antes e depois da String
        System.out.println("Removendo espaços " + texto.trim());
        System.out.println("Substiruindo parte da String " + texto.replace("Hello", "Hi"));
        System.out.println("Dividindo String " + texto.substring(11));
        System.out.println("Dividindo em duas partes " + texto.substring(4, 9));

        System.out.println("início do texto " + texto.startsWith("    Hello"));
        System.out.println("final do texto " + texto.endsWith("!   "));
        // Retorna a primeira ocorrencia do caracter ou texto selecionado, se não encontrar retorna -1
        System.out.println("localizano a primeira ocorencia " + texto.indexOf("E"));
        // Retorna a ultimo ocorrencia do caracter ou texto selecionado, se não encontrar retorna -1
        System.out.println("localizano a primeira ocorencia " + texto.lastIndexOf("!"));

        System.out.println("substituindo parte do texto " + texto.replaceAll(" ", ""));

        // Dividindo String
        String[] strings = texto.split(",");
        for (String string : strings) {
            System.out.println("valor : " + string.trim());
        }

        String cpf = "12345678910";
        String cpfFormatado = cpf.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");

        System.out.println("Seu CPF é " + cpfFormatado);

        System.out.println("Digite uma data");
        String novaData = scanf.nextLine();

        String[] simbolos = {"\\\\", "/", "\\*", "\\.", "\\-"};
        for (String s : simbolos) {
            novaData = novaData.replaceAll(s, "");
            System.out.println(" Laço " + novaData);            
        }

    }
}
