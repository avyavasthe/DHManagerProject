package com.company;

import java.util.ArrayList;
import java.util.List;

public class DHManager {
    //ATRIBUTOS
    private List<Alumno> listaAlumnos = new ArrayList<>();
    private List<Profesor> listaProfesores = new ArrayList<>();
    private List<Curso> listaCursos = new ArrayList<>();
    private List<Inscripcion> listaInscripciones = new ArrayList<>();

    //CONSTRUCTOR

    //GETTER/SETTER

    //METODOS
    public void altaCurso(String nombre, Integer codCurso, Integer cupoAlumnos) {
        Curso nuevoCurso = new Curso(nombre, codCurso, cupoAlumnos);
        listaCursos.add(nuevoCurso);
        System.out.println("Curso creado");


    }

    public void bajaCurso(Integer codCurso) {
        listaCursos.remove(codCurso);
        System.out.println("El curso "+ codCurso + " se ha eliminado correctamente");

    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codProfesor, Integer cantHoras) {
        ProfesorAdjunto profesorA = new ProfesorAdjunto(nombre, apellido, codProfesor, cantHoras);
        listaProfesores.add(profesorA);
        System.out.println("Alta profesor adjunto exitosa");
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codProfesor, String especialidad) {
        ProfesorTitular profesorT = new ProfesorTitular(nombre, apellido, codProfesor, especialidad);
        listaProfesores.add(profesorT);
        System.out.println("Alta profesor titular exitosa");
    }

    public void bajaProfesorTitular(Integer codProfesor) {
        for (Profesor profesorTitular: listaProfesores) {
            if (profesorTitular.getCodProfesor().equals(codProfesor)) {
                listaProfesores.remove(codProfesor);
                System.out.println(codProfesor + " ya no esta inscripto en el curso");
            }
        }

    }
    public void bajaProfesorAdjunto(Integer codProfesorAdjunto) {
        for (Profesor profesorAdjunto: listaProfesores) {
            if (profesorAdjunto.getCodProfesor().equals(codProfesorAdjunto)) {
                listaProfesores.remove(codProfesorAdjunto);
                System.out.println(codProfesorAdjunto + " ya no esta inscripto en el curso");
            }
        }



    }

    public void altaAlumno(String nombre, String apellido, Integer codAlumno) {
        Alumno nuevoAlumno = new Alumno(nombre, apellido, codAlumno);
        listaAlumnos.add(nuevoAlumno);
        System.out.println("Nuevo alumno creado");
    }

    public void inscribirAlumno(Integer codAlumno, Integer codCurso) {
        Alumno nuevoAlumno = null;
        Curso unNuevoCurso = null;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCodAlumno().equals(codAlumno)) {
                nuevoAlumno = alumno;
            }
        }
        for (Curso curso : listaCursos) {

            if (curso.getCodCurso().equals(codCurso)) {
                unNuevoCurso = curso;
            }
        }

        if (unNuevoCurso != null && nuevoAlumno != null && unNuevoCurso.agregarAlumno(nuevoAlumno)) {


            Inscripcion nuevaInscripcion = new Inscripcion(nuevoAlumno, unNuevoCurso);
            listaInscripciones.add(nuevaInscripcion);
            System.out.println("Inscripcion exitosa");
        } else if(unNuevoCurso == null) {
            System.out.println("No existe el curso");
        } else if (nuevoAlumno == null){
            System.out.println("No existe el alumno");
        }  else if (unNuevoCurso.agregarAlumno(nuevoAlumno) == Boolean.FALSE){
            System.out.println("El curso esta completo. No se puede inscribir el alumno");
        }


    }

    public void asignarProfesores(Integer codCurso, Integer codProfesorTitular, Integer codProfesorAdjunto){
        ProfesorTitular nuevoProfesorTitular = null;
        ProfesorAdjunto nuevoProfesorAdjunto = null;
        Curso cursoNuevo = null;
        for (Profesor profesorTitular1 : listaProfesores) {
            if (profesorTitular1.getCodProfesor().equals(codProfesorTitular)) {
                nuevoProfesorTitular = (ProfesorTitular) profesorTitular1;
            }

        }
        for (Profesor profesorAdjunto1 : listaProfesores) {
            if (profesorAdjunto1.getCodProfesor().equals(codProfesorAdjunto)) {
                nuevoProfesorAdjunto = (ProfesorAdjunto) profesorAdjunto1;
            }
            }


        for (Curso curso : listaCursos) {

            if (curso.getCodCurso().equals(codCurso)) {
                cursoNuevo = curso;
            }
            }


        if (cursoNuevo != null && nuevoProfesorAdjunto != null && nuevoProfesorTitular != null) {

            cursoNuevo.setProfesorAdjunto(nuevoProfesorAdjunto);
            cursoNuevo.setProfesorTitular(nuevoProfesorTitular);
            listaProfesores.add(nuevoProfesorTitular);
            listaProfesores.add(nuevoProfesorAdjunto);
            System.out.println("Asignacion exitosa");
        } else if (cursoNuevo == null){
            System.out.println("El curso no existe");
        } else if (nuevoProfesorAdjunto == null){
            System.out.println("El profesor adjunto no existe");
        } else if (nuevoProfesorTitular == null) {
            System.out.println("El profesro Titular no existe");
        }

    }
}
