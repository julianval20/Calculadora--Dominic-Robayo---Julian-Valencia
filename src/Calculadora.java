import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Superclase Calculadora
 * Permite sumar y restar dos números ingresados por consola.
 * Contiene un método convertir que será sobrescrito por las subclases.
 * 
 * @author TuNombre
 * @version 1.1
 */
public class Calculadora {
    protected int numero1;
    protected int numero2;
    protected int resultado;

    /**
     * Método para leer dos números desde consola según el sistema numérico elegido.
     * @param tipoSistema Tipo de sistema numérico (1 = Octal, 2 = Binario)
     * @param sc Scanner para entrada de datos
     */
    public void leerNumeros(int tipoSistema, Scanner sc) {
        boolean valido = false;

        do {
            try {
                System.out.print("Ingrese el primer número: ");
                String input1 = sc.next();
                numero1 = parseNumero(input1, tipoSistema);

                System.out.print("Ingrese el segundo número: ");
                String input2 = sc.next();
                numero2 = parseNumero(input2, tipoSistema);

                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Número inválido para el sistema seleccionado. Intente de nuevo.");
            }
        } while (!valido);
    }

    /**
     * Convierte una cadena a número decimal según el sistema numérico.
     * @param numero Cadena a convertir
     * @param tipoSistema Tipo de sistema (1 = Octal, 2 = Binario)
     * @return Número en decimal
     */
    private int parseNumero(String numero, int tipoSistema) {
        switch (tipoSistema) {
            case 1: return Integer.parseInt(numero, 8);  // Octal
            case 2: return Integer.parseInt(numero, 2);  // Binario
            default: throw new NumberFormatException("Sistema inválido");
        }
    }

    /** Suma los dos números. */
    public void sumar() {
        resultado = numero1 + numero2;
        System.out.println("Resultado de la suma (decimal): " + resultado);
    }

    /** Resta los dos números. */
    public void restar() {
        resultado = numero1 - numero2;
        System.out.println("Resultado de la resta (decimal): " + resultado);
    }

    /** Método convertir (sobrescrito en subclases). */
    public void convertir() {
        System.out.println("Método convertir en Calculadora (sin implementación).");
    }
}
