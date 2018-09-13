package com.company;

public class Alumno {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private Integer codAlumno;

    //CONSTRUCTOR

    public Alumno(String nombre, String apellido, Integer codAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codAlumno = codAlumno;
    }
    //GETTER/SETTER


    public Integer getCodAlumno() {
        return codAlumno;
    }

    //METODOS
    @Override
    public boolean equals(Object o) {


        Alumno otroAlumno = (Alumno) o;

        return this.codAlumno.equals(otroAlumno.getCodAlumno());

    }
    @Override
    public int hashCode(){
        return codAlumno.hashCode();
    }
}
