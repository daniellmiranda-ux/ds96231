import java.lang.instrument.ClassFileTransformer;
import java.nio.channels.ClosedByInterruptException;

public class Main { 
    Run|Debug
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
        livro1.setPreco(100)

        Funcionario Funcionario1 = new Funcionario();
        Funcionario1.setNome("daniel")
        Funcionario1.setCargo("inspetor de calculos");
        Funcionario1.setSalario(2000)


        System.out.println ("Nome: " + cliente1.getNome());
        System.out.println("Idade:" + cliente1.getIdade());

        System.out.println ("Nome: " + pet1.getRaça());
        System.out.println("Idade:" + pet1.getIdade());

        System.out.println ("Nome: " + livro1.getNome());
        System.out.println("Idade:" + livro1.getPreco());

        System.out.println ("Nome: " + Funcionario1.getNome());
        System.out.println("Idade:" + Funcionario1.getCargo());
        System.out.println("Idade:" + Funcionario1.getSalario());



    }

}
