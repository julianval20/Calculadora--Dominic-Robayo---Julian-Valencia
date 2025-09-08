import java.util.Scanner;

/**
 * Clase principal Main
 * Permite al usuario elegir qué operación realizar (suma/resta) 
 * y en qué formato ver el resultado (binario/octal).
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("¡Bienvenido a la Calculadora!");

        do {
            int tipo = 0;
            while (tipo != 1 && tipo != 2) {
                System.out.println("\nSeleccione el sistema numérico:");
                System.out.println("1. Octal");
                System.out.println("2. Binario");
                tipo = sc.nextInt();
                if (tipo != 1 && tipo != 2) {
                    System.out.println("Opción inválida. Intente de nuevo.");
                }
            }

            Calculadora calc = (tipo == 1) ? new Octal() : new Binario();

            // Leer números en el sistema elegido
            calc.leerNumeros(tipo, sc);

            // Selección de operación
            int operacion = 0;
            while (operacion != 1 && operacion != 2) {
                System.out.println("Seleccione operación:");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                operacion = sc.nextInt();
                if (operacion != 1 && operacion != 2) {
                    System.out.println("Opción inválida. Intente de nuevo.");
                }
            }

            if (operacion == 1) {
                calc.sumar();
            } else {
                calc.restar();
            }

            // Mostrar resultado convertido
            calc.convertir();

            // Repetir o salir
            System.out.println("\n¿Desea calcular de nuevo?");
            System.out.println("1. Sí");
            System.out.println("2. No (salir)");
            opcion = sc.nextInt();

        } while (opcion == 1);

        System.out.println("¡Gracias por usar la Calculadora! Hasta luego.");
    }
}
