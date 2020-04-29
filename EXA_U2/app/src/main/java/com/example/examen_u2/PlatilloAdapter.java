package com.example.examen_u2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class PlatilloAdapter extends ArrayAdapter<Platillo> {

    Platillo[] platillos;
    Context context;
    int resource;

    public PlatilloAdapter(@NonNull Context context, int resource, @NonNull Platillo[] platillos) {
        super(context, resource, platillos);
        this.platillos = platillos;
        this.context = context;
        this.resource = resource;

    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {//PRIMERA VEZ, HAY QUE CREAR EL LAYOUT
            convertView = ((Activity) context).getLayoutInflater().inflate(resource, parent, false);
        }


}
