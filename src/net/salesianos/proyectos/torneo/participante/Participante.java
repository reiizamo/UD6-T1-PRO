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

    public String getIdJugador(){
        return this.idJugador;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getCategoria(){
        return this.categoria;
    }

    public void setIdJugador(String idJugador){
        this.idJugador = idJugador;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return this.idJugador + " " + this.nombre + " " + this.categoria;
    }

    @Override
    public boolean equals(Object obj) {
        Participante participanteComparar = (Participante) obj;
        if (this.idJugador == participanteComparar.idJugador) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return idJugador.hashCode();
    }
}
