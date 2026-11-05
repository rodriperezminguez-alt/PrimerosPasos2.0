import java.util.Scanner;

public class ejercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int valor = scanner.nextInt();
        System.out.print("Ingrese otro valor: ");
        int valor2 = scanner.nextInt();
        int resultado = 0;
        for (int i = 0; i < valor2; i++) {
            resultado += valor;
        }
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
