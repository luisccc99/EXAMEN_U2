package com.example.examen_u2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class CaptureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture);
    }
                                                                                                    /*Este método se activa cada vez que se presiona con el botón back del dispositivo
                                                                                                    * y al presionarlo vuelve a generar un intent para ir a la clase Main además
                                                                                                    * recibe la instrucción o bandera de borrar la actividad que esté en la parte superior de la
                                                                                                    * pila de memoria, agregando un valor booleano de que se ha cerrado y terminado el intent de esta actividad
                                                                                                    * esto se hace para no estár abriendo multiples ventana para evitar saturar la memoria del dispositivo*/
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("EXIT", true);
        startActivity(intent);
    }
}
