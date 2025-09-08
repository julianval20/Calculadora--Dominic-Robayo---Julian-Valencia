/**
 * Subclase Binario
 * Convierte el resultado de la operación a binario.
 * 
 * @author TuNombre
 * @version 1.0
 */
public class Binario extends Calculadora {

    /**
     * Convierte el resultado a representación binaria.
     */
    @Override
    public void convertir() {
        System.out.println("Resultado en binario: " + Integer.toBinaryString(resultado));
    }
}
