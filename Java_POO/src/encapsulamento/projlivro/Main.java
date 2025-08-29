package encapsulamento.projlivro;

public class Main {
    public static void main(String[] args) {
        Biblioteca minhaBiblioteca = new Biblioteca(5);

        minhaBiblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien"));
        minhaBiblioteca.adicionarLivro(new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling"));
        minhaBiblioteca.adicionarLivro(new Livro("1984", "George Orwell"));

        minhaBiblioteca.mostrarLivros();

        System.out.println("\n--- Realizando operações ---");

        minhaBiblioteca.emprestarLivro("1984");

        minhaBiblioteca.mostrarLivros();

        minhaBiblioteca.devolverLivro("1984");

        minhaBiblioteca.mostrarLivros();
    }
}
