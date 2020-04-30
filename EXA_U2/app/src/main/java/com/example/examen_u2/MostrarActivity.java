package com.example.examen_u2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostrarActivity extends AppCompatActivity {
    ListView listRestautante;
    final int Rest = 10;
    public static ArrayAdapter<Restaurante> arrayAdapter;
    public static ArrayList<Restaurante> restaurantes;
    Restaurante[] restaurantesPorDefault = {
            new Restaurante("Mercado Uno", "Breakfast Outdoor seating", "Periferico de la Juventud 5700", R.drawable.platillo, 3),
            new Restaurante("Mercado Dos", "Breakfast Outdoor seating", "Periferico de la Juventud 5700", R.drawable.platillo, 3),
            new Restaurante("Mercado Tres", "Breakfast Outdoor seating", "Periferico de la Juventud 5700", R.drawable.platillo, 3),
            new Restaurante("Mercado Cuatro" , "Breakfast Outdoor seating", "Periferico de la Juventud 5700",R.drawable.platillo , 3),
            new Restaurante("Mercado Cinco" , "Breakfast Outdoor seating", "Periferico de la Juventud 5700",R.drawable.platillo , 3)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_restaurantes);
        restaurantes = new ArrayList<Restaurante>(Arrays.asList(restaurantesPorDefault));

        arrayAdapter = new RestauranteAdapter(MostrarActivity.this, R.layout.item_restaurante, (ArrayList<Restaurante>) restaurantes);

        listRestautante = findViewById(R.id.listRest);

        arrayAdapter.notifyDataSetChanged();

        listRestautante.setAdapter(arrayAdapter);

        listRestautante.setFocusable(false);
        listRestautante.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),"ListView Item: "+position,Toast.LENGTH_SHORT).show();
                Intent EvaluarRestaurante = new Intent(MostrarActivity.this,EvaluacionRestaurante.class);
                EvaluarRestaurante.putExtra("IndexList",position);
                startActivity(EvaluarRestaurante);
            }
        });
        listRestautante.requestFocus();
    }

    public static ArrayAdapter<Restaurante> obtenerAdapter(){
        return arrayAdapter;
    }

    public static List<Restaurante> obtenerLista(){
        return restaurantes;
    }

    public static void actualizarLista(){
        arrayAdapter.notifyDataSetChanged();
    }
}
