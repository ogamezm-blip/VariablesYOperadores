package tarea2;
import java.util.Scanner;

public class OperacionesMatematicas_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // SECCIÓN DOUBLE
        System.out.println("\n[ 1. Operaciones con DOUBLE ]");
        System.out.print("Ingresa el primer double (ej. 10.5): ");
        double d1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo double (ej. 3.2): ");
        double d2 = scanner.nextDouble();
        System.out.println("Resultados Double -> Suma: " + (d1 + d2) + " | Resta: " + (d1 - d2) + 
                           " | Mult: " + (d1 * d2) + " | Div: " + (d1 / d2));

        // SECCIÓN FLOAT
        System.out.println("\n[ 2. Operaciones con FLOAT ]");
        System.out.print("Ingresa el primer float: ");
        float f1 = scanner.nextFloat();
        System.out.print("Ingresa el segundo float: ");
        float f2 = scanner.nextFloat();
        System.out.println("Resultados Float -> Suma: " + (f1 + f2) + " | Resta: " + (f1 - f2) + 
                           " | Mult: " + (f1 * f2) + " | Div: " + (f1 / f2));

        // SECCIÓN SHORT
        System.out.println("\n[ 3. Operaciones con SHORT ]");
        System.out.print("Ingresa el primer short (-32768 a 32767): ");
        short s1 = scanner.nextShort();
        System.out.print("Ingresa el segundo short: ");
        short s2 = scanner.nextShort();
        System.out.println("Resultados Short -> Suma: " + (s1 + s2) + " | Resta: " + (s1 - s2) + 
                           " | Mult: " + (s1 * s2) + " | Div: " + (s1 / s2));

        // SECCIÓN BYTE
        System.out.println("\n[ 4. Operaciones con BYTE ]");
        System.out.print("Ingresa el primer byte (-128 a 127): ");
        byte b1 = scanner.nextByte();
        System.out.print("Ingresa el segundo byte: ");
        byte b2 = scanner.nextByte();
        System.out.println("Resultados Byte -> Suma: " + (b1 + b2) + " | Resta: " + (b1 - b2) + 
                           " | Mult: " + (b1 * b2) + " | Div: " + (b1 / b2));

        System.out.println("\nANÁLISIS DE DIVISIÓN:");
        System.out.println("- Double/Float: Mantienen los decimales.");
        System.out.println("- Short/Byte: Al ser tipos enteros, TRUNCAN el resultado (5/2 = 2).");
        
        scanner.close();
    }
}