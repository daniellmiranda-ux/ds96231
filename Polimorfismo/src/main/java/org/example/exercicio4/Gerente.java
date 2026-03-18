package org.example.exercicio4;

import org.example.exer1.Funcionario;

public class Gerente extends CargoDeConfianca implements Contratacao {
    public Gerente(String nome, String cpf, String dataNascimento, double salarioBase) {
        super(nome, cpf, dataNascimento, salarioBase);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Contratando:"+ funcionario.getNome());
    }

    @Override
    public void demitir(org.example.exercicio4.Funcionario funcionario) {
        System.out.println("Desligando:"+ funcionario.getNome());

    }

    @Override
    public double obterSalarioFinal() {
        return Beneficiario.GERENTE.getValor() * super.salarioBase;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "beneficiario=" + beneficiario +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + obterSalarioFinal() +
                '}';
    }
}
