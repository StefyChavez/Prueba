/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Pedido;

/**
 *
 * @author admin
 */
public class PedidoServicio implements IPedidoServicio{
    
    private static List<Pedido> pedidoList = new ArrayList<>();
    
    @Override
    public Pedido crear(Pedido pedido) {
        this.pedidoList.add(pedido);
        return pedido;
    }
    
    public List<Pedido> listar(){
        return this.pedidoList;
    }
}
