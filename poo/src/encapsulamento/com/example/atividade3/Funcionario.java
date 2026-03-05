package com.example.atividade3;

public class Funcionario {
    private String codigoDoFuncionario;
    private String Nome;
    private String Endereco;
    private String Telefone;
    private String Email;
    private Contabancaria contabancaria;

    public Funcionario(String codigoDoFuncionario, String nome, String endereco, String telefone, String email, Contabancaria contabancaria) {
        this.codigoDoFuncionario = codigoDoFuncionario;
        Nome = nome;
        Endereco = endereco;
        Telefone = telefone;
        Email = email;
        this.contabancaria = contabancaria;
    }

    public String getCodigoDoFuncionario() {
        return codigoDoFuncionario;
    }

    public void setCodigoDoFuncionario(String codigoDoFuncionario) {
        this.codigoDoFuncionario = codigoDoFuncionario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Contabancaria getContabancaria() {
        return contabancaria;
    }

    public void setContabancaria(Contabancaria contabancaria) {
        this.contabancaria = contabancaria;
    }
}
