package EjerciciosRepasoUT2;

public class Ejercicio07 implements Runnable {
    Thread t;
    int optio;

    public Ejercicio07(int optio) {
        this.optio = optio;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        if (optio==2){
            for (int i = 0; i < 31; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 0; i < 26; i++) {
                System.out.println((char)(i+97));
            }
        }

    }
}

