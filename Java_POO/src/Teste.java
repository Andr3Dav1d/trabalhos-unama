import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        // primeiro, pega o número digitado
        String numeroStr = JOptionPane.showInputDialog(
            null,
            "Digite o número:",
            "Entrada de Número",
            JOptionPane.PLAIN_MESSAGE
        );

        if (numeroStr == null) {
            System.out.println("Cancelou o input.");
            return;
        }

        // agora mostra as opções de operação
        Object[] opcoes = { "Somar", "Subtrair" };
        int escolha = JOptionPane.showOptionDialog(
            null,
            "Escolha a operação para o número " + numeroStr + ":",
            "Operação",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );

        if (escolha == JOptionPane.CLOSED_OPTION) {
            System.out.println("Fechou sem escolher operação.");
            return;
        }

        System.out.println("Número: " + numeroStr);
        System.out.println("Operação escolhida: " + opcoes[escolha]);
    }
}
