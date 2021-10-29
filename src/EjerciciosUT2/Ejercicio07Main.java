package EjerciciosUT2;

import java.util.Scanner;

public class Ejercicio07Main {
    public static void main(String[] args) {
        System.out.println("Introduce el tipo");
        Scanner sc = new Scanner(System.in);
        int tipo = 0;
        do {
            tipo = sc.nextInt();
        } while ((tipo!=1)&&(tipo!=2));

        Ejercicio07 hilo = new Ejercicio07(tipo);
    }
}
