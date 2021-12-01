package EjercicioUT2_BufferMonitor4;

import java.util.ArrayList;

public class BufferMonitor {
    ArrayList<Integer> lista = new ArrayList<>();
    Integer praevium;
    boolean turnoPar = false;

    public synchronized void get (String nomen){
        Integer resultado;
        while (lista    .isEmpty()){
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        resultado = lista.remove(0);
        System.out.println(resultado + " ");
        notifyAll();
    }

    public synchronized void putImpar (int num){
        while (turnoPar) {
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        lista.add(num);
        turnoPar = true;
        notifyAll();
    }

    public synchronized void putPar (int num){
        while(!turnoPar) {
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        lista.add(num);
        turnoPar = false;
        notifyAll();
    }
}
