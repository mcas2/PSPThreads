package EjercicioUT2_BufferMonitor4;

import java.util.Random;

public class HiloPut extends Thread {

    Random r = new Random();

    BufferMonitor bf;
    boolean flag;

    public HiloPut(BufferMonitor bf, boolean flag){
        this.bf =  bf;
        this.flag = flag;
    }

    @Override
    public void run() {
        if(this.flag){
            for (int i = 0; i < 50; i++) {
                bf.putPar(generaNumero(true));
            }
        } else{
            for (int i = 0; i < 50; i++) {
                bf.putImpar(generaNumero(false));
            }
        }
    }

    private int generaNumero (boolean flagPar){
        int num;
        flag = false;
        do {
            num = r.nextInt(1000);
            if (flagPar && num%2==0){
                flag = true;
            } else if (!flagPar && num%2!=0){
                flag = true;
            }
        } while (!flag);
        return num;
    }
}
