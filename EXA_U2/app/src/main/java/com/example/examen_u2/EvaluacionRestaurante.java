package com.example.examen_u2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EvaluacionRestaurante extends AppCompatActivity {
    final int NOMBRE = 22;
    TextView Nombre;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode){
            case NOMBRE:
                if(resultCode == Activity.RESULT_OK);
                Nombre.setText(data.getStringExtra("restauranteSeleccionado"));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluacion_restaurante);

        Nombre = findViewById(R.id.txtNom);
        Intent obtenerDatos = new Intent(getApplicationContext(), MostrarActivity.class);
        startActivityForResult(obtenerDatos, NOMBRE);


        finish();
    }
}
