package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pais {

    private String nome;
    private List<Estado> listEstados;

    public Pais(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Estado> getListEstados() {
        return listEstados;
    }

    public void setListEstados(List<Estado> listEstados) {
        this.listEstados = listEstados;
    }

    @Override
    public String toString() {
        return nome;
    }
}
