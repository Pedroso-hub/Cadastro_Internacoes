package com.example.internacoeshospitalares;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;



public class Internacao {

    private String nome;

    private String sexo;

    private int idade;

    private int cpf;

    private String hospital;

    private String municipio;


    public Internacao( String nome, String sexo, int idade, int cpf, String hospital, String municipio){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.cpf = cpf;
        this.hospital = hospital;
        this.municipio = municipio;
    }


    public String getNome() {
        return nome;
    }


    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public int getCpf() {
        return cpf;
    }


    public String getHospital() {
        return hospital;
    }


    public String getMunicipio() {
        return municipio;
    }
}
