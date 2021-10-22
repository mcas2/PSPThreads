package EjerciciosUT2;

import java.util.Scanner;

public class Ejercicio06Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        int num = sc.nextInt();

        Ejercicio06 hilo = new Ejercicio06(num);

    }
}
