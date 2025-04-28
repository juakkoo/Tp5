package org.example;

import java.time.LocalDate;
import java.util.Random;

public class TicketSoporte {
    Random rand = new Random();
    private int id;
    private  String descripcion;
    private LocalDate fechaCreacion;
    private Estado estado;
    private Usuario usuario;
    private Tecnico tecnico;


    public TicketSoporte(String descripcion, Usuario usuario) {
        this.usuario = usuario;
        this.id = rand.nextInt(9000)+1000;
        this.descripcion = descripcion;
        this.fechaCreacion = LocalDate.now();
        estado = Estado.ABIERTO;
    }

    public TicketSoporte(String descripcion) {
        this( descripcion, null);
    }

    public void asignarTecnico(Tecnico tecnico){
        this.tecnico=tecnico;
        tecnico.setTicketTecnico(this);
        this.estado = Estado.ENPROCESO;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public Estado getEstado() {
        return estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion += " ("+descripcion+") ";
    }

    @Override
    public String toString() {
        return "Ticket Soporte"+"\n"
                + " ID: " + id + "\n"
                +" Descripcion: " + descripcion + "\n"
                +" Fecha de creacion: " + fechaCreacion + "\n"
                +" Estado: " + estado + "\n"
                +" Usuario: " + usuario + "\n"
                +" Tecnico: " + tecnico + "\n";
    }

}
