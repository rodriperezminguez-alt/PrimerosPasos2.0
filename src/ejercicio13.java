import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int valor = scanner.nextInt();
        System.out.print("Ingrese otro valor: ");
        int valor2 = scanner.nextInt();
        System.out.print("Ingrese 1 para orden ascendente o cualquier otro número para orden descendente: ");
        int orden = scanner.nextInt();

        if (orden == 1) {
            if (valor < valor2) {
                System.out.println("Los valores en orden ascendente son: " + valor + ", " + valor2);
            } else if (valor > valor2) {
                System.out.println("Los valores en orden ascendente son: " + valor2 + ", " + valor);
            } else {
                System.out.println("Los valores son iguales: " + valor);
            }
        } else {
            if (valor > valor2) {
                System.out.println("Los valores en orden descendente son: " + valor + ", " + valor2);
            } else if (valor < valor2) {
                System.out.println("Los valores en orden descendente son: " + valor2 + ", " + valor);
            } else {
                System.out.println("Los valores son iguales: " + valor);
            }
        }
    }
}


