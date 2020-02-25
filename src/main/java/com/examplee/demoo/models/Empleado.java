package com.examplee.demoo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleados", schema = "public")
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer empleadoid;
 
    @Column(name = "nombre", length = 255)
    public String nombre;
 
    @Column(name = "apellido", length = 255)
    public String apellido;

    @Column(name = "reporta_a")
    public Integer reporta_a;
    
}