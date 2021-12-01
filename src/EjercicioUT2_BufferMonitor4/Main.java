package EjercicioUT2_BufferMonitor4;

public class Main {
    public static void main(String[] args) {
        BufferMonitor bf = new BufferMonitor();
        new HiloPut(bf, true).start();
        new HiloPut(bf, false).start();
        new HiloGet(bf).start();
    }
}
