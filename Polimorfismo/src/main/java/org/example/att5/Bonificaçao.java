package org.example.att5;

public enum Bonificaçao {
    MASCULINO(1.2),
    DIRETOR(1.0);

    private final double valor;

    Bonificaçao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
