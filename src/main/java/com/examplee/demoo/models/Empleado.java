package com.examplee.demoo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleados", schema = "public")
public class Empleado {
    
    @Id
    @GeneratedValue()
    public Integer empleadoid;
 
    @Column(name = "nombre", length = 255)
    public String nombre;
 
    @Column(name = "apellido", length = 255)
    public String apellido;
 
    @Column(name = "fecha_nac")
    public Date fecha_nac;

    @Column(name = "extension")
    public Integer extension;

    @Column(name = "reporta_a")
    public Integer reporta_a;
    
}