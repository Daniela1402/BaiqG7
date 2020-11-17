/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiq.proyectoG7.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniela
 */
@Entity
@Table(name = "detalle_orden_pago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleOrdenPago.findAll", query = "SELECT d FROM DetalleOrdenPago d")})
public class DetalleOrdenPago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_detalleOrdenPago")
    private Integer iddetalleOrdenPago;
    @Column(name = "Id_producto")
    private Integer idproducto;
    @Column(name = "Subtotal")
    private Long subtotal;
    @Column(name = "IVA")
    private Long iva;
    @Column(name = "Total")
    private Long total;
    @Column(name = "Id_OrdenPago")
    private Integer idOrdenPago;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "Id_cliente")
    private Integer idcliente;
    @Size(max = 150)
    @Column(name = "Diagnostico")
    private String diagnostico;
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;

    public DetalleOrdenPago() {
    }

    public DetalleOrdenPago(Integer iddetalleOrdenPago) {
        this.iddetalleOrdenPago = iddetalleOrdenPago;
    }

    public Integer getIddetalleOrdenPago() {
        return iddetalleOrdenPago;
    }

    public void setIddetalleOrdenPago(Integer iddetalleOrdenPago) {
        this.iddetalleOrdenPago = iddetalleOrdenPago;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public Long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Long subtotal) {
        this.subtotal = subtotal;
    }

    public Long getIva() {
        return iva;
    }

    public void setIva(Long iva) {
        this.iva = iva;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getIdOrdenPago() {
        return idOrdenPago;
    }

    public void setIdOrdenPago(Integer idOrdenPago) {
        this.idOrdenPago = idOrdenPago;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetalleOrdenPago != null ? iddetalleOrdenPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleOrdenPago)) {
            return false;
        }
        DetalleOrdenPago other = (DetalleOrdenPago) object;
        if ((this.iddetalleOrdenPago == null && other.iddetalleOrdenPago != null) || (this.iddetalleOrdenPago != null && !this.iddetalleOrdenPago.equals(other.iddetalleOrdenPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "baiq.proyectoG7.entity.DetalleOrdenPago[ iddetalleOrdenPago=" + iddetalleOrdenPago + " ]";
    }
    
}
