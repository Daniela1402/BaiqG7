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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniela
 */
@Entity
@Table(name = "orden_pago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenPago.findAll", query = "SELECT o FROM OrdenPago o")})
public class OrdenPago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_OrdenPago")
    private Integer idOrdenPago;
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "Id_OrdenServicio")
    private Integer idOrdenServicio;
    @Column(name = "Id_venta")
    private Integer idventa;

    public OrdenPago() {
    }

    public OrdenPago(Integer idOrdenPago) {
        this.idOrdenPago = idOrdenPago;
    }

    public Integer getIdOrdenPago() {
        return idOrdenPago;
    }

    public void setIdOrdenPago(Integer idOrdenPago) {
        this.idOrdenPago = idOrdenPago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getIdOrdenServicio() {
        return idOrdenServicio;
    }

    public void setIdOrdenServicio(Integer idOrdenServicio) {
        this.idOrdenServicio = idOrdenServicio;
    }

    public Integer getIdventa() {
        return idventa;
    }

    public void setIdventa(Integer idventa) {
        this.idventa = idventa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrdenPago != null ? idOrdenPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenPago)) {
            return false;
        }
        OrdenPago other = (OrdenPago) object;
        if ((this.idOrdenPago == null && other.idOrdenPago != null) || (this.idOrdenPago != null && !this.idOrdenPago.equals(other.idOrdenPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "baiq.proyectoG7.entity.OrdenPago[ idOrdenPago=" + idOrdenPago + " ]";
    }
    
}
