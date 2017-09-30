package com.example.damian.calculos;

import java.util.ArrayList;

/**
 * Created by DAMIAN on 29/09/2017.
 */

public class Datos {

    private static ArrayList<Operaciones> op = new ArrayList<>();

    public static void GuardarOperacion(Operaciones p){
        op.add(p);
    }

    public static ArrayList<Operaciones> Obtener(){
        return  op;
    }

public static String CalcularAreaCuadrado(int l){
    String Res = "" + (l * l);
    Operaciones x = new Operaciones("Area del Cuadrado","Lado : "+l,Res);
    GuardarOperacion(x);
    return Res;
}

}
