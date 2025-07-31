import java.util.Scanner;

public class ConversorTemperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Ingresa temperatura en Celsius: ");
                double c = sc.nextDouble();
                double f = (c * 9/5) + 32;
                System.out.println("Fahrenheit: " + f);
            } else if (opcion == 2) {
                System.out.print("Ingresa temperatura en Fahrenheit: ");
                double f = sc.nextDouble();
                double c = (f - 32) * 5/9;
                System.out.println(" Celsius: " + c);
            }
        } while (opcion != 3);

        System.out.println("Programa terminado");
    }
}