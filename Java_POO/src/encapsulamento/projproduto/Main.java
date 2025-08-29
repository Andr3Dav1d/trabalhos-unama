package encapsulamento.projproduto;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Teste 1: Produto com preço válido ---");
        Produto produto1 = new Produto("Caderno", 15.50);
        produto1.exibirInformacoes();
        System.out.println();

        System.out.println("--- Teste 2: Atribuindo preço negativo no construtor ---");
        Produto produto2 = new Produto("Caneta", -2.00);
        produto2.exibirInformacoes();
        System.out.println();

        System.out.println("--- Teste 3: Atribuindo preço negativo via setter ---");
        Produto produto3 = new Produto("Lápis", 1.00);
        produto3.exibirInformacoes();
        System.out.println("Tentando alterar o preço para -3.50...");
        produto3.setPreco(-3.50);
        produto3.exibirInformacoes();
        System.out.println();

        System.out.println("--- Teste 4: Alterando o preço para um valor válido ---");
        produto3.exibirInformacoes();
        System.out.println("Alterando o preço para 2.75...");
        produto3.setPreco(2.75);
        produto3.exibirInformacoes();
        System.out.println();
    }
}
