package org.example.att5;

public class Diretor extends CargodeConfianca implements Contratacao {
    private final double PREMIO = 1.1;

    public Diretor(String nome, String cpf, String dataNascimento, double salarioBase, String dataAdmissao, String rg, Sexo sexo, Bonificaçao bonificaçao) {
        super(nome, cpf, dataNascimento, salarioBase, dataAdmissao, rg, sexo, bonificaçao);
    }

}
