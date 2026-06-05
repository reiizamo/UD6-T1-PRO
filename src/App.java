import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import net.salesianos.proyectos.cafeteria.pedido.Pedido;
public class App {
    public static void main(String[] args) throws Exception {
        Pedido p1 = new Pedido("P001", "Carla", "Café con leche", true);
        Pedido p2 = new Pedido("P002", "Mario", "Bocadillo de pollo", false);
        Pedido p3 = new Pedido("P003", "Nerea", "Zumo natural", true);
        Pedido p4 = new Pedido("P004", "Iván", "Tostada integral", false);
        Pedido p5 = new Pedido("P005", "Laura", "Té verde", true);

        Queue<Pedido> pedidos = new LinkedList<>();
        pedidos.add(p1);
        pedidos.add(p2);
        pedidos.add(p3);
        pedidos.add(p4);
        pedidos.add(p5);

        System.out.println();
        System.out.println("Comandas");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);    
        }

        // El propio nombre del método te dice que hace, no tuve ni que usar IA
        System.out.println();
        System.out.println("Primera Comanda");
        System.out.println(pedidos.peek());

        System.out.println();
        System.out.println("Pedidos preparados");
        System.out.println(pedidos.poll());
        System.out.println(pedidos.poll());
        System.out.println(pedidos.poll());

        Stack<Pedido> preparados = new Stack<>();
        preparados.push(p1);
        preparados.push(p2);
        preparados.push(p3);

        System.out.println();
        System.out.println("Último preparado");
        System.out.println(preparados.peek());

        System.out.println();
        System.out.println("Extraccion de pedido");
        System.out.println(preparados.pop());

        System.out.println();
        System.out.println("Comandas");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }

        System.out.println();
        System.out.println("La lista de comandas");
        System.out.println(pedidos.isEmpty() ? "Esta vacía" : "No esta vacía");
    }
}
