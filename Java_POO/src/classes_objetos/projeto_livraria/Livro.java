package classes_objetos.projeto_livraria;

public class Livro {
    public String titulo, genero;
    public int numeroPaginas, anoPublicacao;
    public double preco;
    public int descontoAplicado;

    public Livro (String titulo, String genero, int numeroPaginas, int anoPublicacao, double preco) {
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
            System.out.printf("Preço: R$%.2f (Com desconto de %d) \n", this.preco, descontoAplicado);
        } else {
            System.out.printf("Preço: R$%.2f\n", this.preco);
        }
        System.out.println("-------------------------------");
    }

    public void cadastrar () {
        System.out.println("Cadastrando no banco de dados");
    }

    public double calcFrete (String cep) {
        double valorFrete = cep.startsWith("66") ? 15.00 : 30.00;
        System.out.println("Calculando frete para o CEP " + cep);
        return valorFrete;
    }

    public void vender() {
        System.out.printf("Vendendo livro por R$%.2f", preco);
    }

    public String trocar () {
        return "Livro Trocado!";
    }
}
