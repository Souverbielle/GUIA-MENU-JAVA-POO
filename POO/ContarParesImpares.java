import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número límite: ");
        int limite = sc.nextInt();

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
        sc.close();
    }
}
