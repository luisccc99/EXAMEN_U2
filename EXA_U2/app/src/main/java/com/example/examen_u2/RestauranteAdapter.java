package com.example.examen_u2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

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
        //ConvertView representa mi layout creado
        if (convertView ==null){ //Primera vez que se ejecuta el layout
            convertView = ((Activity) context).getLayoutInflater().inflate(resource, parent,false);
        }
        //Hay que recuperar los componentes
        TextView txtNombre, txtDesc, txtAddress;
        ImageView imgRestaurante;
        RatingBar califRestaurante;

        txtNombre = convertView.findViewById(R.id.Name_Restaurante);
        txtDesc = convertView.findViewById(R.id.desc_Restaurante);
        txtAddress = convertView.findViewById(R.id.address_Restaurante);

        imgRestaurante = convertView.findViewById(R.id.img_Restaurante);

        califRestaurante = convertView.findViewById(R.id.calif_Restaurante);


        txtNombre.setText(getItem(position).getNombre());
        txtDesc.setText(getItem(position).getDescripcion());
        txtAddress.setText(getItem(position).getDireccion_tel());
        imgRestaurante.setImageResource(getItem(position).getImg());
        califRestaurante.setRating(getItem(position).getCalif());
        return convertView;
    }
}
