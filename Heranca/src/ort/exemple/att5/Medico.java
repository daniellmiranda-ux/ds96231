package ort.exemple.att5;

public class Medico extends Funcionario{
    private String cm;

    public Medico(String nome, String email, float salario, Endereco endereco, String cm) {
        super(nome, email, salario, endereco);
        this.cm = cm;
    }

    public String getCm() {
        return cm;
    }

    public void setCm(String cm) {
        this.cm = cm;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "cm='" + cm + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", salario=" + salario +
                ", endereco=" + endereco +
                '}';
    }
}
