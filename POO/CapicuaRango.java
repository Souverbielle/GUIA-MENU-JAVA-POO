import java.util.Scanner;

public class CapicuaRango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, fin;

        System.out.print("pon el numero inicial del rango: ");
        inicio = sc.nextInt();
        System.out.print("introduce el numero final del rango: ");
        fin = sc.nextInt();

        System.out.println("numeros capicua en el rango:");
        for (int i = inicio; i <= fin; i++) {
            if (esCapicua(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean esCapicua(int numero) {
        int original = numero;
        int volteado = 0;

        while (numero > 0) {
            int digito = numero % 10;
            volteado = volteado * 10 + digito;
            numero /= 10;
        }

        return original == volteado;
    }
}

