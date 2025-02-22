package calculadora.test;

import calculadora.Cociente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase para probar los métodos de la clase Cociente.
 */
public class CocienteTest {

    @Test
    public void testDividirReales() {
        double resultado = Cociente.dividirReales(10.0, 2.0);
        assertEquals(5.0, resultado, "El resultado de 10.0 / 2.0 debe ser 5.0");
    }

    @Test
    public void testDividirEnteros() {
        int resultado = Cociente.dividirEnteros(9, 3);
        assertEquals(3, resultado, "El resultado de 9 / 3 debe ser 3");
    }

    @Test
    public void testInverso() {
        double resultado = Cociente.inverso(4.0);
        assertEquals(0.25, resultado, 0.001, "El inverso de 4.0 debe ser 0.25");
    }

    @Test
    public void testRaiz() {
        double resultado = Cociente.raiz(16.0);
        assertEquals(4.0, resultado, "La raíz cuadrada de 16.0 debe ser 4.0");
    }

    // Casos de prueba con valores problemáticos

    @Test
    public void testDividirRealesPorCero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> Cociente.dividirReales(10.0, 0));
        assertEquals("Error: No se puede dividir 10.0 entre cero", exception.getMessage());
    }

    @Test
    public void testDividirEnterosPorCero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> Cociente.dividirEnteros(5, 0));
        assertEquals("Error: No se puede dividir 5 entre cero", exception.getMessage());
    }

    @Test
    public void testInversoDeCero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> Cociente.inverso(0));
        assertEquals("Error: No se puede calcular el inverso de cero", exception.getMessage());
    }

    @Test
    public void testRaizNegativa() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Cociente.raiz(-9));
        assertEquals("Error: No se puede calcular la raíz cuadrada de un número negativo", exception.getMessage());
    }
}