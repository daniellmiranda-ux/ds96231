package org.example.exercicio4;

public abstract class CargoDeConfianca extends Funcionario{
    protected Beneficiario beneficiario;

    public CargoDeConfianca(String nome, String cpf, String dataNascimento, double salarioBase) {
        super(nome, cpf, dataNascimento, salarioBase);
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }
}
