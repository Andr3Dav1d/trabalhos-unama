package atividadesvetor;

// Criar um vetor com 4 notas e exibir em tela a média aritmética das notas;
public class QuatroNotas {
    public static void main(String[] args) {
        int notas[] = {7, 5, 6, 9};
        int total = 0;

        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }

        double media = total / 4.0;
        System.out.println("A média das notas é %.2f.".formatted(media));
    }
}
