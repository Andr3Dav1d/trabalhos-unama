package encapsulamento.projproduto;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.setPreco(preco);
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço não pode ser negativo. O valor não foi alterado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço: R$" + String.format("%.2f", this.preco));
    }
}
