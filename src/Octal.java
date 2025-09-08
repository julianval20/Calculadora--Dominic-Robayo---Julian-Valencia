/**
 * Subclase Octal
 * Convierte el resultado de la operación a octal.
 * 
 * @author TuNombre
 * @version 1.0
 */
public class Octal extends Calculadora {
    
    public void convertir() {
        System.out.println("Resultado en octal: " + Integer.toOctalString(resultado));
    }
}
