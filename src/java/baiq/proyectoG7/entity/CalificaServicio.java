/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baiq.proyectoG7.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniela
 */
@Entity
@Table(name = "califica_servicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CalificaServicio.findAll", query = "SELECT c FROM CalificaServicio c")})
public class CalificaServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_CalificaServicio")
    private Integer idCalificaServicio;
    @Column(name = "Puntaje")
    private Integer puntaje;
    @Size(max = 150)
    @Column(name = "Obeservaciones")
    private String obeservaciones;
    @Column(name = "Id_detalleOrdenPago")
    private Integer iddetalleOrdenPago;
    @Column(name = "Id_OrdenServicio")
    private Integer idOrdenServicio;
    @Column(name = "Id_Admin")
    private Integer idAdmin;
    @Column(name = "Id_Encuesta")
    private Integer idEncuesta;

    public CalificaServicio() {
    }

    public CalificaServicio(Integer idCalificaServicio) {
        this.idCalificaServicio = idCalificaServicio;
    }

    public Integer getIdCalificaServicio() {
        return idCalificaServicio;
    }

    public void setIdCalificaServicio(Integer idCalificaServicio) {
        this.idCalificaServicio = idCalificaServicio;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public String getObeservaciones() {
        return obeservaciones;
    }

    public void setObeservaciones(String obeservaciones) {
        this.obeservaciones = obeservaciones;
    }

    public Integer getIddetalleOrdenPago() {
        return iddetalleOrdenPago;
    }

    public void setIddetalleOrdenPago(Integer iddetalleOrdenPago) {
        this.iddetalleOrdenPago = iddetalleOrdenPago;
    }

    public Integer getIdOrdenServicio() {
        return idOrdenServicio;
    }

    public void setIdOrdenServicio(Integer idOrdenServicio) {
        this.idOrdenServicio = idOrdenServicio;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Integer getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(Integer idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCalificaServicio != null ? idCalificaServicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CalificaServicio)) {
            return false;
        }
        CalificaServicio other = (CalificaServicio) object;
        if ((this.idCalificaServicio == null && other.idCalificaServicio != null) || (this.idCalificaServicio != null && !this.idCalificaServicio.equals(other.idCalificaServicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "baiq.proyectoG7.entity.CalificaServicio[ idCalificaServicio=" + idCalificaServicio + " ]";
    }

}
