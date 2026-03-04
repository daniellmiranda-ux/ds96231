package com.example.atividade1;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua B","55","Salvador");
        Cliente cliente1 = new Cliente("Marta",25, endereco1);

        System.out.println("Nome:"+ cliente1.getNome());
        System.out.println("Nome:"+ cliente1.getIdade());
        System.out.println();
        System.out.println("Nome:"+ cliente1.getEndereco().getLogradouro());
        System.out.println("Nome:"+ cliente1.getEndereco().getCidade());
        System.out.println("Nome:"+ cliente1.getEndereco().getNumero());

    }
}
