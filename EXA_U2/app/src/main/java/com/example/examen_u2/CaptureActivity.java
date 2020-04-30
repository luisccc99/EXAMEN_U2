package com.example.examen_u2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CaptureActivity extends AppCompatActivity {

     ArrayAdapter<Restaurante> arrayAdapter = MostrarActivity.obtenerAdapter();


    Intent obtnerImagen;

    final int IMAGEN = 18;
    int idImagen;
    int DEFAULT_ID_IMAGEN = R.drawable.platillo;


    EditText txt_Name;
    EditText txt_Desc;
    EditText txt_Direc_Num;
    Button btn_Save;
    ImageView imgRest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture);

        txt_Name = findViewById(R.id.txt_Name);
        txt_Desc = findViewById(R.id.txt_Desc);
        txt_Direc_Num = findViewById(R.id.txt_Address);
        btn_Save = findViewById(R.id.save);
        imgRest = findViewById(R.id.imgRest);
        final Intent imagen = new Intent();


        btn_Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!TextUtils.isEmpty(txt_Name.getText()) && !TextUtils.isEmpty(txt_Desc.getText()) && !TextUtils.isEmpty(txt_Desc.getText()))  {
                    Restaurante restaurante = new Restaurante(
                            txt_Name.getText().toString(), txt_Desc.getText().toString(),
                            txt_Direc_Num.getText().toString(), R.drawable.comidarapida, 2);
                    arrayAdapter.add(restaurante);

                } else {
                    Toast.makeText(getApplicationContext(), "Llena todos los campos por favor", Toast.LENGTH_SHORT).show();
                }

            }
        });
        imgRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent obtenerImagen = new Intent(getApplicationContext(),ListaPlatillos.class);

                startActivityForResult(obtenerImagen,IMAGEN);
            }
        });



        }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode){

            case IMAGEN:
                if(resultCode == Activity.RESULT_OK){
                    idImagen = data.getIntExtra("platilloSeleccionado",DEFAULT_ID_IMAGEN);
                    imgRest.setImageResource(idImagen);

                }
                break;
        }
    }
    /*Este método se activa cada vez que se presiona con el botón back del dispositivo
     * y al presionarlo vuelve a generar un intent para ir a la clase Main además
     * recibe la instrucción o bandera de borrar la actividad que esté en la parte superior de la
     * pila de memoria, agregando un valor booleano de que se ha cerrado y terminado el intent de esta actividad
     * esto se hace para no estár abriendo multiples ventana para evitar saturar la memoria del dispositivo*/





}


