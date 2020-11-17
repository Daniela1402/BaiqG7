/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiq.proyectoG7.facade;

import baiq.proyectoG7.entity.DetalleOrdenPago;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Daniela
 */
@Local
public interface DetalleOrdenPagoFacadeLocal {

    void create(DetalleOrdenPago detalleOrdenPago);

    void edit(DetalleOrdenPago detalleOrdenPago);

    void remove(DetalleOrdenPago detalleOrdenPago);

    DetalleOrdenPago find(Object id);

    List<DetalleOrdenPago> findAll();

    List<DetalleOrdenPago> findRange(int[] range);

    int count();
    
}
