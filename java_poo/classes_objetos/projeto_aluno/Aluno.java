package classes_objetos.projeto_aluno;

public class Aluno {
    String nome;
    int matricula;
    double notaAv1, notaAv2;

    Aluno (String nome, int matricula, double notaAv1, double notaAv2) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }

    void imprimirDados() {
        System.out.println("------------ALUNO-------------");
        System.out.println("Nome do Aluno: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nota da Av1: " + notaAv1);
        System.out.println("Nota da Av2: " + notaAv2);
        System.out.println("Status: " + verificarAprovacao(0));
        System.out.println("------------------------------");
    }

    double calcularMedia (int print) {
        double media = (notaAv1 + notaAv2) / 2;
        if (print == 1) System.out.println("Média do aluno " + this.nome + ": " + media);
        return media;
    }

    String verificarAprovacao (int print) {
        double media = calcularMedia(0);
        String aprovacao;

        if (media >= 7) {
            aprovacao = "Aprovado";
        } else if (media >= 4) {
            aprovacao = "Prova Final";
        } else {
            aprovacao = "Reprovado";
        }
        if (print == 1) System.out.println("Status do(a) Aluno(a) " + this.nome + ": " + aprovacao);
        return aprovacao;
    }
}
