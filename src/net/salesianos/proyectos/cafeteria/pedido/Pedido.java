package net.salesianos.proyectos.cafeteria.pedido;

public class Pedido {
    private String codigo;
    private String cliente;
    private String producto;
    private boolean paraLlevar;

    public Pedido(){}

    public Pedido(String codigo, String cliente, String producto, boolean paraLlevar){
        this.codigo = codigo;
        this.cliente = cliente;
        this.producto = producto;
        this.paraLlevar = paraLlevar;
    }
}
