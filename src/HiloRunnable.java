public class HiloRunnable implements Runnable {
    Thread t;

    public HiloRunnable(String s) {
        t = new Thread(this, s);
        System.out.println("Creando hilo: " + t);
        System.out.println("Nombre del hilo: " + t.getName());
        t.start();

    }

    public void run(){
        for (int i = 5; i >= 0; i--) {
            System.out.println(t.getName() +" termina en " + i);
        }
    }
}
