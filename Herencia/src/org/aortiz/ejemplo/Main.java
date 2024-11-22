package org.aortiz.ejemplo;

import org.aortiz.pooherencia.Alumno;
import org.aortiz.pooherencia.AlumnoIntercambio;
import org.aortiz.pooherencia.Profesor;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Alvaro");
        alumno.setApellido("Ortiz");
        alumno.setNotaMatematicas(4.0);
        alumno.setNotaCastellano(5.0);
        alumno.setNotasHistoria(4.4);

        AlumnoIntercambio alumnoIntercambio = new AlumnoIntercambio();
        alumnoIntercambio.setNombre("Pedro");
        alumnoIntercambio.setApellido("Lopez");
        alumnoIntercambio.setMateriaIngles(4.1);
        alumnoIntercambio.setPais("Colombia");


        Profesor profesor = new Profesor();
        profesor.setNombre("Andres");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matematicas");



        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor de " + profesor.getAsignatura() + ":" +
                profesor.getNombre() + " " + profesor.getApellido());
        System.out.println(alumnoIntercambio.getNombre() + " " + alumnoIntercambio.getApellido()   + " de "+ alumnoIntercambio.getPais() +
                " " + alumnoIntercambio.getMateriaIngles());

        Class clase = alumnoIntercambio.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }

    }
}