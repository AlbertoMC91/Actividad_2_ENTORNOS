package calculadora.test;

import calculadora.Cociente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para la clase {@link Cociente}.
 */
public class CocienteTest {

    /**
     * Prueba el método dividirReales para dos números reales válidos.
     * Se espera que la división de 10.0 entre 2.0 sea 5.0.
     */
    @Test
    public void testDividirReales() {
        double resultado = Cociente.dividirReales(10.0, 2.0);
        assertEquals(5.0, resultado, 0.0001);
    }

    /**
     * Verifica que dividirReales lance una ArithmeticException al intentar dividir entre cero.
     */
    @Test
    public void testDividirRealesPorCero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Cociente.dividirReales(10.0, 0.0);
        });
        String mensajeEsperado = "No se puede dividir";
        String mensajeReal = exception.getMessage();
        assertTrue(mensajeReal.contains(mensajeEsperado));
    }

    /**
     * Prueba el método dividirEnteros para dos números enteros válidos.
     * Se espera que la división de 10 entre 2 sea 5.
     */
    @Test
    public void testDividirEnteros() {
        int resultado = Cociente.dividirEnteros(10, 2);
        assertEquals(5, resultado);
    }

    /**
     * Verifica que dividirEnteros lance una ArithmeticException al intentar dividir entre cero.
     */
    @Test
    public void testDividirEnterosPorCero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Cociente.dividirEnteros(10, 0);
        });
        String mensajeEsperado = "No se puede dividir";
        String mensajeReal = exception.getMessage();
        assertTrue(mensajeReal.contains(mensajeEsperado));
    }

    /**
     * Prueba el método inverso con un número válido.
     * Se espera que el inverso de 5.0 sea 0.2.
     */
    @Test
    public void testInverso() {
        double resultado = Cociente.inverso(5.0);
        assertEquals(0.2, resultado, 0.0001);
    }

    /**
     * Verifica que el método inverso lance una ArithmeticException al intentar calcular el inverso de 0.
     */
    @Test
    public void testInversoCero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Cociente.inverso(0.0);
        });
        String mensajeEsperado = "No se puede calcular el inverso de cero";
        String mensajeReal = exception.getMessage();
        assertTrue(mensajeReal.contains(mensajeEsperado));
    }

    /**
     * Prueba el método raiz con un número positivo.
     * Se espera que la raíz cuadrada de 25.0 sea 5.0.
     */
    @Test
    public void testRaiz() {
        double resultado = Cociente.raiz(25.0);
        assertEquals(5.0, resultado, 0.0001);
    }

    /**
     * Verifica que el método raiz lance una IllegalArgumentException al intentar calcular la raíz
     * cuadrada de un número negativo.
     */
    @Test
    public void testRaizNegativa() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Cociente.raiz(-25.0);
        });
        String mensajeEsperado = "No se puede calcular la raíz cuadrada de un número negativo";
        String mensajeReal = exception.getMessage();
        assertTrue(mensajeReal.contains(mensajeEsperado));
    }
}