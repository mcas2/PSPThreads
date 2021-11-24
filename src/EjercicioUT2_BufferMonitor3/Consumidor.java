package EjercicioUT2_BufferMonitor3;

public class Consumidor extends Thread {
    String nombre;
    int cantidad;
    public Consumidor(String nombre, int cantidad){
        this.nombre = nombre;
        this.cantidad =  cantidad;
    }

    @Override
    public void run() {
        super.run();
    }
}
