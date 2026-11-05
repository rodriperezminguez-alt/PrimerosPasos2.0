import java.util.Scanner;

public class ejercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el dividendo y el divisor: ");
        int dividendo = scanner.nextInt();
        int divisor = scanner.nextInt();

        int resto = dividendo;

        for (int i = 0; i < dividendo / divisor; i++) {
            resto -= divisor;
        }

        System.out.println("El resto de la división de " + dividendo + " entre " + divisor + " es: " + resto);
    }
}
