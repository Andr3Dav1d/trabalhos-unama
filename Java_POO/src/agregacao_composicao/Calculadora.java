package agregacao_composicao;
import javax.swing.JOptionPane;

public class Calculadora {
    public static int inputInt(String mensagem) {
        while (true) {
            String valor = JOptionPane.showInputDialog(
                null,
                mensagem,
                "Entrada Numérica",
                JOptionPane.QUESTION_MESSAGE
            );

            // se o usuário cancelar
            if (valor == null) {
                JOptionPane.showMessageDialog(
                    null,
                    "Operação cancelada.",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE
                );
                throw new RuntimeException("Entrada cancelada pelo usuário");
            }

            try {
                return Integer.parseInt(valor.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                    null,
                    "O valor deve ser um número inteiro.",
                    "Erro de Entrada",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }

    public static void display(String informacao) {
        JOptionPane.showMessageDialog(
            null, 
            informacao, 
            "Info", 
            JOptionPane.INFORMATION_MESSAGE);
    }

    public static double operacao (int numero1, int numero2) {
        double resultado = 0.0;
        Object[] operacoes = {"+","-","*","/"};

        int operacao = JOptionPane.showOptionDialog(
            null,
            "Números: %d | %d".formatted(numero1, numero2),
            "Qual operador usar?",
            JOptionPane.CLOSED_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            operacoes,
            operacoes[0]
        );

        switch (operacao) {
            case 0:
                resultado = numero1 + numero2;
                break;
            case 1:
                resultado = numero1 - numero2;
                break;
            case 2:
                resultado = numero1 * numero2;
                break;
            case 3:
                if (numero2 == 0) {
                    display("Não pode dividir por 0.");
                    resultado = numero1;
                } else {
                    resultado = numero1 / numero2;
                }
                break;
            default:
                break;
            }
            return resultado;
    }

    public static void main(String[] args) {
        int num1 = inputInt("Digite o 1° número");
        int num2 = inputInt("Digite o 2° número");
        double result = operacao(num1, num2);

        display("Resultado: " + result);
    }
}
