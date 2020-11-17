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
@Table(name = "fidelizacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fidelizacion.findAll", query = "SELECT f FROM Fidelizacion f")})
public class Fidelizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_fidelizacion")
    private Integer idfidelizacion;
    @Size(max = 150)
    @Column(name = "promociones")
    private String promociones;
    @Size(max = 150)
    @Column(name = "Descuentos")
    private String descuentos;
    @Size(max = 150)
    @Column(name = "HistorialCliente")
    private String historialCliente;
    @Size(max = 150)
    @Column(name = "Noticias")
    private String noticias;
    @Column(name = "FechaRegistro")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistro;
    @Column(name = "Id_cliente")
    private Integer idcliente;
    @Column(name = "Id_vendedor")
    private Integer idvendedor;
    @Column(name = "Id_tarjeta_puntos")
    private Integer idtarjetapuntos;

    public Fidelizacion() {
    }

    public Fidelizacion(Integer idfidelizacion) {
        this.idfidelizacion = idfidelizacion;
    }

    public Integer getIdfidelizacion() {
        return idfidelizacion;
    }

    public void setIdfidelizacion(Integer idfidelizacion) {
        this.idfidelizacion = idfidelizacion;
    }

    public String getPromociones() {
        return promociones;
    }

    public void setPromociones(String promociones) {
        this.promociones = promociones;
    }

    public String getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(String descuentos) {
        this.descuentos = descuentos;
    }

    public String getHistorialCliente() {
        return historialCliente;
    }

    public void setHistorialCliente(String historialCliente) {
        this.historialCliente = historialCliente;
    }

    public String getNoticias() {
        return noticias;
    }

    public void setNoticias(String noticias) {
        this.noticias = noticias;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public Integer getIdvendedor() {
        return idvendedor;
    }

    public void setIdvendedor(Integer idvendedor) {
        this.idvendedor = idvendedor;
    }

    public Integer getIdtarjetapuntos() {
        return idtarjetapuntos;
    }

    public void setIdtarjetapuntos(Integer idtarjetapuntos) {
        this.idtarjetapuntos = idtarjetapuntos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfidelizacion != null ? idfidelizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fidelizacion)) {
            return false;
        }
        Fidelizacion other = (Fidelizacion) object;
        if ((this.idfidelizacion == null && other.idfidelizacion != null) || (this.idfidelizacion != null && !this.idfidelizacion.equals(other.idfidelizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "baiq.proyectoG7.entity.Fidelizacion[ idfidelizacion=" + idfidelizacion + " ]";
    }
    
}
