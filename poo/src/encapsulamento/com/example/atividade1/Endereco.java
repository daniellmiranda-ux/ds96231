package com.example.atividade1;

public class Endereco {
    private String  logradouro;
    private String  numero;
    private String  cidade;

    public Endereco(java.lang.String logradouro, java.lang.String numero, java.lang.String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;

    }

    public java.lang.String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(java.lang.String logradouro) {
        this.logradouro = logradouro;
    }

    public java.lang.String getNumero() {
        return numero;
    }

    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }

    public java.lang.String getCidade() {
        return cidade;
    }

    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }
}
