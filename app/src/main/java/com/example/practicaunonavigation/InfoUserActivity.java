package com.example.practicaunonavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.example.practicaunonavigation.ui.enter.AdaptadorFollowers;
import java.util.ArrayList;
import java.util.List;
import com.example.practicaunonavigation.rest.adapter.GitHubAdapter;
import com.example.practicaunonavigation.rest.model.Owner;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InfoUserActivity extends AppCompatActivity {

    ArrayList<Owner> listaFollowers;
    RecyclerView recyclerViewFollowers;
    TextView textViewNombre, textViewCiudad;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_user);

        textViewNombre = findViewById(R.id.textViewNombre);
        textViewCiudad = findViewById(R.id.labelCiudad);

        listaFollowers = new ArrayList<>();
        recyclerViewFollowers = (RecyclerView)findViewById(R.id.recyclerViewFollowers);

        recyclerViewFollowers.setLayoutManager(new LinearLayoutManager(this));

        String cedula = getIntent().getStringExtra("cedula");

        mostrarDatosBasicos(cedula);
        mostrarSeguidores(cedula);
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

    private void mostrarSeguidores(String cedula){
        GitHubAdapter adapter = new GitHubAdapter();
        Call<List<Owner>> call = adapter.getOwnerFollowers(cedula);
        call.enqueue(new Callback<List<Owner>>() {
            @Override
            public void onResponse(Call<List<Owner>> call, Response<List<Owner>> response) {
                List<Owner> lista = response.body();
                for (Owner owner: lista
                ) {
                    Log.e("CEDULA", owner.getCedula());
                    listaFollowers.add(owner);
                }
                AdaptadorFollowers adaptadorFollowers = new AdaptadorFollowers(listaFollowers);
                recyclerViewFollowers.setAdapter(adaptadorFollowers);

            }

            @Override
            public void onFailure(Call<List<Owner>> call, Throwable t) {


            }
        });
    }
}
