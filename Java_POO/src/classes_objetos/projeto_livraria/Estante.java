package classes_objetos.projeto_livraria;

public class Estante {
    public String genero;
    public int quantidadeLivros, descontoEstante;

    public Estante (String genero, int quantidadeLivros) {
        this.genero = genero;
        this.quantidadeLivros = quantidadeLivros;
        this.descontoEstante = 0;
    }

    // Método para alterar quantidade de livros
    public void alterarQntdLivros (int novaQntd) {
        this.quantidadeLivros = novaQntd;
        System.out.printf("Nova quantidade de livros da estante %s: %d", this.genero, novaQntd);
    }

    public void imprimirNaTela () {
        System.out.println("-------------ESTANTE-------------");
        System.out.println("Gênero: " + this.genero);
        System.out.println("Quantidade de Livros: " + (this.quantidadeLivros > 0 ? this.quantidadeLivros : "Sem estoque"));
        System.out.println("Desconto: " + (this.descontoEstante > 0 ? this.descontoEstante + "%" : "Sem desconto"));
        System.out.println("---------------------------------");
    }

    // Método para aplicar desconto na estante
    public void aplicarDesconto (int desconto) {
        this.descontoEstante = desconto;
    }
}
