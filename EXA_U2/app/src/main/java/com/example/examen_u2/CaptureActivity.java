package com.example.examen_u2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class CaptureActivity extends AppCompatActivity {
public List<Restaurante> restaurantes;
int img_id;
EditText txt_Name;
EditText txt_Desc;
EditText txt_Direc_Num;
Button btn_Save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture);
        txt_Name = findViewById(R.id.txt_Name);
        txt_Desc = findViewById(R.id.txt_Desc);
        txt_Direc_Num = findViewById(R.id.txt_Address);
        btn_Save = findViewById(R.id.save);


    }
                                                                                                    /*Este método se activa cada vez que se presiona con el botón back del dispositivo
                                                                                                    * y al presionarlo vuelve a generar un intent para ir a la clase Main además
                                                                                                    * recibe la instrucción o bandera de borrar la actividad que esté en la parte superior de la
                                                                                                    * pila de memoria, agregando un valor booleano de que se ha cerrado y terminado el intent de esta actividad
                                                                                                    * esto se hace para no estár abriendo multiples ventana para evitar saturar la memoria del dispositivo*/

}
