package calculadora.test;

import calculadora.Resta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la clase {@link Resta}.
 * Se encarga de verificar el correcto funcionamiento de los métodos de resta.
 */
class RestaTest {
    private Resta resta;

    /**
     * Configuración previa a cada prueba.
     * Se ejecuta antes de cada test para inicializar la instancia de {@link Resta}.
     */
    @BeforeEach
    void setUp() {
        resta = new Resta();
    }

    /**
     * Prueba el método {@link Resta#restar(double, double)} para la resta de dos números reales.
     * Se espera que la resta de 5.5 y 3.0 sea 2.5.
     */
    @Test
    void testRestarDosReales() {
        assertEquals(2.5, resta.restar(5.5, 3.0), 0.0001);
    }

    /**
     * Prueba el método {@link Resta#restar(int, int)} para la resta de dos números enteros.
     * Se espera que la resta de 7 y 4 sea 3.
     */
    @Test
    void testRestarDosEnteros() {
        assertEquals(3, resta.restar(7, 4));
    }

    /**
     * Prueba el método {@link Resta#restar(double, double, double)} para la resta de tres números reales.
     * Se espera que la resta de 10.0, 5.0 y 4.0 sea 1.0.
     */
    @Test
    void testRestarTresReales() {
        assertEquals(1.0, resta.restar(10.0, 5.0, 4.0), 0.0001);
    }

    /**
     * Prueba el método {@link Resta#restarAcumulado(double)} para la resta acumulada.
     * Se resta 5 al valor acumulado (inicialmente 0), por lo que el resultado esperado es -5.0.
     */
    @Test
    void testRestarAcumulado() {
        resta.restarAcumulado(5);
        assertEquals(-5.0, resta.getValorAcumulado(), 0.0001);
    }
}