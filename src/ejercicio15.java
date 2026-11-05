import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero del 1 al 10: ");
        int numero = scanner.nextInt();
        switch (numero) {
            case 1:
                System.out.println("El número en letra es: uno");
                break;
            case 2:
                System.out.println("El número en letra es: dos");
                break;
            case 3:
                System.out.println("El número en letra es: tres");
                break;
            case 4:
                System.out.println("El número en letra es: cuatro");
                break;
            case 5:
                System.out.println("El número en letra es: cinco");
                break;
            case 6:
                System.out.println("El número en letra es: seis");
                break;
            case 7:
                System.out.println("El número en letra es: siete");
                break;
            case 8:
                System.out.println("El número en letra es: ocho");
                break;
            case 9:
                System.out.println("El número en letra es: nueve");
                break;
            case 10:
                System.out.println("El número en letra es: diez");
                break;
        }
    }
}
