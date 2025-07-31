import java.util.Scanner;
 
public class ValidadorContrasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasena;
 
        do {
            System.out.print("Ingresa una contrasena segura: ");
            contrasena = sc.nextLine();
 
            if (!esContrasenaSegura(contrasena)) {
                System.out.println("Contrasena invalida,debe tener al menos 8 caracteres, una mayuscula, una minuscula y un numero.");
            }
 
        } while (!esContrasenaSegura(contrasena));
 
        System.out.println("Contrasena buena");
    }
 
    public static boolean esContrasenaSegura(String contrasena) {
        return contrasena.length() >= 8 &&
               contrasena.matches(".*[A-Z].*") &&
               contrasena.matches(".*[a-z].*") &&
               contrasena.matches(".*\\d.*");
    }
}