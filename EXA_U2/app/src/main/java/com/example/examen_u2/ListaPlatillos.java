package com.example.examen_u2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListaPlatillos extends AppCompatActivity {

    ListView listPlatillo;
    Platillo[] platillos = {
            new Platillo(R.drawable.enchilada),
            new Platillo(R.drawable.mole),
            new Platillo(R.drawable.ensalada),
            new Platillo(R.drawable.comidarapida),
            new Platillo(R.drawable.tlacoyo)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_platillos);
        listPlatillo = findViewById(R.id.listPlatillo);
       listPlatillo.setAdapter(new PlatilloAdapter(this, R.layout.item_platillo, platillos));
       listPlatillo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


              Intent devolverImagen = new Intent();
              devolverImagen.putExtra("platilloSeleccionado",platillos[position].getImageId());

              setResult(Activity.RESULT_OK,devolverImagen);
              finish();


           }
       });





    }


}
