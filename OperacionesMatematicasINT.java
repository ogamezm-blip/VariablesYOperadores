package tarea2;
import java.util.Scanner;

public class OperacionesMatematicasINT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA DE ENTEROS");
        // Solicita los numeros
        System.out.print("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Operaciones matematicas
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2; 

        // Salida de datos
        System.out.println("\n RESULTADOS: ");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División (Entera): " + division);
        
        scanner.close();
    }
}