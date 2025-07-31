import java.util.Scanner;
import java.util.Random;

public class NumeroMisterioso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numeroSecreto = rand.nextInt(100) + 1;
        int intentos = 7;
        int intentoUsuario;

        System.out.println("Bienvenido al juego del numero misterioso");
        System.out.println("Adivina el numero entre 1 y 100, tienes 7 intentos.");

        while (intentos > 0) {
            System.out.print("Ingresa tu intento: ");
            intentoUsuario = sc.nextInt();

            if (intentoUsuario == numeroSecreto) {
                System.out.println("Adivinastee");
                break;
            } else {
                intentos--;
                if (Math.abs(intentoUsuario - numeroSecreto) < 10) {
                    System.out.println("Casiii, esytas cerca");
                }

                if (intentoUsuario < numeroSecreto) {
                    System.out.println("El numero secreto es mayor.");
                } else {
                    System.out.println("El numero secreto es menor.");
                }

                if (intentos > 0) {
                    System.out.println("Te quedan " + intentos + " intento(s).");
                } else {
                    System.out.println("Ni modo, no adivinaste, el numero era: " + numeroSecreto);
                }
            }
        }
    }
}