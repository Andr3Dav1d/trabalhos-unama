package ProjetoContaBancaria;

public class Main {
    public static void main(String[] args) {

        // Criação das contas bancárias
        ContaBancaria conta1 = new ContaBancaria("00011", "André David", 10000);
        ContaBancaria conta2 = new ContaBancaria("00012", "Paulo Silveira", 15000);

        // Depósito
        conta1.depositar(5000); // Valor final: R$15.000,00 
        conta2.depositar(7000); // Valor final: R$22.000,00

        // Saque
        conta1.sacar(2500); // Valor final: R$12.500,00
        conta2.sacar(50000); // Essa operação dará erro pois não terá saldo suficiente

        // Consulta 
        conta1.consultarSaldo();
        conta2.consultarSaldo();
    }
}
