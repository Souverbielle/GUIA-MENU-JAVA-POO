import java.util.Scanner;

public class Edad_acceso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa tu edad");
        int edad = input.nextInt();

        if (edad >= 18) {
            System.out.println("Puedes entrar a la fiesta");

    } else if (edad >=16) {
            System.out.println("Puedes entrar, pero con permiso");

        } else if (edad <16) {
            System.out.println("No puedes entrar a la fiesta");
        }
    }
   }



