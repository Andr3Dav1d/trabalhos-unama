package ProjetoLivraria;

public class Livro {
    String titulo, genero;
    int numeroPaginas, anoPublicacao;
    double preco;
    int descontoAplicado;

    Livro (String titulo, String genero, int numeroPaginas, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.descontoAplicado = 0;
    }

    public void imprimirNaTela () {
        System.out.println("-------------LIVRO-------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Número de páginas: " + this.numeroPaginas);
        System.out.println("Ano de publicação: " + this.anoPublicacao);
        if (descontoAplicado > 0) {
            System.out.printf("Preço: R$%.2f (Com desconto de %d%) \n", this.preco, descontoAplicado);
        } else {
            System.out.printf("Preço: R$%.2f\n", this.preco);
        }
        System.out.println("-------------------------------");
    }

    void cadastrar () {
        System.out.println("Cadastrando no banco de dados");
    }

    double calcFrete (String cep) {
        double valorFrete = cep.startsWith("66") ? 15.00 : 30.00;
        System.out.println("Calculando frete para o CEP " + cep);
        return valorFrete;
    }

    void vender() {
        System.out.printf("Vendendo livro por R$%.2f", preco);
    }

    String trocar () {
        return "Livro Trocado!";
    }
}
