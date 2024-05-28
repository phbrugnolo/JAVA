package view;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


import controller.Hospedagem;
import controller.Reserva;
import controller.ReservaController;
import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Barco barco = new Barco(1, 150, LocalTime.of(14, 0), LocalTime.of(20, 0), 15);
        Aviao aviao = new Aviao(1, 1000, LocalTime.of(8, 30), LocalTime.of(17,0), 70);

        Hospedagem hotel1 = new Hospedagem("Hotel1", 20, 4, 150);
        Hospedagem hotel2 = new Hospedagem("Hotel2", 30, 2, 75);

        Reserva reserva1 = new Reserva("Seoul", "Changai", LocalDate.parse("2022-12-01"), LocalDate.parse("2023-01-01"), 7000.5f, hotel2, aviao);
        Reserva reserva2 = new Reserva("Brasilia", "Curitiba", LocalDate.parse("2023-07-16"), LocalDate.parse("2024-02-14"), 3000, hotel1, barco);
        Reserva reserva3 = new Reserva("Taiwan", "Texas", LocalDate.parse("2008-10-16"), LocalDate.parse("2009-03-24"), 5000, hotel2, aviao);
        Reserva reserva4 = new Reserva("Paris", "Rio de Janeiro", LocalDate.parse("2014-05-20"), LocalDate.parse("2024-07-01"), 10000.99f, hotel1, barco);

        ReservaController reservas = new ReservaController(new ArrayList<>());

        reservas.adicionarReserva(reserva1);
        reservas.adicionarReserva(reserva2);
        reservas.adicionarReserva(reserva3);
        reservas.adicionarReserva(reserva4);

        reservas.excluirReserva(reserva2);

        reservas.listarReservas();
    }
}
