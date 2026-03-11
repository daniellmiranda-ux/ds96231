package ort.exemple.att3;

import ort.exemple.att1.Memoria;
import ort.exemple.att1.Processador;

public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador("Iphone","Iphone 12","ASAKW");
        PlacaMae placaMae = new PlacaMae("Apple","ATX","KKKK");
        Memoria memoria = new Memoria("Intel","ATX","54G");
        DispositivodeArmazenamento dispositivodeArmazenamento = new DispositivodeArmazenamento("intel","APX","87G","Wifi");

        System.out.println(processador);
        System.out.println(placaMae);
        System.out.println(memoria);
        System.out.println(dispositivodeArmazenamento);
    }
}
