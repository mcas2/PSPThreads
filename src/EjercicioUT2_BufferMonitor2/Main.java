package EjercicioUT2_BufferMonitor2;

import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Inicio del hilo principal");

        BufferMonitor monitor = new BufferMonitor();
        Productor prod1 = new Productor(monitor, "Gerardo el Dulces", " ", 4);
        Productor prod2 = new Productor(monitor, "La Chocolatada", " ", 4);
        Productor prod3 = new Productor(monitor, "Tienda Genérica", " ", 3);
        Consumidor cons1 = new Consumidor(monitor, "Jesús");
        Consumidor cons2 = new Consumidor(monitor, "Clara");

        prod1.start();
        prod2.start();
        prod3.start();
        cons1.start();
        cons2.start();

        System.out.println("Fin del hilo principal");
    }
}
