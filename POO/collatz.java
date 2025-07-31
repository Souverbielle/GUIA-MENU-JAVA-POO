import java.util.Scanner;

public class collatz {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        // Solicita al usuario un número entero positivo
        System.out.print("Ingresa un numero positivo: ");
        int numero = escaner.nextInt();

        // Aplica la secuencia de Collatz hasta llegar a 1
        while (numero != 1) {
            System.out.print(numero + " ---> ");

            // Si es par se divide entre 2
            if (numero % 2 == 0) {
                numero = numero / 2;
            } else {
                // Si es impar se multiplica por 3 y se le suma 1
                numero = numero * 3 + 1;
            }
        }

        // Muestra el número final (siempre es 1)
        System.out.println(numero);
    }
}
