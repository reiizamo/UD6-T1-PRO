package net.salesianos.proyectos.aplicación.pelicula;

public class Pelicula {
    private String titulo;
    private String genero;
    private int duracionMinutos;

    public Pelicula(){}

    public Pelicula(String titulo, String genero, int duracion){
        this.titulo = titulo;
        this.genero = genero;
        this.duracionMinutos = duracion;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getGenero(){
        return this.genero;
    }
    public int getDuracion(){
        return this.duracionMinutos;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setDuracion(int duracion){
        this.duracionMinutos = duracion;
    }

    @Override
    public String toString() {
        return this.titulo + " " + this.genero + " " + this.duracionMinutos;
    }

}
