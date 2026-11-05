import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nota del examen (0-10): ");
        int nota = scanner.nextInt();

        if (nota >= 0) {
            if (nota < 5) {
                System.out.println("Insuficiente");
            } else if (nota < 6) {
                System.out.println("Suficiente");
            } else if (nota < 7) {
                System.out.println("Bien");
            } else if (nota < 9) {
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente");
            }
        } else {
            System.out.println("Nota inválida. Debe estar entre 0 y 10.");
        }
    }
}
