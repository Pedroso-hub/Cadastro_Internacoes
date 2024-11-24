package com.example.internacoeshospitalares;

import static java.lang.Integer.parseInt;

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
import java.io.FileReader;
import java.util.ArrayList;

public class VerHistorico extends AppCompatActivity {





    private RecyclerView historico;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_historico);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        ArrayList<Internacao> localDataset = new ArrayList<Internacao>();

        BufferedReader br = null;
        try {
            String sCurrentLine;
            int count = 0;
            br = new BufferedReader(new FileReader(getFilesDir()+"\\tabelaInternacoes.csv"));
            Log.d("sucesso", "arquivo lido com sucesso");
            sCurrentLine = br.readLine();
            Log.d("sucesso", sCurrentLine);

            while (sCurrentLine != null) {
                Log.d("sucesso", sCurrentLine);
                String[] dados = sCurrentLine.split(";");
                Internacao internacao = new Internacao(dados[0], dados[1], parseInt(dados[2]), parseInt(dados[3]), dados[4], dados[5] );
                localDataset.add(internacao);
                count++;

                sCurrentLine = br.readLine();

            }
        } catch (Exception e) {
            Toast erroLeitura = Toast.makeText(VerHistorico.this, "erro ao ler/converter dados", Toast.LENGTH_SHORT);
            erroLeitura.show();
        } finally {
            try {
                if (br != null)br.close();
            } catch (Exception ex) {
                Toast erroFechar = Toast.makeText(VerHistorico.this, "erro ao fechar arquivo", Toast.LENGTH_SHORT);
                erroFechar.show();
            }
        }

        final InternacaoRecyclerAdapter adapter = new InternacaoRecyclerAdapter(localDataset);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));











    }



}