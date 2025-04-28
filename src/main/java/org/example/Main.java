package org.example;
public class Main {

    public static void main(String[] args) {
        Usuario u1 = new Usuario("Pedro","pedro@mail.com");
        Usuario u2 = new Usuario("Juan","juan@mail.com");
        Tecnico t1 = new Tecnico("Mario","Analista");
        Tecnico t2 = new Tecnico("Ruben","Programador");

        SistemaSoporte s = new SistemaSoporte();

        // Se crean los Tickets
        s.crearTicket("Error Desconocido",u1);
        s.crearTicket("Error Desconocido");
        s.crearTicket("Error 001452",u2);
        s.crearTicket("Error 025101");
        //Se asigna un Tecnico a un Ticket
        s.asignarTecnico(t1);
        //El Tecnico modifica la descripcion y cambia el estado del ticket a CERRADO
        t1.modificarTicketSoporte("Solucionado");
        t1.cerrarTicketSoporte();
        //Se asignan dos Tecnicos a distintos Tickets
        s.asignarTecnico(t2);
        s.asignarTecnico(t1);

        s.listarTicket();
    }
}