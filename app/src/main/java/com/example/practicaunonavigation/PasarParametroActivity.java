package com.example.practicaunonavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PasarParametroActivity extends AppCompatActivity {

    EditText cajaNombre;
    EditText cajaDireccion;
    EditText cajaTelefono;
    Button botonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasar_parametro);

        cajaNombre =(EditText) findViewById(R.id.edtText_Nombre);
        cajaDireccion =(EditText) findViewById(R.id.edtText_Direccion);
        cajaTelefono =(EditText) findViewById(R.id.edtText_Telefono);
        botonEnviar=(Button) findViewById(R.id.btnEnviarParametro);

        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(PasarParametroActivity.this, RecibirParametroActivity.class);
                Bundle bundle =new Bundle();

                bundle.putString("datoNombre",cajaNombre.getText().toString());
                bundle.putString("datoDireccion",cajaDireccion.getText().toString());
                bundle.putString("datoTelefono",cajaTelefono.getText().toString());


                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
