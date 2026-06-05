package net.salesianos.proyectos.aplicación.pelicula;

public class Pelicula {
    private String titulo;
    private String genero;
    private int duracionMinutos;

    public Pelicula(){}

    public Pelicula(String titulo, String genero, int duracionMinutos){
        this.titulo = titulo;
        this.genero = genero;
        this.duracionMinutos = duracionMinutos;
    }
}
