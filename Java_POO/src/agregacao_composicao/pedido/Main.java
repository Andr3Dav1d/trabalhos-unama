package agregacao_composicao.pedido;

public class Main {
    public static void main(String[] args) {
        Pedido tech = new Pedido();
        System.out.println("== LOJA ==");
        System.out.println("Adicionando produtos...");
        tech.adicionarItem("Notebook Lenovo ThinkPad", 2, 1864.50);
        tech.adicionarItem("Fone Headset HyperX Cloud III", 1, 368.90);
        tech.adicionarItem("SSD SATA Kingston 500GB", 2, 279.99);
        System.out.println();
        tech.valorTotal();
        System.out.println("==========");
    }
}