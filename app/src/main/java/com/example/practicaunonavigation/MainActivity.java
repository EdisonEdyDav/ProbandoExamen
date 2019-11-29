package com.example.practicaunonavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Button btnLogin,btnGuardar,btnBuscar,btnPasarParametro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnLogin=(Button)findViewById(R.id.btnLogin);
        btnGuardar=(Button) findViewById(R.id.btnGuardar);
        btnBuscar=(Button) findViewById(R.id.btnBuscar);
        btnPasarParametro=(Button) findViewById(R.id.btnPasarParametro);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this, GuardarActivity.class);
                startActivity(intent);
            }
        });

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this, BuscarActivity.class);
                startActivity(intent);
            }
        });


        btnPasarParametro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(MainActivity.this, PasarParametroActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item){

        Intent intent;

        switch (item.getItemId()){
            case R.id.opcionLogin:
                intent = new Intent (MainActivity.this, LoginActivity.class);
                        startActivity(intent);
                break;

        }

        switch (item.getItemId()){
            case R.id.opcionRegistrar:
                intent = new Intent (MainActivity.this, PasarParametroActivity.class);
                startActivity(intent);
                break;


        }


        return true;
    }
}



