import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("     MENU PRINCIPAL      ");
            System.out.println("1. Calificacion");
            System.out.println("2. Capicua Rango");
            System.out.println("3. Collatz");
            System.out.println("4. Contar Pares o Impares");
            System.out.println("5. Conversor Temperaturas");

            System.out.println("6. Edad Acceso");
            System.out.println("7. Positivo o Negativo o Cero");
            System.out.println("8. Gemelos");
            System.out.println("9. Adivinanza");
            System.out.println("10. Numero Mayor");

            System.out.println("11. Numero Misterioso");
            System.out.println("12. Numero Palindromos");
            System.out.println("13. Numero Perfectos");
            System.out.println("14. Numero Primos");

            System.out.println("15. Numero Perfectos");
            System.out.println("16. Par o Impar");
            System.out.println("17. Pascal");
            System.out.println("18. Promedio Calificaciones");

            System.out.println("19. Suma de Naturales");
            System.out.println("20. Tabla Multiplicar");
            System.out.println("21. Triangulo Asteriscos");
            System.out.println("22. Validador Contraseña");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Por favor ingrese un número válido: ");
                scanner.next(); 
            }

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: Calificacion.main(null); break;
                case 2: CapicuaRango.main(null); break;
                case 3: collatz.main(null); break;
                case 4: ContarParesImpares.main(null); break;

                case 5: ConversorTemperaturas.main(null); break;
                case 6: Edad_acceso.main(null); break;
                case 7: Ejercicio1.main(null); break;

                case 8: gemelos.main(null); break;
                case 9: JuegoAdivinanza.main(null); break;
                case 10: NumeroMayor.main(null); break;
                case 11: NumeroMisterioso.main(null); break;
                case 12: NumerosPalindromos.main(null); break;
                case 13: NumerosPerfectos.main(null); break;
                case 14: NumerosPrimos.main(null); break;
                case 15: numperfectos.main(null); break;
                
                case 16: par_o_impar.main(null); break;
                case 17: pascal.main(null); break;
                case 18: PromedioCalificaciones.main(null); break;
                case 19: SumaNaturales.main(null); break;

                case 20: TablaMultiplicar.main(null); break;
                case 21: TrianguloAsteriscos.main(null); break;
                case 22: ValidadorContrasena.main(null); break;
                case 0: 
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("No existe eso, intenta de nuevo.");
            }

            System.out.println();

        } while (opcion != 0);

        scanner.close();
    }
}