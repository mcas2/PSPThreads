public class HiloPrioridad extends Thread {
    public HiloPrioridad(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ":" + i);
        } try {
            sleep(100);
        } catch (InterruptedException e){
            //do nothing
        }
    }

    public static void main(String[] args) {
        HiloPrioridad h1 = new HiloPrioridad("Hola luna...");
        HiloPrioridad h2 = new HiloPrioridad("Hola sol...");

        int prioridad1 = h1.getPriority();
        System.out.println("La prioridad inicial de 1 es "+prioridad1);

        int prioridad2 = h2.getPriority();
        System.out.println("La prioridad inicial de 2 es "+prioridad2);

        h1.setPriority(MAX_PRIORITY);

        System.out.println("La prioridad final de 1 es "+prioridad1);

        h1.start();
        h2.start();
    }
}
