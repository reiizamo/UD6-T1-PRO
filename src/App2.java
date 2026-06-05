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

    }
}
