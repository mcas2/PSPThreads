package EjercicioUT2_BufferMonitor2;

import java.util.ArrayList;
import java.util.Random;

public class Productor extends Thread {
    private BufferMonitor monitor;
    int cantidad;
    String sabor;
    Random r = new Random();
    String[] sabores = {"tarta de nata", "tarta de chocolate", "tarta de fresa", "tarta de fresisuis", "tarta de zanahoria"};


    public Productor(BufferMonitor monitor, String name, String sabor, int cantidad) {
        super(name);
        this.sabor = sabor;
        this.monitor = monitor;
        this.cantidad = cantidad;
    }

    public void run() {
        for (int i = 0; i < cantidad; i++) {
            monitor.put(sabores[r.nextInt(5)], this.getName());
        }
    }
}
