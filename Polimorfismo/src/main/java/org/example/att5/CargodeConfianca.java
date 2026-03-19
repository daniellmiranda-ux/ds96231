package org.example.att5;

public  abstract class  CargodeConfianca extends Funcionario{
    protected Bonificaçao bonificaçao;

    public CargodeConfianca(String nome, String cpf, String dataNascimento, double salarioBase, String dataAdmissao, String rg, Sexo sexo, Bonificaçao bonificaçao) {
        super(nome, cpf, dataNascimento, salarioBase, dataAdmissao, rg, sexo);
        this.bonificaçao = bonificaçao;
    }

    public Bonificaçao getBonificaçao() {
        return bonificaçao;
    }

    public void setBonificaçao(Bonificaçao bonificaçao) {
        this.bonificaçao = bonificaçao;
    }

    public abstract double getSalarioFinal();
}
