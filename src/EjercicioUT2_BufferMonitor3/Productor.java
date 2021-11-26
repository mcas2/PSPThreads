package EjercicioUT2_BufferMonitor3;

public class Productor extends Thread{
    String color;
    String nombre;
    int cantidad;
    BufferMonitor bf;

    public Productor(String nombre, String color, int cantidad, BufferMonitor bf){
        this.nombre = nombre;
        this.color = color;
        this.cantidad =  cantidad;
        this.bf = bf;
    }

    @Override
    public void run() {
        for (int i = 0; i < cantidad; i++) {
            try {
                sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bf.put(nombre, color);
        }
    }
}
