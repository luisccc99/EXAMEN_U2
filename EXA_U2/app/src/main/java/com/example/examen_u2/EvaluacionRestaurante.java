package com.example.examen_u2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Objects;

public class EvaluacionRestaurante extends AppCompatActivity {

List<Restaurante> restaurantes = MostrarActivity.obtenerLista();
int posicionLista;
TextView  txtNombre, txtDescripcion, txtAddress;
ImageView imgRestaurante;
RatingBar Evaluacion;
float   EvalRatin;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
       Toast.makeText(this,"La posición es: "+data.getStringExtra("posicion"),Toast.LENGTH_SHORT).show();
      //  posicionLista = data.getIntExtra("posicion",0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluacion_restaurante);
        txtAddress = findViewById(R.id.txtDir);
        txtDescripcion = findViewById(R.id.txtDesc);
        txtNombre = findViewById(R.id.txtNom);
        imgRestaurante = findViewById(R.id.ImgEvaluacion);
        Evaluacion = findViewById(R.id.ratingEva);

        txtNombre.setText(restaurantes.get(3).getNombre());
       // Toast.makeText(this,""+posicionLista,Toast.LENGTH_SHORT).show();
    }
}
