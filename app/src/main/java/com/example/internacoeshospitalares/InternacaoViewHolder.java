package com.example.internacoeshospitalares;
//aqui eh definido o ViewHolder do RecyclerView, que vai apresentar o nosso banco de dados
//RecyclerView é um componente complexo do android Jetpack, que nos permite ter uma visão parcial de um
//conjunto de dados
//esse componente faz parte do Material Design, do google
//ver <https://developer.android.com/develop/ui/views/layout/recyclerview>
//cada objeto da lista do recycler view, é um ViewHolder
//"After the view holder is created, the RecyclerView binds it to its data."
//esse processo de binding da data c o recycler view eh feito por meio de um Adapter, de maneira
//similar ao que foi feito com o spinner, na tela/view de cadastro


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class InternacaoViewHolder extends RecyclerView.ViewHolder {
    private TextView txtNome;
    private TextView txtSexo;
    private TextView txtIdade;
    private TextView txtCpf;
    private TextView txtHospital;
    private TextView txtMunicipio;

    InternacaoViewHolder(View itemView) {
        super(itemView);
        txtNome = itemView.findViewById(R.id.textViewNome);
        txtSexo = itemView.findViewById(R.id.textViewSexo);
        txtIdade = itemView.findViewById(R.id.textViewIdade);
        txtCpf = itemView.findViewById(R.id.textViewCpf);
        txtHospital = itemView.findViewById(R.id.textViewHospital);
        txtMunicipio = itemView.findViewById(R.id.textViewMunicipio);

    }

    public TextView getTxtNome() {
        return txtNome;
    }

    public TextView getTxtSexo() {
        return txtSexo;
    }

    public TextView getTxtIdade() {
        return txtIdade;
    }

    public TextView getTxtCpf() {
        return txtCpf;
    }

    public TextView getTxtHospital() {
        return txtHospital;
    }

    public TextView getTxtMunicipio() {
        return txtMunicipio;
    }
}

