package com.company;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;


public class LectorDeArchivosCSV {
        public static void main(String args[]) {
            CSVReader csvReader = null;

            try {

                csvReader = new CSVReader(new FileReader("listadoDeAlumnos.csv"), ',', '"', 1);

                String[] alumnos = null;

                List<String[]> datosAlumno = new ArrayList<String[]>();
                datosAlumno = csvReader.readAll();

                for (String[] row : datosAlumno) {
                    System.out.println(Arrays.toString(row));
                }
            } catch (Exception ee) {
                ee.printStackTrace();
            }
        }
    }
