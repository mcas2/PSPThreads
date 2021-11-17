package EjercicioUT2_Semaforo;

public class Consumidor extends Thread {
    private BufferSemaforo buffer;
    private int nVeces;

    Consumidor (BufferSemaforo cola, String name){
        super(name);
        this.buffer =  cola;
    }

    @Override
    public void run() {
        for (int i = 0; i <15; i++){
            buffer.get(this.getName());
        }
    }
}