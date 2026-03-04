package com.example.atividade2;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marta",23,
            new Pet("Toto",4,"caramelo"));

        System.out.println("Nome:"+cliente1.getNome());
        System.out.println("Nome:" + cliente1.getIdade());
        System.out.println();
        System.out.println("Nome do pet:" + cliente1.getPet().getNome());
        System.out.println("Nome do pet:" + cliente1.getPet().getRaca());
        System.out.println("Nome do pet:" + cliente1.getPet().getIdade());




    }
}
