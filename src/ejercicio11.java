import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int valor = scanner.nextInt();
        int valor2;
        System.out.print("Ingrese otro valor: ");
        valor2 = scanner.nextInt();
        if (valor < valor2) {
            System.out.println("Los valores en orden ascendente son: " + valor + ", " + valor2);
        } else if (valor > valor2) {
            System.out.println("Los valores en orden ascendente son: " + valor2 + ", " + valor);
        } else {
            System.out.println("Los valores son iguales: " + valor);
        }
    }
}
