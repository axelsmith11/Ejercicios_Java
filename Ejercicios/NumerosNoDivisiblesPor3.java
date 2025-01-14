import java.util.ArrayList;
import java.util.Scanner;

public class NumerosNoDivisiblesPor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número N: ");
        int N = scanner.nextInt();

        ArrayList<Integer> lista = new ArrayList<>(); // Lista para almacenar los números

        for (int i = 1; i <= N; i++) {
            if (i % 3 != 0) { // Verifica si el número no es divisible por 3
                lista.add(i); // Agrega el número a la lista
            }
        }

        System.out.println("Números del 1 al " + N + " que no son divisibles por 3:");
        System.out.println(lista);

        scanner.close();
    }
}
