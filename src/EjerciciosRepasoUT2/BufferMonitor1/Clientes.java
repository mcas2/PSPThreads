package EjerciciosRepasoUT2.BufferMonitor1;

public class Clientes extends Thread {
    Concesionario c;
    String clase;

    public Clientes(Concesionario c, String name, String clase){
        super(name);
        this.c = c;
        this.clase = clase;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            c.consumir(clase, getName());
        }
    }
}
