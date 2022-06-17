/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Pedido;

/**
 *
 * @author admin
 */
public interface IPedidoServicio {
    
    public Pedido crear (Pedido pedido);
    public List<Pedido> listar();
    
}
