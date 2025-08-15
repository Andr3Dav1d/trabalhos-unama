public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;
    private String senha;
    
    public ContaBancaria(String numeroConta, String titular, String senha) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.senha = senha;
        this.saldo = 0.0;
    }
    
    public ContaBancaria(String numeroConta, String titular, String senha, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.senha = senha;
        this.saldo = saldoInicial;
    }
    
    public boolean verificarSenha(String senha) {
        return this.senha.equals(senha);
    }
    
    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    
    public double consultarSaldo() {
        return saldo;
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setSenha(String novaSenha) {
        this.senha = novaSenha;
    }
}
