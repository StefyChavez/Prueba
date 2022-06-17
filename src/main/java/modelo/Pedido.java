/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author admin
 */
public class Pedido {
    
    private int codigo;
    private String nombreProducto;
    private String descripcion;
    private int cantidad;

    public Pedido(int codigo, String nombreProducto, String descripcion, int cantidad) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", nombreProducto=" + nombreProducto + ", descripcion=" + descripcion + ", cantidad=" + cantidad + '}';
    }
    
    
}
