package com.codellege.api.repository;

import com.codellege.api.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*  1. Repository es la capa de acceso a datos para una ENTITY

    Estamos usando HERENCIA (capacidad de extender ATRIBUTOS y METODOS de una clase padre a una hija)

    2. Mediante 'extends' heredamos los métodos abstractos de la Interfaz JpaRepository
*/

@Repository
public interface IAlumnoRepo extends JpaRepository<Alumno, Integer> {
}
