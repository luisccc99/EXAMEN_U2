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
ArrayAdapter<Restaurante> arrayAdapter =  MostrarActivity.obtenerAdapter();
int posicionLista;
TextView  txtNombre, txtDescripcion, txtAddress;
ImageView imgRestaurante;
RatingBar Evaluacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluacion_restaurante);

       posicionLista = getIntent().getExtras().getInt("IndexList");

        txtAddress = findViewById(R.id.txtDir);
        txtDescripcion = findViewById(R.id.txtDesc);
        txtNombre = findViewById(R.id.txtNom);
        imgRestaurante = findViewById(R.id.ImgEvaluacion);
        Evaluacion = findViewById(R.id.ratingEva);

        txtNombre.setText(restaurantes.get(posicionLista).getNombre());
        txtDescripcion.setText(restaurantes.get(posicionLista).getDescripcion());
        txtAddress.setText(restaurantes.get(posicionLista).getDireccion_tel());

        imgRestaurante.setImageResource(restaurantes.get(posicionLista).getImg());

        Evaluacion.setRating(restaurantes.get(posicionLista).getCalif());


    }

    @Override
    public void onBackPressed() {
        restaurantes.get(posicionLista).setCalif(Evaluacion.getRating());
        arrayAdapter.notifyDataSetChanged();
        super.onBackPressed();
    }
}
