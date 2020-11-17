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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Daniela
 */
@Entity
@Table(name = "soporte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Soporte.findAll", query = "SELECT s FROM Soporte s")})
public class Soporte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_soporte")
    private Integer idsoporte;
    @Column(name = "Sueldo")
    private Integer sueldo;
    @Column(name = "Id_usuario")
    private Integer idusuario;
    @Column(name = "Id_rol")
    private Integer idrol;

    public Soporte() {
    }

    public Soporte(Integer idsoporte) {
        this.idsoporte = idsoporte;
    }

    public Integer getIdsoporte() {
        return idsoporte;
    }

    public void setIdsoporte(Integer idsoporte) {
        this.idsoporte = idsoporte;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Integer getIdrol() {
        return idrol;
    }

    public void setIdrol(Integer idrol) {
        this.idrol = idrol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsoporte != null ? idsoporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Soporte)) {
            return false;
        }
        Soporte other = (Soporte) object;
        if ((this.idsoporte == null && other.idsoporte != null) || (this.idsoporte != null && !this.idsoporte.equals(other.idsoporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "baiq.proyectoG7.entity.Soporte[ idsoporte=" + idsoporte + " ]";
    }
    
}
