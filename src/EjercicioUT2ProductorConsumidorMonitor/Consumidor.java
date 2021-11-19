package EjercicioUT2ProductorConsumidorMonitor;

public class Consumidor extends Thread {
    String nombre;
    BufferMonitor vitrina;

    public Consumidor(BufferMonitor vitrina, String nombre){
        super(nombre);
        this.vitrina = vitrina;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            vitrina.get(nombre);
        }
    }
}
