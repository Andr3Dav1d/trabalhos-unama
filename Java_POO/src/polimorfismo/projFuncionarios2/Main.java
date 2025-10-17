package polimorfismo.projFuncionarios2;

public class Main {
    public static void main(String[] args) {
        Funcionario enzo = new Suporte(1700);
        Funcionario felipe = new Desenvolvedor(4000);

        System.out.println("O salário do Enzo é: " + enzo.calcularSalarioFinal());
        System.out.println("O salário do Felipe é: " + felipe.calcularSalarioFinal());
    }
}
