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

    public String getCodigo(){
        return this.codigo;
    }
    public String getCliente(){
        return this.cliente;
    }
    public String getProducto(){
        return this.producto;
    }
    public boolean getParaLlevar(){
        return this.paraLlevar;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    public void setProducto(String producto){
        this.producto = producto;
    }
    public void setParaLlevar(boolean paraLlevar){
        this.paraLlevar = paraLlevar;
    }

    @Override
    public String toString() {
        return this.codigo + ", " + this.cliente + ", " + this. producto + ", " + (this.paraLlevar ? "Para llevar" : "Para comer aquí");
    }

    @Override
    public boolean equals(Object obj) {
        Pedido pedidoComparar = (Pedido) obj;
        if (this.codigo == pedidoComparar.codigo) {
            return true;
        }
        return false;
    }
}
