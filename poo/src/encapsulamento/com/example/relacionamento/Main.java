package com.example.relacionamento;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(55,"Dan",19,"71999639107",
                "dan@gmail.com",Sexo.MASCULINO,
                new Endereco("rua C","55","casa verde","43805310","Candeias",
                        UnidadeFederativa.BAHIA));
        System.out.println(pessoa1.toString());
    }
}
