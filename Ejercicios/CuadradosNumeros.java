import java.util.Scanner;

public class CuadradosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número N: ");
        int N = scanner.nextInt();

        System.out.println("Cuadrados de los números del 1 al " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.println("El cuadrado de " + i + " es: " + (i * i));
        }

        scanner.close();
    }
}
