import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las horas: ");
        int horas = scanner.nextInt();
        System.out.print("Ingrese los minutos: ");
        int minutos = scanner.nextInt();
        System.out.print("Ingrese los segundos: ");
        int segundos = scanner.nextInt();
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}
