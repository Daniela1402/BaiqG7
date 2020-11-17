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
@Table(name = "encuesta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Encuesta.findAll", query = "SELECT e FROM Encuesta e")})
public class Encuesta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Encuesta")
    private Integer idEncuesta;
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "Servicio")
    private Integer servicio;
    @Column(name = "Precio")
    private Integer precio;
    @Column(name = "Producto")
    private Integer producto;
    @Column(name = "Asesoria")
    private Integer asesoria;
    @Column(name = "VolveriaComprar")
    private Integer volveriaComprar;

    public Encuesta() {
    }

    public Encuesta(Integer idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public Integer getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(Integer idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getServicio() {
        return servicio;
    }

    public void setServicio(Integer servicio) {
        this.servicio = servicio;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getProducto() {
        return producto;
    }

    public void setProducto(Integer producto) {
        this.producto = producto;
    }

    public Integer getAsesoria() {
        return asesoria;
    }

    public void setAsesoria(Integer asesoria) {
        this.asesoria = asesoria;
    }

    public Integer getVolveriaComprar() {
        return volveriaComprar;
    }

    public void setVolveriaComprar(Integer volveriaComprar) {
        this.volveriaComprar = volveriaComprar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEncuesta != null ? idEncuesta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Encuesta)) {
            return false;
        }
        Encuesta other = (Encuesta) object;
        if ((this.idEncuesta == null && other.idEncuesta != null) || (this.idEncuesta != null && !this.idEncuesta.equals(other.idEncuesta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "baiq.proyectoG7.entity.Encuesta[ idEncuesta=" + idEncuesta + " ]";
    }
    
}
