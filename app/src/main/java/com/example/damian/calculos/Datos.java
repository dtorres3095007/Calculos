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

public static String CalcularAreaCuadrado(double l){
    String Res = "" + (l * l);
    Operaciones x = new Operaciones("Area del Cuadrado","Lado : "+l,Res);
    GuardarOperacion(x);
    return Res;
}

    public static String CalcularAreaTriangulo(double b, double h){
        double Res = (b * h)/2;
        String datos = "Base : " + b +" - Altura: "+ h;
        Operaciones x = new Operaciones("Area del Triangulo",datos,Res+"");
        GuardarOperacion(x);
        return Res+"";
    }
    public static String CalcularAreaRectangulo(double a, double b){
        double Res = a * b;
        String datos = "Lado A : " + a +" - Lado B: "+ b;
        Operaciones x = new Operaciones("Area del Rectangulo",datos,Res+"");
        GuardarOperacion(x);
        return Res+"";
    }
    public static String CalcularAreaCirculo(double r){
        double Res = 3.14 * (r * r);
        Operaciones x = new Operaciones("Area del Circulo:","Radio : "+r,Res+"");
        GuardarOperacion(x);
        return Res + "";
    }
}
