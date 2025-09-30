package heranca.questao1;

public class Aluno extends Pessoa {
    String matricula, curso;

    public Aluno (String nome, int idade, String sexo, String matricula, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void cancelarMatr () {
        this.matricula = "---";
        this.curso = "---";
        System.out.println("O aluno %s teve sua matrícula cancelada.".formatted(this.nome));
    }
}