package com.example.internacoeshospitalares;


import static java.lang.Integer.parseInt;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;


import android.util.Log;
import android.view.View;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class AdicionarInternacao extends AppCompatActivity {
    private Button botaoCadastrar ;
    private  EditText inputNome ;
    private  EditText inputIdade;
    private  EditText inputCpf ;
    private  EditText inputMunicipio;
    private  EditText inputData;
    private  EditText inputHospital;
    private Spinner sexo;

    private ouvidorSpinner ouvidor;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_internacao);
        //selecionar os componentes
        botaoCadastrar = findViewById(R.id.botaoCadastrar);
        inputNome = findViewById(R.id.inputNome);
        inputIdade = findViewById(R.id.inputIdade);
        inputCpf = findViewById(R.id.inputCpf);
        inputMunicipio = findViewById(R.id.inputMunicipio);
        inputData = findViewById(R.id.inputData);
        inputHospital = findViewById(R.id.inputHospital);
        sexo = findViewById(R.id.spinner);
        //para setar as escolhas de um spinner, eh necessário passa-las por meio de um SpinnerAdapter

        // cria um novo adaptador para o spinner, usando esta classe como contexto,
        //uma ArrayList de sexos, localizada no string resources, e um layout pré-definido de spinner básico
        //obs: spinners são os widgets usados para criar menus drop-down.
        //refs: "https://developer.android.com/develop/ui/views/components/spinner"

        ArrayAdapter<CharSequence>  adaptadorSexo= ArrayAdapter.createFromResource(
                this,
                    R.array.array_sexos,
                    android.R.layout.simple_spinner_item
                );
        //passa o adaptador para o spinner
        sexo.setAdapter(adaptadorSexo);
        ouvidor = new ouvidorSpinner();

        sexo.setOnItemSelectedListener(ouvidor);




    }





    public void clickarCadastrar(View view){

        String textoNome = inputNome.getText().toString();
        String textoSexo = ouvidor.texto;
        String textoIdade = inputIdade.getText().toString();
        String textoCpf = inputCpf.getText().toString();
        String textoHospital = inputHospital.getText().toString();
        String textoMunicipio = inputMunicipio.getText().toString();


        try{
            int idade = parseInt(textoIdade);
            int cpf = parseInt(textoCpf);
            Log.d("sucesso", "comecei");
            Internacao internacao = new Internacao(textoNome, textoSexo, idade, cpf, textoHospital, textoMunicipio);
            String s = textoNome+";"+textoSexo+";"+textoIdade+";"+textoCpf+";"+textoHospital+";"+textoMunicipio+"\n";
            try{
                FileOutputStream fileout=openFileOutput("mytextfile.txt", MODE_APPEND);
                OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
                outputWriter.write(s);
                outputWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }catch(Exception e){
            //caso não seja possivel converter a idade e o cpf, lança um alerta de erro
            Toast erro = Toast.makeText(view.getContext(), "erro ao cadastrar dados", Toast.LENGTH_SHORT);
            erro.show();


        }







    }


}