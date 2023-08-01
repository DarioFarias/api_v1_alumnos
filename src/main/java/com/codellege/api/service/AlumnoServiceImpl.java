package com.codellege.api.service;

import com.codellege.api.model.Alumno;
import com.codellege.api.repository.IAlumnoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*  Estamos usando POLIMORFISMO mediante sobre escritura de métodos (Override)
    el cual permite a una clase HIJA sobreescribir el método de una clase PADRE
    esto permite a la clase hija IMPLEMENTAR el método en base a diferentes OBJETOS.
* */

@Service
public class AlumnoServiceImpl implements IAlumnoService<Alumno, Integer>{

    // Inyección de Dependencia: Patrón de Diseño que permite inyectar dependencias a un OBJETO desde una clase externa
    @Autowired
    private IAlumnoRepo reposiroty;

    // OVERRIDE = Sobreescritura de métodos

    //GET
    @Override
    public List<Alumno> findAll() {
        return reposiroty.findAll();
    }

    //POST
    @Override
    public Alumno save(Alumno alumno) {
        return reposiroty.save(alumno);
    }

    //PUT
    @Override
    public Alumno save(Integer id, Alumno alumno) {
        alumno.setId(id);
        return reposiroty.save(alumno);
    }

    //DELETE
    @Override
    public void deleteById(Integer id) {
        reposiroty.deleteById(id);
    }
}
