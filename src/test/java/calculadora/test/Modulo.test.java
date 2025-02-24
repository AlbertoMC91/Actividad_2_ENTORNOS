package calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModuloTest {

    /**
     * Pruebas para el método calcularResiduo de la clase Modulo.
     * Este método calcula el residuo de la división entre dos números enteros.
     */

    @Test
    void testCalcularResiduo_NumerosPositivos() {
        // Caso con números positivos
        int a = 10;
        int b = 3;
        int resultadoEsperado = 1;

        int resultado = Modulo.calcularResiduo(a, b);

        assertEquals(resultadoEsperado, resultado, "El residuo de 10 % 3 debe ser 1.");
    }

    @Test
    void testCalcularResiduo_DividendoNegativo() {
        // Caso donde el dividendo es negativo
        int a = -10;
        int b = 3;
        int resultadoEsperado = -1;

        int resultado = Modulo.calcularResiduo(a, b);

        assertEquals(resultadoEsperado, resultado, "El residuo de -10 % 3 debe ser -1.");
    }

    @Test
    void testCalcularResiduo_DivisorNegativo() {
        // Caso donde el divisor es negativo
        int a = 10;
        int b = -3;
        int resultadoEsperado = 1;

        int resultado = Modulo.calcularResiduo(a, b);

        assertEquals(resultadoEsperado, resultado, "El residuo de 10 % -3 debe ser 1.");
    }

    @Test
    void testCalcularResiduo_AmbosNegativos() {
        // Caso donde tanto el dividendo como el divisor son negativos
        int a = -10;
        int b = -3;
        int resultadoEsperado = -1;

        int resultado = Modulo.calcularResiduo(a, b);

        assertEquals(resultadoEsperado, resultado, "El residuo de -10 % -3 debe ser -1.");
    }

    @Test
    void testCalcularResiduo_DivisorMayorQueDividendo() {
        // Caso donde el divisor es mayor que el dividendo
        int a = 3;
        int b = 10;
        int resultadoEsperado = 3;

        int resultado = Modulo.calcularResiduo(a, b);

        assertEquals(resultadoEsperado, resultado, "El residuo de 3 % 10 debe ser 3.");
    }

    @Test
    void testCalcularResiduo_DivisorEsUno() {
        // Caso donde el divisor es 1
        int a = 10;
        int b = 1;
        int resultadoEsperado = 0;

        int resultado = Modulo.calcularResiduo(a, b);

        assertEquals(resultadoEsperado, resultado, "El residuo de 10 % 1 debe ser 0.");
    }

    @Test
    void testCalcularResiduo_DivisorEsMenosUno() {
        // Caso donde el divisor es -1
        int a = 10;
        int b = -1;
        int resultadoEsperado = 0;

        int resultado = Modulo.calcularResiduo(a, b);

        assertEquals(resultadoEsperado, resultado, "El residuo de 10 % -1 debe ser 0.");
    }

    @Test
    void testCalcularResiduo_DivisorEsCero() {
        // Caso donde el divisor es 0, debe lanzar una excepción
        int a = 10;
        int b = 0;

        assertThrows(ArithmeticException.class, () -> Modulo.calcularResiduo(a, b),
                "La división por cero debe lanzar ArithmeticException.");
    }

    @Test
    void testCalcularResiduo_DividendoEsCero() {
        // Caso donde el dividendo es 0
        int a = 0;
        int b = 10;
        int resultadoEsperado = 0;

        int resultado = Modulo.calcularResiduo(a, b);

        assertEquals(resultadoEsperado, resultado, "El residuo de 0 % 10 debe ser 0.");
    }
}