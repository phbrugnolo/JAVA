import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        float valor1, valor2, resultado;
        int opcao;
        Boolean menu = true;

        while (menu) {
            System.out.println(
                "Escolha uma das opções \n" +
                "1 - Soma \n" +
                "2 - Subtração \n" +
                "3 - Divisão \n" + 
                "4 - Multiplicação \n" +
                "0 - Sair\n"
            );

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor 1");
                    valor1 = entrada.nextFloat();
                    System.out.println("Digite o valor 2");
                    valor2 = entrada.nextFloat();

                    resultado = valor1 + valor2;
                    System.out.println("O resultado da soma é " + resultado);
                break;
                case 2:
                    System.out.println("Digite o valor 1");
                    valor1 = entrada.nextFloat();
                    System.out.println("Digite o valor 2");
                    valor2 = entrada.nextFloat();

                    resultado = valor1 - valor2;
                    System.out.println("O resultado da subtracao é " + resultado);
                break;
                case 3:
                    System.out.println("Digite o valor 1");
                    valor1 = entrada.nextFloat();
                    System.out.println("Digite o valor 2");
                    valor2 = entrada.nextFloat();

                    resultado = valor1 / valor2;
                    System.out.println("O resultado da divisao é " + resultado);
                break;
                case 4:
                    System.out.println("Digite o valor 1");
                    valor1 = entrada.nextFloat();
                    System.out.println("Digite o valor 2");
                    valor2 = entrada.nextFloat();

                    resultado = valor1 * valor2;
                    System.out.println("O resultado da multiplicação é " + resultado);
                break;
                case 0:
                    menu = false;
                break;            
                default:
                    System.out.println("Digite um valor válido");
                break;
            }
        }
    
    }
}
