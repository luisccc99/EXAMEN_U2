package com.example.examen_u2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostrarActivity extends AppCompatActivity {

    Restaurante[] restaurantesPorDefault = {
            new Restaurante("Mercado Reforma", "Breakfast Outdoor seating", "Periferico de la Juventud 5700", R.drawable.platillo, 3),
            new Restaurante("Mercado Reforma", "Breakfast Outdoor seating", "Periferico de la Juventud 5700", R.drawable.platillo, 3),
            new Restaurante("Mercado Reforma", "Breakfast Outdoor seating", "Periferico de la Juventud 5700", R.drawable.platillo, 3),
            new Restaurante("Mercado Reforma" , "Breakfast Outdoor seating", "Periferico de la Juventud 5700",R.drawable.platillo , 3),
            new Restaurante("Mercado Reforma" , "Breakfast Outdoor seating", "Periferico de la Juventud 5700",R.drawable.platillo , 3)
    };

    List<Restaurante> restaurantes = new ArrayList<Restaurante>(Arrays.asList(restaurantesPorDefault));

    ArrayAdapter<Restaurante> arrayAdapter = new RestauranteAdapter(this, R.layout.item_restaurante, (ArrayList<Restaurante>) restaurantes);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_restaurantes);

    }
}
