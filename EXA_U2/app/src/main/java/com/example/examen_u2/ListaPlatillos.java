package com.example.examen_u2;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListaPlatillos extends AppCompatActivity {

    ListView listPlatillo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_imagenes);
        listPlatillo = findViewById(R.id.listPlatillo);

    }

    Platillo[] platillos = {new Platillo(R.drawable.enchilada), new Platillo(R.drawable.mole)
            , new Platillo(R.drawable.ensalada), new Platillo(R.drawable.comidarapida), new Platillo(R.drawable.tlacoyo)};
}
