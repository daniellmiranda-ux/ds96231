import java.lang.instrument.ClassFileTransformer;
import java.nio.channels.ClosedByInterruptException;

public class Main { 
    /**
     * @param args
     */
    public static void main(String[]args) {
       // String nome;
       // int idade;

       // Nome = "Marta";
       // idade = 22;

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Marta");
        cliente1.setIdade(22);

        Pet pet1 =  new Pet();
        pet1.setRaça("Pitbul");
        pet1.setIdade(4);

        Livro livro1 = new Livro();
        livro1.setNome("diario de um banana");
        livro1.setPreco(100);

        Funcionario funcionario1 = new Funcionario("dan", "professor", 1000);
    

        Aluno aluno1 = new Aluno("dan", "jose@gmial.com");
        System.out.println("Nome:" + aluno1.getNome());
        System.out.println ("Email:" +aluno1.getEmail());


        System.out.println ("Nome: " + cliente1.getNome());
        System.out.println("Idade:" + cliente1.getIdade());

        System.out.println ("Nome: " + pet1.getRaça());
        System.out.println("Idade:" + pet1.getIdade());

        System.out.println ("Nome: " + livro1.getNome());
        System.out.println("Idade:" + livro1.getPreco());

        System.out.println ("Nome: " + funcionario1.getNome());
        System.out.println("Idade:" + funcionario1.getCargo());
        System.out.println("Idade:" + funcionario1.getSalario());

        Livro2 livro3 = new Livro2("estrelas", "rhai", 100, 125);
        System.out.println("titulo" + livro3.getTitulo());
        System.out.println("autor" + livro3.getAutor());
        System.out.println("numerodepag" + livro3.getNumerodepag());
        System.out.println("preco" + livro3.getPreco());

        Livro2 livro5 = new Livro2("visca", "dan", 100, 125);
        System.out.println("titulo:" + livro5.getTitulo());
        System.out.println("autor:" + livro5.getAutor());
        System.out.println("numerodepag:" + livro5.getNumerodepag());
        System.out.println("preco:" + livro5.getPreco());







    }

    
}
