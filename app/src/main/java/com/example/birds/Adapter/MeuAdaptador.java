package com.example.birds.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.birds.R;
import com.example.birds.model.Passaros;

import java.util.ArrayList;

public class MeuAdaptador extends RecyclerView.Adapter {

    ArrayList<Passaros> passaros;
    Context context;
    OnItemClickListener listener;

    public MeuAdaptador(ArrayList<Passaros> passaros , Context context, OnItemClickListener listener) {
        this.passaros = passaros;
        this.context = context;
        this.listener = listener;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.celula,parent,false);
        MeuViewHolder meuViewHolder = new MeuViewHolder(view);
        return meuViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MeuViewHolder meuViewHolder = (MeuViewHolder) holder;
        Passaros meuEpisodio = passaros.get(position);
        meuViewHolder.titulo.setText(meuEpisodio.getNome());
        meuViewHolder.imagem.setImageResource(passaros.get(position).getFotoLocal());

        meuViewHolder.bind(passaros.get(position), listener);

    }

    @Override
    public int getItemCount() {
        return passaros.size();
    }

    public  interface OnItemClickListener{
        void onItemClick(Passaros passaros);


    }

}