package calculadora;

/**
 * Esta clase contendrá los métodos relacionados con la resta de la calculadora. Está compuesta
 * por los siguientes métodos:
 * 1. Resta de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
 * 2. Resta de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la solución.
 * 3. Resta de tres números reales, rendrá 3 parámetros de entrada y uno de salida que será la solución.
 * 4. Resta con valor acumulado, tendrá un parámetro de entrada y la clase deberá de guardar el valor acumulado.
 * 
 * @autor AlbertoLaraLópez
 * @see
 */

public class Resta {
    
    // Atributo para almacenar el valor acumulado
    private double ValorAcumulado;

    /**
     * Constructor por defecto. Inicializa el valor acumulado a 0.0.
     */
    public Resta(){

    }
    
    /**
     * Devuelve el valor acumulado actual.
     * @return El valor acumulado.
     */
    public double getValorAcumulado(){
        return this.ValorAcumulado;
    }

     /**
     * Resta de  dos números reales.
     * @param num1 Primer número real.
     * @param num2 Segundo número real.
     * @return La resta de los dos números reales.
     */
    public double restar(double num1, double num2){
        return num1 - num2;
        
    }

     /**
     * Resta de  dos números enteros.
     * @param num1 Primer número entero.
     * @param num2 Segundo número entero.
     * @return La resta de los dos números enteros.
     */

    public int restar(int num1, int num2){
        return num1 - num2;
    }

    /**
     * Resta de tres números reales.
     * @param num1 Primer número real.
     * @param num2 Segundo número real.
     * @param num3 Tercer número real.
     * @return La resta de los tres números reales.
     */

    public double restar(double num1, double num2, double num3){
        return num1 - num2 - num3;
    }

     /**
     * Resta un valor al acumulado y devuelve el nuevo valor acumulado.
     * @param num Número real que se restará al acumulado.
     * @return El nuevo valor acumulado después de la resta.
     */

    public double restarAcumulado(double num){
        this.ValorAcumulado -= num;
        return this.ValorAcumulado;
    }

    
}
