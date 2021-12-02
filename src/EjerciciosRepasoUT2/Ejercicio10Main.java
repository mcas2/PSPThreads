package EjerciciosRepasoUT2;

import java.util.Scanner;

public class Ejercicio10Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int optio = 0;
        do {
            System.out.println("Introduce 1 para letras, 2 para números");
            optio = sc.nextInt();
        } while (optio!=1 && optio!=2);

        Ejercicio10 e10 = new Ejercicio10(optio);
        new Thread(e10).start();
    }
}
