package org.example.att5;

import org.example.exercicio4.Gerente;
import org.example.exercicio4.Motoboy;

public class Main {
    public static void main(String[] args) {
        org.example.exercicio4.Motoboy motoboy = new Motoboy("DANIEL", "524522", "07/09", 9000, "524512");
        org.example.exercicio4.Gerente gerente = new Gerente("dan", "524522", "09/07", 1200);


        System.out.println(motoboy);
        System.out.println(gerente);

        gerente.demitir(motoboy);

    }
}
