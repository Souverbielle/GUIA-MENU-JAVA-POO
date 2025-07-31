
public class NumerosPerfectos {
    public static void main(String[] args) {
        System.out.println("Números perfectos entre 1 y 1000:");

        for (int num = 1; num <= 1000; num++) {
            int suma = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    suma += i;
                }
            }
            if (suma == num) {
                System.out.println(num);
            }
        }
    }
}
