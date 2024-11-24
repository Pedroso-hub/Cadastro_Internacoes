package com.example.internacoeshospitalares;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "tabela_internacao")
public class Internacao {
    @NonNull
    private String nome;
    @NonNull
    private String sexo;
    @NonNull
    private int idade;
    @NonNull
    @PrimaryKey
    private int cpf;
    @NonNull
    private String hospital;
    @NonNull
    private String municipio;


    public Internacao(@NonNull String nome,@NonNull String sexo,@NonNull int idade,@NonNull int cpf,@NonNull String hospital,@NonNull String municipio){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.cpf = cpf;
        this.hospital = hospital;
        this.municipio = municipio;
    }

    @NonNull
    public String getNome() {
        return nome;
    }

    @NonNull
    public String getSexo() {
        return sexo;
    }
    @NonNull
    public int getIdade() {
        return idade;
    }
    @NonNull
    public int getCpf() {
        return cpf;
    }

    @NonNull
    public String getHospital() {
        return hospital;
    }

    @NonNull
    public String getMunicipio() {
        return municipio;
    }
}
