package polimorfismo.projCalculadora;

public class Calculadora {
    
    public static void somar (int num1, int num2) {
        double resultado = num1 + num2;
        System.out.println("A soma dos dois números INT %d | %d é: %.1f".formatted(num1, num2, resultado));
    }

    public static void somar (int num1, int num2, int num3) {
        double resultado = num1 + num2 + num3;
        System.out.println("A soma dos três números INT %d | %d | %d é: %.1f".formatted(num1, num2, num3, resultado));
    }

    public static void somar (double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println("A soma dos dois números DOUBLE %.1f | %.1f é: %.1f".formatted(num1, num2, resultado));
    }
}
