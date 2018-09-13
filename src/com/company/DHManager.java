package com.company;

import java.util.ArrayList;
import java.util.List;

public class DHManager {
    //ATRIBUTOS
    private List<Alumno> listaAlumnos = new ArrayList<>();
    private List<ProfesorTitular> listaProfesoresTitulares = new ArrayList<>();
    private List<ProfesorAdjunto> listaProfesoresAdjuntos = new ArrayList<>();
    private List<Curso> listaCursos = new ArrayList<>();
    private List<Inscripcion> listaInscripciones = new ArrayList<>();

    //CONSTRUCTOR

    //GETTER/SETTER

    //METODOS
    public void altaCurso(String nombre, Integer codCurso, Integer cupoAlumnos) {
        Curso nuevoCurso = new Curso(nombre, codCurso, cupoAlumnos);
        System.out.println("Curso creado");


    }

    public void bajaCurso(Integer codCurso) {
        listaCursos.remove(codCurso);
        System.out.println(codCurso + " ya no esta inscripto en el curso");

    }

    public void altaProfesorAdjunto(String nombre, String apellido, Integer codProfesorAdjunto, Integer cantHoras) {
        ProfesorAdjunto profesor1 = new ProfesorAdjunto(nombre, apellido, codProfesorAdjunto, cantHoras);
        System.out.println("Alta profesor adjunto exitosa");
    }

    public void altaProfesorTitular(String nombre, String apellido, Integer codProfesorTitular, String especialidad) {
        ProfesorTitular profesor1 = new ProfesorTitular(nombre, apellido, codProfesorTitular, especialidad);
        System.out.println("Alta profesor titular exitosa");
    }

    public void bajaProfesorTitular(Integer codProfesorTitular) {
        listaProfesoresTitulares.remove(codProfesorTitular);
        System.out.println(codProfesorTitular + " ya no esta inscripto en el curso");

    }
    public void bajaProfesorAdjunto(Integer codProfesorAdjunto) {
        listaProfesoresAdjuntos.remove(codProfesorAdjunto);
        System.out.println(codProfesorAdjunto + " ya no esta inscripto en el curso");

    }

    public void altaAlumno(String nombre, String apellido, Integer codAlumno) {
        Alumno nuevoAlumno = new Alumno(nombre, apellido, codAlumno);
        System.out.println("Nuevo alumno creado");
    }

    public void inscribirAlumno(Integer codAlumno, Integer codCurso) {
        Alumno nuevoAlumno = null;
        Curso nuevoCurso = null;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getCodAlumno().equals(codAlumno)) {
                nuevoAlumno = alumno;
                System.out.println(nuevoAlumno);
            } else {
                System.out.println("El alumno no existe");
            }

        }
        for (Curso curso : listaCursos) {

            if (curso.getCodCurso().equals(codCurso)) {
                nuevoCurso = curso;
                System.out.println(nuevoCurso);
            } else {
                System.out.println("El curso no existe");
            }
        }

        if (nuevoCurso != null && nuevoAlumno != null && nuevoCurso.agregarAlumno(nuevoAlumno) == Boolean.TRUE ) {


            Inscripcion nuevaInscripcion = new Inscripcion(nuevoAlumno, nuevoCurso);
            listaInscripciones.add(nuevaInscripcion);
            System.out.println("Inscripcion exitosa");
        } else {
            System.out.println("Curso completo. No se pudo inscribir nuevo alumno");
        }


    }

    public void asignarProfesores(Integer codCurso, Integer codProfesorTitular, Integer codProfesorAdjunto){
        ProfesorTitular nuevoProfesorTitular = null;
        ProfesorAdjunto nuevoProfesorAdjunto = null;
        Curso nuevoCurso = null;
        for (ProfesorTitular profesorTitular : listaProfesoresTitulares) {
            if (profesorTitular.getCodProfesorTitular().equals(codProfesorTitular)) {
                nuevoProfesorTitular = profesorTitular;
                System.out.println(nuevoProfesorTitular);
            } else {
                System.out.println("El profesor no existe");
            }

        }
        for (ProfesorAdjunto profesorAdjunto : listaProfesoresAdjuntos) {
            if (profesorAdjunto.getCodProfesorAdjunto().equals(codProfesorAdjunto)) {
                nuevoProfesorAdjunto = profesorAdjunto;
                System.out.println(nuevoProfesorAdjunto);
            } else {
                System.out.println("El profesor no existe");
            }

        }
        for (Curso curso : listaCursos) {

            if (curso.getCodCurso().equals(codCurso)) {
                nuevoCurso = curso;
                System.out.println(nuevoCurso);
            } else {
                System.out.println("El curso no existe");
            }
        }

        if (nuevoCurso != null && nuevoProfesorAdjunto != null && nuevoProfesorTitular != null) {

            nuevoCurso.setProfesorAdjunto(nuevoProfesorAdjunto);
            nuevoCurso.setProfesorTitular(nuevoProfesorTitular);
            listaProfesoresTitulares.add(nuevoProfesorTitular);
            listaProfesoresAdjuntos.add(nuevoProfesorAdjunto);
            System.out.println("Asignacion exitosa");
        }

    }
}
