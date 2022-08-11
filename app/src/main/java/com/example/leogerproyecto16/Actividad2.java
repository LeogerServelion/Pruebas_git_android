package com.example.leogerproyecto16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        tv1=findViewById(R.id.tv1);
        Bundle datos= getIntent().getExtras();
        int valor1= datos.getInt("valor1");
        int valor2= datos.getInt("valor2");
        String op= datos.getString("operacion");
        switch (op){

            case "Sumar": int suma= valor1 + valor2;
            tv1.setText(valor1 +"+"+valor2 +"="+suma ); break;

            case "Restar": int resta= valor1 - valor2;
                tv1.setText(valor1 +"-"+valor2 +"="+resta );
                break;
            case "Multiplicar": int multi= valor1 * valor2;
                tv1.setText(valor1+ "*"+valor2 +"="+multi );
                break;
            case "Dividir": int div= valor1 / valor2;
                tv1.setText(valor1 +"/"+valor2 +"="+div );
                break;
        }
    }

    public void retornar(View view) {
        finish();
    }
}