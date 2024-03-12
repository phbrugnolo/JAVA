import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        float valor1, valor2, resultado;
        int opcao, par, cod1, cod2, ipi, qtd1, qtd2;
        int vetor[] = {1,2,3,4,5,6,7,8,9,10};
        Boolean menu = true;

        while (menu) {
            System.out.println(
                "Escolha uma das opções \n" +
                "1 - Soma \n" +
                "2 - Subtração \n" +
                "3 - Divisão \n" + 
                "4 - Multiplicação \n" +
                "5 - Potenciação \n" +
                "6 - Exercício 1 \n" +
                "0 - Sair \n"
            );

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    valor1 = receberFloat("Digite o valor 1");
                    valor2 = receberFloat("Digite o valor 2");

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
                case 5:
                    System.out.println("Digite o valor 1");
                    valor1 = entrada.nextFloat();
                    System.out.println("Digite o valor 2");
                    valor2 = (int) entrada.nextFloat();

                    for(float controle = valor1; valor2 > 1; valor2--){
                        //valor1 = valor1 * controle;
                        valor1 *= controle;
                    }

                    System.out.println("O resultado da Potenciação é " + valor1);
                break;
                case 6:
                    System.out.println("Escolha 2 para exbir os numeros pares e 1 para os impares");

                    par = entrada.nextInt();
                    for (int v : vetor) {
                        if((v % 2) == 0 && par ==2){
                            System.out.println("Pares " + v);
                        }else if((v % 2) != 0 && par == 1){
                            System.out.println("Impares " + v);
                        }
                    }
                break;
                case 7:
                    System.out.println("Digite o IPI");
                    ipi = entrada.nextInt();

                    System.out.println("Digite o códido do Produto 1");
                    cod1 = entrada.nextInt();
                    System.out.println("Digite a quantidade do Produto 1");
                    qtd1 = entrada.nextInt();
                    System.out.println("Digite o valor do Produto 1");
                    valor1 = entrada.nextFloat();

                    System.out.println("Digite o códido do Produto 2");
                    cod2 = entrada.nextInt();
                    System.out.println("Digite a quantidade do Produto 2");
                    qtd2 = entrada.nextInt();
                    System.out.println("Digite o valor do Produto 2");
                    valor2 = entrada.nextFloat();

                    System.out.println(
                        "Produto 1 " + cod1 + " Valor: " + valor1 + " Quantidade " + qtd1 +
                        "\nProduto 2 " + cod2 + " Valor: " + valor2 + " Quantidade " + qtd2 +
                        "\nTotal com IPI " + ipi + " = " + (((valor1 * qtd1) + (valor2 * qtd2)) * ipi)
                    );
                break;
                case 0:
                    menu = false;
                    encerrar();
                break;            
                default:
                    System.out.println("Digite um valor válido");
                break;
            }
        }
    }

    public static float receberFloat(String texto){
        System.out.println(texto);
        Scanner entrada =  new Scanner(System.in);
        //float res = entrada.nextFloat();
        //return res;
        return entrada.nextFloat();
    }

    public static void encerrar(){
        System.out.println("O Programa será finalizado");
    }
}
