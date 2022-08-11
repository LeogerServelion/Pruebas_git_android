package com.example.leogerproyecto16;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.io.FileDescriptor;
import java.io.PrintWriter;

public class MainActivity extends AppCompatActivity {
    //Creacion de variables
private EditText et1, et2;
    private String[] operacion={"Sumar", "Restar", "Multiplicar", "Dividir"};
private Spinner spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        spinner1=findViewById(R.id.spinner);

        ArrayAdapter<String>adaptador= new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, operacion);
        spinner1.setAdapter(adaptador);
    }


//Demostracion de resultados para la segunda actividad
    public void mostrarResultado(View v) {
        Intent intento1= new Intent(this, Actividad2.class);
        int valor1=Integer.parseInt(et1.getText().toString());
        int valor2=Integer.parseInt(et2.getText().toString());
String operacion=spinner1.getSelectedItem().toString();

intento1.putExtra("valor1", valor1 );
        intento1.putExtra("valor2", valor2 );
        intento1.putExtra("operacion", operacion );

        startActivity(intento1);
    }
}