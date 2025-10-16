package polimorfismo.projFuncionarios;

public class Main {
    public static void main(String[] args) {
        
        Funcionario[] listaDePagamento = {
            new Programador("André David", "111.222.333-44"),
            new Gerente("Filipe","000.111.222-33")
        };

        for (Funcionario f : listaDePagamento) {
            double salario = f.calcularSalario();
            System.out.println("O salário de %s é de R$%.2f.".formatted(f.nome, salario));
        }
    }
}
