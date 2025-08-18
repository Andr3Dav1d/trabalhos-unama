import java.io.IOException;
import java.util.Scanner;

public class Repeticao {
    public static Scanner scanner = new Scanner(System.in);

    // Inputs para o scanner
    public static String inputString(String text) {
        System.out.print(text);
        return scanner.nextLine();
    }

    public static int inputInt(String text) {
        System.out.print(text);
        int num = scanner.nextInt();
        scanner.nextLine(); // Consome o '\n' pendente
        return num;
    }

    // Função para mostrar o título
    public static void titulo() {
        System.out.println("█░█ █▄░█ ▄▀█ █▀▄▀█ ▄▀█   ▄▄   ▄▀█ █▀▄ █▀\n█▄█ █░▀█ █▀█ █░▀░█ █▀█   ░░   █▀█ █▄▀ ▄█\n[Aluno: André David T.R. Mendes - 04182774]");
    }

    // Função para limpar a tela
    public static void clearScreen() throws IOException, InterruptedException {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
    }

    // --- Listagem de funções ---

    public static void exibirNumerosDe1a10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Número " + i);
        }
    }

    public static void lerApenas5Negativos() {
        int contNegativos = 0;
        for (int i = 1; i <= 5; i++) {
            int numero = inputInt("- Insira o " + i + "° número: ");
            if (numero < 0) {
                System.out.println(numero + " é negativo.");
                contNegativos++;
            } else {
                System.out.println(numero + " é " + (numero > 0 ? "positivo." : "zero."));
            }
        }
        System.out.println("Números negativos inseridos: " + contNegativos);
    }

    public static void exibirNumerosMenores() {
        int numero = inputInt("Insira um número: ");
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void exibirMenoresQue10() {
        for (int i = 1; i <= 5; i++) {
            int numero = inputInt("- Insira o " + i + "° número: ");
            if (numero < 10) System.out.println("Valor menor que 10");
        }
    }

    public static void exibirParesAte50() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    public static void somarApenasPares() {
        int contador = 0;
        for (int i = 1; i <= 6; i++) {
            int numero = inputInt("- Insira o " + i + "° número: ");
            if (numero % 2 == 0) {
                System.out.println("=> Par");
                contador += numero;
            } else {
                System.out.println("=> Impar");
            }
        }
        System.out.println("Soma dos números pares: " + contador);
    }

    // --- Funções do Programa ---

    public static void mostrarMenu() throws IOException, InterruptedException {
        boolean executando = true;
        while (executando) {
            clearScreen();
            titulo();
            System.out.println("POO e Estrutura de Dados - Java - Laços de Repetição");
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1. Exibir números de 1 a 10\n2. Ler 5 números e exibir quais são negativos\n3. Ler um número e exibir todos os números menores\n4. Ler 5 números e dizer quais são menores que 10\n5. Exibir números pares de 1 a 50\n6. Ler 6 números e somar apenas os pares");
            System.out.println("\nEscolha uma opção de 1 a 6, ou S para sair.");
            String opcao = inputString("> ");

            clearScreen();
            switch (opcao.toLowerCase()) {
                case "1":
                    exibirNumerosDe1a10();
                    break;
                case "2":
                    lerApenas5Negativos();
                    break;
                case "3":
                    exibirNumerosMenores();
                    break;
                case "4":
                    exibirMenoresQue10();
                    break;
                case "5":
                    exibirParesAte50();
                    break;
                case "6":
                    somarApenasPares();
                    break;
                case "s":
                    executando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            if (executando) {
                System.out.print("Pressione ENTER para voltar ao menu.");
                scanner.nextLine();
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        mostrarMenu();
    }
}
