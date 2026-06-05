import net.salesianos.proyectos.aplicación.pelicula.Pelicula;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class App3 {
    public static void main(String[] args) throws IOException{
        List<String> lineas = Files.readAllLines(Path.of("./data/peliculas.csv"));
        List<String> peliculas = new ArrayList<>();
        for (int i = 1; i < lineas.size(); i++){
            peliculas.add(lineas.get(i));

        }

    }
}
