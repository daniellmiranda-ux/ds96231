package org.example.exer1;

public enum Setor {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}

