package com.codellege.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
/*
    1. Una clase ENTITY representa una TABLA en una Base de Datos
    2. La anotación @Entity le indica a SPRING BOOT que la clase es una ENTITY y los OBJETOS java deben ser MAPEADOS a una TABLA
    3. La anotación @Id le indica a SPRING BOOT la tabla que será la LLAVE PRIMARIA (Primary Key)
    4. La anotación @GeneratedValue indica que el valor de un campo se Autogenerara automáticamente
    5. IDENTITY es similar al autoincremental de SQL

    Estamos implementando ABSTRACCIÓN (ocultamos los detalles de la implementación y abstraemos los elementos fundamentales para instanciarlos en objetos)
    y ENCAPSULAMIENTO (agrupar datos en función de un objetos gestionando el acceso mediante modificadores de acceso)

    6. Transformamos una clase ENTITY en una clase POJO (Plain Old Java Object) al generar los méotods de acceso y modificación conocidos como GETTERs y SETTERs
*/
@Entity
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
