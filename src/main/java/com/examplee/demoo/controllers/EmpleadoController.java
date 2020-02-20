package com.examplee.demoo.controllers;

import java.util.List;

import com.examplee.demoo.models.Empleado;
import com.examplee.demoo.services.EmpleadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
 
    @Autowired
    private EmpleadoService empleadoService;
 
    @GetMapping("/empleados")
    public List<Empleado> getAll() {
        return empleadoService.findAll();
    }

    @GetMapping("/empleados/{id}")
    public Empleado getEmpleado(@PathVariable("id") int id) {
        return empleadoService.getEmpleado(id);
    }

    @PostMapping("/empleados")
    public Empleado addEmpleado(@RequestBody Empleado empleado) {
        return empleadoService.addEmpleado(empleado);
    }

    @PutMapping("/empleados")
    public Empleado updateEmpleado(@RequestBody Empleado empleado) {
        return empleadoService.updateEmpleado(empleado);
    }

    @DeleteMapping("/empleados/{id}")
    public void deleteEmpleado(@PathVariable int id) {
     empleadoService.deleteEmpleado(id);
    }
}