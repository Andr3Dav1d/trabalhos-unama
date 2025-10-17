package polimorfismo.projFuncionarios2;

public class Suporte extends Funcionario {
    public Suporte (double salario) {
        super.salarioBase = salario;
    }

    public double calcularSalarioFinal() {
        return (super.salarioBase + 200);
    }
}
