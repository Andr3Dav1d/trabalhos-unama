package Java_ED.AtividadesVetor;
import java.util.Random;

// Criar um vetor com 10 idades e exibir em tela as idades maiores que 18 anos

// Para essa atividade, eu usei o método random para gerar números aleatórios e adicionar dentro da array, com números que variam entre 12 e 25.
public class DezIdades {
    public static void main(String[] args) {
        int idades[] = new int[10];

        Random random = new Random();
        int min = 0;
        int max = 25;
        System.out.println("-------------------------");
        System.out.print("Uma lista aleatória foi criada com os seguintes números: ");
        for (int i = 0; i < idades.length; i++) {
            int numeroAleatorio = random.nextInt(max - min + 1) + min;
            idades[i] = numeroAleatorio;
            System.out.print(numeroAleatorio + " ");
        }

        System.out.print("\nIdades maiores que 18 anos: ");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 18) System.out.print(idades[i] + " ");
        }
        System.out.print("\n");
    }
}
