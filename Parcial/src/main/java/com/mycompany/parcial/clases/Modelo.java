/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial.clases;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gabriel
 */
@Entity
@Table(name = "modelo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modelo.findAll", query = "SELECT m FROM Modelo m"),
    @NamedQuery(name = "Modelo.findByModeloId", query = "SELECT m FROM Modelo m WHERE m.modeloId = :modeloId"),
    @NamedQuery(name = "Modelo.findByDecada", query = "SELECT m FROM Modelo m WHERE m.decada = :decada"),
    @NamedQuery(name = "Modelo.findByModeloInconveniente", query = "SELECT m FROM Modelo m WHERE m.modeloInconveniente = :modeloInconveniente")})
public class Modelo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "modelo_id")
    private Integer modeloId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "decada")
    private String decada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "modelo_inconveniente")
    private String modeloInconveniente;

    public Modelo() {
    }

    public Modelo(Integer modeloId) {
        this.modeloId = modeloId;
    }

    public Modelo(Integer modeloId, String decada, String modeloInconveniente) {
        this.modeloId = modeloId;
        this.decada = decada;
        this.modeloInconveniente = modeloInconveniente;
    }

    public Integer getModeloId() {
        return modeloId;
    }

    public void setModeloId(Integer modeloId) {
        this.modeloId = modeloId;
    }

    public String getDecada() {
        return decada;
    }

    public void setDecada(String decada) {
        this.decada = decada;
    }

    public String getModeloInconveniente() {
        return modeloInconveniente;
    }

    public void setModeloInconveniente(String modeloInconveniente) {
        this.modeloInconveniente = modeloInconveniente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modeloId != null ? modeloId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modelo)) {
            return false;
        }
        Modelo other = (Modelo) object;
        if ((this.modeloId == null && other.modeloId != null) || (this.modeloId != null && !this.modeloId.equals(other.modeloId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.parcial.clases.Modelo[ modeloId=" + modeloId + " ]";
    }
    
}
