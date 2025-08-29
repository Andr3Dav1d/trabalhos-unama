package encapsulamento.projlivro;

public class Livro {
    String titulo, autor;
    boolean disponivel;

    Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("Você pediu emprestado o livro %s.".formatted(this.titulo));
        } else {
            System.out.println("O livro %s já foi emprestado.".formatted(this.titulo));
        }
    }

    public void devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
            System.out.println("Você devolveu o livro %s.".formatted(this.titulo));
        } else {
            System.out.println("O livro %s já estava disponível.".formatted(this.titulo));
        }
    }
}
