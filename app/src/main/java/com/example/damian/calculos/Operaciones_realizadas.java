package com.example.damian.calculos;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Operaciones_realizadas extends AppCompatActivity {
    private Resources resources;
    private TableLayout tabla;
    private ArrayList<Operaciones> p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operaciones_realizadas);
        resources=this.getResources();
        tabla = (TableLayout) findViewById(R.id.tabla);
        p = Datos.Obtener();
        for(int i = 0 ; i< p.size();i++){
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            c1.setText(""+ (i + 1));
            c2.setText(""+p.get(i).getOperacion());
            c3.setText(""+p.get(i).getDatos());
            c4.setText(""+p.get(i).getResultado());



            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
       

            tabla.addView(fila);
        }
    }
}
