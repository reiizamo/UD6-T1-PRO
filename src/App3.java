import net.salesianos.proyectos.aplicación.pelicula.Pelicula;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) throws IOException{
        List<String> lineas = Files.readAllLines(Path.of("./data/peliculas.csv"));
        List<Pelicula> peliculas = new ArrayList<>();
        for (int i = 1; i < lineas.size(); i++){
            String[] separador = lineas.get(i).split(",");

            String titulo = separador[0];
            String genero = separador[1];
            //Aqui use IA pq no me acordaba de como pasar a int
            int duracion = Integer.parseInt(separador[2]);

            peliculas.add(new Pelicula(titulo, genero, duracion));
        }

        System.out.println();
        System.out.println("Número total pelis");
        System.out.println(peliculas.size());

        System.out.println();
        System.out.println("Duración total en minutos");
        int duracionTotal = 0;
        for (Pelicula pelicula : peliculas) {
            duracionTotal = duracionTotal + pelicula.getDuracion();
        }
        System.out.println(duracionTotal);

        System.out.println();
        System.out.println("Duración media");
        System.out.println(duracionTotal/peliculas.size());

        System.out.println();
        System.out.println("Pelicula con mayor duración");
        Pelicula mayorDuracion = peliculas.get(0);
        for (int i = 1; i < peliculas.size(); i++){
            if (peliculas.get(i).getDuracion() > mayorDuracion.getDuracion()){
                mayorDuracion = peliculas.get(i);
            }
        }
        System.out.println(mayorDuracion.getTitulo() + " " + mayorDuracion.getDuracion());

        String resume = "Número total pelis: " + peliculas.size() + "\nDuración total en minutos: " + duracionTotal + "\nDuración media: " + duracionTotal/peliculas.size() + "\nPelicula con mayor duración: " + mayorDuracion.getTitulo()+" "+mayorDuracion.getDuracion();
        Files.writeString(Path.of("./data/resumen_peliculas.txt"), resume);

        String log = "programa ejecutado";
        Files.writeString(Path.of("./data/log_peliculas.txt"), log, java.nio.file.StandardOpenOption.APPEND);

        

    }
}
