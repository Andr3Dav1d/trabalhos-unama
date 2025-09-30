package heranca.questao2e3;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor() {
        super();
    }

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public void obterSaldo() {
        double saldo = valorCredito - valorDivida;
        System.out.println("Saldo de %s: R$%.2f".formatted(getNome(), saldo));
    }
}