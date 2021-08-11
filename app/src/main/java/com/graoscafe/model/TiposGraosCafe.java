package com.graoscafe.model;

import java.io.Serializable;

public class TiposGraosCafe implements Serializable {
    private String nome;

    public TiposGraosCafe(String nome) {
        this.nome=nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
