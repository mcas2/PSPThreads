package EjercicioUT2_BufferMonitor3;

public class Consumidor extends Thread {
    String nombre;
    private BufferMonitor bf;

    public Consumidor(String nombre, BufferMonitor bf){
        this.nombre = nombre;
        this.bf = bf;
    }

    @Override
    public void run() {
        for (int i = 0; i < 250; i++) {
            try {
                sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bf.get(nombre);
        }
    }
}
