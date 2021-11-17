package EjercicioUT2_Semaforo;

public class Productor extends Thread {
    private BufferSemaforo buffer;
    private int nVeces;

    Productor (BufferSemaforo cola, String name){
        super(name);
        this.buffer =  cola;
    }

    @Override
    public void run() {
        for (int i = 0; i <10; i++){
            buffer.put(this.getName(), i);
        }
    }
}
