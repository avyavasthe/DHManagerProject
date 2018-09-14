package com.company;

import java.security.DigestException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code he

        DHManager dhManager = new DHManager();
        //ALTA PROFESORES
        dhManager.altaProfesorAdjunto("Andres", "Benitez", 4,89);
        dhManager.altaProfesorTitular("Alberto", "Gomez", 1, "Fullstack");
        dhManager.altaProfesorTitular("Juan", "Perez", 2, "Android");
        dhManager.altaProfesorAdjunto("Berto", "Gonzalez", 3, 15);

        //ALTA CURSO
        dhManager.altaCurso("Fullstack", 20001, 3);
        dhManager.altaCurso("Android", 20002, 2);

        //ALTA ALUMNOS
        dhManager.altaAlumno("Carlos", "Sanchez", 1);
        dhManager.altaAlumno("Juana", "Jota", 2);
        dhManager.altaAlumno("Julia", "Fernandez", 3);

        //INSCRIBIR ALUMNOS
        dhManager.inscribirAlumno(1, 20001);
        dhManager.inscribirAlumno(2, 20001);
        dhManager.inscribirAlumno(1, 20002);
        dhManager.inscribirAlumno(2, 20002);
        dhManager.inscribirAlumno(3, 20002);

       //ASIGNAR PROFESORES
        dhManager.asignarProfesores(20001, 1, 3);
        dhManager.asignarProfesores(20002, 2, 4);


        //Dar de baja un profesor

        dhManager.bajaProfesor(3);

        //Dar de baja un curso

        dhManager.bajaCurso(20001);



        //EXPORTAR ALUMNOS
        dhManager.leerCSV();


        /* Agregar un metodo a la clase alumno que permita registrar en un Array<List> los cursos
        a los que se inscribe, y otro metodo en la clase DHManager que recorra la lista de inscripciones y
        busque al alumno por su codigo de alumno y le informe las inscripciones al alumno*/






    }
}
