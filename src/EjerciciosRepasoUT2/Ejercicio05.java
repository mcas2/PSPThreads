package EjerciciosRepasoUT2;

import java.util.Scanner;

public class Ejercicio05 implements Runnable {
    Thread t;
    String nomen;
    Scanner sc = new Scanner(System.in);

    public Ejercicio05(String nomen){
        this.nomen = nomen;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Introduce un número");
        int max = sc.nextInt();
        for (int i = 0; i < max; i++) {
            System.out.println(i + " " + nomen);
        }
    }
}
