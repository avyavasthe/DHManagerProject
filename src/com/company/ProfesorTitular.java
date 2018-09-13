package com.company;

public class ProfesorTitular extends Profesor {
    //ATRIBUTOS

    private String especialidad;
    private Integer codProfesorTitular;

    //CONSTRUCTOR

    public ProfesorTitular(String nombre, String apellido,  Integer codProfesorTitular, String especialidad) {
        super(nombre, apellido);
        this.especialidad = especialidad;
        this.codProfesorTitular = codProfesorTitular;
    }

    //GETTER/SETTER


    public Integer getCodProfesorTitular() {
        return codProfesorTitular;
    }

    //METODOS
    @Override
    public boolean equals (Object o){
        ProfesorTitular mismoProfesor = (ProfesorTitular) o;
        return this.codProfesorTitular.equals(mismoProfesor.getCodProfesorTitular());

    }
    @Override
    public int hashCode(){
        return codProfesorTitular.hashCode();
    }
}
