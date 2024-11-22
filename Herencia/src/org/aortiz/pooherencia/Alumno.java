package org.aortiz.pooherencia;

public class Alumno extends Persona{
    private String intitucion;
    private  double notaMatematicas;
    private double notaCastellano;
    private double notasHistoria;


    public String getIntitucion() {
        return intitucion;
    }

    public void setIntitucion(String intitucion) {
        this.intitucion = intitucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotasHistoria() {
        return notasHistoria;
    }

    public void setNotasHistoria(double notasHistoria) {
        this.notasHistoria = notasHistoria;
    }
}
