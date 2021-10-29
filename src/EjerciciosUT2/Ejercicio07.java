package EjerciciosUT2;

public class Ejercicio07 implements Runnable {
    Thread t;
    int tipo;

    public Ejercicio07 (int tipo) {
        this.tipo = tipo;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        if (tipo==1) {
            for (int i = 1; i <= 30; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 97; i < 122; i++) {
                System.out.println((char)i);
            }
        }
    }
}
