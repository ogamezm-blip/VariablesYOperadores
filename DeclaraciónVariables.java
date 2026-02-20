package tarea2;
import java.util.Scanner; 

public class DeclaraciónVariables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita los datos del usuario
        System.out.print("Por favor, ingresa tu nombre completo: ");
        String nombreUsuario = scanner.nextLine();
        
        System.out.print("Ingresa tu edad: ");
        int edadUsuario = scanner.nextInt();

        System.out.print("Ingresa tu altura en metros (ejemplo: 1.60): ");
        double alturaUsuario = scanner.nextDouble();

        System.out.print("¿Eres estudiante activo? (escribe true o false): ");
        boolean esEstudiante = scanner.nextBoolean();

        // Salida de datos
        System.out.println("DATOS DEL USUARIO:");
        System.out.println("Nombre: " + nombreUsuario);
        System.out.println("Edad: " + edadUsuario + " años");
        System.out.println("Altura: " + alturaUsuario + " m");
        System.out.println("Estado de estudiante: " + esEstudiante);

        scanner.close();
    }
}