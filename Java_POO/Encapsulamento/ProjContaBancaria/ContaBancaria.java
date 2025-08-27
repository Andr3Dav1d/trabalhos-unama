public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        saldo += deposito;
        System.out.println("DEPOSITO: Foram depositados R$%.2f na conta %d (Saldo final: R$%.2f)".formatted(deposito, numeroConta, saldo));
    }

    public void sacar(double saque) {
        if (saque > saldo) {
            System.out.println("ERRO DE SAQUE: A conta %d tentou sacar R$%.2f, mas não tem saldo suficiente. (R$%.2f)".formatted(numeroConta, saque, saldo));
        }
    }

    public void getSaldo() {
        System.out.println("Saldo atual da conta %d: R$%.2f".formatted(numeroConta, saldo));
    }
}
