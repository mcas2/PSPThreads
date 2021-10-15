public class MainHilo {
    public static void main(String[] args) {
        System.out.println("Creando hilo en main");
        new HiloRunnable("Hilo 1");
        new HiloRunnable("Hilo 2");
    }
}
