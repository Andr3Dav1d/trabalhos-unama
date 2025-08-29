package classes_objetos.projeto_aluno;

public class Main {
    public static void main (String[] args) {
        Aluno aluno1 = new Aluno("João", 23, 10, 8);
        Aluno aluno2 = new Aluno("Paulo", 45, 7, 5);

        aluno1.imprimirDados();
        aluno2.imprimirDados();

        aluno1.verificarAprovacao(1);
        aluno2.verificarAprovacao(1);

        aluno1.calcularMedia(1);
        aluno2.calcularMedia(1);
    }
}
