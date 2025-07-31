import java.util.Scanner; 
public class NumeroMayor { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
int numero; 
do { 
System.out.print("Introduce un número mayor que 100: "); 
numero = scanner.nextInt(); 
} while (numero <= 100); 
System.out.println("¡Gracias! El número ingresado es " + 
numero); 
} 
} 