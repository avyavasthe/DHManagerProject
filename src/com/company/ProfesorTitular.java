package com.company;

public class ProfesorTitular extends Profesor {
    //ATRIBUTOS

    private String especialidad;

    //CONSTRUCTOR

    public ProfesorTitular(String nombre, String apellido, Integer codProfesor, String especialidad) {
        super(nombre, apellido, codProfesor);
        this.especialidad = especialidad;
    }


    //GETTER/SETTER

    //METODOS

}
