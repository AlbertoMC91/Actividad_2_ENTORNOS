package calculadora.test;

import calculadora.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase para probar los métodos de la clase Producto.
 */
public class ProductoTest {

    Producto producto = new Producto();

    @Test
    public void testMultiplicarReales() {
        double resultado = producto.multiplicar(3.5, 2.0);
        assertEquals(7.0, resultado, "El producto de 3.5 y 2.0 debe ser 7.0");
    }

    @Test
    public void testMultiplicarEnteros() {
        int resultado = producto.multiplicar(3, 4);
        assertEquals(12, resultado, "El producto de 3 y 4 debe ser 12");
    }

    @Test
    public void testMultiplicarTresReales() {
        double resultado = producto.multiplicar(2.0, 3.0, 4.0);
        assertEquals(24.0, resultado, "El producto de 2.0, 3.0 y 4.0 debe ser 24.0");
    }

    @Test
    public void testPotencia() {
        double resultado = producto.potencia(2.0, 3.0);
        assertEquals(8.0, resultado, "2 elevado a 3 debe ser 8.0");
    }

    // Caso de prueba con números negativos
    @Test
    public void testMultiplicarRealesNegativos() {
        double resultado = producto.multiplicar(-2.0, 4.0);
        assertEquals(-8.0, resultado, "El producto de -2.0 y 4.0 debe ser -8.0");
    }

    // Caso de prueba con valores 0
    @Test
    public void testMultiplicarPorCero() {
        double resultado = producto.multiplicar(0.0, 100.0);
        assertEquals(0.0, resultado, "El producto de 0.0 y 100.0 debe ser 0.0");
    }

    @Test
    public void testPotenciaCero() {
        double resultado = producto.potencia(0.0, 3.0);
        assertEquals(0.0, resultado, "0 elevado a 3 debe ser 0.0");
    }
}