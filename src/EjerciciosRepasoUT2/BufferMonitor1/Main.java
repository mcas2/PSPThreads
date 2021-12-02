package EjerciciosRepasoUT2.BufferMonitor1;

public class Main {
    public static void main(String[] args) {
        Concesionario c = new Concesionario();
        Taller taller1 = new Taller(c,"Porsche", "T.Paco");
        Taller taller2 = new Taller(c,"BMW", "T.Plaza");
        Taller taller3 = new Taller(c,"Seat", "T.Chumbimba");

        Clientes c1 = new Clientes(c,"Borja", "alta");
        Clientes c2 = new Clientes(c,"Cayetana", "alta");
        Clientes c3 = new Clientes(c,"Leonardo", "alta");
        Clientes c4 = new Clientes(c,"Álvaro", "media");
        Clientes c5 = new Clientes(c,"Alejandro", "media");
        Clientes c6 = new Clientes(c,"Daniel", "media");
        Clientes c7 = new Clientes(c,"Tirso", "baja");
        Clientes c8 = new Clientes(c,"Enrique", "baja");
        Clientes c9 = new Clientes(c,"Rodrigo", "baja");

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
    }
}
