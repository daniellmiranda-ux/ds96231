package org.example.exercicio4;

public class Main  {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("DANIEL", "524522", "07/09", 9000, "524512");
        Gerente gerente = new Gerente("dan", "524522", "09/07", 1200);


        System.out.println(motoboy);
        System.out.println(gerente);

        gerente.demitir(motoboy);

    }
}
