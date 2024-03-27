import java.util.Scanner;

public class Cafeteira {
    public boolean ligada;
    public int qntdcafé = 0; 
    public int qnth20 = 0;
    public boolean sugar;
    Scanner sc = new Scanner(System.in);

    public void cafeteira(){}
    public void cafeteira(int qntdcafé, int qnth20){}

    public void on(){ 
        this.ligada = true;
    }
    public void off(){
        this.ligada = false;
    }

    public void addsugar(){ 
        this.sugar = true;
    }
    public void nosugar(){
        this.sugar = false;
    }

    void addwater(){
        System.out.println("Quantos ml de água você quer colocar na cafeteira?");
        if(this.qnth20 < 120) 
        {
            this.qnth20 = sc.nextInt() + this.qnth20;
            if (this.qnth20 > 120)
            {
                this.qnth20 = 120;
                System.out.println("A cafeteira já encheu!");
            }
        }
        else
        {
            System.out.println("A cafeteira está cheia!");
        }
    }
    void fillcoff(){
        System.out.println("Quantas gramas de café você quer colocar?");
        if(this.qntdcafé < 28) 
        {   
            this.qntdcafé = sc.nextInt() + this.qntdcafé;
            if (this.qntdcafé > 28)
            {
                this.qntdcafé = 28;
                System.out.println("A cafeteira está cheia!");
            }
        }
        else
        {
            System.out.println("Não cabe mais café!");
        }
    }

    void pcoff(){
        if (this.ligada == true && this.qntdcafé >= 7 && this.qnth20 >= 30)
        {
            int tempoInicial = 3; // Defina o tempo inicial da contagem regressiva
            System.out.println("Se café vai ficar pronto em 3 segundos");
            for (int i = tempoInicial; i >= 0; i--) // laço repetição que inicia pelo tempo inicial decrementa até 0
            {
                System.out.println(i);
                try {
                    Thread.sleep(1000); // Pausa por 1 segundo (1000 milissegundos)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            this.qntdcafé = this.qntdcafé - 7;
            this.qnth20 = this.qnth20 - 30;
            if (this.sugar == true) this.sugar= false;

            System.out.println("Sirva-se!");
        }
        else if(this.ligada == false && this.qntdcafé >= 7 && this.qnth20 >= 30)
        {
            System.out.println("Ligue a cafeteira antes de fazer seu café.");
        }
        else if(this.ligada == true && this.qntdcafé < 7 && this.qnth20 >= 30)
        {
            System.out.println("Coloque mais café na cafeteira para poder prepará-lo.");
        }
        else if(this.ligada == true && this.qntdcafé >= 7 && this.qnth20 < 30)
        {
            System.out.println("Pouca água na cafeteira.");
        }
        else 
        {
            System.out.println("Não consigo preparar seu café com poucos recursos :(");
        }
    }

    void mcoff(){
        if (this.ligada == true && this.qntdcafé >= 12 && this.qnth20 >= 50)
        {
            int tempoInicial = 4; // Defina o tempo inicial da contagem regressiva
            System.out.println("Se café vai ficar pronto em 4 segundos");
            for (int i = tempoInicial; i >= 0; i--) // laço repetição que inicia pelo tempo inicial decrementa até 0
            {
                System.out.println(i);
                try {
                    Thread.sleep(1000); // Pausa por 1 segundo (1000 milissegundos)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            this.qntdcafé = this.qntdcafé - 12;
            this.qnth20 = this.qnth20 - 50;
            
            if (this.sugar == true) this.sugar= false;
            System.out.println("Sirva-se!");
        }
        else if(this.ligada == false && this.qntdcafé >= 12 && this.qnth20 >= 50)
        {
            System.out.println("Ligue a cafeteira antes de fazer seu café.");
        }
        else if(this.ligada == true && this.qntdcafé < 12 && this.qnth20 >= 50)
        {
            System.out.println("Coloque mais café na cafeteira para poder prepará-lo.");
        }
        else if(this.ligada == true && this.qntdcafé >= 12 && this.qnth20 < 50)
        {
            System.out.println("Pouca água na cafeteira.");
        }
        else 
        {
            System.out.println("Não consigo preparar seu café com poucos recursos :(");
        }
    }

    void gcoff(){
        if (this.ligada == true && this.qntdcafé >= 18 && this.qnth20 >= 70)
        {
            int tempoInicial = 5; // Defina o tempo inicial da contagem regressiva
            System.out.println("Se café vai ficar pronto em 5 segundos");
            for (int i = tempoInicial; i >= 0; i--) // laço repetição que inicia pelo tempo inicial decrementa até 0
            {
                System.out.println(i);
                try {
                    Thread.sleep(1000); // Pausa por 1 segundo (1000 milissegundos)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            this.qntdcafé = this.qntdcafé - 18;
            this.qnth20 = this.qnth20 - 70;
            if (this.sugar == true) this.sugar= false;
            System.out.println("Sirva-se!");
        }
        else if(this.ligada == false && this.qntdcafé >= 18 && this.qnth20 >= 70)
        {
            System.out.println("Ligue a cafeteira antes de fazer seu café.");
        }
        else if(this.ligada == true && this.qntdcafé < 18 && this.qnth20 >= 70)
        {
            System.out.println("Coloque mais café na cafeteira para poder prepará-lo.");
        }
        else if(this.ligada == true && this.qntdcafé >= 18 && this.qnth20 < 70)
        {
            System.out.println("Pouca água na cafeteira.");
        }
        else 
        {
            System.out.println("Não consigo preparar seu café com poucos recursos :(");
        }
    }
    
    void status()
    {   
        System.out.println("Cafeteira QuickCoffee 2000");

        if (this.ligada == true) 
        {
            System.out.println("Cafeteira ligada");    
        } else System.out.println( "Cafeteira desligada" );


        if (this.sugar == true) 
        {
            System.out.println("Com açucar");    
        } else System.out.println( "Sem açucar" );

        System.out.println("Quantidade de café: " + qntdcafé + "g");
        System.out.println("Quantidade de água: " + qnth20 + "ml");
    }

}