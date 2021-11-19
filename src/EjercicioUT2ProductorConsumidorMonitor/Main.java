package EjercicioUT2ProductorConsumidorMonitor;
/* 3 productores.
*
*
* */
public class Main {
    public static void main(String[] args) {
        BufferMonitor vitrina = new BufferMonitor();
        Productor p1 = new Productor(vitrina,"Dulces González","Chocolate",3);
        Productor p2 = new Productor(vitrina,"Tartas Benito","Fresa",2);
        Productor p3 = new Productor(vitrina,"Reposterías Maritere","Nata",5);
        Consumidor c1 = new Consumidor(vitrina, "Pedro");
        Consumidor c2 = new Consumidor(vitrina, "Laura");

        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();
    }
}
