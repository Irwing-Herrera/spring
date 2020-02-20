package com.examplee.demoo.repositories;

import java.util.List;

import com.examplee.demoo.models.Empleado;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Integer> {
    List<Empleado> findAll();
}