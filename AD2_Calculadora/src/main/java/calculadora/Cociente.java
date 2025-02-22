package calculadora;

public class Cociente {

    // Método para dividir dos números reales

    public static double dividirReales(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Error: No se puede dividir entre cero");
        }
        return num1 / num2;
    }

    // Método para dividir dos números enteros

    public static int dividirEnteros(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Error: No se puede dividir entre cero");
        }
        return num1 / num2;
    }

    // Método para calcular el inverso de un número real

    public static double inverso(double num) {
        if (num == 0) {
            throw new ArithmeticException("Error: No se puede calcular el inverso de cero");
        }
        return 1 / num;
    }

    // Método para calcular la raíz cuadrada de un número

    public static double raiz(double num) {
        if (num < 0) {
            throw new ArithmeticException("Error: No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(num);
    }

    }
}
