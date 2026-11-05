import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int valor = scanner.nextInt();
        if (valor >= 0) {
            System.out.println("El valor es positivo");
        } else {
            System.out.println("El valor es negativo");
        }
    }
}
