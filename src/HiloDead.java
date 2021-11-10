public class HiloDead extends Thread {
    private boolean stopHilo = false;

    public void pararHilo(){
        stopHilo = true;
    }

    @Override
    public void run() {
        while (!stopHilo) {
            System.out.println("En el hilo.");
        }
    }

    public static void main(String[] args) {
        HiloDead h1 = new HiloDead();
        h1.start();
        System.out.println(h1.getState());
        for (int i = 0; i < 100000; i++);
        h1.pararHilo();
        System.out.println(h1.getState());
    }
}

