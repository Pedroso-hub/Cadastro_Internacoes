package com.example.internacoeshospitalares;

import static java.lang.Integer.parseInt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class InternacaoRecyclerAdapter extends RecyclerView.Adapter <InternacaoViewHolder> {

    private ArrayList<Internacao> localDataset;

    public InternacaoRecyclerAdapter(ArrayList<Internacao> dataSet) {
        this.localDataset = dataSet;
    }

    @Override
    public InternacaoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_historico_item, parent, false);
        InternacaoViewHolder holder = new InternacaoViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(InternacaoViewHolder holder, int position) {
        Internacao current = localDataset.get(position);
    holder.getTxtNome().setText("nome: "+current.getNome());
        holder.getTxtSexo().setText("sexo: "+current.getSexo());
        holder.getTxtIdade().setText("idade: "+String.valueOf(current.getIdade()));
        holder.getTxtCpf().setText("cpf: "+String.valueOf(current.getCpf()));
        holder.getTxtHospital().setText("hospital: "+current.getHospital());
        holder.getTxtMunicipio().setText("municipio: "+current.getMunicipio());

    }

    @Override
    public int getItemCount(){
        return localDataset.size();
    }


}
