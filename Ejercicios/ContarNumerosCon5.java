import java.util.Scanner;

public class ContarNumerosCon5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número N: ");
        int N = scanner.nextInt();

        int contador = 0; // Variable para contar los números con el dígito 5

        for (int i = 1; i <= N; i++) {
            if (contieneDigito5(i)) {
                contador++;
            }
        }

        System.out.println("Cantidad de números con al menos un dígito igual a 5 entre 1 y " + N + ": " + contador);

        scanner.close();
    }

    // Método para verificar si un número contiene el dígito 5
    public static boolean contieneDigito5(int numero) {
        while (numero > 0) {
            if (numero % 10 == 5) {
                return true;
            }
            numero /= 10; // Elimina el último dígito
        }
        return false;
    }
}
