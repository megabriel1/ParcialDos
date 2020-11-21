/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial.clases;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "marca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marca.findAll", query = "SELECT m FROM Marca m"),
    @NamedQuery(name = "Marca.findByMarcaId", query = "SELECT m FROM Marca m WHERE m.marcaId = :marcaId"),
    @NamedQuery(name = "Marca.findByNombre", query = "SELECT m FROM Marca m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "Marca.findByPais", query = "SELECT m FROM Marca m WHERE m.pais = :pais"),
    @NamedQuery(name = "Marca.findByMarcaInconveniente", query = "SELECT m FROM Marca m WHERE m.marcaInconveniente = :marcaInconveniente")})


public class Marca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "marca_id")
    private Integer marcaId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "pais")
    private String pais;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "marca_inconveniente")
    private String marcaInconveniente;

    public Marca() {
    }

    public Marca(Integer marcaId) {
        this.marcaId = marcaId;
    }

    public Marca(Integer marcaId, String nombre, String pais, String marcaInconveniente) {
        this.marcaId = marcaId;
        this.nombre = nombre;
        this.pais = pais;
        this.marcaInconveniente = marcaInconveniente;
    }
    
    public Integer getMarcaId() {
        return marcaId;
    }

    public void setMarcaId(Integer marcaId) {
        this.marcaId = marcaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getMarcaInconveniente() {
        return marcaInconveniente;
    }

    public void setMarcaInconveniente(String marcaInconveniente) {
        this.marcaInconveniente = marcaInconveniente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (marcaId != null ? marcaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marca)) {
            return false;
        }
        Marca other = (Marca) object;
        if ((this.marcaId == null && other.marcaId != null) || (this.marcaId != null && !this.marcaId.equals(other.marcaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.parcial.clases.Marca[ marcaId=" + marcaId + " ]";
    }
    
}
