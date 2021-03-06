package com.example.damian.calculos;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Operar_Area_Triangulo extends AppCompatActivity {
    private EditText base, alt;
    private Intent in;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operar__area__triangulo);
        resources=this.getResources();
        base=(EditText)findViewById(R.id.txtbase);
        alt=(EditText)findViewById(R.id.txtaltura);
    }
    public void  Aceptar(View v){
        if (base.getText().length()==0 ||alt.getText().length()==0 ){
            Toast.makeText(this,resources.getString(R.string.error_datos),Toast.LENGTH_SHORT).show();
        }else{
            double al = Double.parseDouble(alt.getText().toString().trim());
            double ba = Double.parseDouble(base.getText().toString().trim());
            String r = Datos.CalcularAreaTriangulo(ba,al);
            principal.Titulo_Resultado = resources.getString(R.string.triangulo);
            principal.Titulo_datos = "Area : " + r;
            in = new Intent(Operar_Area_Triangulo.this,resultado.class);
            startActivity(in);
        }
    }

    public void  borrar(View v){
        base.setText("");
        alt.setText("");
        //valor.setVisibility(View.INVISIBLE);

    }
}
