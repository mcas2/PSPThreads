package EjerciciosRepasoUT2;

import java.util.Scanner;

public class Ejercicio04 extends Thread {

    String nomen;
    Scanner sc = new Scanner(System.in);

    public Ejercicio04 (String nomen){
        this.nomen = nomen;
    }

    @Override
    public void run() {
        System.out.println("Introduce un número límite");
        int max = sc.nextInt();
        for (int i = 0; i < max; i++) {
            System.out.println(i + " " + nomen + " "+ getName());
        }
    }
}
