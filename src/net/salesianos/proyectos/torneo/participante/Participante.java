package net.salesianos.proyectos.torneo.participante;

public class Participante {
    private String idJugador;
    private String nombre;
    private String categoria;

    public Participante(){}

    public Participante(String idJugador, String nombre, String categoria){
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.categoria = categoria;
    }
    
}
