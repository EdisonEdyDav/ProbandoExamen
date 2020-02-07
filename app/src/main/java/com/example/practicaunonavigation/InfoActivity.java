package com.example.practicaunonavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.example.practicaunonavigation.rest.adapter.GitHubAdapter;
import com.example.practicaunonavigation.rest.model.Owner;
import com.example.practicaunonavigation.ui.enter.AdaptadorFollowers;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InfoActivity extends AppCompatActivity {

    ArrayList<Owner> listaFollowers;
    RecyclerView recyclerViewFollowers;
    TextView textViewNombre, textViewCiudad;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_user);

        textViewNombre = findViewById(R.id.textViewNombre);
        textViewCiudad = findViewById(R.id.textViewCiudad);

        listaFollowers = new ArrayList<>();
        recyclerViewFollowers = (RecyclerView)findViewById(R.id.recyclerViewFollowers);

        recyclerViewFollowers.setLayoutManager(new LinearLayoutManager(this));

        String cedula = getIntent().getStringExtra("cedula");

        mostrarDatosBasicos(cedula);

    }
    TextView labelNombre, labelCiudad;
    private void mostrarDatosBasicos(String cedula){
        GitHubAdapter adapter = new GitHubAdapter();

        Call<Owner> call = adapter.getOwner(cedula);

        call.enqueue(new Callback<Owner>() {

            @Override
            public void onResponse(Call<Owner> call, Response<Owner> response) {
                Owner owner = response.body();
                textViewNombre.setText(owner.getNombre());
                textViewCiudad.setText(owner.getCiudad());


            }

            @Override
            public void onFailure(Call<Owner> call, Throwable t) {
                //Toast.makeText(this, "Something went worng", Toast.LENGTH_LONG).show();
            }
        });


    }

}
