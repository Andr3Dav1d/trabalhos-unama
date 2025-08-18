// Sacar
// Depositar
// Ver saldo

import java.util.Scanner;
import java.io.IOException;

public class Banco {
    private static Scanner scanner = new Scanner(System.in);
    private static float saldo = 1000.0f; // Saldo global
    
    public static void clearScreenOrHome(int option1or2) throws IOException, InterruptedException {
        if (option1or2 == 2) {
            System.out.print("Pressione ENTER para voltar ao menu.");
            scanner.nextLine();
            new ProcessBuilder("clear").inheritIO().start().waitFor();
            mostrarMenu(); // Método separado em vez de recursão
        } else {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }
    }
    
    public static void mostrarMenu() throws IOException, InterruptedException {
        clearScreenOrHome(1);
        System.out.printf("Bem vindo!\nSeu saldo é de R$%.2f\n", saldo);
        System.out.println("1. Sacar\n2. Depositar\n3. Sair");
        System.out.print("- ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcao) {
            case 1:
                clearScreenOrHome(1);
                subTitulo("Sacar");
                System.out.printf("Você está com R$%.2f\n", saldo);
                System.out.print("Digite o valor para sacar: ");
                float valorSaque = scanner.nextFloat(); // Usar float
                scanner.nextLine(); // Limpar buffer
                
                if(saldo < valorSaque) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valorSaque;
                    System.out.printf("Saque realizado! Novo saldo: R$%.2f\n", saldo);
                }
                clearScreenOrHome(2);
                break;
            case 2:
                clearScreenOrHome(1);


                subTitulo("Depositar");
                System.out.printf("Você está com R$%.2f\n", saldo);
                System.out.print("Digite o valor de depósito: ");
                float valorDeposito = scanner.nextFloat();
                scanner.nextLine();

                saldo += valorDeposito;
                System.out.printf("Deposito realizado! Novo saldo: R$%.2f\n", saldo);

                clearScreenOrHome(2);
                break;
            case 3:
                clearScreenOrHome(1);
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção Inválida!");
                clearScreenOrHome(2);
        }
    }

    public static void subTitulo (String titulo) {
        System.out.println(titulo);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < titulo.length(); i++) {
            sb.append('-');
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        mostrarMenu();
    }
}