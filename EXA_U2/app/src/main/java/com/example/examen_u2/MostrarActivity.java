package com.example.examen_u2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        final List<Restaurante> restaurantes = new ArrayList<Restaurante>(Arrays.asList(restaurantesPorDefault));

        ArrayAdapter<Restaurante> arrayAdapter = new RestauranteAdapter(MostrarActivity.this, R.layout.item_restaurante, (ArrayList<Restaurante>) restaurantes);

arrayAdapter.notifyDataSetChanged();
        listRestautante = findViewById(R.id.listRest);
        listRestautante.setAdapter(arrayAdapter);
        listRestautante.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent restauranteSelec = new Intent();
                restauranteSelec.putExtra("Restaurante Seleccionado", restaurantes.getPosition);
                setResult(Activity.RESULT_OK,restauranteSelec);
                finish();
            }
        });
    }
}
