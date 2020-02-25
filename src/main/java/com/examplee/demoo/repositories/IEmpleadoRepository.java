package com.examplee.demoo.repositories;

import com.examplee.demoo.models.Empleado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoRepository extends JpaRepository<Empleado, Integer> {
}