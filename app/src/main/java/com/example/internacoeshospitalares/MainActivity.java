package com.example.internacoeshospitalares;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    public void irParaTelaAdicionar(View view){
        Intent intent = new Intent( this, AdicionarInternacao.class);
        startActivity(intent);
    }

    public void irParaTelaDarAlta(View view){
        Intent intent = new Intent( this, DarAlta.class);
        startActivity(intent);
    }

    public void irParaTelaHistorico(View view){
        Intent intent = new Intent( this, VerHistorico.class);
        startActivity(intent);
    }
}