package org.example.exer1;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("Dan","09/08",Sexo.MASCULINO,Setor.OPERACOES,5000,"875521");
        DIretor dIretor = new DIretor("Dan","10/02",Sexo.FEMININO,Setor.FINANCEIRO,5000);

        System.out.println(motoboy);
        System.out.println(dIretor);


    }
}
