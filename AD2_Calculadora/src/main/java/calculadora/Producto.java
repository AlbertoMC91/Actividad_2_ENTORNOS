package calculadora;

public class Producto {

    package calculadora;

    /**
     * Esta clase implementará todos los métodos que están relacionados con la
     * multiplicación de la calculadora.
     * Esta clase tendrá los siguientes métodos:
     * 1. Producto de dos números reales, tendrá 2 parámetros de entrada y uno
     * de salida que será la solución.
     * 2. Producto de dos números enteros, tendrá 2 parámetros de entrada y uno
     * de salida que será la solución.
     * 3. Producto de tres números reales, tendrá 3 parámetros de entrada y uno
     * de salida que será la solución.
     * 4. Potencia, tendrá dos parámetros de entrada (base y exponente) y uno
     * de salida que será la solución.
     *
     * @author Daniel Porokhnyak
     * @see <a href="https://github.com/DanielPoro">Perfil de GitHub</a>
     */
    public class Producto {

        /**
         * Producto de dos números reales.
         * @param num1 Primer número real.
         * @param num2 Segundo número real.
         * @return El producto de los dos números reales.
         */
        public double multiplicar(double num1, double num2) {
            return num1 * num2;
        }

        /**
         * Producto de dos números enteros.
         * @param num1 Primer número entero.
         * @param num2 Segundo número entero.
         * @return El producto de los dos números enteros.
         */
        public int multiplicar(int num1, int num2) {
            return num1 * num2;
        }

        /**
         * Producto de tres números reales.
         * @param num1 Primer número real.
         * @param num2 Segundo número real.
         * @param num3 Tercer número real.
         * @return El producto de los tres números reales.
         */
        public double multiplicar(double num1, double num2, double num3) {
            return num1 * num2 * num3;
        }

        /**
         * Calcula la potencia de un número elevado a un exponente.
         * @param base Número base.
         * @param exponente Exponente al que se elevará la base.
         * @return El resultado de elevar la base al exponente.
         */
        public double potencia(double base, double exponente) {
            return Math.pow(base, exponente);
        }
    }

}