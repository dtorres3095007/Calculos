package com.example.damian.calculos;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class principal extends AppCompatActivity {
    private ListView lv;
    private Resources resources;
    private String opc[];
    private Intent in;
    static String Titulo_Resultado = "";
    static String Titulo_datos = "";
    static String Titulo_op = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lv = (ListView)findViewById(R.id.opciones);
        resources = this.getResources();
        opc = resources.getStringArray(R.array.opciones_principales);
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc);
        lv.setAdapter(Adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(principal.this,Areas.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(principal.this,Volumenes.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(principal.this,Operaciones_realizadas.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }
}
