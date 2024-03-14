import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ex001 \n");
        
        Conta conta1 = new Conta(000, "Vazio", 0);
        System.out.println(conta1.imprimir());

        conta1.setNome("Pedro");
        conta1.setNumConta(123);
        conta1.setSaldo(500);

        System.out.println("\n" + conta1.imprimir() + "\n");

        if(conta1.Sacar(120)){
            System.out.println("Saque realizado com sucesso");
            System.out.println(conta1.imprimir());
        }else{
            System.out.println("Saldo insuficiente");
            System.out.println(conta1.imprimir());
        }

        System.out.println("\n ex002 \n");

        Reserva reserva1 = new Reserva(null, 0, null, 0);
        System.out.println(reserva1.exibir());

        reserva1.setNome("Pedro");
        reserva1.setNumPessoa(4);
        reserva1.setData(LocalDate.now());
        reserva1.setValor(200);

        System.out.println("\n" + reserva1.exibir() + "\n");


        System.out.println("\n ex003 \n");
        Evento evento1 = new Evento(null, null, 0, 0, 0);
        System.out.println(evento1.infoVendas());

        evento1.setNome("Pedro");
        evento1.setData(LocalDate.now());
        evento1.setQuantidadeIG(200);
        evento1.setPreco(50);
        evento1.setQuantidadeIGVendidos(150);

        System.out.println("\n" + evento1.infoVendas());
    }
}
