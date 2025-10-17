package polimorfismo.projFuncionarios2;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor (double salario) {
        super.salarioBase = salario;
    }

    public double calcularSalarioFinal() {
        return (super.salarioBase + (super.salarioBase * 0.1));
    }
}
