package com.company;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    //ATRIBUTOS

    private String nombre;
    private Integer codCurso;
    private ProfesorAdjunto profesorAdjunto;
    private ProfesorTitular profesorTitular;
    private Integer cupoAlumnos;
    private List<Alumno> alumnosInscriptos = new ArrayList<>();

    //CONSTRUCTOR


    public Curso(String nombre, Integer codCurso, Integer cupoAlumnos) {
        this.nombre = nombre;
        this.codCurso = codCurso;
        this.cupoAlumnos= cupoAlumnos;
    }

    //GETTER/SETTER


    public Integer getCodCurso() {
        return codCurso;
    }

    public void setProfesorAdjunto(ProfesorAdjunto profesorAdjunto) {
        this.profesorAdjunto = profesorAdjunto;
    }

    public void setProfesorTitular(ProfesorTitular profesorTitular) {
        this.profesorTitular = profesorTitular;
    }

    public Integer getCupoAlumnos() {
        return cupoAlumnos;
    }

    //METODOS
    @Override

    public boolean equals (Object obj){
        Curso nuevoCurso = (Curso) obj;
        return this.codCurso.equals(nuevoCurso.getCodCurso());
    }
    @Override

    public int hashCode(){
        return codCurso.hashCode();
    }

    public Boolean agregarAlumno (Alumno unAlumno){
        Integer nroAlumnos = 0;
        for (Integer i = 0; i < alumnosInscriptos.size(); i++){
            System.out.println(nroAlumnos + 1);
        }
        if (nroAlumnos < cupoAlumnos){
            alumnosInscriptos.add(unAlumno);
            return true;
        } else {
            return false;
        }


    }
    //AGREGAR METODO QUE VERIFIQUE SI EL ALUMNO NO ESTA PREVIAMENTE INSCRIPTO
    public void eliminarAlumno (Alumno unAlumno){
        alumnosInscriptos.remove(unAlumno);
        System.out.println( unAlumno + " ya no esta inscripto en el curso");


    }
}
