import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import net.salesianos.proyectos.torneo.participante.Participante;

public class App2 {
    public static void main(String[] args) {
        Participante p1 = new Participante("J001", "Adrián", "Junior");
        Participante p2 = new Participante("J002", "Paula", "Junior");
        Participante p3 = new Participante("J003", "Samuel", "Senior");
        Participante p4 = new Participante("J001", "Adrián repetido", "Senior");
        Participante p5 = new Participante("J004", "Claudia", "Senior");
        Participante p6 = new Participante("J005", "Diego", "Junior");
        Participante p7 = new Participante("J006", "Alba", "Experto");

        HashSet<Participante> hashset = new HashSet<>();
        hashset.add(p1);
        hashset.add(p2);
        hashset.add(p3);
        hashset.add(p4);
        hashset.add(p5);
        hashset.add(p6);
        hashset.add(p7);

        System.out.println();
        System.out.println("Participante");
        for (Participante participante : hashset) {
            System.out.println(participante);
        }

        System.out.println();
        System.out.println("Número de participantes que se intentarion añadir");
        ArrayList<Participante> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        lista.add(p7);

        System.out.println(lista.size());
        
        System.out.println();
        System.out.println("Número de participantes que se añadieron");
        System.out.println(hashset.size());

        // No es una lista que no añade elementos duplicados basandose en el HashCode
        // y como el hashCode se crea basandose en el idJugador,
        // cualquier participante que tenga el mismo id, no se va a añadir

        HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.put("Junior", 3);
        hashmap.put("Senior", 2);
        hashmap.put("Experto", 1);

        

        System.out.println();
        System.out.println("Mapa Completo");
        System.out.println(hashmap);
    }
}
