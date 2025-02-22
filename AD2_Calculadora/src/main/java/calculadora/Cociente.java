package calculadora;

/**
 * Clase Cociente que implementa métodos para realizar operaciones de división
 * y cálculos relacionados en una calculadora.
 * Autor: Aitor Polo Lopez
 */
public class Cociente {

    /**
     * Método para dividir dos números reales.
     * @param num1 El primer número a dividir.
     * @param num2 El segundo número a dividir (no puede ser cero).
     * @return El resultado de la división.
     * @throws ArithmeticException si num2 es cero.
     */
    public static double dividirReales(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Error: No se puede dividir " + num1 + " entre cero");
        }
        return num1 / num2;
    }

    /**
     * Método para dividir dos números enteros.
     * @param num1 El primer número a dividir.
     * @param num2 El segundo número a dividir (no puede ser cero).
     * @return El resultado de la división.
     * @throws ArithmeticException si num2 es cero.
     */
    public static int dividirEnteros(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Error: No se puede dividir " + num1 + " entre cero");
        }
        return num1 / num2;
    }

    /**
     * Método para calcular el inverso de un número real.
     * @param num El número cuyo inverso se desea calcular (no puede ser cero).
     * @return El inverso del número.
     * @throws ArithmeticException si num es cero.
     */
    public static double inverso(double num) {
        if (num == 0) {
            throw new ArithmeticException("Error: No se puede calcular el inverso de cero");
        }
        return 1 / num;
    }

    /**
     * Método para calcular la raíz cuadrada de un número.
     * @param num El número del cual se desea calcular la raíz (no puede ser negativo).
     * @return La raíz cuadrada del número.
     * @throws IllegalArgumentException si num es negativo.
     */
    public static double raiz(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Error: No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(num);
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        try {
            System.out.println("División de 10.0 / 2.0: " + dividirReales(10.0, 2.0));
            System.out.println("Inverso de 5.0: " + inverso(5.0));
            System.out.println("Raíz cuadrada de 25.0: " + raiz(25.0));
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

