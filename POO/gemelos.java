import java.util.Scanner;

public class gemelos {
    // Función que determina si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero < 2) return false; // Los menores a 2 no son primos
        // Verifica si tiene algún divisor entre 2 y el número - 1
        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                return false; // No es primo si tiene divisores
            }
        }
        return true; // Es primo si no se encontró divisor
    }

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        // Solicita un número límite al usuario
        System.out.print("Ingresa un número: ");
        int limite = escaner.nextInt();
        System.out.println("Pares de primos gemelos menores que " + limite + ":");

        // Recorre los números desde 2 hasta el límite - 2
        for (int numero = 2; numero < limite - 1; numero++) {
            // Verifica si el número y el número + 2 son primos
            if (esPrimo(numero) && esPrimo(numero + 2)) {
                // Si lo son, imprime el par de primos gemelos
                System.out.println(numero + " y " + (numero + 2));
            }
        }
    }
}
