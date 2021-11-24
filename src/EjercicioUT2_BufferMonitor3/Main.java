package EjercicioUT2_BufferMonitor3;

public class Main {
    public static void main(String[] args) {
        Productor p1 = new Productor("Pinturas Jacobo", "verde");
        Productor p2 = new Productor("Pinturas María", "azul");
        Productor p3 = new Productor("Pinturas California", "blanca");
        Productor p4 = new Productor("Pinturas Alfredo", "negra");
        Productor p5 = new Productor("Pinturas Kim", "roja");
        Consumidor c1 = new Consumidor("Tienda Zaragoza" , 100);
        Consumidor c2 = new Consumidor("Tienda Aluche", 75);
        Consumidor c3 = new Consumidor("Tienda Sans", 75);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        c1.start();
        c2.start();
        c3.start();
    }
}
