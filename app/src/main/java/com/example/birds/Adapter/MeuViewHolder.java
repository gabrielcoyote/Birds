package com.example.birds.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.birds.R;
import com.example.birds.model.Passaros;

public class MeuViewHolder extends RecyclerView.ViewHolder {

    public ImageView imagem;
    public TextView titulo;


    public MeuViewHolder(@NonNull View itemView) {
        super(itemView);

        imagem = itemView.findViewById(R.id.imagem_passaro);
        titulo = itemView.findViewById(R.id.nome_passaro);

    }
    public void bind(final Passaros item, final MeuAdaptador.OnItemClickListener listener){

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(item);
            }
        });

    }

}