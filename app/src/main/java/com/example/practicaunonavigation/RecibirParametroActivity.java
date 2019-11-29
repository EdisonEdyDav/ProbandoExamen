package com.example.practicaunonavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecibirParametroActivity extends AppCompatActivity {

    TextView textoNombre;
    TextView textoDireccion;
    TextView textoTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_parametro);


        textoNombre=(TextView) findViewById(R.id.lblNombres);
        textoDireccion=(TextView) findViewById(R.id.lblDireccion);
        textoTelefono=(TextView) findViewById(R.id.lblTelefono);


        Bundle bundle=this.getIntent().getExtras();

        textoNombre.setText(bundle.getString("datoNombre"));
        textoDireccion.setText(bundle.getString("datoDireccion"));
        textoTelefono.setText(bundle.getString("datoTelefono"));



    }
}
