package com.example.internacoeshospitalares;

import static java.lang.Integer.parseInt;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class VerHistorico extends AppCompatActivity {





    private RecyclerView historico;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_historico);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        ArrayList<Internacao> localDataset = new ArrayList<Internacao>();
        FileInputStream inputStream;
        try {
            inputStream = openFileInput("mytextfile.txt");
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] campos = linha.split(";");
                Internacao internacao = new Internacao(campos[0], campos[1], parseInt(campos[2]), parseInt(campos[3]), campos[4], campos[5]);
                localDataset.add(internacao);
                Log.d("sucesso", "internacao adicionada com sucesso: "+linha);
                Log.d("sucesso", localDataset.get(localDataset.size()-1).getNome());
            }
            scanner.close();


        } catch (Exception e) {

            throw new RuntimeException(e);
        }







        final InternacaoRecyclerAdapter adapter = new InternacaoRecyclerAdapter(localDataset);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));












    }



}