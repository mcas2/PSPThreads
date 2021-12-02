package EjerciciosRepasoUT2;

public class Ejercicio10 implements Runnable {
    int optio;

    public Ejercicio10(int optio) {
        this.optio = optio;
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

