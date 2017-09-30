package com.example.damian.calculos;

/**
 * Created by DAMIAN on 29/09/2017.
 */

public class Operaciones {

    private String operacion;
    private String datos;
    private String resultado;

    public Operaciones(String operacion, String datos, String resultado) {
        this.operacion = operacion;
        this.datos = datos;
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void Guardar(){
        Datos.GuardarOperacion(this);
    }
}
