package Java_ED.AtividadesVetor;

// Crie um programa com um vetor de 10 elementos inteiros. Exibir em tela os valores pares.
public class ExibirValoresPares {
    public static void main(String[] args) {
        int numeros[] = {10, 15, 65, 27, 34, 98, 2, 76, 83};

        System.out.print("Os números pares são: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
             };
        }
        System.out.print("\n");
    }
}
