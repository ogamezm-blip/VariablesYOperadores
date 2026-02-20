package tarea2;
import java.util.Scanner;

public class ClasificacionEdad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CLASIFICADOR DE ETAPAS DE VIDA");
        
        // Solicita la edad del usuario
        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("\nRESULTADO DE LA CLASIFICACIÓN");
        
        if (edad < 0) {
            // Validación por si ingresan números negativos
            System.out.println("Error: La edad no puede ser un número negativo.");
        } 
        else if (edad < 12) {
            // Menos de 12 años
            System.out.println("Categoría: Niño");
            System.out.println("Edad: " + edad);
        } 
        else if (edad >= 12 && edad <= 17) {
            // Rango de 12 a 17 años
            System.out.println("Categoría: Adolescente");
            System.out.println("Edad: " + edad);
        } 
        else if (edad >= 18 && edad <= 59) {
            // Rango de 18 a 59 años
            System.out.println("Categoría: Adulto");
            System.out.println("Edad: " + edad);
        } 
        else {
            // 60 años o más
            System.out.println("Categoría: Adulto mayor");
            System.out.println("Edad: " + edad);
        }

        scanner.close();
    }
}