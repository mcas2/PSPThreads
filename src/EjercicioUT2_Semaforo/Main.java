package EjercicioUT2_Semaforo;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Inicio del hilo principal");
        BufferSemaforo cola = new BufferSemaforo();
        Productor p1 = new Productor(cola, "Productor1");
        Productor p2 = new Productor(cola, "Productor2");
        Productor p3 = new Productor(cola, "Productor3");
        Consumidor c1 = new Consumidor(cola, "Consumidor1");
        Consumidor c2 = new Consumidor(cola, "Consumidor2");

        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();

        //El número total tiene que ser el mismo en los dos extremos para que
        //el programa funcione correctamente.
    }
}
