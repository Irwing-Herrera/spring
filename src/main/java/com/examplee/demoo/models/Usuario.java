package com.examplee.demoo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios", schema = "public")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
 
    @Column(name = "nombre", length = 10)
    public String nombre;
 
    @Column(name = "clavev", length = 255)
    public String clavev;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClavev() {
        return clavev;
    }

    public void setClavev(String clavev) {
        this.clavev = clavev;
    }
    
}