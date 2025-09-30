package heranca.questao1;

public class Funcionario extends Pessoa {
    String setor;
    boolean trabalhando;

    public Funcionario (String nome, int idade, String sexo, String setor, boolean trabalhando) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho (String novoTrabalho) {
        this.setor = novoTrabalho;
        System.out.println("O emprego do funcionário %s mudou para %s".formatted(this.nome, novoTrabalho));
    }
}