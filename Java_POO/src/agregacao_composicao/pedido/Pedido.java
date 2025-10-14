package agregacao_composicao.pedido;
import java.util.ArrayList;

public class Pedido {
    ArrayList<ItemPedido> pedidos = new ArrayList<>();

    public void adicionarItem (String nomedoProduto, int quantidade, double precoUnitario) {
        ItemPedido novoPedido = new ItemPedido(nomedoProduto, quantidade, precoUnitario);
        pedidos.add(novoPedido);
    }

    public void valorTotal () {
        double valor = 0;
        for (int i = 0; i < pedidos.size(); i++) {
            ItemPedido pedido = pedidos.get(i);
            valor += pedido.subtotal();
        }
        System.out.println("Valor total: R$%.2f".formatted(valor));
    }
}