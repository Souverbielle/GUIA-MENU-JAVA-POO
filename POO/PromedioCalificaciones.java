import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int calificacion;

        do {
            System.out.print("Ingresa una calificacion de (0 a 10 y un numero negativo para terminar): ");
            calificacion = sc.nextInt();

            if (calificacion >= 0 && calificacion <= 10) {
                suma += calificacion;
                contador++;
            } else if (calificacion > 10) {
                System.out.println("Calificacion invalida. Solo se pueden valores entre 0 y 10.");
            }

        } while (calificacion >= 0);

        if (contador > 0) {
            double promedio = (double)suma / contador;
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("No se ingresaron calificaciones validas.");
        }
    }
}