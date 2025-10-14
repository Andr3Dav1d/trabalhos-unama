package agregacao_composicao.professor_turma;

public class Main {
    public static void main(String[] args) {
        Professor samara = new Professor("Samara Souza");
        Professor filipe = new Professor("Filipe Fernandes");

        Turma ads = new Turma(150, samara);

        System.out.println("\n> Exibindo informações do professor:");
        ads.resumo();
        
        System.out.println("> Alterando professor:");
        ads.setProfessor(filipe);
        ads.resumo();
    }
}
