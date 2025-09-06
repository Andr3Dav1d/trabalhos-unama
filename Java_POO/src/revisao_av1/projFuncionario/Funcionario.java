package revisao_av1.projFuncionario;

public class Funcionario {
    private String nome;
    private int matricula;
    private double salario;

    public Funcionario () {
        System.out.println("Construtor vazio criado.");
    }
    public Funcionario (String nome, int matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        System.out.println("Construtor parametrizado criado.\n- Nome: %s\nMatrícula: %d\nSalário: R$%.2f".formatted(this.nome, this.matricula, this.salario));
    }
 
    public String setNome (String nome) {
        this.nome = nome;
        System.out.println("Nome do funcionário: %s".formatted(nome));
        return nome;
    }

    public int setMatricula (int matricula) {
        this.matricula = matricula;
        System.out.println("Nome do funcionário: %s".formatted(matricula));
        return matricula;
    }

    public double setSalario (double novoSalario) {
        if (novoSalario < 1412) {
            System.out.println("ERRO [%s, %d]: O novo salário não deve ser inferior ao salário mínimo (R$%.2f)".formatted(this.nome, this.matricula, 1412.00));
            return this.salario;
        } else {
            this.salario = novoSalario;
            System.out.println("[%s, %d] O salário foi alterado para R$%.2f.".formatted(this.nome, this.matricula, novoSalario));
            return novoSalario;
        }
    }
    public double getSalario (boolean print) {
        if (print) System.out.println("O salário de %s é: R$%.2f".formatted(this.nome, this.salario));
        return this.salario;
    }
}