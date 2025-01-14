import java.util.Scanner;

public class SumaNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número N: ");
        int N = scanner.nextInt();

        int suma = 0; // Variable para acumular la suma de los pares

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) { // Verifica si el número es par
                suma += i;
            }
        }

        System.out.println("La suma de los números pares del 1 al " + N + " es: " + suma);

        scanner.close();
    }
}
