package com.example.internacoeshospitalares;

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
        return InternacaoViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(InternacaoViewHolder holder, int position) {
        Internacao current = localDataset.get(position);
        holder.bind(current.getNome(), current.getSexo(), current.getIdade(), current.getCpf()
        , current.getHospital(), current.getMunicipio());
    }

    @Override
    public int getItemCount(){
        return localDataset.size();
    }


}
