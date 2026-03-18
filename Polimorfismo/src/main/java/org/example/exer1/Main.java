package org.example.exer1;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("Dan","09/08",Sexo.OPERACOES,Setor.FEMININO,5000,"7852242");
        DIretor dIretor = new DIretor("Dan","10/02",Sexo.FINANCEIRO,Setor.MASCULINO,5000);

        System.out.println(motoboy);
        System.out.println(dIretor);


    }
}
