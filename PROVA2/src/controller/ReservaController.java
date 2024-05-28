package controller;

import java.util.Collections;
import java.util.List;

public class ReservaController {

    private List<Reserva> reservas;

    public ReservaController(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Reserva buscarReserva(int id){
        return reservas.stream().filter(r -> r.getId() == id).findFirst().orElse(null);
    }
    
    public void excluirReserva(Reserva reserva){
        if(buscarReserva(reserva.getId()) != null){
            if(reserva.getId() == 2){
                reservas.remove(reserva);
            }
        }
    }
    public void adicionarReserva(Reserva reserva){
        if(buscarReserva(reserva.getId()) == null){
            reservas.add(reserva);
        }
    }

    public void listarReservas(){
        System.out.println(reservas);
    }

    public void ordenarValor(){
        Collections.sort(reservas, Collections.reverseOrder());
    }

    @Override
    public String toString() {
        return "ReservaController [reservas=" + reservas + "]";
    }
    
    

    


    
}
