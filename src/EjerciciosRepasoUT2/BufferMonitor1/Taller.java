package EjerciciosRepasoUT2.BufferMonitor1;

public class Taller implements Runnable {
    Thread t;
    Concesionario c;
    String modelo;

    public Taller(Concesionario c, String modelo, String name) {
        this.c = c;
        this.modelo = modelo;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            c.producir(modelo, t.getName());
        }
    }
}
