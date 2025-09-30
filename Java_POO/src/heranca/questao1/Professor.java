package heranca.questao1;

public class Professor extends Pessoa {
    String especialidade;
    double salario;

    public Professor (String nome, int idade, String sexo, String especialidade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAum(double valorAumento) {
        salario += valorAumento;
        System.out.println("O salário de %s aumentou em R$%.2f. Novo valor: R$%.2f".formatted(this.nome, valorAumento, this.salario));
    }
}