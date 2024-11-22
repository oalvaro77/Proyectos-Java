package org.aortiz.pooherencia;

public class AlumnoIntercambio extends Alumno{
    private String pais;
    private Double materiaIngles;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getMateriaIngles() {
        return materiaIngles;
    }

    public void setMateriaIngles(Double materiaIngles) {
        this.materiaIngles = materiaIngles;
    }
}
