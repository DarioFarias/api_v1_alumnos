package com.codellege.api.controller;

import com.codellege.api.model.Alumno;
import com.codellege.api.service.AlumnoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
    1. Esta clase es un CONTROLADOR REST procesa solicitudes HTTP y regresa las respuestas
    2. @RestController es la combinación de @Controller (marca una clase como Controlador)
        y @ResponseBody (indica que el cuerpo de la respuesta será un objeto Java)
    3. @RequestMapping: mapea el método REST a una ruta HTTP
* */
@RestController
@RequestMapping("api/v1/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoServiceImpl serviciosREST;

    @GetMapping
    public List<Alumno> listarTodoLosAlumnos(){
        return serviciosREST.findAll();
    }

    @PostMapping
    public Alumno crear(@RequestBody Alumno alumno){
        return serviciosREST.save(alumno);
    }

    @PutMapping("{id}")
    public Alumno actualizar(@RequestBody Alumno alumno, @PathVariable Integer id){
        alumno.setId(id);
        return serviciosREST.save(alumno);
    }

    @DeleteMapping("{id}")
    public void elimnar(@PathVariable Integer id){
        serviciosREST.deleteById(id);
    }
}
