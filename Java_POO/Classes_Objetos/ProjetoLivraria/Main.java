package ProjetoLivraria;

public class Main {
    public static void main (String[] args) {
    
    // >> Atividade 1 
    // Instanciar dois objetos da classe
    Livro alg = new Livro("Entendendo Algoritmos", "Exatas", 264, 2017, 60.00);
    Livro evang = new Livro("Product Backlog Building", "Gestão de Times", 143, 2021, 20.00);

    // Alterar atributos através do objeto da classe (usei como exemplo os preços)
    alg.preco = 55.00;
    evang.preco = 45.00;

    // Impressão dos atributos na tela e Invocação dos métodos de classe
    alg.imprimirNaTela();
    evang.imprimirNaTela();

    // >> Atividade 2
    // Criação de duas estantes com os gêneros dos dois livros
    Estante exatas_estante = new Estante("Exatas", 50);
    Estante times_estante = new Estante("Gestão de Times", 25);

    // Adicionando desconto na estante de exatas
    exatas_estante.aplicarDesconto(50);

    // Imprimindo as estantes
    exatas_estante.imprimirNaTela();
    times_estante.imprimirNaTela();

    }
}
