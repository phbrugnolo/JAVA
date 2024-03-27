import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception 
    {
        Cafeteira caffeeteira = new Cafeteira();
        
        Scanner scanf = new Scanner(System.in);
        int opc = 0, opcsize = 0;


        System.out.println("|- Bom dia! para fazer seu café, você precisa de 7g de café e 30 ml de água -|");

        do
        {
            System.out.println("|----         MENU         -----|");
            System.out.println("|  1 - Ligar/Desligar           |");
            System.out.println("|  2 - Com açucar/Sem açucar    |");
            System.out.println("|  3 - Adicionar café           |");
            System.out.println("|  4 - Adicionar água           |");
            System.out.println("|  5 - Fazer café               |");
            System.out.println("|  6 - Status da Cafeteira      |");
            System.out.println("|  7 - Não quero café           |");
            
            System.out.print ("\nEscolha a Opção: ");
            opc = scanf.nextInt();
                    
            switch(opc)
            {
                case 1: if(caffeeteira.ligada == true) 
                        {
                            caffeeteira.off();
                        }
                        else 
                        {
                            caffeeteira.on();
                        }
                break;

                case 2: if(caffeeteira.sugar == true) 
                        {
                            caffeeteira.nosugar();
                        }
                        else 
                        {
                            caffeeteira.addsugar();
                        }
                break;

                case 3: caffeeteira.fillcoff();
                break;

                case 4: caffeeteira.addwater();
                break;

                case 5:  
                    System.out.println("|   1 - Pingado           |");
                    System.out.println("|   2 - Café médio        |");
                    System.out.println("|   3 - Café grande       |");
                    
                    opcsize = scanf.nextInt();
                        if(opcsize == 1) caffeeteira.pcoff();
                        if(opcsize == 2) caffeeteira.mcoff();
                        if(opcsize == 3) caffeeteira.gcoff();
                break;

                case 6: caffeeteira.status();
                break;

                case 7:
                break;

                default: System.err.println("\nOpção Inválida!\n");
                break;
            }
        }while (opc != 7);
         System.out.println("Muito Obrigado, desligando a cafeteira!");
    }
}
