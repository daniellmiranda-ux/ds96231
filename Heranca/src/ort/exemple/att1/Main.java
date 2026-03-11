package ort.exemple.att1;

public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador("SnapDragon","15","255");
        Memoria memoria = new Memoria("Appple","Iphone 12","128G");

        System.out.println(processador);
        System.out.println(memoria);
    }
}
