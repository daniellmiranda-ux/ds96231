public class Livro2 {
     private String titulo;
     private String autor;
     private int numerodepag;
     private double preco;


    
     public Livro2(String titulo, String autor, int numerodepag, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.numerodepag = numerodepag;
        this.preco = preco;
    }
     public String getTitulo() {
         return titulo;
     }
     public void setTitulo(String titulo) {
         this.titulo = titulo;
     }
     public String getAutor() {
         return autor;
     }
     public void setAutor(String autor) {
         this.autor = autor;
     }
     public int getNumerodepag() {
         return numerodepag;
     }
     public void setNumerodepag(int numerodepag) {
         this.numerodepag = numerodepag;
     }
     public double getPreco() {
         return preco;
     }
     public void setPreco(double preco) {
         this.preco = preco;
     } 




}
