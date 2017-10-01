package com.example.damian.calculos;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Operar_Volumen_Esfera extends AppCompatActivity {
    private EditText radio;
    private Intent in;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operar__volumen__esfera);
        resources=this.getResources();
        radio=(EditText)findViewById(R.id.txtradio);
    }
    public void  Aceptar(View v){
        if (radio.getText().length()==0){
            Toast.makeText(this,resources.getString(R.string.error_datos),Toast.LENGTH_SHORT).show();
        }else{
            double dato = Double.parseDouble(radio.getText().toString().trim());
            String r = Datos.CalcularVolumenEsfera(dato);
            principal.Titulo_Resultado = resources.getString(R.string.circulo);
            principal.Titulo_datos = "Volumen : " + r;
            in = new Intent(Operar_Volumen_Esfera.this,resultado.class);
            startActivity(in);
        }
    }

    public void  borrar(View v){
        radio.setText("");
        //valor.setVisibility(View.INVISIBLE);

    }
}
