package heranca.questao1;

public class Pessoa {
    String nome;
    int idade;
    String sexo;

    public void fazerAniv() {
        idade++;
        System.out.println("%s agora está fazendo %d anos.".formatted(nome, idade));
    }
}