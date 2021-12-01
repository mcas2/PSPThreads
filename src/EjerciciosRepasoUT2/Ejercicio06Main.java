package EjerciciosRepasoUT2;

import java.util.Scanner;

public class Ejercicio06Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números de la sucesión quieres conocer?");
        int num = sc.nextInt();
        Ejercicio06 e6 = new Ejercicio06(num, "Filum I");
        e6.start();
    }
}
