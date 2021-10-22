package EjerciciosUT2;

import java.util.Scanner;

public class Ejercicio04Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número límite");
        int num = sc.nextInt();

        Ejercicio04 hilo1 = new Ejercicio04(num, "Hilo1");
        Ejercicio04 hilo2 = new Ejercicio04(num, "Hilo2");

        hilo1.start();
        hilo2.start();
    }
}
