package com.examplee.demoo.services;

import java.util.List;

import com.examplee.demoo.models.Empleado;
import com.examplee.demoo.repositories.IEmpleadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {

    @Autowired
    private IEmpleadoRepository repo;
 
    public List<Empleado> findAll() {
        return repo.findAll();
    }

    public Empleado getEmpleado(int id) {
        return repo.findAll().stream().filter((x) -> x.empleadoid.equals(id)).findAny().orElse(null);
    }

    public Empleado addEmpleado(Empleado empleado) {
        return repo.save(empleado);
    }

    public Empleado updateEmpleado(Empleado empleado) {
        return repo.save(empleado);
    }

    public void deleteEmpleado(int id) {
        repo.deleteById(id);
    }
    
}