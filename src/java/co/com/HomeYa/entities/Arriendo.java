/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.HomeYa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "arriendo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arriendo.findAll", query = "SELECT a FROM Arriendo a"),
    @NamedQuery(name = "Arriendo.findByIdAlquiler", query = "SELECT a FROM Arriendo a WHERE a.idAlquiler = :idAlquiler"),
    @NamedQuery(name = "Arriendo.findByBarrio", query = "SELECT a FROM Arriendo a WHERE a.barrio = :barrio"),
    @NamedQuery(name = "Arriendo.findByPrecio", query = "SELECT a FROM Arriendo a WHERE a.precio = :precio"),
    @NamedQuery(name = "Arriendo.findByDescripcion", query = "SELECT a FROM Arriendo a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Arriendo.findByDireccionDomicilio", query = "SELECT a FROM Arriendo a WHERE a.direccionDomicilio = :direccionDomicilio"),
    @NamedQuery(name = "Arriendo.findByFotos", query = "SELECT a FROM Arriendo a WHERE a.fotos = :fotos")})
public class Arriendo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAlquiler")
    private Integer idAlquiler;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "barrio")
    private String barrio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "precio")
    private String precio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "direccionDomicilio")
    private String direccionDomicilio;
    @Size(max = 45)
    @Column(name = "Fotos")
    private String fotos;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false)
    private Usuario idUsuario;

    public Arriendo() {
    }

    public Arriendo(Integer idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Arriendo(Integer idAlquiler, String barrio, String precio, String descripcion, String direccionDomicilio) {
        this.idAlquiler = idAlquiler;
        this.barrio = barrio;
        this.precio = precio;
        this.descripcion = descripcion;
        this.direccionDomicilio = direccionDomicilio;
    }

    public Integer getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(Integer idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public String getFotos() {
        return fotos;
    }

    public void setFotos(String fotos) {
        this.fotos = fotos;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAlquiler != null ? idAlquiler.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arriendo)) {
            return false;
        }
        Arriendo other = (Arriendo) object;
        if ((this.idAlquiler == null && other.idAlquiler != null) || (this.idAlquiler != null && !this.idAlquiler.equals(other.idAlquiler))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.HomeYa.entities.Arriendo[ idAlquiler=" + idAlquiler + " ]";
    }
    
}
