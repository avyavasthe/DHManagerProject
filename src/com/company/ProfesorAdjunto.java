package com.company;

public class ProfesorAdjunto extends Profesor {
    //ATRIBUTOS
    private Integer cantHoras;
    private Integer codProfesorAdjunto;

    //CONSTRUCTOR

    public ProfesorAdjunto(String nombre, String apellido, Integer codProfesorAdjunto, Integer cantHoras) {
        super(nombre, apellido);
        this.cantHoras = cantHoras;
    }

    //GETTER/SETTER

    public Integer getCodProfesorAdjunto() {
        return codProfesorAdjunto;
    }


    //METODOS
    @Override
    public boolean equals (Object o){
        ProfesorAdjunto mismoProfesor = (ProfesorAdjunto) o;
        return this.codProfesorAdjunto.equals(mismoProfesor.getCodProfesorAdjunto());

    }
    @Override
    public int hashCode(){
        return codProfesorAdjunto.hashCode();
    }

}
