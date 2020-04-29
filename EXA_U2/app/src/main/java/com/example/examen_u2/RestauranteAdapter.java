package com.example.examen_u2;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

public class RestauranteAdapter extends ArrayAdapter<Restaurante> {

    private List<Restaurante> listaDeRestaurantes;
    private Context context;
    private int resource;

    public RestauranteAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull Restaurante[] objects) {
        super(context, resource, textViewResourceId, objects);
    }
}
