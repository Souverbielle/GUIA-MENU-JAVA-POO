import java.util.Scanner;

public class SumaNaturales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número N: ");
        int N = sc.nextInt();

        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += i;
        }

        System.out.println("La suma del 1 al " + N + " es: " + suma);
        sc.close();
    }
}






