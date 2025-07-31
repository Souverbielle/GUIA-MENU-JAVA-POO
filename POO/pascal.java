import java.util.Scanner;
public class pascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se solicita la cantidad de filas del triángulo
        System.out.print("¿Cuantas filas del Triangulo de Pascal quieres?: ");
        int numero = scanner.nextInt();

        // Se genera fila por fila del triangulo
        for (int fila = 0; fila < numero; fila++) {
            int valor = 1;

            // Imprime espacios al inicio para dar forma de piramide
            for (int s = 0; s < numero - fila; s++) {
                System.out.print(" ");
            }

            // Calcula e imprime los valores de cada fila
            for (int col = 0; col <= fila; col++) {
                System.out.print(valor + " ");
                // Actualiza el valor según el coeficiente binomial
                valor = valor * (fila - col) / (col + 1);
            }

            // Salto de línea al final de cada fila
            System.out.println();
        }
    }
}
