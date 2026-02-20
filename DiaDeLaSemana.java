package tarea2;
import java.util.Scanner;

public class DiaDeLaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BUSCADOR DE DÍAS DE LA SEMANA");
        
        // Solicita el número al usuario
        System.out.print("Ingresa un número del 1 al 7: ");
        int numeroDia = scanner.nextInt();

        System.out.println("\nRESULTADO");

        // Estructura switch con los días de la semana
        switch (numeroDia) {
            case 1:
                System.out.println("El día 1 corresponde a: Lunes");
                break;
            case 2:
                System.out.println("El día 2 corresponde a: Martes");
                break;
            case 3:
                System.out.println("El día 3 corresponde a: Miércoles");
                break;
            case 4:
                System.out.println("El día 4 corresponde a: Jueves");
                break;
            case 5:
                System.out.println("El día 5 corresponde a: Viernes");
                break;
            case 6:
                System.out.println("El día 6 corresponde a: Sábado");
                break;
            case 7:
                System.out.println("El día 7 corresponde a: Domingo");
                break;
            default:
                // El default atrapa cualquier valor que no sea una eleccion correcta
                System.out.println("Error: El número ingresado (" + numeroDia + ") no es válido. Debe ser del 1 al 7.");
                break;
        }

        scanner.close();
    }
}