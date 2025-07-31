import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secreto = (int)(Math.random() * 100) + 1;
        int intento;

        do {
            System.out.print("Adivina el numero de (1 a 100): ");
            intento = sc.nextInt();

            if (intento < secreto) {
                System.out.println("te falta");
            } else if (intento > secreto) {
                System.out.println("Te pasaste");
            }
        } while (intento != secreto);

        System.out.println("Adivinaste, el numero era " + secreto);
    }
}