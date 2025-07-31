import java.util.Scanner;
public class numperfectos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicita un número al usuario
        System.out.print("Ingresa un numero: ");
        int NUMERO = scanner.nextInt();

        // Muestra los números perfectos entre 1 y numero
        System.out.println("Números perfectos entre 1 y " + NUMERO + ":");

        // Se recorre cada número desde 1 hasta numero
        for (int num = 1; num <= NUMERO; num++) {
            int suma = 0;

            // Suma los divisores propios del número
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    suma += i; // Acumula los divisores
                }
            }

            // Si la suma de divisores equivale al número, es perfecto
            if (suma == num) {
                System.out.println(num);
            }
        }
    }
}
