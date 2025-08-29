package classes_objetos.projeto_contabancaria;

public class ContaBancaria {
    public String numeroConta, titular;
    public double saldo;

    public ContaBancaria (String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar (double valor) {
        this.saldo += valor;
        System.out.printf("DEPOSITO: %s depositou R$%.2f. Valor final: R$%.2f\n", this.titular, valor, this.saldo);
    }

    public void sacar (double valor) {
        if (valor > this.saldo) {
            System.out.printf("SAQUE: O valor especificado de %s não foi sacado pois não tem saldo suficiente. Valor: R$%.2f\n", this.titular, this.saldo);
        } else {
            this.saldo -= valor;
            System.out.printf("SAQUE: O usuário %s sacou R$%.2f da conta. Valor final: R$%.2f\n", this.titular, valor, this.saldo);
        }
    }

    public void consultarSaldo () {
        System.out.println("----------SALDO----------");
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.printf("Saldo disponível: R$%.2f\n", this.saldo);
        System.out.println("-------------------------");
    }
}
