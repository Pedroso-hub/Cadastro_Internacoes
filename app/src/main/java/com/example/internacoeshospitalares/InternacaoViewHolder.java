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

class InternacaoViewHolder extends RecyclerView.ViewHolder {
    private TextView txtNome;
    private TextView txtSexo;
    private TextView txtIdade;
    private TextView txtCpf;
    private TextView txtHospital;
    private TextView txtMunicipio;

    private InternacaoViewHolder(View itemView) {
        super(itemView);
        txtNome = itemView.findViewById(R.id.textViewNome);
        txtSexo = itemView.findViewById(R.id.textViewSexo);
        txtIdade = itemView.findViewById(R.id.textViewIdade);
        txtCpf = itemView.findViewById(R.id.textViewCpf);
        txtHospital = itemView.findViewById(R.id.textViewHospital);
        txtMunicipio = itemView.findViewById(R.id.textViewMunicipio);

    }


    //coloca o texto no layout
    
    public void bind(String nome,  String sexo,  int idade,  int cpf,  String hospital,  String municipio) {
        txtNome.setText(nome);
        txtSexo.setText(sexo);
        txtIdade.setText(idade);
        txtCpf.setText(cpf);
        txtHospital.setText(hospital);
        txtMunicipio.setText(municipio);
    }

    //Viewgroup é a superclasse de todos os Layouts
    //"the layout inflater object turns a layout XML file into its
    //corresponding view object using the layout id received from the ArrayBookAdapter
    //constructor." Android for java programmers, 2022

    static InternacaoViewHolder create(ViewGroup parent) {
        //vamos attach essa View ao ViewGroup "parent", passado como parâmetro
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_historico_item, parent, false);
        return new InternacaoViewHolder(view);
    }
}

