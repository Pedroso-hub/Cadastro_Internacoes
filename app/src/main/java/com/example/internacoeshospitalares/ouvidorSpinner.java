package com.example.internacoeshospitalares;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.content.Context;

public class ouvidorSpinner implements AdapterView.OnItemSelectedListener{
    public String texto;
@Override
public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    String sexoSelecionado = parent.getItemAtPosition(position).toString();
    Toast alerta = Toast.makeText(view.getContext(), sexoSelecionado, Toast.LENGTH_SHORT);
    alerta.show();
    this.texto = sexoSelecionado;
}

@Override
public void onNothingSelected(AdapterView<?> parent) {

}
}
