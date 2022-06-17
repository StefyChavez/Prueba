/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Pedido;
import servicio.PedidoServicio;

/**
 *
 * @author admin
 */
public class PedidoControl {
    
    private final PedidoServicio pedidoServicio = new PedidoServicio();
    
    public Pedido crear(String [] args){
        Pedido pedido = new Pedido(Integer.valueOf(args[0]),args[1],args[2],Integer.valueOf(args[3]));
        this.pedidoServicio.crear(pedido);
        return pedido;
    }
    
    public List<Pedido> listar(){
        return this.pedidoServicio.listar();
    }
    
}
