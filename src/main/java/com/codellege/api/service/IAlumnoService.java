package com.codellege.api.service;

import java.util.List;

//  Una INTERFAZ es una colección de métodos abstractos o vacios (que no estan implementados)
public interface IAlumnoService<Alumno, Integer> {

    // REST: 4 HTTP GET, POST, PUT & DELETE

    //GET
    List<Alumno> findAll();

    //POST
    Alumno save(Alumno alumno);

    //PUT
    Alumno save(Integer id, Alumno alumno);

    //DELETE
    void deleteById(Integer id);
}
