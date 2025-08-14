import java.util.Scanner;

public class Test {
    public static Scanner teclado = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.print("Insira a idade: ");
        int idade = teclado.nextInt();
        String categoria;

        if (idade <= 7) {
            categoria = "Infantil A";
        } else if (8 <= idade && idade <= 10) {
            categoria = "Infantil B";
        } else if (11 <= idade && idade <= 13) {
            categoria = "Juvenil A";
        } else if (14 <= idade && idade <= 17) {
            categoria = "Juvenil B";
        } else {
            categoria = "Sênior";
        }

        System.out.printf("A categoria do nadador é %s.\n", categoria);
    }
}