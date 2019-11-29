package com.example.practicaunonavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class CicloVidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclo_vida);

        Log.e("Ciclo de Vida", "onCreate");
        MostrarMensaje("onCreate");

    }

    private void MostrarMensaje(String mensaje){
        Toast.makeText(this, mensaje,Toast.LENGTH_LONG)
                .show();


    }


    @Override
    protected void onStart() {
        super.onStart();

        Log.e("Ciclo de Vida", "onStart");
        MostrarMensaje("onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();


    }
}
