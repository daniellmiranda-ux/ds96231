package ort.exemple.att3;

public class DispositivodeArmazenamento extends Aparelhos {
    private String capacidadedeArmazenamento;
    private String tipoConexao;

    public DispositivodeArmazenamento(String marca, String modelo, String capacidadedeArmazenamento, String tipoConexao) {
        super(marca, modelo);
        this.capacidadedeArmazenamento = capacidadedeArmazenamento;
        this.tipoConexao = tipoConexao;
    }

    public String getCapacidadedeArmazenamento() {
        return capacidadedeArmazenamento;
    }

    public void setCapacidadedeArmazenamento(String capacidadedeArmazenamento) {
        this.capacidadedeArmazenamento = capacidadedeArmazenamento;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    @Override
    public String toString() {
        return "DispositivodeArmazenamento{" +
                "capacidadedeArmazenamento='" + capacidadedeArmazenamento + '\'' +
                ", tipoConexao='" + tipoConexao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
