package org.example;
import java.util.Random;
public class Usuario {
    Random rand = new Random();
    private int id;
    private  String nombre;
    private String email;

    public Usuario(String nombre, String email) {
        this.id = rand.nextInt(9000)+1000;
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "\n"
                +"\t"+"ID: " + id + "\n"
                +"\t"+"Nombre: " + nombre + "\n"
                +"\t"+"Email: " + email;
    }

}
