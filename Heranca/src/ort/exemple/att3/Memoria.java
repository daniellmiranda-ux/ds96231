package ort.exemple.att3;

public class Memoria extends Aparelhos{
    private String capacidadedeArmazenamento;

    public Memoria(String marca, String modelo, String capacidadedeArmazenamento) {
        super(marca, modelo);
        this.capacidadedeArmazenamento = capacidadedeArmazenamento;
    }

    public String getCapacidadedeArmazenamento() {
        return capacidadedeArmazenamento;
    }

    public void setCapacidadedeArmazenamento(String capacidadedeArmazenamento) {
        this.capacidadedeArmazenamento = capacidadedeArmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidadedeArmazenamento='" + capacidadedeArmazenamento + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
