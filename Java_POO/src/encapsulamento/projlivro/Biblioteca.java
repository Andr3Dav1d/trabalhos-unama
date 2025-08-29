package encapsulamento.projlivro;

public class Biblioteca {
    private Livro[] livros;
    private int contador;

    public Biblioteca(int capacidade) {
        this.livros = new Livro[capacidade];
        this.contador = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (contador < livros.length) {
            livros[contador] = livro;
            contador++;
            System.out.println("Livro '" + livro.getTitulo() + "' adicionado com sucesso.");
        } else {
            System.out.println("A biblioteca está cheia. Não é possível adicionar mais livros.");
        }
    }

    public void emprestarLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                if (livros[i].isDisponivel()) {
                    livros[i].emprestar();
                    System.out.println("Livro '" + titulo + "' emprestado com sucesso.");
                    return;
                } else {
                    System.out.println("O livro '" + titulo + "' já está emprestado.");
                    return;
                }
            }
        }
        System.out.println("Livro '" + titulo + "' não encontrado.");
    }

    public void devolverLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                if (!livros[i].isDisponivel()) {
                    livros[i].devolver();
                    System.out.println("Livro '" + titulo + "' devolvido com sucesso.");
                    return;
                } else {
                    System.out.println("O livro '" + titulo + "' já está disponível.");
                    return;
                }
            }
        }
        System.out.println("Livro '" + titulo + "' não encontrado.");
    }

    public void mostrarLivros() {
        System.out.println("--- Lista de Livros ---");
        for (int i = 0; i < contador; i++) {
            String status = livros[i].isDisponivel() ? "Disponível" : "Emprestado";
            System.out.println("Título: " + livros[i].getTitulo() + " | Autor: " + livros[i].getAutor() + " | Status: " + status);
        }
        if (contador == 0) {
            System.out.println("Nenhum livro cadastrado.");
        }
    }
}
