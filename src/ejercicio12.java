import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int valor = scanner.nextInt();
        System.out.print("Ingrese otro valor: ");
        int valor2 = scanner.nextInt();
        if (valor > valor2) {
            System.out.println("El valor más grande es: " + valor);
        } else if (valor < valor2) {
            System.out.println("El valor más grande es: " + valor2);
        } else {
            System.out.println("Los valores son iguales: " + valor);
        }
    }
}
