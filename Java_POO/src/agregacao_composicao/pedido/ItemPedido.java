package agregacao_composicao.pedido;

public class ItemPedido {
    String nomedoProduto;
    int quantidade;
    double precoUnitario;

    public ItemPedido(String nomedoProduto, int quantidade, double precoUnitario) {
        this.nomedoProduto = nomedoProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;

        System.out.println("\n> Produto adicionado");
        System.out.println("-- Produto: " + this.nomedoProduto);
        System.out.println("-- Quantidade: " + this.quantidade);
        System.out.println("-- Valor do produto: R$%.2f (cada)".formatted(this.precoUnitario));
        System.out.println("-- Subtotal: R$%.2f".formatted(this.subtotal()));
    }

    public double subtotal () {
        return precoUnitario * quantidade;
    }
}