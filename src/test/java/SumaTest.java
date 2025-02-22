import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumaTest {
    private Suma suma;
    @BeforeEach
    void setUp() {
         suma  = new Suma();
    }

    @Test
    void getValorAcumulado() {
    }

    @Test
    void sumar() {
    }

    @Test
    void testSumar() {
        double resultado = suma.sumar(2,3);
        assertEquals(5, resultado, "el resultado debe ser 5");
        System.out.println("resultado esperado : 6.0, resultado obtenido . " + resultado);
        System.out.flush();
    }

    @Test
    void testSumar1() {
        double resultado = suma.sumar(8,14);
        assertEquals(22, resultado, "el resultado debe ser 22");
        System.out.println("el resultado esperado debe ser " + resultado);

    }

    @Test
    void sumarAcumulado() {
        suma.sumarAcumulado(5);
        assertEquals(5,suma.getValorAcumulado(), "el valor acumulado es tanto");

        suma.sumarAcumulado(8);
        System.out.println("valor es " + suma.sumarAcumulado(4));
    }
}