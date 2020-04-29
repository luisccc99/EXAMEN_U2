package com.example.examen_u2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent intent;                                                                                  //Generamos un Intent global que nos permitirá maipularlo según sea el caso del botón seleccionado
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v){                                                                    //Generé un método global para los 3 botones el cual coniene un switch case que va a determinar cual de los 3 botones se seleccionó mediante su ID
        switch (v.getId()){                                                                         //Aquí vamos a recuperar el ID del botón pulsado para compararlo con los ID de cada botón
            case R.id.btn_capture:
                Toast.makeText(this,"Capturar",Toast.LENGTH_SHORT).show();
                intent = new Intent(v.getContext(),CaptureActivity.class);                          //Generamos el Intent explicito ya que le indicamos que Activity va a ejecturar
                break;
            case R.id.btn_show:
                Toast.makeText(this,"Mostrar",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_exit:
                Toast.makeText(this,"Salir",Toast.LENGTH_SHORT).show();
        }
                                                                                                    /*En esta instrucción verificaremos el valor que es agregado al intent
                                                                                                    cada vez que se presiona el botón de back en alguna otra actividad
                                                                                                    y si contiene  un valor falso bajo el nombre "EXIT" va a proceder a finalizar la app*/
        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();}
        else
            startActivity(intent);                                                                  //Aqui ejecutamos el intent generado al presionar algún botón
    }
}
