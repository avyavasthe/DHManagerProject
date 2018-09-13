package com.company;

public abstract class Profesor {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private Integer codProfesor;
    private Integer antiguedad = 0;



    //CONSTRUCTOR

    public Profesor(String nombre, String apellido, Integer codProfesor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codProfesor = codProfesor;
    }
    //GETTER/SETTER

    public Integer getCodProfesor() {
        return codProfesor;
    }


    //METODOS
    @Override
    public boolean equals (Object o){
        Profesor mismoProfesor = (Profesor) o;
        return this.codProfesor.equals(mismoProfesor.getCodProfesor());

    }
    @Override
    public int hashCode(){
        return codProfesor.hashCode();
    }

}
