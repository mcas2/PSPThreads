public class HiloImpar implements Runnable {
    Thread t;

    public HiloImpar (String nom){
        t = new Thread(this, nom);
        System.out.println("Nombre del hilo: " + t.getName());

        t.start();
    }

    public void run() {
        System.out.println("Iniciando hilo " + t.getName());
        for (int i = 0; i < 50; i++) {
            if (i%2!=0) System.out.println("Hilo " + t.getName() + " " + i);
        }
        System.out.println("Finalizando.");
    }
}
