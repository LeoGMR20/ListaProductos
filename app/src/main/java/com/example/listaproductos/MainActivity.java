package com.example.listaproductos;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.listaproductos.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //Binding tiene un objeto que mapea tu layout
    //Generalmento lo asocia al nombre del layout con la
    //terminacion Binding
    //Vas a pillar un tipo de dato objeto ocn la referencia
    //de tu layout y terminado en Binding

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //Referenciar tu variable Binding consandola con el layout
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnProcesar.setOnClickListener(view -> {
            procesarDato();
        });
    }

    private void procesarDato() {
        String nombre = binding.etNombre.getText().toString();
        binding.txtResultado.setText(nombre);
    }

}