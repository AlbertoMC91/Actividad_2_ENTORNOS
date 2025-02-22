import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la clase {@Suma}.
 * Esta clase contiene los métodos necesarios para realizar pruebas
 * unitarias sobre la funcionalidad de la clase {@suma}.
 */

public class SumaTest {
    /**
     * Instancia de la clase {@Suma} que será utilizada en las pruebas.
     */
    private Suma suma;

    /**
     * método que se ejecuta antes de cada prueba.
     * Inicializa la instancia de {@Suma} antes de ejecutar las pruebas.
     */
    @BeforeEach
    void setUp() {
         suma  = new Suma();
    }

    /**
     * Método que devuelve el valor
     * acumulado de la operación de suma.
     * Éste método es utilizado para
     * comprobar el valor acumulado tras realizar las sumas.
     * @return el valor acumulado de la suma.
     */



    @Test
    void getValorAcumulado() {
    }



    @Test
    void sumar() {
    }
    /**
     * Prueba que verifica si la suma de dos números es correcta.
     * En este caso realiza la suma de los numeros 2 y 3.
     * Se espera que el resultado de cinco.
     */

    @Test
    void testSumar() {
        double resultado = suma.sumar(2,3);
        assertEquals(5, resultado, "el resultado debe ser 5");
        System.out.println("resultado esperado : 6.0, resultado obtenido . " + resultado);
        System.out.flush();
    }
    /**
     * Prueba que verifica si la suma de dos números es correcta.
     * En este caso realiza la suma de los numeros 8 y 14.
     * Se espera que el resultado de 22.
     */

    @Test
    void testSumar1() {
        double resultado = suma.sumar(8,14);
        assertEquals(22, resultado, "el resultado debe ser 22");
        System.out.println("el resultado esperado debe ser " + resultado);

    }

    /**
     * Prueba que verifica el valor
     * acumulado despues de sumar un numero.
     * En este caso, realiza la suma de un numero 5
     * a un valor acumulado previamente.
     * Se espera que el valor acumulado sea 17. (
     */

    @Test
    void sumarAcumulado() {
        suma.sumarAcumulado(5);
        assertEquals(5,suma.getValorAcumulado(), "el valor acumulado es tanto");

        suma.sumarAcumulado(8);
        System.out.println("valor es " + suma.sumarAcumulado(4));
    }
}