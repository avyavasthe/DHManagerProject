package com.company;

import java.security.DigestException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code he
        DHManager dhManager = new DHManager();
        dhManager.altaProfesorAdjunto("Andres", "Benitez", 4,89);
        dhManager.altaProfesorTitular("Alberto", "Gomez", 1, "Fullstack");
        dhManager.altaProfesorTitular("Juan", "Perez", 2, "Android");
        dhManager.altaProfesorAdjunto("Berto", "Gonzalez", 3, 15);

        dhManager.altaCurso("Fullstack", 20001, 3);
        dhManager.altaCurso("Android", 20002, 2);



    }
}
