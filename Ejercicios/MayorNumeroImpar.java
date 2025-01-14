import java.util.Scanner;

public class MayorNumeroImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número N: ");
        int N = scanner.nextInt();

        int mayorImpar;
        if (N % 2 == 0) {
            mayorImpar = N - 1; // Si N es par, el mayor impar es N - 1
        } else {
            mayorImpar = N; // Si N es impar, es el mayor impar
        }

        System.out.println("El mayor número impar entre 1 y " + N + " es: " + mayorImpar);

        scanner.close();
    }
}
