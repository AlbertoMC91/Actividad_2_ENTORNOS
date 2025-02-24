package calculadora;

/**
 * Esta clase implementará todos los métodos que están relacionados con la suma de la calculadora. Esta
 * clase tendrá los siguientes métodos:
 * 1. Suma de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
 * 2. Suma de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
 * 3. Suma de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la solución.
 * 4. Suma con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el valor
 * acumulado.
 *
 * @author AlbertoMonteroCabezas
 * @see <a href="https://github.com/AlbertoMC91">Perfil de GitHub</a>
 */

public class Suma {

    // Atributo para almacenar el valor acumulado
    private double valorAcumulado;

    /**
     * Constructor por defecto. Inicializa el valor acumulado a 0.0.
     */
    public Suma() {
    }

    /**
     * Devuelve el valor acumulado actual.
     * @return El valor acumulado.
     */
    public double getValorAcumulado() {
        return this.valorAcumulado;
    }

    /**
     * Suma dos números reales.
     * @param num1 Primer número real.
     * @param num2 Segundo número real.
     * @return La suma de los dos números reales.
     */
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Suma dos números enteros.
     * @param num1 Primer número entero.
     * @param num2 Segundo número entero.
     * @return La suma de los dos números enteros.
     */
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Suma tres números reales.
     * @param num1 Primer número real.
     * @param num2 Segundo número real.
     * @param num3 Tercer número real.
     * @return La suma de los tres números reales.
     */
    public double sumar(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    /**
     * Suma un valor al acumulado y devuelve el nuevo valor acumulado.
     * @param num Número real que se sumará al acumulado.
     * @return El nuevo valor acumulado después de la suma.
     */
    public double sumarAcumulado(double num) {
        this.valorAcumulado += num;
        return this.valorAcumulado;
    }
}
