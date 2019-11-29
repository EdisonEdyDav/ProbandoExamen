package com.example.practicaunonavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GuardarActivity extends AppCompatActivity {

       EditText cajaDatosNombres;
       EditText cajaDatosDireccion;
       EditText cajaDatosTelefono;
       Button botonEnviarNombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardar);

        cajaDatosNombres =(EditText) findViewById(R.id.edtText_Nombres);
        cajaDatosDireccion =(EditText) findViewById(R.id.edtText_Direccion);
        cajaDatosTelefono =(EditText) findViewById(R.id.edtText_Telefono);
        botonEnviarNombres=(Button) findViewById(R.id.btnEnviarDatos);

        botonEnviarNombres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(GuardarActivity.this, RecibirParametroActivity.class);

                Bundle bundle =new Bundle();

                bundle.putString("datoNombres",cajaDatosNombres.getText().toString());
                bundle.putString("datoDireccion",cajaDatosDireccion.getText().toString());
                bundle.putString("datoTelefono",cajaDatosTelefono.getText().toString());

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });





    }
}
