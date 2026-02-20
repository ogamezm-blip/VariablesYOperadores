package tarea2;
import java.util.Scanner;

public class VerificacionDeAcceso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables que almacenan los datos del usuario
        String usuario = "admin";
        String password = "secreta123";

        System.out.println("SISTEMA DE SESION");

        // Ingreso de datos
        System.out.print("Ingrese su usuario: ");
        String usuarioIngresado = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String passwordIngresada = scanner.nextLine();

        System.out.println("\nESTADO DE AUTENTICACIÓN");

        // if-else anidado
        if (usuarioIngresado.equals(usuario)) {
            
            //Verifica el usuario y la contraseña
            if (passwordIngresada.equals(password)) {
                System.out.println("Acceso concedido.");
            } else {
                System.out.println("Contraseña incorrecta.");
            }
            
        } else {
            //Si el usuario no es correcto, no accede
            System.out.println("Usuario no registrado.");
        }

        scanner.close();
    }
}