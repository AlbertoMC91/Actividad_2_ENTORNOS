package calculadora.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import calculadora.Suma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para la clase {@link Suma}.
 * Esta clase contiene los métodos necesarios para realizar pruebas
 * unitarias sobre la funcionalidad de la clase {@link Suma}.
 */
public class SumaTest {
    private Suma suma;

    @BeforeEach
    void setUp() {
        suma = new Suma();
    }

    @Test
    void testSumar() {
        double resultado = suma.sumar(2, 3);
        assertEquals(5, resultado, "El resultado debe ser 5");
    }

    @Test
    void testSumar1() {
        double resultado = suma.sumar(8, 14);
        assertEquals(22, resultado, "El resultado debe ser 22");
    }

    @Test
    void testSumarAcumulado() {
        suma.sumarAcumulado(5);
        assertEquals(5, suma.getValorAcumulado(), "El valor acumulado debe ser 5");

        suma.sumarAcumulado(8);
        assertEquals(13, suma.getValorAcumulado(), "El valor acumulado debe ser 13");
    }

    @Test
    void testSumarAcumuladoMultiples() {
        suma.sumarAcumulado(3);
        suma.sumarAcumulado(4);
        suma.sumarAcumulado(5);
        assertEquals(12, suma.getValorAcumulado(), "El valor acumulado debe ser 12");
    }
}