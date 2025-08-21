package Java_ED.AtividadesVetor;
import java.util.Scanner;

// Crie um programa que armazene as notas de 10 alunos recebidas pelo usuário. O programa deve retornar a maior nota em tela.
public class Receber10Notas {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int notas[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Insira o %d° número: ", i);
            int numero = input.nextInt();
            notas[i] = numero;
        }

        // ainda falta o for
    }
}
