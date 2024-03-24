import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite a base e o expoente
        System.out.println("Digite a base:");
        double base = scanner.nextDouble();

        System.out.println("Digite o expoente:");
        int expoente = scanner.nextInt();

        // Calcula a potência
        double resultado = calcularPotencia(base, expoente);

        // Exibe o resultado
        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);

        scanner.close();
    }

    public static double calcularPotencia(double base, int expoente) {
        double resultado = 1;

        if (expoente >= 0) {
            for (int i = 1; i <= expoente; i++) {
                resultado *= base;
            }
        } else {
            for (int i = 1; i <= -expoente; i++) {
                resultado /= base;
            }
        }

        return resultado;
    }
}
