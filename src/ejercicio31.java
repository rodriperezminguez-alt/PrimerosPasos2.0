import java.util.Scanner;

public class ejercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número natural: ");
        int numero = scanner.nextInt();
        System.out.print("Los divisores de " + numero + " son: ");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
