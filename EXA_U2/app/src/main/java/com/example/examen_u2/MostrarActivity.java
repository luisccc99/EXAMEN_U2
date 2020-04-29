package com.example.examen_u2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostrarActivity extends AppCompatActivity {
    ListView listRestautante;
    Restaurante[] restaurantesPorDefault = {
            new Restaurante("Mercado Reforma", "Breakfast Outdoor seating", "Periferico de la Juventud 5700", R.drawable.platillo, 3),
            new Restaurante("Mercado Reforma", "Breakfast Outdoor seating", "Periferico de la Juventud 5700", R.drawable.platillo, 3),
            new Restaurante("Mercado Reforma", "Breakfast Outdoor seating", "Periferico de la Juventud 5700", R.drawable.platillo, 3),
            new Restaurante("Mercado Reforma" , "Breakfast Outdoor seating", "Periferico de la Juventud 5700",R.drawable.platillo , 3),
            new Restaurante("Mercado Reforma" , "Breakfast Outdoor seating", "Periferico de la Juventud 5700",R.drawable.platillo , 3)
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_restaurantes);
        List<Restaurante> restaurantes = new ArrayList<Restaurante>(Arrays.asList(restaurantesPorDefault));

        ArrayAdapter<Restaurante> arrayAdapter = new RestauranteAdapter(MostrarActivity.this, R.layout.item_restaurante, (ArrayList<Restaurante>) restaurantes);

arrayAdapter.notifyDataSetChanged();
        listRestautante = findViewById(R.id.listRest);
        listRestautante.setAdapter(arrayAdapter);
    }
}
