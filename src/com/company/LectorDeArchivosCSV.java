package com.company;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;


public class LectorDeArchivosCSV {


        public List<String[]> alumnosCSV() {
            CSVReader csvReader = null;
            List<String[]> datosAlumno = new ArrayList<>();

            try {

                csvReader = new CSVReader(new FileReader("listadoDeAlumnos.csv"), ',', '"', 1);



                datosAlumno = csvReader.readAll();


            } catch (Exception ee) {
                ee.printStackTrace();
            }
            return datosAlumno;
        }

    }
