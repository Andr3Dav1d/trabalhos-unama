package encapsulamento.projcontabancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria um = new ContaBancaria(1, 500); // Saldo inicial: R$500,00

        System.out.println("=== Operações na Conta Bancária ===");

        um.sacar(1000); // Erro de saldo insuficiente
        um.depositar(10000); // Saldo: R$10.500,00
        um.sacar(100); // Saldo: R$10.400,00

        um.getSaldo();
    }
}
