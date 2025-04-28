package org.example;
import java.util.Random;
public class Tecnico {
    Random rand = new Random();
    private int id;
    private  String nombre;
    private String especialidad;
    private TicketSoporte ticketTecnico;

    public Tecnico( String nombre, String especialidad) {
        this.id = rand.nextInt(900)+100;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void modificarTicketSoporte(String nuevaDescripcion) {
        ticketTecnico.setDescripcion(nuevaDescripcion);
    }
    public void cerrarTicketSoporte() {
        ticketTecnico.setEstado(Estado.CERRADO);
        ticketTecnico = null;
    }

    public void setTicketTecnico(TicketSoporte ticketTecnico) {
        this.ticketTecnico = ticketTecnico;
    }

    @Override
    public String toString() {
        return "\n"
                + "\t"+"ID: "+id+"\n"
                + "\t"+"Nombre: "+nombre+"\n"
                + "\t"+"Especialidad: "+especialidad;
    }
}
