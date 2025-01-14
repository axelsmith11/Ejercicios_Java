import java.util.Scanner;

public class ParqueDeAventuras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saludo inicial
        System.out.println("BIENVENIDO AL PARQUE DE AVENTURAS".repeat(1).replace("\0", "=").substring(0, 50));
        System.out.print("¿Cuál es tu nombre?: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + ", estamos encantados de recibirte en nuestro Parque de Aventuras.");
        System.out.println("El precio de la entrada depende de tu edad y de las actividades que elijas disfrutar.");

        // Solicitar edad
        System.out.print("¿Cuántos años tienes?: ");
        int edad = scanner.nextInt();
        int precioEntrada;

        // Determinar precio de la entrada
        if (edad < 5) {
            System.out.println("Tu entrada es gratuita.");
            precioEntrada = 0;
        } else if (edad <= 12) {
            System.out.println("Tu entrada cuesta S/.7");
            precioEntrada = 7;
        } else if (edad <= 17) {
            System.out.println("Tu entrada cuesta S/.10");
            precioEntrada = 10;
        } else {
            System.out.println("Tu entrada cuesta S/.15");
            precioEntrada = 15;
        }

        // Mostrar actividades disponibles
        System.out.println("\nTenemos varias actividades emocionantes para ti:");
        System.out.println("1. Tirolesa (S/.10 por persona)");
        System.out.println("2. Escalada en muro (S/.7 por persona)");
        System.out.println("3. Recorrido guiado por la naturaleza (S/.5 por persona)");
        System.out.println("4. Circuito de cuerdas (S/.12 por persona)");

        // Preguntar cuántas actividades desea realizar
        System.out.print("¿Cuántas actividades deseas realizar?: ");
        int cantidadActividades = scanner.nextInt();
        int costoActividades = 0;

        // Registrar actividades
        for (int i = 1; i <= cantidadActividades; i++) {
            System.out.print("Selecciona la actividad " + i + " (Escribe el número de la actividad): ");
            int actividad = scanner.nextInt();

            switch (actividad) {
                case 1:
                    System.out.println("Has elegido la tirolesa. Costo: S/.10");
                    costoActividades += 10;
                    break;
                case 2:
                    System.out.println("Has elegido escalada en el muro. Costo: S/.7");
                    costoActividades += 7;
                    break;
                case 3:
                    System.out.println("Has elegido el recorrido guiado. Costo: S/.5");
                    costoActividades += 5;
                    break;
                case 4:
                    System.out.println("Has elegido el circuito de cuerdas. Costo: S/.12");
                    costoActividades += 12;
                    break;
                default:
                    System.out.println("Opción no válida. No se sumará ninguna actividad.");
            }
        }

        // Preguntar si tiene descuento especial
        System.out.print("¿Tienes un cupón de descuento? (Sí/No): ");
        scanner.nextLine(); // Consumir salto de línea
        String descuentoEspecial = scanner.nextLine().trim().toLowerCase();
        double descuento = (descuentoEspecial.equals("sí") || descuentoEspecial.equals("si")) ? 0.15 : 0;

        // Calcular el costo total
        int total = precioEntrada + costoActividades;
        double totalConDescuento = total - (total * descuento);

        // Mostrar resumen
        System.out.println("\nResumen de tu compra:");
        System.out.println("Entrada: S/." + precioEntrada);
        System.out.println("Costo total de actividades: S/." + costoActividades);
        System.out.println("Descuento aplicado: " + (int) (descuento * 100) + "%");
        System.out.printf("Total a pagar: S/.%.2f%n", totalConDescuento);

        // Método de pago
        System.out.print("\n¿Qué método de pago deseas utilizar? (Tarjeta/Efectivo): ");
        String metodoPago = scanner.nextLine().trim().toLowerCase();

        if (metodoPago.equals("tarjeta")) {
            System.out.printf("Has elegido pagar con tarjeta. Procesando el pago de S/.%.2f...%n", totalConDescuento);
        } else if (metodoPago.equals("efectivo")) {
            System.out.printf("Has elegido pagar en efectivo. El total a pagar es S/.%.2f.%n", totalConDescuento);
        } else {
            System.out.println("Método de pago no válido.");
        }

        System.out.println("\n¡Gracias por visitarnos! Esperamos que disfrutes de tu tiempo en el Parque de Aventuras.");
        scanner.close();
    }
}
