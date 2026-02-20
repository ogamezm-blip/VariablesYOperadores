
package tarea2;
import java.util.Scanner;

public class OperacionesLogicas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("OPERADORES DE COMPARACIÓN Y LÓGICOS");

        // Solicita los dos valores
        System.out.print("Ingresa el primer número (A): ");
        double a = scanner.nextDouble();

        System.out.print("Ingresa el segundo número (B): ");
        double b = scanner.nextDouble();

        // Operadores de Comparación
        boolean esMayor = a > b;
        boolean esMenor = a < b;
        boolean esIgual = a == b;

        System.out.println("\n--- RESULTADOS DE COMPARACIÓN ---");
        System.out.println("¿A es mayor que B? (" + a + " > " + b + "): " + esMayor);
        System.out.println("¿A es menor que B? (" + a + " < " + b + "): " + esMenor);
        System.out.println("¿A es exactamente igual a B? (" + a + " == " + b + "): " + esIgual);

        // Operadores Lógicos
        System.out.println("\nAPLICANDO OPERADORES LÓGICOS");

        // Operador Logico: AND (&&)
        boolean ejemploAnd = (a > 0) && (b > 0);
        System.out.println("¿Ambos números son positivos? (A > 0 AND B > 0): " + ejemploAnd);

        // Operador Logico: OR (||)
        boolean ejemploOr = (a > 100) || (b > 100);
        System.out.println("¿Al menos uno es mayor a 100? (A > 100 OR B > 100): " + ejemploOr);

        // Combinación de operadores logicos
        boolean combinada = (a != b) && (a > 0);
        System.out.println("¿Son diferentes Y además A es positivo?: " + combinada);

        scanner.close();
    }
}