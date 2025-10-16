package polimorfismo.projFuncionarios;

public abstract class Funcionario {
    String nome, cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public double calcularSalario () {
        return 1500.00;
    }
}