import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa la calificación (0-100): ");
        int calificacion = input.nextInt();

        if (calificacion >= 60) {
            System.out.println("El alumno aprueba.");
        } else {
            System.out.println("El alumno reprueba.");
        }
    }
}