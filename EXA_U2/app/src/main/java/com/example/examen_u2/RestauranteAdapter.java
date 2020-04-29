package com.example.examen_u2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RestauranteAdapter extends ArrayAdapter<Restaurante> {

    private List<Restaurante> listaDeRestaurantes;
    private Context context;
    private int resource;

    public RestauranteAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull ArrayList<Restaurante> objects) {
        super(context, resource, textViewResourceId, objects);
        this.context=context;
        this.resource=resource;
        this.listaDeRestaurantes= objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
