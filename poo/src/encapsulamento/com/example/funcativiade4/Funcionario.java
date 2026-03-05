package com.example.funcativiade4;

public class Funcionario {
    private String id;
    private String Nome;
    private double Salario;
    private Setor Setor;
    private Sexo Sexo;
    private int idade;

    public Funcionario(String id, String nome, double salario, com.example.funcativiade4.Setor setor, com.example.funcativiade4.Sexo sexo, int idade) {
        this.id = id;
        Nome = nome;
        Salario = salario;
        Setor = setor;
        Sexo = sexo;
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public com.example.funcativiade4.Setor getSetor() {
        return Setor;
    }

    public void setSetor(com.example.funcativiade4.Setor setor) {
        Setor = setor;
    }

    public com.example.funcativiade4.Sexo getSexo() {
        return Sexo;
    }

    public void setSexo(com.example.funcativiade4.Sexo sexo) {
        Sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id='" + id + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Salario=" + Salario +
                ", Setor=" + Setor +
                ", Sexo=" + Sexo +
                ", idade=" + idade +
                '}';
    }
}
