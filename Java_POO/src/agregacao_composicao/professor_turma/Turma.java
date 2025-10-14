package agregacao_composicao.professor_turma;

public class Turma {
    int codigo;
    Professor professor;

    public Turma (int codigo, Professor professor) {
        this.codigo = codigo;
        this.professor = professor;
    }

    public void setProfessor (Professor p) {
        this.professor = p;
    }

    public void resumo () {
        System.out.println("== Informações da Turma ==");
        System.out.println("Código de turma: " + this.codigo);
        System.out.println("Professor responsável: " + this.professor.nome);
        System.out.println("==========================");
    }
}