package com.example.attprova.model.enuns;

public enum Setor {
    FINANCEIRO("Financeiro"),
    RECURSOS_HUMANOS("RecursosHumanos"),
    VENDAS("Vendas"),
    MARKETING("Marketing");

    private String nome;

    Setor(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}