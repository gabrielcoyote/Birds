package com.example.birds.model;

import java.io.Serializable;

public class Passaros implements Serializable {

    private String Nome;
    int fotoLocal;

    public Passaros(String nome, int fotoLocal) {
        Nome = nome;
        this.fotoLocal = fotoLocal;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getFotoLocal() {
        return fotoLocal;
    }

    public void setFotoLocal(int fotoLocal) {
        this.fotoLocal = fotoLocal;
    }

}

