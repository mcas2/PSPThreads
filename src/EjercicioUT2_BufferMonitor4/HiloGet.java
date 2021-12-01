package EjercicioUT2_BufferMonitor4;

public class HiloGet extends Thread {

    private BufferMonitor bf;

    public HiloGet(BufferMonitor bf){
        this.bf = bf;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            bf.get(this.getName());
            try {
                Thread.sleep((long)0.5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
