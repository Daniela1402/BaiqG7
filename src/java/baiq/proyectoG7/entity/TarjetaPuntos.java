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
@Table(name = "tarjeta_puntos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TarjetaPuntos.findAll", query = "SELECT t FROM TarjetaPuntos t")})
public class TarjetaPuntos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_tarjeta_puntos")
    private Integer idtarjetapuntos;
    @Column(name = "FechaExpedicion")
    @Temporal(TemporalType.DATE)
    private Date fechaExpedicion;
    @Column(name = "Puntos")
    private Integer puntos;
    @Column(name = "Id_estado")
    private Integer idestado;

    public TarjetaPuntos() {
    }

    public TarjetaPuntos(Integer idtarjetapuntos) {
        this.idtarjetapuntos = idtarjetapuntos;
    }

    public Integer getIdtarjetapuntos() {
        return idtarjetapuntos;
    }

    public void setIdtarjetapuntos(Integer idtarjetapuntos) {
        this.idtarjetapuntos = idtarjetapuntos;
    }

    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Integer getIdestado() {
        return idestado;
    }

    public void setIdestado(Integer idestado) {
        this.idestado = idestado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtarjetapuntos != null ? idtarjetapuntos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarjetaPuntos)) {
            return false;
        }
        TarjetaPuntos other = (TarjetaPuntos) object;
        if ((this.idtarjetapuntos == null && other.idtarjetapuntos != null) || (this.idtarjetapuntos != null && !this.idtarjetapuntos.equals(other.idtarjetapuntos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "baiq.proyectoG7.entity.TarjetaPuntos[ idtarjetapuntos=" + idtarjetapuntos + " ]";
    }
    
}
