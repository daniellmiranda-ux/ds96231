package org.example.exer1;

public class DIretor  extends Funcionario implements Contratacao{
    private final double PREMIO = 0.2;

    public DIretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
    }

    @Override
    public double getSalarioBase() {
        double salarioFinal= super.salarioBase;
        salarioFinal +=super.salarioBase * this.PREMIO;
        return salarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Contratando:"+ funcionario.getNome());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Desligado" + funcionario.getNome());


    }

    @Override
    public String toString() {
        return "DIretor{" +
                "PREMIO=" + PREMIO +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salarioBase=" + salarioBase +
                '}';
    }
}

