package calculadora;

public class Cociente {

    //Esta clase implementará todos los métodos que están relacionados con la división de la calculadora. Esta
    //clase tendrá los siguientes métodos:
    //1. División de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
    //2. División de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la
    //solución.
    //3. Inverso de un número real, tendrá un parámetro de entrada y uno de salida que será la solución.
    //4. Raíz de un número, tendrá un parámetro de entra y uno de salida que será la solución.

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

    public static void main(String[] args) {
        try {
            System.out.println("División de dos reales: " + dividirReales(10.5, 2.5));
            System.out.println("División de dos enteros: " + dividirEnteros(10, 2));
            System.out.println("Inverso de un número real: " + inverso(5.0));
            System.out.println("Raíz cuadrada de un número: " + raiz(16));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
