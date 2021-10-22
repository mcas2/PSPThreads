package EjerciciosUT2;

import java.util.Scanner;

public class Ejercicio05Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce límite");
        int num = sc.nextInt();

        Ejercicio05 hilo1 = new Ejercicio05(num, "Hilo1");
    }
}
