package org.example;

import java.util.ArrayList;

import static org.example.Estado.*;

public class SistemaSoporte {
    private TicketSoporte ticket;
    private ArrayList<TicketSoporte> listaTicket = new ArrayList<>();
    private static int cantTickets = 0;

    public  void crearTicket(String descripcion){
        ticket = new TicketSoporte(descripcion);
        listaTicket.add(ticket);
        cantTickets++;
    }

    public  void crearTicket(String descripcion,Usuario usuario) {
        ticket = new TicketSoporte(descripcion, usuario);
        listaTicket.add(ticket);
        cantTickets++;
    }

    public void asignarTecnico(Tecnico tecnico) {
        for (TicketSoporte ts : listaTicket) {
            if (ts.getTecnico() == null || ts.getEstado() == ABIERTO){
                ts.asignarTecnico(tecnico);
                break;
            }
        }
    }

    public void listarTicket() {
        for (TicketSoporte ticketSoporte : listaTicket) {
            System.out.println(ticketSoporte);
            System.out.println("--------------------------------------------");
        }
        System.out.println("Total de tickets: " + cantTickets);

    }

    @Override
    public String toString() {
        return "SistemaSoporte{" +
                ", listaTicket=" + listaTicket +
                '}';
    }
}