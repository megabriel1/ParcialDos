/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial.clases;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "motocicletas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Motocicletas_1.findAll", query = "SELECT m FROM Motocicletas_1 m"),
    @NamedQuery(name = "Motocicletas_1.findByMotocicletasId", query = "SELECT m FROM Motocicletas_1 m WHERE m.motocicletasId = :motocicletasId"),
    @NamedQuery(name = "Motocicletas_1.findByCodigoBarras", query = "SELECT m FROM Motocicletas_1 m WHERE m.codigoBarras = :codigoBarras")})
public class Motocicletas_1 implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "motocicletas_id")
    private Integer motocicletasId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "codigo_barras")
    private String codigoBarras;
    @JoinTable(name = "motocicletas_proveedor", joinColumns = {
        @JoinColumn(name = "motocicletas_id", referencedColumnName = "motocicletas_id")}, inverseJoinColumns = {
        @JoinColumn(name = "proveedor_id", referencedColumnName = "proveedor_id")})
    @ManyToMany
    private Collection<Proveedor> proveedorCollection;

    public Motocicletas_1() {
    }

    public Motocicletas_1(Integer motocicletasId) {
        this.motocicletasId = motocicletasId;
    }

    public Motocicletas_1(Integer motocicletasId, String codigoBarras) {
        this.motocicletasId = motocicletasId;
        this.codigoBarras = codigoBarras;
    }

    public Integer getMotocicletasId() {
        return motocicletasId;
    }

    public void setMotocicletasId(Integer motocicletasId) {
        this.motocicletasId = motocicletasId;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @XmlTransient
    @JsonIgnore
    public Collection<Proveedor> getProveedorCollection() {
        return proveedorCollection;
    }

    public void setProveedorCollection(Collection<Proveedor> proveedorCollection) {
        this.proveedorCollection = proveedorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (motocicletasId != null ? motocicletasId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motocicletas_1)) {
            return false;
        }
        Motocicletas_1 other = (Motocicletas_1) object;
        if ((this.motocicletasId == null && other.motocicletasId != null) || (this.motocicletasId != null && !this.motocicletasId.equals(other.motocicletasId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.parcial.clases.Motocicletas_1[ motocicletasId=" + motocicletasId + " ]";
    }


    
}
