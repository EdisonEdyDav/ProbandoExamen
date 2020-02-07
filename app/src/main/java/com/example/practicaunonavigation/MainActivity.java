package com.example.practicaunonavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etUser;
    private Button btnFollowers;
    private Button btnIndividual;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }



    private void initViews() {
        etUser = findViewById(R.id.enter_user_edit_text);
        btnFollowers = findViewById(R.id.enter_user_button);
        btnIndividual = findViewById(R.id.enter_user_button_Individual);
        btnFollowers.setOnClickListener(this);
        btnIndividual.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnFollowers) {
            // TODO: Go to nex activity
            Intent intent = new Intent(MainActivity.this, InfoUserActivity.class);
            intent.putExtra("cedula", etUser.getText().toString());
            startActivity(intent);

        }else if (v == btnIndividual){

            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            intent.putExtra("cedula", etUser.getText().toString());
            startActivity(intent);


        }
    }
}

