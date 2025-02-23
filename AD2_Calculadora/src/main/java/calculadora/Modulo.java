package calculadora;

/**
 * Clase Modulo
 *
 * Proporciona métodos para realizar operaciones matemáticas básicas:
 * 1. calcularResiduo: Devuelve el residuo de una división entera.
 * 2. valorAbsoluto: Retorna el valor absoluto de un número.
 *
 * Autor: Brian Ivan Portillo Ortiz
 * GitHub: https://github.com/Brian-Portillo-04
 */
public class Modulo {

    /**
     * Método para calcular el residuo de una división entera.
     *
     * @param a Dividendo
     * @param b Divisor (debe ser distinto de 0)
     * @return Residuo de la división entera de a entre b
     * @throws ArithmeticException Si b es 0
     */
    public static int calcularResiduo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("La división por cero no está permitida.");
        }
        return a % b; // Calcula y devuelve el residuo de la división
    }

    /**
     * Método para calcular el valor absoluto de un número.
     *
     * @param a Número del cual se calculará el valor absoluto
     * @return Valor absoluto de a
     */
    public static double valorAbsoluto(double a) {
        return (a >= 0) ? a : -a; // Si a es negativo, se convierte a positivo
    }
}



























