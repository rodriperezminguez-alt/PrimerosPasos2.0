import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        // Realiza un programa que lea dos números enteros y dependiendo de la operación que indique el usuario (+, -, * , /) muestre el resultado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int valor = scanner.nextInt();
        System.out.print("Ingrese otro valor: ");
        int valor2 = scanner.nextInt();
        System.out.print("Ingrese la operación que desea realizar (+, -, *, /): ");
        String operacion = scanner.next();
        switch (operacion) {
            case "+":
                System.out.println("El resultado es: " + (valor + valor2));
                break;
            case "-":
                System.out.println("El resultado es: " + (valor - valor2));
                break;
            case "*":
                System.out.println("El resultado es: " + (valor * valor2));
                break;
            case "/":
                System.out.println("El resultado es: " + (valor / valor2));
                break;
        }
    }
}
