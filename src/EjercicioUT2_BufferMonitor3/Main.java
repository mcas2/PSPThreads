package EjercicioUT2_BufferMonitor3;

public class Main {
    public static void main(String[] args) {
        BufferMonitor bf = new BufferMonitor();

        Productor p1 = new Productor("Pinturas Jacobo", "verde", 50,bf);
        Productor p2 = new Productor("Pinturas María", "azul", 50,bf);
        Productor p3 = new Productor("Pinturas California", "blanca", 50,bf);
        Productor p4 = new Productor("Pinturas Alfredo", "negra", 50,bf);
        Productor p5 = new Productor("Pinturas Kim", "roja", 50,bf);
        Consumidor c1 = new Consumidor("Tienda Zaragoza", bf);
        Consumidor c2 = new Consumidor("Tienda Aluche", bf);
        Consumidor c3 = new Consumidor("Tienda Sans", bf);

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
